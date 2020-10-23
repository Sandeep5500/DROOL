parser grammar DroolParser;
options {
  tokenVocab = DroolLexer;
}
/*Basic concepts*/

@header{
	import cool.AST;
	import java.util.List;
}

@members{
	String filename;
	public void setFilename(String f){
		filename = f;
	}

/*
	DO NOT EDIT THE FILE ABOVE THIS LINE
	Add member functions, variables below.
*/

}


program: declarationseq? EOF;
/*Expressions*/

primaryExpression:
  Literal
  | LeftParen expression RightParen
  | Identifier;

postfixExpression:
  primaryExpression
  | postfixExpression LeftParen expressionList? RightParen
  | postfixExpression (Dot|Arrow) Identifier
  | postfixExpression (PlusPlus | MinusMinus);

  
expressionList: initializerList;


unaryExpression:
  postfixExpression
  | (PlusPlus | MinusMinus | unaryOperator | Sizeof) unaryExpression
  | (Sizeof|Esizeof|Vsizeof|Val|Inv|Det|Trans) LeftParen dataType RightParen;

unaryOperator: Or | Star | And | Plus | Tildae | Minus | Not;

countExpression:
  unaryExpression (Hashtag unaryExpression)?
  | Hashtag unaryExpression;

addrcExpression:
  countExpression ((Addc | Addr) countExpression)?;

questionExpression:
  addrcExpression (
    Questionmark addrcExpression)?;

multiplicativeExpression:
  questionExpression (
    (Star | Div | Mod) questionExpression
  )*;

additiveExpression:
  multiplicativeExpression (
    (Plus | Minus) multiplicativeExpression
  )*;

shiftExpression: 
  additiveExpression (shiftOperator additiveExpression)*;

shiftOperator: RightShift | LeftShift;

relationalExpression:
  shiftExpression (
    (Less | Greater | LessEqual | GreaterEqual) shiftExpression
  )*;

equalityExpression:
  relationalExpression (
    (Equal | NotEqual) relationalExpression
  )*;



andExpression: equalityExpression (And equalityExpression)*;

exclusiveOrExpression: andExpression (Caret andExpression)*;

inclusiveOrExpression:
  exclusiveOrExpression (Or exclusiveOrExpression)*;

logicalAndExpression:
  inclusiveOrExpression (AndAnd inclusiveOrExpression)*;

logicalOrExpression:
  logicalAndExpression (OrOr logicalAndExpression)*;

assignmentExpression:
  logicalOrExpression
  | logicalOrExpression assignmentOperator initializerClause;

assignmentOperator:
  Assign
  | StarAssign
  | DivAssign
  | ModAssign
  | PlusAssign
  | MinusAssign
  | AndAssign
  | XorAssign
  | OrAssign;

expression: assignmentExpression (Comma assignmentExpression)*;

constantExpression: logicalOrExpression;
/*Statements*/

statement:
  caseStatement
  |expressionStatement
  | compoundStatement
  | selectionStatement
  | iterationStatement
  | declarationStatement
  | jumpStatement;
  
jumpStatement:
	(
		Break
		| Continue
		| Return (expression | bracedInitList)?
	) Semi;
	
caseStatement:
  (
    Case constantExpression
    | Default
  ) Colon statement;

expressionStatement: expression? Semi;

compoundStatement: LeftBrace statementSeq? RightBrace;

statementSeq: statement+;

selectionStatement:
  If LeftParen condition RightParen statement (Else statement)?
  | Switch LeftParen condition RightParen LeftBrace (caseStatement)* RightBrace;

condition:
  expression
  | declarator (
    Assign initializerClause
    | bracedInitList
  );

iterationStatement:
  While LeftParen condition RightParen statement
  | For LeftParen (
    forInitStatement condition? Semi expression?
  ) RightParen statement;

forInitStatement: expressionStatement | simpleDeclaration;




declarationStatement: blockDeclaration;
/*Declarations*/

declarationseq: declaration+;

declaration:
  blockDeclaration
  | functionDefinition;

blockDeclaration:
  simpleDeclaration Semi;
  
simpleDeclaration:
  initDeclaratorList? Semi
  | initDeclaratorList Semi;

dataType:
   Bool
  | Int
  | Float
  | Void
  | String
  | Graph
  | Edge
  | Matrix
  | Vertex
  | className;

initDeclaratorList: initDeclarator (Comma initDeclarator)*;

initDeclarator: dataType declarator initializer?;

declarator:
  Identifier (parametersAndQualifiers
  | LeftBracket constantExpression? RightBracket)? ;

parametersAndQualifiers:
  LeftParen parameterDeclarationClause? RightParen;


parameterDeclarationClause:
  parameterDeclarationList;

parameterDeclarationList:
  parameterDeclaration (Comma parameterDeclaration)*;

parameterDeclaration:
   (initDeclarator)?;

functionDefinition:
  dataType Identifier LeftParen parameterDeclarationClause RightParen functionBody;

functionBody:
  compoundStatement
  | Assign (Default | Delete) Semi;

initializer:
  braceOrEqualInitializer
  | LeftParen expressionList RightParen;

braceOrEqualInitializer:
  Assign initializerClause
  | bracedInitList;

initializerClause: assignmentExpression | bracedInitList;

initializerList:
  initializerClause  (
    Comma initializerClause 
  )*;

bracedInitList: LeftBrace (initializerList Comma?)? RightBrace;
/*Classes*/

className: Identifier;

classSpecifier:
  classHead LeftBrace memberSpecification? RightBrace;

classHead:
  Class className baseClause?;


memberSpecification:
  (memberdeclaration)+;

memberdeclaration:
   memberDeclaratorList? Semi
  | functionDefinition;

memberDeclaratorList:
  memberDeclarator (Comma memberDeclarator)*;

memberDeclarator:
  initDeclarator (
    | braceOrEqualInitializer?
  )
  ;


/*Derived classes*/

baseClause: Colon baseSpecifierList;

baseSpecifierList:
  className (Comma className )*;

memInitializerList:
  memInitializer Ellipsis? (Comma memInitializer Ellipsis?)*;

memInitializer:
  meminitializerid (
    LeftParen expressionList? RightParen
    | bracedInitList
  );

meminitializerid: className|Identifier;


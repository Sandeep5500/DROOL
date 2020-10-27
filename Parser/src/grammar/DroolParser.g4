parser grammar DroolParser;
options {
  tokenVocab = DroolLexer;
}
/*Basic concepts*/

@header{
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


program: declarseq? EOF;


/*Types of Exprs*/

primaryExpr:
  Literal
  | LeftParen expr RightParen
  | Identifier (LeftBracket constexpr? RightBracket (LeftBracket constexpr? RightBracket)?)?;



postfixExpr:
  primaryExpr
  | postfixExpr LeftParen exprList? RightParen
  | postfixExpr (Dot|Arrow) Identifier
  | postfixExpr (PlusPlus | MinusMinus| Delr | Delc );

  
exprList: initializationseq;


unaryExpr:
  postfixExpr
  | unaryOpr unaryExpr
  | (Sizeof|Esizeof|Vsizeof|Val|Inv|Det|Trans) LeftParen Identifier RightParen;

unaryOpr: Or | Star | And | Plus | Tildae | Minus | Not | PlusPlus | MinusMinus  ;

graphmemberExpr:
  unaryExpr (Hashtag (Hashtag)? unaryExpr)?
  | Hashtag (Hashtag)? unaryExpr;

addrcExpr:
  graphmemberExpr ((Addc | Addr) graphmemberExpr)?;

questionExpr:
  addrcExpr (
    Questionmark addrcExpr)?;

multiplicationExpr:
  questionExpr (
    (Star | Div | Mod) questionExpr
  )*;

additiveExpr:
  multiplicationExpr (
    (Plus | Minus) multiplicationExpr
  )*;

pushpullExpr: 
  additiveExpr (pushpullOpr additiveExpr)*;

pushpullOpr: Push | Pull;

comparisonExpr:
  pushpullExpr (
    (Less | Greater | LessEqual | GreaterEqual) pushpullExpr
  )*;

equalityExpr:
  comparisonExpr (
    (Equal | NotEqual) comparisonExpr
  )*;



binAndExpr: equalityExpr (And equalityExpr)*;

binXorExpr: binAndExpr (Caret binAndExpr)*;

binOrExpr:
  binXorExpr (Or binXorExpr)*;

andExpr:
  binOrExpr (AndAnd binOrExpr)*;

orExpr:
  andExpr (OrOr andExpr)*;

assignExpr:
  orExpr
  | orExpr assignOpr initializationClause;

assignOpr:
  Assign
  | DivAssign
  | StarAssign
  | ModAssign
  | MinusAssign
  | PlusAssign
  | AndAssign
  | XorAssign
  | OrAssign;

expr: assignExpr (Comma assignExpr)*;

constexpr: orExpr;

/*Statements*/
inputStatement: Input LeftParen exprList RightParen Semi;
outputStatement: Output LeftParen exprList RightParen Semi;

statement:
  caseStatement
  |exprStatement
  | compoundStatement
  | selectStatement
  | iterStatement
  | declarationStatement
  | jumpStatement
  | inputStatement
  | outputStatement;
  
jumpStatement:
	(
		Break
		| Continue
		| Return (expr | bracedInitSeq)?
	) Semi;
	
caseStatement:
  (
    Case constexpr
    | Default
  ) Colon statement;

exprStatement: expr? Semi;

compoundStatement: LeftBrace statementSeq? RightBrace;

statementSeq: statement+;

selectStatement:
  If LeftParen condition RightParen statement (Else statement)?
  | Switch LeftParen condition RightParen LeftBrace (caseStatement)* RightBrace;

condition:
  expr
  | declarator (
    Assign initializationClause
    | bracedInitSeq
  );

iterStatement:
  While LeftParen condition RightParen statement
  | For LeftParen (
    forInitStatement condition? Semi expr?
  ) RightParen statement;

forInitStatement: exprStatement | (simpleDeclaration Semi);


declarationStatement: blockDeclaration;
/*Declarations*/

declarseq: declaration+;

declaration:
  blockDeclaration
  | functionDefn
  | classDefn;

blockDeclaration:
  simpleDeclaration Semi;
  
simpleDeclaration:
  initDeclaratorSeq?;

dataType:
  Bool
  | String
  | Int
  | Float
  | Matrix
  | Vertex
  | Graph
  | Edge
  | Void
  | className;

initDeclaratorSeq: dataType initDeclarator (Comma initDeclarator)*;

initDeclarator: declarator initializer?;

declarator:
  Identifier (parameters
  | LeftBracket constexpr? RightBracket (LeftBracket constexpr? RightBracket)?)? ;

parameters:
  LeftParen parameterDeclarationSeq? RightParen;

parameterDeclarationSeq:
  parameterDeclaration (Comma parameterDeclaration)*;

parameterDeclaration:
   (dataType(declarator initializer?)?)?;

functionDefn:
  dataType Identifier LeftParen parameterDeclarationSeq RightParen functionBody;

functionBody:
  compoundStatement;

initializer:
  braceOrEqualInitializer
  | LeftParen exprList RightParen;

braceOrEqualInitializer:
  Assign initializationClause
  | bracedInitSeq;

initializationClause: assignExpr | bracedInitSeq;


bracedInitSeq: LeftBrace (initializationseq Comma?)? RightBrace;


/*Class*/

initializationseq:
  initializationClause  ( Comma initializationClause )*;

className: Identifier;

classDefn:
  classHead LeftBrace memberlist? RightBrace Semi;

classHead:
  Class className inheritanceClause?;


memberlist:
  (memberdeclaration)+;

memberdeclaration:
   memberDeclaratorList? Semi
  | functionDefn;

memberDeclaratorList:
  dataType memberDeclarator (Comma memberDeclarator)*;

memberDeclarator:
  initDeclarator braceOrEqualInitializer?;


inheritanceClause: Colon inheriterList;

inheriterList:
  className (Comma className )*;




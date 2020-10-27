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
  | (Identifer|(LeftParen Identifier Comma Identifier RightParen)) Questionmark Identifier
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


addrcExpr:
  unaryExpr ((Addc | Addr) unaryExpr)?;

multiplicationExpr:
  addrcExpr (
    (Star | Div | Mod) addrcExpr
  )*;

additiveExpr:
  multiplicationExpr (
    (Plus | Minus) multiplicationExpr
  )*;

comparisonExpr:
  additiveExpr (
    (Less | Greater | LessEqual | GreaterEqual) additiveExpr
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


graph:
	(pushpullExpr|graphMemberArrayInit) Semi;

pushpullExpr: 
  	Identifier (pushpullOpr (Identifier | (LeftParen Identifier Comma Identifier (RightParen | Comma (Identifier| Literal) RightParen))))+;

pushpullOpr: Push | Pull;

graphMemberArrayInit:
  dataType Identifier LeftBracket constexpr? RightBracket  Assign (Identifier)? (Hashtag|DoubleHashtag)Identifier;

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
  | outputStatement
  | graph;
  
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



parser grammar DroolParser;
options {
  tokenVocab = DroolLexer;
}


@header{
	import java.util.List;
}

@members{
	String filename;
	public void setFilename(String f){
		filename = f;
	}

}


program: declarseq? EOF;                         //ProgramContext


//Expressions

primaryExpr:                                    //PrimaryExprContext
  Literal
  | (Identifier|(LeftParen Identifier Comma Identifier RightParen)) Questionmark Identifier
  | LeftParen expr RightParen
  | Identifier (LeftBracket constexpr? RightBracket (LeftBracket constexpr? RightBracket)?)?;



postfixExpr:                                   //PostfixExprContext
  primaryExpr
  | postfixExpr LeftParen exprList? RightParen
  | postfixExpr (Dot|Arrow) Identifier
  | postfixExpr (PlusPlus | MinusMinus| Delr | Delc );

  
exprList: initializationseq;                 // ExprListContext

unaryExpr:                                   //UnaryExprContext
  postfixExpr
  | unaryOpr unaryExpr
  | (Sizeof|Esizeof|Vsizeof|Val|Inv|Det|Trans) LeftParen Identifier RightParen;

unaryOpr: Or | Star | And | Plus | Tildae | Minus | Not | PlusPlus | MinusMinus  ;         //UnaryOprContext


addrcExpr:                                   //AddrcExprContext
  unaryExpr ((Addc | Addr) unaryExpr)?;

multiplicationExpr:                          //MultiplicationExprContext
  addrcExpr (
    (Star | Div | Mod) addrcExpr
  )*;

additiveExpr:                                //AdditiveExprContext
  multiplicationExpr (
    (Plus | Minus) multiplicationExpr
  )*;

comparisonExpr:                              //ComparisonExprContext 
  additiveExpr (
    (Less | Greater | LessEqual | GreaterEqual) additiveExpr
  )*;

equalityExpr:                                //EqualityExprContext
  comparisonExpr (
    (Equal | NotEqual) comparisonExpr
  )*;



binAndExpr: equalityExpr (And equalityExpr)*;          //BinAndExprContext

binXorExpr: binAndExpr (Caret binAndExpr)*;            //BinXorExprContext

binOrExpr:                                             //BinOrExprContext
  binXorExpr (Or binXorExpr)*;

andExpr:                                              //AndExprContext
  binOrExpr (AndAnd binOrExpr)*;

orExpr:                                               //OrExprContext
  andExpr (OrOr andExpr)*;

assignExpr:                                           //AssignExprContext
  orExpr
  | orExpr assignOpr initializationClause;

assignOpr:                                            //AssignOprContext
  Assign
  | DivAssign
  | StarAssign
  | ModAssign
  | MinusAssign
  | PlusAssign
  | AndAssign
  | XorAssign
  | OrAssign;


graph:                                              //GraphContext
	(pushpullExpr|graphMemberArrayInit) Semi;

pushpullExpr:                                       //PushpullExprContext
  	Identifier (pushpullOpr (Identifier | (LeftParen Identifier Comma Identifier (RightParen | Comma (Identifier| Literal) RightParen))))+;

pushpullOpr: Push | Pull;                           //PushpullOprContext

graphMemberArrayInit:                               //GraphMemberArrayInitContext
  dataType Identifier LeftBracket constexpr? RightBracket  Assign (Identifier)? (Hashtag|DoubleHashtag)Identifier;

expr: assignExpr (Comma assignExpr)*;               //ExprContext

constexpr: orExpr;                                  //ConstexprContext

//Statements
inputStatement: Input LeftParen exprList RightParen Semi;            //InputStatementContext 
outputStatement: Output LeftParen exprList RightParen Semi;          //OutputStatementContext

statement:                    //StatementContext
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
  
jumpStatement:              //JumpStatementContext
	(
		Break
		| Continue
		| Return (expr | bracedInitSeq)?
	) Semi;
	
caseStatement:             //CaseStatementContext 
  (
    Case constexpr
    | Default
  ) Colon statement;

exprStatement: expr? Semi;       //ExprStatementContext

compoundStatement: LeftBrace statementSeq? RightBrace;      //CompoundStatementContext

statementSeq: statement+;               //StatementSeqContext

selectStatement:                        //SelectStatementContext
  If LeftParen condition RightParen statement (Else statement)?
  | Switch LeftParen condition RightParen LeftBrace (caseStatement)* RightBrace;

condition:                              //ConditionContext
  expr
  | declarator (
    Assign initializationClause
    | bracedInitSeq
  );

iterStatement:                         //IterStatementContext
  While LeftParen condition RightParen statement
  | For LeftParen (
    forInitStatement condition? Semi expr?
  ) RightParen statement;

forInitStatement: exprStatement | (simpleDeclaration Semi);         //ForInitStatementContext


declarationStatement: blockDeclaration;                  //DeclarationStatementContext

//Declarations

declarseq: declaration+;                 //DeclarseqContext 

declaration:                             //DeclarationContext 
  blockDeclaration
  | functionDefn
  | classDefn;

blockDeclaration:                         //BlockDeclarationContext
  simpleDeclaration Semi;
  
simpleDeclaration:                        //SimpleDeclarationContext
  initDeclaratorSeq?;

dataType:                                //DataTypeContext
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

initDeclaratorSeq: dataType initDeclarator (Comma initDeclarator)*;        //InitDeclaratorSeqContext

initDeclarator: declarator initializer?;                                   //InitDeclaratorContext

declarator:                      //DeclaratorContext 
  Identifier (parameters
  | LeftBracket constexpr? RightBracket (LeftBracket constexpr? RightBracket)?)? ;

parameters:                       //ParametersContext
  LeftParen parameterDeclarationSeq? RightParen;

parameterDeclarationSeq:          //ParameterDeclarationSeqContext
  parameterDeclaration (Comma parameterDeclaration)*;

parameterDeclaration:             //ParameterDeclarationContext
   (dataType(declarator initializer?)?)?;

functionDefn:                     //FunctionDefnContext
  dataType Identifier LeftParen parameterDeclarationSeq RightParen functionBody;

functionBody:                    //FunctionBodyContext
  compoundStatement;

initializer:                     //InitializerContext
  braceOrEqualInitializer
  | LeftParen exprList RightParen
  | HyphenD;

braceOrEqualInitializer:         //BraceOrEqualInitializerContext 
  Assign initializationClause
  | bracedInitSeq;

initializationClause: assignExpr | bracedInitSeq;         //InitializationClauseContext


bracedInitSeq: LeftBrace (initializationseq Comma?)? RightBrace;       //BracedInitSeqContext


//Classes

initializationseq:                                              //InitializationseqContext
  initializationClause  ( Comma initializationClause )*;

className: Identifier;                 //ClassNameContext

classDefn:                             //ClassDefnContext
  classHead LeftBrace memberlist? RightBrace Semi;

classHead:                             //ClassHeadContext
  Class className inheritanceClause?;


memberlist:                            //MemberlistContext
  (memberdeclaration)+;

memberdeclaration:                     //MemberdeclarationContext
   memberDeclaratorList? Semi
  | functionDefn;

memberDeclaratorList:                 //MemberDeclaratorListContext
  dataType memberDeclarator (Comma memberDeclarator)*;

memberDeclarator:                    // MemberDeclaratorContext
  initDeclarator braceOrEqualInitializer?;


inheritanceClause: Colon inheriterList;        //InheritanceClauseContext

inheriterList:                                 //InheriterListContext
  className (Comma className )*;


parser grammar DroolParser;
options {
  tokenVocab = DroolLexer;
}
/*Basic concepts*/

translationUnit: declarationseq? EOF;
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

  

 // add a middle layer to eliminate duplicated function declarations
 // */


expressionList: initializerList;


unaryExpression:
  postfixExpression
  | (PlusPlus | MinusMinus | unaryOperator | Sizeof) unaryExpression
  | (Sizeof|Esizeof|Vsizeof|Val|Inv|Det|Transpose) LeftParen dataType RightParen;
 // | newExpression
  //| deleteExpression;

unaryOperator: Or | Star | And | Plus | Tilde | Minus | Not;

/*newExpression:
  Doublecolon? New (
    newTypeId
    | (LeftParen theTypeId RightParen)
  ) newInitializer?;

newPlacement: LeftParen expressionList RightParen;

newTypeId: typeSpecifierSeq newDeclarator?;

// newDeclarator:
//   pointerOperator newDeclarator?
//   | noPointerNewDeclarator;

noPointerNewDeclarator:
  LeftBracket expression RightBracket attributeSpecifierSeq?
  | noPointerNewDeclarator LeftBracket constantExpression RightBracket attributeSpecifierSeq?;

newInitializer:
  LeftParen expressionList? RightParen
  | bracedInitList;

*/
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

/*conditionalExpression:
  logicalOrExpression (
    Question expression Colon assignmentExpression
  )?;
*/
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
  | declarationStatement;

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


/*declSpecifier:
  typeSpecifier
  | functionSpecifier
  | Constexpr;
*/
// declSpecifierSeq: declSpecifier+ attributeSpecifierSeq?;

//typedefName: Identifier;

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

// typeSpecifier:
//   trailingTypeSpecifier
//   | classSpecifier;


// trailingTypeSpecifier:
//   simpleTypeSpecifier
//   | elaboratedTypeSpecifier
//   | typeNameSpecifier;

// typeSpecifierSeq: typeSpecifier+ attributeSpecifierSeq?;

// trailingTypeSpecifierSeq:
//   trailingTypeSpecifier+ attributeSpecifierSeq?;



// simpleTypeSpecifier:
//   nestedNameSpecifier? theTypeName
//   | Bool
//   | Int
//   | Float
//   | Double
//   | Void
//   | decltypeSpecifier;

// theTypeName:
//   className
//   | enumName
//   | typedefName
//   | simpleTemplateId;

// decltypeSpecifier:
//   Decltype LeftParen (expression ) RightParen;

// elaboratedTypeSpecifier:
//   classKey (
//     attributeSpecifierSeq? nestedNameSpecifier? Identifier
//     | simpleTemplateId
//     | nestedNameSpecifier Template? simpleTemplateId
//   )
//   | Enum nestedNameSpecifier? Identifier;


// qualifiednamespacespecifier: nestedNameSpecifier? namespaceName;



/*attributeSpecifierSeq: attributeSpecifier+;``

attributeSpecifier:
  LeftBracket LeftBracket attributeList? RightBracket RightBracket;


attributeList: attribute (Comma attribute)* ;

attribute:  Identifier attributeArgumentClause?;


attributeArgumentClause: LeftParen balancedTokenSeq? RightParen;

balancedTokenSeq: balancedtoken+;

balancedtoken:
  LeftParen balancedTokenSeq RightParen
  | LeftBracket balancedTokenSeq RightBracket
  | LeftBrace balancedTokenSeq RightBrace
  | ~(
    LeftParen
    | RightParen
    | LeftBrace
    | RightBrace
    | LeftBracket
    | RightBracket
  )+;
/*Declarators*/

initDeclaratorList: initDeclarator (Comma initDeclarator)*;

// initDeclarator: declarator initializer?;
initDeclarator: dataType declarator initializer?;

// declarator:
//   noPointerDeclarator parametersAndQualifiers trailingReturnType;


declarator:
  Identifier (parametersAndQualifiers
  | LeftBracket constantExpression? RightBracket)? ;
  // | LeftParen pointerDeclarator RightParen;

parametersAndQualifiers:
  LeftParen parameterDeclarationClause? RightParen;

// trailingReturnType:
//   Arrow trailingTypeSpecifierSeq abstractDeclarator?;

//pointerOperator:
//  (And | AndAnd) attributeSpecifierSeq?
//  | nestedNameSpecifier? Star attributeSpecifierSeq? ;



// refqualifier: And | AndAnd;

// declaratorid: idExpression;

// theTypeId: typeSpecifierSeq ;



parameterDeclarationClause:
  parameterDeclarationList;

parameterDeclarationList:
  parameterDeclaration (Comma parameterDeclaration)*;

parameterDeclaration:
   (initDeclarator)?;

functionDefinition:
  dataType Identifier Lparen parameterDeclarationClause Rparen functionBody;

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

// baseSpecifier:
//   baseTypeSpecifier;

// classOrDeclType:
//   nestedNameSpecifier? className
//   | decltypeSpecifier;

// baseTypeSpecifier: classOrDeclType;

/*Special member functions*/

// conversionFunctionId: Operator conversionTypeId;

// conversionTypeId: typeSpecifierSeq conversionDeclarator?;

// conversionDeclarator: pointerOperator conversionDeclarator?;

// constructorInitializer: Colon memInitializerList;

memInitializerList:
  memInitializer Ellipsis? (Comma memInitializer Ellipsis?)*;

memInitializer:
  meminitializerid (
    LeftParen expressionList? RightParen
    | bracedInitList
  );

meminitializerid: className|Identifier;
/*Overloading*/

// operatorFunctionId: Operator theOperator;

// literalOperatorId:
//   Operator (
//     StringLiteral Identifier
//     | UserDefinedStringLiteral
//   );
/*Templates*/
// typeParameter:
//   (
//     (Template Less templateparameterList Greater)? Class
//     | Typename_
//   ) ((Ellipsis? Identifier?) | (Identifier? Assign theTypeId));



// typeNameSpecifier:
//   Typename_ nestedNameSpecifier (
//     Identifier
//   );




// typeIdList: theTypeId Ellipsis? (Comma theTypeId Ellipsis?)*;


/*Preprocessing directives*/

/*Lexer*/

/*theOperator:
  New (LeftBracket RightBracket)?
  | Plus
  | Minus
  | Star
  | Div
  | Mod
  | And
  | Or
  | Tilde
  | Not
  | Assign
  | Less
  | GreaterEqual
  | PlusAssign
  | MinusAssign
  | StarAssign
  | Assign
  | ModAssign
  | XorAssign
  | AndAssign
  | OrAssign
  | LeftShift
  | RightShift
  | RightShiftAssign
  | LeftShiftAssign
  | Equal
  | NotEqual
  | LessEqual
  | GreaterEqual
  | AndAnd
  | OrOr
  | PlusPlus
  | MinusMinus
  | Comma
  | LeftParen RightParen
  | LeftBracket RightBracket;*/

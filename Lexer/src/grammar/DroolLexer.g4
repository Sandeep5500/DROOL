lexer grammar DroolLexer;

Literal:
	IntegerLiteral
	| FloatingLiteral
	| StringLiteral
	| BooleanLiteral
	| VertexLiteral;

fragment UCL: [A-Z];
fragment LCL: [a-z];
fragment NONDIGIT: [UCL | LCL| _];
fragment DIGIT: [0-9];
fragment NONZERODIGIT: [1-9];
fragment BINARYDIGIT: [01];


// Symbols
LeftParen: '(';
RightParen: ')';
LeftBrace: '{';
RightBrace: '}';
LeftBracket: '[';
RightBracket: ']';

Or: '|';
Star: '*';
And: '&';
Plus: '+';
Minus: '-';
Tildae: '~';
Not:'!';
Div: '/';
Mod: '%';

RightShift: '->>';
LeftShift: '<<-';
Less: '<';
Greater: '>';
LessEqual: '<=';
GreaterEqual: '>=';
Equal:'==';
NotEqual: '!=';
Caret: '^';
AndAnd: '&&';
OrOr: '||';

Assign: '=';
StarAssign: '*=';
DivAssign: '/=';
ModAssign: '%=';
PlusAssign: '+=';
MinusAssign: '-=';
AndAssign: '&=';
XorAssign: '^=';
OrAssign: '|=';


PlusPlus: '++';
MinusMinus: '--';

Dot: '.';
Arrow: '->';

Sizeof: 'sizeof';
Hashtag: '#';
Addc: 'addc';
Addr: 'addr';
Delr: 'delr';
Questionmark: '?';
Inv: 'inv';
Trans: 'trans';
Vsizeof: 'vsizeof';
Esizeof: 'esizeof';
Val: 'val';
Push: '<<';
Pull: '<<';

If: 'if';
Else: 'else';
Switch: 'switch';
While: 'while';
For: 'for';
Case: 'case';
Default: 'default';

Comma: ',';
Colon: ':';
Semi: ';';
Ellipsis: '...';
SingleQuote: '\'';

Class: 'class';
Void: 'void';
Bool: 'bool';
Int: 'int';
Float: 'float';
String: 'string';
Graph: 'graph';
Edge: 'edge';
Matrix: 'matrix';
Vertex: 'vertex';
Long: 'long';
Unsigned: 'unsigned';
Delete: 'delete';
Operator: 'operator';
Return: 'return';

Const: 'const';
False_: 'false';
True_: 'true';

fragment Escapesequence:
	'\\\''
	| '\\"'
	| '\\?'
	| '\\\\'
	| '\\a'
	| '\\b'
	| '\\f'
	| '\\n'
	| '\\r'
	| '\\t'
	| '\\v';


Identifier:
	NONDIGIT (NONDIGIT | DIGIT)*;

IntegerLiteral:
	DecimalLiteral Integersuffix?
	| BinaryLiteral Integersuffix?;

DecimalLiteral: NONZERODIGIT ('\''? DIGIT)*;
BinaryLiteral: ('0b' | '0B') BINARYDIGIT ('\''? BINARYDIGIT)*;

Integersuffix:
	Unsignedsuffix Longsuffix?
	| Unsignedsuffix Longlongsuffix?
	| Longsuffix Unsignedsuffix?
	| Longlongsuffix Unsignedsuffix?;
fragment Unsignedsuffix: [uU];
fragment Longsuffix: [lL];
fragment Longlongsuffix: 'll' | 'LL';

FloatingLiteral:
	Fractionalconstant Exponentpart? Floatingsuffix?
	| Digitsequence Exponentpart Floatingsuffix?;

fragment Fractionalconstant:
	Digitsequence? '.' Digitsequence
	| Digitsequence '.';
fragment Exponentpart:
	'e' SIGN? Digitsequence
	| 'E' SIGN? Digitsequence;

fragment SIGN: [+-];
fragment Digitsequence: DIGIT ('\''? DIGIT)*;
fragment Floatingsuffix: [flFL];

StringLiteral:
	Encodingprefix? '"' Schar* '"'
	| Encodingprefix? 'R' Rawstring;
fragment Encodingprefix: 'u8' | 'u' | 'U' | 'L';

fragment Schar:
	~ ["\\\r\n]
	| Escapesequence;

fragment Rawstring: '"' .*? '(' .*? ')' .*? '"';

BooleanLiteral: False_ | True_;

VertexLiteral: SingleQuote Identifier SingleQuote Comma (StringLiteral)?;
EdgeLiteral: LeftParen Vertex Comma Vertex Comma (IntegerLiteral)? RightParen;

Whitespace: [ \t]+ -> skip;
Newline: ('\r' '\n'? | '\n') -> skip;
BlockComment: '/*' .*? '*/' -> skip;
LineComment: '//' ~ [\r\n]* -> skip;

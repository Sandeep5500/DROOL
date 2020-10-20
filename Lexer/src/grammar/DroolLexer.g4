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

// Creating case insensitive alphabets
fragment A : [aA];
fragment B : [bB];
fragment C : [cC];
fragment D : [dD];
fragment E : [eE];
fragment F : [fF];
fragment G : [gG];
fragment H : [hH];
fragment I : [iI];
fragment J : [jJ];
fragment K : [kK];
fragment L : [lL];
fragment M : [mM];
fragment N : [nN];
fragment O : [oO];
fragment P : [pP];
fragment Q : [qQ];
fragment R : [rR];
fragment S : [sS];
fragment T : [tT];
fragment U : [uU];
fragment V : [vV];
fragment W : [wW];
fragment X : [xX];
fragment Y : [yY];
fragment Z : [zZ];

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

Sizeof: S I Z E O F;
Hashtag: '#';
Addc: A D D C;
Addr: A D D R;
Delr: D E L R;
Questionmark: '?';
Inv: I N V;
Trans: T R A N S;
Vsizeof: V S I Z E O F;
Esizeof: E S I Z E O F;
Val: V A L;
Push: '<<';
Pull: '<<';

If: I F;
Else: E L S E;
Switch: S W I T C H;
While: W H I L E;
For: F O R;
Case: C A S E;
Default: D E F A U L T;

Comma: ',';
Colon: ':';
Semi: ';';
Ellipsis: '...';
SingleQuote: '\'';

Class: C L A S S;
Void: V O I D;
Bool: B O O L;
Int: I N T;
Float: F L O A T;
String: S T R I N G;
Graph: G R A P H;
Edge: E D G E;
Matrix: M A T R I X;
Vertex: V E R T E X;
Long: L O N G;
Unsigned: U N S I G N E D;
Delete: D E L E T E;
Operator: O P E R A T O R;
Return: R E T U R N;

Const: C O N S T;
False_: 'false';
True_: 'true';


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

Whitespace: [ \t]+ -> skip;
Newline: ('\r' '\n'? | '\n') -> skip;
BlockComment: '/*' .*? '*/' -> skip;
LineComment: '//' ~ [\r\n]* -> skip;

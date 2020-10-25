lexer grammar DroolLexer;

tokens{
	ERROR
}

@members{

	/*
		ADDED MY MEMBER VARIABLES AND METHODS HERE
	*/

	/**
	* Function to report errors.
	* Using this function whenever my lexer encounters any erroneous input
	*/
	public void reportError(String errorString){
		setText(errorString);
		setType(ERROR);
	}

	public void invalidToken() { 
		Token t = _factory.create(_tokenFactorySourcePair, _type, _text, _channel, _tokenStartCharIndex, getCharIndex()-1, _tokenStartLine, _tokenStartCharPositionInLine);
		String text = t.getText();
		reportError(text);
	}

	public void processString() {
		Token t = _factory.create(_tokenFactorySourcePair, _type, _text, _channel, _tokenStartCharIndex, getCharIndex()-1, _tokenStartLine, _tokenStartCharPositionInLine);
		String text = t.getText();

		//write your code to test strings here

		if(text.length()-2 > 1024) {
			reportError("String constant too long"); // Checking if the length of string exceeds 1024 characters without quotes
		} else {
			text = text.substring(1, text.length()-1); // Removing the quotes
			String newText = "";
			for(int i=0; i < text.length(); i++) {
				if (text.charAt(i)=='\\') {
					switch(text.charAt(i+1)) {
						case 'n':
						newText+= '\n';
						break;
						case 'f':
						newText+= '\f';
						break;
						case 'r':
						newText+= '\r';
						break;
						case 't':
						newText+= '\t';
						break;
						case 'v':
						newText+= '\u000b'; // Unicode for vertical tab
						break;
						case '\\':
						newText+= '\\';
						break;
						default:
						newText+= (text.charAt(i+1));						
					}
					i++;					
				} else {
					newText+= (text.charAt(i));
				}
			}
			text = newText;
			setText(text);	
		}
		return;
	}
}




Literal:
	IntegerLiteral
	| FloatingLiteral
	| StringLiteral
	| BooleanLiteral
	| VertexLiteral;

fragment UCL: [A-Z];
fragment LCL: [a-z];
fragment NONDIGIT: (UCL | LCL | '_');
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
Delc: D E L C; 
Questionmark: '?';
Inv: I N V;
Trans: T R A N S;
Det: D E T;
Vsizeof: V S I Z E O F;
Esizeof: E S I Z E O F;
Val: V A L;
RightShift: '>>';
LeftShift: '<<';

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
SingleQuote: '\'';
DoubleQuote: '"';

Input: I N P U T;
Output: O U T P U T;
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
Continue: C O N T I N U E;
Break: B R E A K;
Return: R E T U R N;

Const: C O N S T;
False_: 'false';
True_: 'true';


Identifier:
	NONDIGIT (NONDIGIT | DIGIT)*;

IntegerLiteral: DecimalLiteral Integersuffix?;

DecimalLiteral: NONZERODIGIT ('\''? DIGIT)*;

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

// StringLiteral: DoubleQuote Schar* DoubleQuote;

// Error handling what do I have no clue
	
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

fragment Schar:
	~["\\\r\n]
	| Escapesequence;


BooleanLiteral: 
	False_ 
	| True_;

VertexLiteral: SingleQuote Identifier SingleQuote WHITESPACE?(Comma WHITESPACE? StringLiteral)?;

// Whitespace: [ \t]+ -> skip;
Newline: ('\r' '\n'? | '\n') -> skip;

WHITESPACE: [ \n\f\r\t\u000b]+ -> skip; // skip causes the lexer to discard the token.
ESC: ('\\'~('\u0000')); // Escape characters are allowed except for null character
fragment STR_INVALID_NEG: ~('\n'|'\u0000'|'\\'|'"'); // String cannot contain unescaped newline, null, only backslash, or unescaped quotes
fragment STR_VALID: (ESC | STR_INVALID_NEG)*;

// Errors
UNTERM_STR: '"' STR_VALID '\n' {reportError("Unterminated string constant");};
NULL_STR: '"' STR_VALID '\u0000' (ESC | ~('\n'|'\\'|'"'))* ('"'|'\n'| (EOF)) {reportError("String contains null character");};
ESC_NULL_STR: '"' STR_VALID '\\\u0000' (ESC | ~('\n'|'\\'|'"'))* ('"'|'\n'| (EOF)) {reportError("String contains escaped null character");};
EOF_BCKSLSH_STR: '"' STR_VALID '\\' (EOF) {reportError("backslash at end of file");}; 
EOF_STR: '"' STR_VALID (EOF) {reportError("EOF in string constant");};
EOF_COMMENT_0: '(*' (EOF) {reportError("EOF in comment");}; // (EOF) represents end of file representation, EOF in comment at 0th level of nesting, immediately after comment open, ie. (*(EOF)
OPEN_COMMENT: '*)' {reportError("Unmatched *)");};	

StringLiteral: '"' STR_VALID '"' { processString(); };


SINGLE_LINE_COMMENT: '//' .*? ('\n'|(EOF)) -> skip; //Using non-greedy lexer subrule to consume all input until a new line is encountered	
MULTI_LINE_COMMENT: '(*' -> pushMode(IN_MLC), skip; // If a multi line comment opener, "(*" is encountered we enter IN_MLC mode while skipping characters in the comment


// Using modes for managing nested multiline comments and errors due to EOF in them
mode IN_MLC;
EOF_COMMENT_1: . (EOF) {reportError("EOF in comment");}; // EOF in comment with some characters at 0th level of nesting, eg. (*hello(EOF)
EOF_COMMENT_2: '(*' (EOF) {reportError("EOF in comment");}; // eg. (*hello(*(EOF)
IN_NEST_MLC_0: '(*' -> pushMode(NESTED_MLC), skip;
CLOSE_MLC_0: '*)' -> popMode, skip;
CONTENT_MLC_0: . -> skip;

mode NESTED_MLC;
EOF_COMMENT_3: . (EOF) {reportError("EOF in comment");}; // eg. (*hello(*hi(EOF)
EOF_COMMENT_4: '(*' (EOF) {reportError("EOF in comment");}; // eg. (*hello(*hi(*(EOF)
EOF_COMMENT_5: '*)' (EOF) {reportError("EOF in comment");}; // eg. (*hello(*hi*)(EOF)
IN_NEST_MLC_1: '(*' -> pushMode(NESTED_MLC), skip;
CLOSE_MLC_1: '*)' -> popMode, skip;
CONTENT_MLC_1: . -> skip;

// BlockComment: '/*' .*? '*/' -> skip;
// LineComment: '//' ~ [\r\n]* -> skip;

OTHER: . {invalidToken();};

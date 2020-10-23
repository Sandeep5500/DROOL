// Generated from /home/manya/Desktop/COMPILERS2/DROOL/Lexer/src/grammar/DroolLexer.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DroolLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ERROR=1, Literal=2, LeftParen=3, RightParen=4, LeftBrace=5, RightBrace=6, 
		LeftBracket=7, RightBracket=8, Or=9, Star=10, And=11, Plus=12, Minus=13, 
		Tildae=14, Not=15, Div=16, Mod=17, Less=18, Greater=19, LessEqual=20, 
		GreaterEqual=21, Equal=22, NotEqual=23, Caret=24, AndAnd=25, OrOr=26, 
		Assign=27, StarAssign=28, DivAssign=29, ModAssign=30, PlusAssign=31, MinusAssign=32, 
		AndAssign=33, XorAssign=34, OrAssign=35, PlusPlus=36, MinusMinus=37, Dot=38, 
		Arrow=39, Sizeof=40, Hashtag=41, Addc=42, Addr=43, Delr=44, Questionmark=45, 
		Inv=46, Trans=47, Det=48, Vsizeof=49, Esizeof=50, Val=51, RightShift=52, 
		LeftShift=53, If=54, Else=55, Switch=56, While=57, For=58, Case=59, Default=60, 
		Comma=61, Colon=62, Semi=63, Ellipsis=64, SingleQuote=65, DoubleQuote=66, 
		Class=67, Void=68, Bool=69, Int=70, Float=71, String=72, Graph=73, Edge=74, 
		Matrix=75, Vertex=76, Long=77, Unsigned=78, Delete=79, Operator=80, Return=81, 
		Const=82, False_=83, True_=84, Identifier=85, IntegerLiteral=86, DecimalLiteral=87, 
		Integersuffix=88, FloatingLiteral=89, StringLiteral=90, BooleanLiteral=91, 
		VertexLiteral=92, Newline=93, WHITESPACE=94, ESC=95, UNTERM_STR=96, NULL_STR=97, 
		ESC_NULL_STR=98, EOF_BCKSLSH_STR=99, EOF_STR=100, EOF_COMMENT_0=101, OPEN_COMMENT=102, 
		SINGLE_LINE_COMMENT=103, MULTI_LINE_COMMENT=104, EOF_COMMENT_1=105, EOF_COMMENT_2=106, 
		IN_NEST_MLC_0=107, CLOSE_MLC_0=108, CONTENT_MLC_0=109, EOF_COMMENT_3=110, 
		EOF_COMMENT_4=111, EOF_COMMENT_5=112, IN_NEST_MLC_1=113, CLOSE_MLC_1=114, 
		CONTENT_MLC_1=115, OTHER=116;
	public static final int
		IN_MLC=1, NESTED_MLC=2;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "IN_MLC", "NESTED_MLC"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Literal", "UCL", "LCL", "NONDIGIT", "DIGIT", "NONZERODIGIT", "BINARYDIGIT", 
			"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", 
			"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "LeftParen", 
			"RightParen", "LeftBrace", "RightBrace", "LeftBracket", "RightBracket", 
			"Or", "Star", "And", "Plus", "Minus", "Tildae", "Not", "Div", "Mod", 
			"Less", "Greater", "LessEqual", "GreaterEqual", "Equal", "NotEqual", 
			"Caret", "AndAnd", "OrOr", "Assign", "StarAssign", "DivAssign", "ModAssign", 
			"PlusAssign", "MinusAssign", "AndAssign", "XorAssign", "OrAssign", "PlusPlus", 
			"MinusMinus", "Dot", "Arrow", "Sizeof", "Hashtag", "Addc", "Addr", "Delr", 
			"Questionmark", "Inv", "Trans", "Det", "Vsizeof", "Esizeof", "Val", "RightShift", 
			"LeftShift", "If", "Else", "Switch", "While", "For", "Case", "Default", 
			"Comma", "Colon", "Semi", "Ellipsis", "SingleQuote", "DoubleQuote", "Class", 
			"Void", "Bool", "Int", "Float", "String", "Graph", "Edge", "Matrix", 
			"Vertex", "Long", "Unsigned", "Delete", "Operator", "Return", "Const", 
			"False_", "True_", "Identifier", "IntegerLiteral", "DecimalLiteral", 
			"Integersuffix", "Unsignedsuffix", "Longsuffix", "Longlongsuffix", "FloatingLiteral", 
			"Fractionalconstant", "Exponentpart", "SIGN", "Digitsequence", "Floatingsuffix", 
			"StringLiteral", "Escapesequence", "Schar", "BooleanLiteral", "VertexLiteral", 
			"Newline", "WHITESPACE", "ESC", "STR_INVALID_NEG", "STR_VALID", "UNTERM_STR", 
			"NULL_STR", "ESC_NULL_STR", "EOF_BCKSLSH_STR", "EOF_STR", "EOF_COMMENT_0", 
			"OPEN_COMMENT", "SINGLE_LINE_COMMENT", "MULTI_LINE_COMMENT", "EOF_COMMENT_1", 
			"EOF_COMMENT_2", "IN_NEST_MLC_0", "CLOSE_MLC_0", "CONTENT_MLC_0", "EOF_COMMENT_3", 
			"EOF_COMMENT_4", "EOF_COMMENT_5", "IN_NEST_MLC_1", "CLOSE_MLC_1", "CONTENT_MLC_1", 
			"OTHER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'('", "')'", "'{'", "'}'", "'['", "']'", "'|'", "'*'", 
			"'&'", "'+'", "'-'", "'~'", "'!'", "'/'", "'%'", "'<'", "'>'", "'<='", 
			"'>='", "'=='", "'!='", "'^'", "'&&'", "'||'", "'='", "'*='", "'/='", 
			"'%='", "'+='", "'-='", "'&='", "'^='", "'|='", "'++'", "'--'", "'.'", 
			"'->'", null, "'#'", null, null, null, "'?'", null, null, null, null, 
			null, null, "'>>'", "'<<'", null, null, null, null, null, null, null, 
			"','", "':'", "';'", "'...'", "'''", "'\"'", null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"'false'", "'true'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ERROR", "Literal", "LeftParen", "RightParen", "LeftBrace", "RightBrace", 
			"LeftBracket", "RightBracket", "Or", "Star", "And", "Plus", "Minus", 
			"Tildae", "Not", "Div", "Mod", "Less", "Greater", "LessEqual", "GreaterEqual", 
			"Equal", "NotEqual", "Caret", "AndAnd", "OrOr", "Assign", "StarAssign", 
			"DivAssign", "ModAssign", "PlusAssign", "MinusAssign", "AndAssign", "XorAssign", 
			"OrAssign", "PlusPlus", "MinusMinus", "Dot", "Arrow", "Sizeof", "Hashtag", 
			"Addc", "Addr", "Delr", "Questionmark", "Inv", "Trans", "Det", "Vsizeof", 
			"Esizeof", "Val", "RightShift", "LeftShift", "If", "Else", "Switch", 
			"While", "For", "Case", "Default", "Comma", "Colon", "Semi", "Ellipsis", 
			"SingleQuote", "DoubleQuote", "Class", "Void", "Bool", "Int", "Float", 
			"String", "Graph", "Edge", "Matrix", "Vertex", "Long", "Unsigned", "Delete", 
			"Operator", "Return", "Const", "False_", "True_", "Identifier", "IntegerLiteral", 
			"DecimalLiteral", "Integersuffix", "FloatingLiteral", "StringLiteral", 
			"BooleanLiteral", "VertexLiteral", "Newline", "WHITESPACE", "ESC", "UNTERM_STR", 
			"NULL_STR", "ESC_NULL_STR", "EOF_BCKSLSH_STR", "EOF_STR", "EOF_COMMENT_0", 
			"OPEN_COMMENT", "SINGLE_LINE_COMMENT", "MULTI_LINE_COMMENT", "EOF_COMMENT_1", 
			"EOF_COMMENT_2", "IN_NEST_MLC_0", "CLOSE_MLC_0", "CONTENT_MLC_0", "EOF_COMMENT_3", 
			"EOF_COMMENT_4", "EOF_COMMENT_5", "IN_NEST_MLC_1", "CLOSE_MLC_1", "CONTENT_MLC_1", 
			"OTHER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}



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


	public DroolLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DroolLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 138:
			UNTERM_STR_action((RuleContext)_localctx, actionIndex);
			break;
		case 139:
			NULL_STR_action((RuleContext)_localctx, actionIndex);
			break;
		case 140:
			ESC_NULL_STR_action((RuleContext)_localctx, actionIndex);
			break;
		case 141:
			EOF_BCKSLSH_STR_action((RuleContext)_localctx, actionIndex);
			break;
		case 142:
			EOF_STR_action((RuleContext)_localctx, actionIndex);
			break;
		case 143:
			EOF_COMMENT_0_action((RuleContext)_localctx, actionIndex);
			break;
		case 144:
			OPEN_COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 147:
			EOF_COMMENT_1_action((RuleContext)_localctx, actionIndex);
			break;
		case 148:
			EOF_COMMENT_2_action((RuleContext)_localctx, actionIndex);
			break;
		case 152:
			EOF_COMMENT_3_action((RuleContext)_localctx, actionIndex);
			break;
		case 153:
			EOF_COMMENT_4_action((RuleContext)_localctx, actionIndex);
			break;
		case 154:
			EOF_COMMENT_5_action((RuleContext)_localctx, actionIndex);
			break;
		case 158:
			OTHER_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void UNTERM_STR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			reportError("Unterminated string constant");
			break;
		}
	}
	private void NULL_STR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			reportError("String contains null character");
			break;
		}
	}
	private void ESC_NULL_STR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			reportError("String contains escaped null character");
			break;
		}
	}
	private void EOF_BCKSLSH_STR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			reportError("backslash at end of file");
			break;
		}
	}
	private void EOF_STR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			reportError("EOF in string constant");
			break;
		}
	}
	private void EOF_COMMENT_0_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			reportError("EOF in comment");
			break;
		}
	}
	private void OPEN_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:
			reportError("Unmatched *)");
			break;
		}
	}
	private void EOF_COMMENT_1_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7:
			reportError("EOF in comment");
			break;
		}
	}
	private void EOF_COMMENT_2_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8:
			reportError("EOF in comment");
			break;
		}
	}
	private void EOF_COMMENT_3_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9:
			reportError("EOF in comment");
			break;
		}
	}
	private void EOF_COMMENT_4_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 10:
			reportError("EOF in comment");
			break;
		}
	}
	private void EOF_COMMENT_5_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 11:
			reportError("EOF in comment");
			break;
		}
	}
	private void OTHER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 12:
			invalidToken();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2v\u040a\b\1\b\1\b"+
		"\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
		"\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
		"\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30"+
		"\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37"+
		"\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t"+
		"*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63"+
		"\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t"+
		"<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4"+
		"H\tH\4I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\t"+
		"S\4T\tT\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^"+
		"\4_\t_\4`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j"+
		"\tj\4k\tk\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu"+
		"\4v\tv\4w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080"+
		"\t\u0080\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084"+
		"\4\u0085\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089"+
		"\t\u0089\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d"+
		"\4\u008e\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092"+
		"\t\u0092\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096"+
		"\4\u0097\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b"+
		"\t\u009b\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f"+
		"\4\u00a0\t\u00a0\3\2\3\2\3\2\3\2\3\2\5\2\u0149\n\2\3\3\3\3\3\4\3\4\3\5"+
		"\3\5\3\5\5\5\u0152\n\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!"+
		"\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3"+
		",\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3"+
		"\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\38\38\39\39\39\3"+
		":\3:\3:\3;\3;\3<\3<\3<\3=\3=\3=\3>\3>\3>\3?\3?\3?\3@\3@\3@\3A\3A\3A\3"+
		"B\3B\3B\3C\3C\3C\3D\3D\3D\3E\3E\3E\3F\3F\3G\3G\3G\3H\3H\3H\3H\3H\3H\3"+
		"H\3I\3I\3J\3J\3J\3J\3J\3K\3K\3K\3K\3K\3L\3L\3L\3L\3L\3M\3M\3N\3N\3N\3"+
		"N\3O\3O\3O\3O\3O\3O\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3"+
		"R\3R\3R\3R\3S\3S\3S\3S\3T\3T\3T\3U\3U\3U\3V\3V\3V\3W\3W\3W\3W\3W\3X\3"+
		"X\3X\3X\3X\3X\3X\3Y\3Y\3Y\3Y\3Y\3Y\3Z\3Z\3Z\3Z\3[\3[\3[\3[\3[\3\\\3\\"+
		"\3\\\3\\\3\\\3\\\3\\\3\\\3]\3]\3^\3^\3_\3_\3`\3`\3`\3`\3a\3a\3b\3b\3c"+
		"\3c\3c\3c\3c\3c\3d\3d\3d\3d\3d\3e\3e\3e\3e\3e\3f\3f\3f\3f\3g\3g\3g\3g"+
		"\3g\3g\3h\3h\3h\3h\3h\3h\3h\3i\3i\3i\3i\3i\3i\3j\3j\3j\3j\3j\3k\3k\3k"+
		"\3k\3k\3k\3k\3l\3l\3l\3l\3l\3l\3l\3m\3m\3m\3m\3m\3n\3n\3n\3n\3n\3n\3n"+
		"\3n\3n\3o\3o\3o\3o\3o\3o\3o\3p\3p\3p\3p\3p\3p\3p\3p\3p\3q\3q\3q\3q\3q"+
		"\3q\3q\3r\3r\3r\3r\3r\3r\3s\3s\3s\3s\3s\3s\3t\3t\3t\3t\3t\3u\3u\3u\7u"+
		"\u02d2\nu\fu\16u\u02d5\13u\3v\3v\5v\u02d9\nv\3w\3w\5w\u02dd\nw\3w\7w\u02e0"+
		"\nw\fw\16w\u02e3\13w\3x\3x\5x\u02e7\nx\3x\3x\5x\u02eb\nx\3x\3x\5x\u02ef"+
		"\nx\3x\3x\5x\u02f3\nx\5x\u02f5\nx\3y\3y\3z\3z\3{\3{\3{\3{\5{\u02ff\n{"+
		"\3|\3|\5|\u0303\n|\3|\5|\u0306\n|\3|\3|\3|\5|\u030b\n|\5|\u030d\n|\3}"+
		"\5}\u0310\n}\3}\3}\3}\3}\3}\5}\u0317\n}\3~\3~\5~\u031b\n~\3~\3~\3~\5~"+
		"\u0320\n~\3~\5~\u0323\n~\3\177\3\177\3\u0080\3\u0080\5\u0080\u0329\n\u0080"+
		"\3\u0080\7\u0080\u032c\n\u0080\f\u0080\16\u0080\u032f\13\u0080\3\u0081"+
		"\3\u0081\3\u0082\3\u0082\7\u0082\u0335\n\u0082\f\u0082\16\u0082\u0338"+
		"\13\u0082\3\u0082\3\u0082\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\5\u0083\u0352"+
		"\n\u0083\3\u0084\3\u0084\5\u0084\u0356\n\u0084\3\u0085\3\u0085\5\u0085"+
		"\u035a\n\u0085\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\5\u0086\u0361\n"+
		"\u0086\3\u0087\3\u0087\5\u0087\u0365\n\u0087\3\u0087\5\u0087\u0368\n\u0087"+
		"\3\u0087\3\u0087\3\u0088\6\u0088\u036d\n\u0088\r\u0088\16\u0088\u036e"+
		"\3\u0088\3\u0088\3\u0089\3\u0089\3\u0089\3\u008a\3\u008a\3\u008b\3\u008b"+
		"\7\u008b\u037a\n\u008b\f\u008b\16\u008b\u037d\13\u008b\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\7\u008d"+
		"\u0389\n\u008d\f\u008d\16\u008d\u038c\13\u008d\3\u008d\5\u008d\u038f\n"+
		"\u008d\3\u008d\3\u008d\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e"+
		"\3\u008e\7\u008e\u039a\n\u008e\f\u008e\16\u008e\u039d\13\u008e\3\u008e"+
		"\5\u008e\u03a0\n\u008e\3\u008e\3\u008e\3\u008f\3\u008f\3\u008f\3\u008f"+
		"\3\u008f\3\u008f\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092"+
		"\3\u0093\3\u0093\3\u0093\3\u0093\7\u0093\u03be\n\u0093\f\u0093\16\u0093"+
		"\u03c1\13\u0093\3\u0093\5\u0093\u03c4\n\u0093\3\u0093\3\u0093\3\u0094"+
		"\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0097\3\u0097\3\u0097"+
		"\3\u0097\3\u0097\3\u0097\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098"+
		"\3\u0099\3\u0099\3\u0099\3\u0099\3\u009a\3\u009a\3\u009a\3\u009a\3\u009b"+
		"\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009c\3\u009c\3\u009c\3\u009c"+
		"\3\u009c\3\u009c\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009e"+
		"\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009f\3\u009f\3\u009f\3\u009f"+
		"\3\u00a0\3\u00a0\3\u00a0\3\u03bf\2\u00a1\5\4\7\2\t\2\13\2\r\2\17\2\21"+
		"\2\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63"+
		"\2\65\2\67\29\2;\2=\2?\2A\2C\2E\2G\5I\6K\7M\bO\tQ\nS\13U\fW\rY\16[\17"+
		"]\20_\21a\22c\23e\24g\25i\26k\27m\30o\31q\32s\33u\34w\35y\36{\37} \177"+
		"!\u0081\"\u0083#\u0085$\u0087%\u0089&\u008b\'\u008d(\u008f)\u0091*\u0093"+
		"+\u0095,\u0097-\u0099.\u009b/\u009d\60\u009f\61\u00a1\62\u00a3\63\u00a5"+
		"\64\u00a7\65\u00a9\66\u00ab\67\u00ad8\u00af9\u00b1:\u00b3;\u00b5<\u00b7"+
		"=\u00b9>\u00bb?\u00bd@\u00bfA\u00c1B\u00c3C\u00c5D\u00c7E\u00c9F\u00cb"+
		"G\u00cdH\u00cfI\u00d1J\u00d3K\u00d5L\u00d7M\u00d9N\u00dbO\u00ddP\u00df"+
		"Q\u00e1R\u00e3S\u00e5T\u00e7U\u00e9V\u00ebW\u00edX\u00efY\u00f1Z\u00f3"+
		"\2\u00f5\2\u00f7\2\u00f9[\u00fb\2\u00fd\2\u00ff\2\u0101\2\u0103\2\u0105"+
		"\\\u0107\2\u0109\2\u010b]\u010d^\u010f_\u0111`\u0113a\u0115\2\u0117\2"+
		"\u0119b\u011bc\u011dd\u011fe\u0121f\u0123g\u0125h\u0127i\u0129j\u012b"+
		"k\u012dl\u012fm\u0131n\u0133o\u0135p\u0137q\u0139r\u013bs\u013dt\u013f"+
		"u\u0141v\5\2\3\4*\3\2C\\\3\2c|\3\2\62;\3\2\63;\3\2\62\63\4\2CCcc\4\2D"+
		"Ddd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4"+
		"\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUu"+
		"u\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\4\2--//\6"+
		"\2HHNNhhnn\6\2\f\f\17\17$$^^\4\2\13\17\"\"\3\2\2\2\6\2\2\2\f\f$$^^\5\2"+
		"\f\f$$^^\4\3\f\f$$\3\3\f\f\2\u0411\2\5\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2"+
		"\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2"+
		"q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3"+
		"\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2"+
		"\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f"+
		"\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2"+
		"\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1"+
		"\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2"+
		"\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3"+
		"\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2"+
		"\2\2\u00bd\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2\2\2\u00c5"+
		"\3\2\2\2\2\u00c7\3\2\2\2\2\u00c9\3\2\2\2\2\u00cb\3\2\2\2\2\u00cd\3\2\2"+
		"\2\2\u00cf\3\2\2\2\2\u00d1\3\2\2\2\2\u00d3\3\2\2\2\2\u00d5\3\2\2\2\2\u00d7"+
		"\3\2\2\2\2\u00d9\3\2\2\2\2\u00db\3\2\2\2\2\u00dd\3\2\2\2\2\u00df\3\2\2"+
		"\2\2\u00e1\3\2\2\2\2\u00e3\3\2\2\2\2\u00e5\3\2\2\2\2\u00e7\3\2\2\2\2\u00e9"+
		"\3\2\2\2\2\u00eb\3\2\2\2\2\u00ed\3\2\2\2\2\u00ef\3\2\2\2\2\u00f1\3\2\2"+
		"\2\2\u00f9\3\2\2\2\2\u0105\3\2\2\2\2\u010b\3\2\2\2\2\u010d\3\2\2\2\2\u010f"+
		"\3\2\2\2\2\u0111\3\2\2\2\2\u0113\3\2\2\2\2\u0119\3\2\2\2\2\u011b\3\2\2"+
		"\2\2\u011d\3\2\2\2\2\u011f\3\2\2\2\2\u0121\3\2\2\2\2\u0123\3\2\2\2\2\u0125"+
		"\3\2\2\2\2\u0127\3\2\2\2\2\u0129\3\2\2\2\3\u012b\3\2\2\2\3\u012d\3\2\2"+
		"\2\3\u012f\3\2\2\2\3\u0131\3\2\2\2\3\u0133\3\2\2\2\4\u0135\3\2\2\2\4\u0137"+
		"\3\2\2\2\4\u0139\3\2\2\2\4\u013b\3\2\2\2\4\u013d\3\2\2\2\4\u013f\3\2\2"+
		"\2\4\u0141\3\2\2\2\5\u0148\3\2\2\2\7\u014a\3\2\2\2\t\u014c\3\2\2\2\13"+
		"\u0151\3\2\2\2\r\u0153\3\2\2\2\17\u0155\3\2\2\2\21\u0157\3\2\2\2\23\u0159"+
		"\3\2\2\2\25\u015b\3\2\2\2\27\u015d\3\2\2\2\31\u015f\3\2\2\2\33\u0161\3"+
		"\2\2\2\35\u0163\3\2\2\2\37\u0165\3\2\2\2!\u0167\3\2\2\2#\u0169\3\2\2\2"+
		"%\u016b\3\2\2\2\'\u016d\3\2\2\2)\u016f\3\2\2\2+\u0171\3\2\2\2-\u0173\3"+
		"\2\2\2/\u0175\3\2\2\2\61\u0177\3\2\2\2\63\u0179\3\2\2\2\65\u017b\3\2\2"+
		"\2\67\u017d\3\2\2\29\u017f\3\2\2\2;\u0181\3\2\2\2=\u0183\3\2\2\2?\u0185"+
		"\3\2\2\2A\u0187\3\2\2\2C\u0189\3\2\2\2E\u018b\3\2\2\2G\u018d\3\2\2\2I"+
		"\u018f\3\2\2\2K\u0191\3\2\2\2M\u0193\3\2\2\2O\u0195\3\2\2\2Q\u0197\3\2"+
		"\2\2S\u0199\3\2\2\2U\u019b\3\2\2\2W\u019d\3\2\2\2Y\u019f\3\2\2\2[\u01a1"+
		"\3\2\2\2]\u01a3\3\2\2\2_\u01a5\3\2\2\2a\u01a7\3\2\2\2c\u01a9\3\2\2\2e"+
		"\u01ab\3\2\2\2g\u01ad\3\2\2\2i\u01af\3\2\2\2k\u01b2\3\2\2\2m\u01b5\3\2"+
		"\2\2o\u01b8\3\2\2\2q\u01bb\3\2\2\2s\u01bd\3\2\2\2u\u01c0\3\2\2\2w\u01c3"+
		"\3\2\2\2y\u01c5\3\2\2\2{\u01c8\3\2\2\2}\u01cb\3\2\2\2\177\u01ce\3\2\2"+
		"\2\u0081\u01d1\3\2\2\2\u0083\u01d4\3\2\2\2\u0085\u01d7\3\2\2\2\u0087\u01da"+
		"\3\2\2\2\u0089\u01dd\3\2\2\2\u008b\u01e0\3\2\2\2\u008d\u01e3\3\2\2\2\u008f"+
		"\u01e5\3\2\2\2\u0091\u01e8\3\2\2\2\u0093\u01ef\3\2\2\2\u0095\u01f1\3\2"+
		"\2\2\u0097\u01f6\3\2\2\2\u0099\u01fb\3\2\2\2\u009b\u0200\3\2\2\2\u009d"+
		"\u0202\3\2\2\2\u009f\u0206\3\2\2\2\u00a1\u020c\3\2\2\2\u00a3\u0210\3\2"+
		"\2\2\u00a5\u0218\3\2\2\2\u00a7\u0220\3\2\2\2\u00a9\u0224\3\2\2\2\u00ab"+
		"\u0227\3\2\2\2\u00ad\u022a\3\2\2\2\u00af\u022d\3\2\2\2\u00b1\u0232\3\2"+
		"\2\2\u00b3\u0239\3\2\2\2\u00b5\u023f\3\2\2\2\u00b7\u0243\3\2\2\2\u00b9"+
		"\u0248\3\2\2\2\u00bb\u0250\3\2\2\2\u00bd\u0252\3\2\2\2\u00bf\u0254\3\2"+
		"\2\2\u00c1\u0256\3\2\2\2\u00c3\u025a\3\2\2\2\u00c5\u025c\3\2\2\2\u00c7"+
		"\u025e\3\2\2\2\u00c9\u0264\3\2\2\2\u00cb\u0269\3\2\2\2\u00cd\u026e\3\2"+
		"\2\2\u00cf\u0272\3\2\2\2\u00d1\u0278\3\2\2\2\u00d3\u027f\3\2\2\2\u00d5"+
		"\u0285\3\2\2\2\u00d7\u028a\3\2\2\2\u00d9\u0291\3\2\2\2\u00db\u0298\3\2"+
		"\2\2\u00dd\u029d\3\2\2\2\u00df\u02a6\3\2\2\2\u00e1\u02ad\3\2\2\2\u00e3"+
		"\u02b6\3\2\2\2\u00e5\u02bd\3\2\2\2\u00e7\u02c3\3\2\2\2\u00e9\u02c9\3\2"+
		"\2\2\u00eb\u02ce\3\2\2\2\u00ed\u02d6\3\2\2\2\u00ef\u02da\3\2\2\2\u00f1"+
		"\u02f4\3\2\2\2\u00f3\u02f6\3\2\2\2\u00f5\u02f8\3\2\2\2\u00f7\u02fe\3\2"+
		"\2\2\u00f9\u030c\3\2\2\2\u00fb\u0316\3\2\2\2\u00fd\u0322\3\2\2\2\u00ff"+
		"\u0324\3\2\2\2\u0101\u0326\3\2\2\2\u0103\u0330\3\2\2\2\u0105\u0332\3\2"+
		"\2\2\u0107\u0351\3\2\2\2\u0109\u0355\3\2\2\2\u010b\u0359\3\2\2\2\u010d"+
		"\u035b\3\2\2\2\u010f\u0367\3\2\2\2\u0111\u036c\3\2\2\2\u0113\u0372\3\2"+
		"\2\2\u0115\u0375\3\2\2\2\u0117\u037b\3\2\2\2\u0119\u037e\3\2\2\2\u011b"+
		"\u0383\3\2\2\2\u011d\u0392\3\2\2\2\u011f\u03a3\3\2\2\2\u0121\u03a9\3\2"+
		"\2\2\u0123\u03ae\3\2\2\2\u0125\u03b4\3\2\2\2\u0127\u03b9\3\2\2\2\u0129"+
		"\u03c7\3\2\2\2\u012b\u03cd\3\2\2\2\u012d\u03d1\3\2\2\2\u012f\u03d7\3\2"+
		"\2\2\u0131\u03dd\3\2\2\2\u0133\u03e3\3\2\2\2\u0135\u03e7\3\2\2\2\u0137"+
		"\u03eb\3\2\2\2\u0139\u03f1\3\2\2\2\u013b\u03f7\3\2\2\2\u013d\u03fd\3\2"+
		"\2\2\u013f\u0403\3\2\2\2\u0141\u0407\3\2\2\2\u0143\u0149\5\u00edv\2\u0144"+
		"\u0149\5\u00f9|\2\u0145\u0149\5\u0105\u0082\2\u0146\u0149\5\u010b\u0085"+
		"\2\u0147\u0149\5\u010d\u0086\2\u0148\u0143\3\2\2\2\u0148\u0144\3\2\2\2"+
		"\u0148\u0145\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0147\3\2\2\2\u0149\6\3"+
		"\2\2\2\u014a\u014b\t\2\2\2\u014b\b\3\2\2\2\u014c\u014d\t\3\2\2\u014d\n"+
		"\3\2\2\2\u014e\u0152\5\7\3\2\u014f\u0152\5\t\4\2\u0150\u0152\7a\2\2\u0151"+
		"\u014e\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0150\3\2\2\2\u0152\f\3\2\2\2"+
		"\u0153\u0154\t\4\2\2\u0154\16\3\2\2\2\u0155\u0156\t\5\2\2\u0156\20\3\2"+
		"\2\2\u0157\u0158\t\6\2\2\u0158\22\3\2\2\2\u0159\u015a\t\7\2\2\u015a\24"+
		"\3\2\2\2\u015b\u015c\t\b\2\2\u015c\26\3\2\2\2\u015d\u015e\t\t\2\2\u015e"+
		"\30\3\2\2\2\u015f\u0160\t\n\2\2\u0160\32\3\2\2\2\u0161\u0162\t\13\2\2"+
		"\u0162\34\3\2\2\2\u0163\u0164\t\f\2\2\u0164\36\3\2\2\2\u0165\u0166\t\r"+
		"\2\2\u0166 \3\2\2\2\u0167\u0168\t\16\2\2\u0168\"\3\2\2\2\u0169\u016a\t"+
		"\17\2\2\u016a$\3\2\2\2\u016b\u016c\t\20\2\2\u016c&\3\2\2\2\u016d\u016e"+
		"\t\21\2\2\u016e(\3\2\2\2\u016f\u0170\t\22\2\2\u0170*\3\2\2\2\u0171\u0172"+
		"\t\23\2\2\u0172,\3\2\2\2\u0173\u0174\t\24\2\2\u0174.\3\2\2\2\u0175\u0176"+
		"\t\25\2\2\u0176\60\3\2\2\2\u0177\u0178\t\26\2\2\u0178\62\3\2\2\2\u0179"+
		"\u017a\t\27\2\2\u017a\64\3\2\2\2\u017b\u017c\t\30\2\2\u017c\66\3\2\2\2"+
		"\u017d\u017e\t\31\2\2\u017e8\3\2\2\2\u017f\u0180\t\32\2\2\u0180:\3\2\2"+
		"\2\u0181\u0182\t\33\2\2\u0182<\3\2\2\2\u0183\u0184\t\34\2\2\u0184>\3\2"+
		"\2\2\u0185\u0186\t\35\2\2\u0186@\3\2\2\2\u0187\u0188\t\36\2\2\u0188B\3"+
		"\2\2\2\u0189\u018a\t\37\2\2\u018aD\3\2\2\2\u018b\u018c\t \2\2\u018cF\3"+
		"\2\2\2\u018d\u018e\7*\2\2\u018eH\3\2\2\2\u018f\u0190\7+\2\2\u0190J\3\2"+
		"\2\2\u0191\u0192\7}\2\2\u0192L\3\2\2\2\u0193\u0194\7\177\2\2\u0194N\3"+
		"\2\2\2\u0195\u0196\7]\2\2\u0196P\3\2\2\2\u0197\u0198\7_\2\2\u0198R\3\2"+
		"\2\2\u0199\u019a\7~\2\2\u019aT\3\2\2\2\u019b\u019c\7,\2\2\u019cV\3\2\2"+
		"\2\u019d\u019e\7(\2\2\u019eX\3\2\2\2\u019f\u01a0\7-\2\2\u01a0Z\3\2\2\2"+
		"\u01a1\u01a2\7/\2\2\u01a2\\\3\2\2\2\u01a3\u01a4\7\u0080\2\2\u01a4^\3\2"+
		"\2\2\u01a5\u01a6\7#\2\2\u01a6`\3\2\2\2\u01a7\u01a8\7\61\2\2\u01a8b\3\2"+
		"\2\2\u01a9\u01aa\7\'\2\2\u01aad\3\2\2\2\u01ab\u01ac\7>\2\2\u01acf\3\2"+
		"\2\2\u01ad\u01ae\7@\2\2\u01aeh\3\2\2\2\u01af\u01b0\7>\2\2\u01b0\u01b1"+
		"\7?\2\2\u01b1j\3\2\2\2\u01b2\u01b3\7@\2\2\u01b3\u01b4\7?\2\2\u01b4l\3"+
		"\2\2\2\u01b5\u01b6\7?\2\2\u01b6\u01b7\7?\2\2\u01b7n\3\2\2\2\u01b8\u01b9"+
		"\7#\2\2\u01b9\u01ba\7?\2\2\u01bap\3\2\2\2\u01bb\u01bc\7`\2\2\u01bcr\3"+
		"\2\2\2\u01bd\u01be\7(\2\2\u01be\u01bf\7(\2\2\u01bft\3\2\2\2\u01c0\u01c1"+
		"\7~\2\2\u01c1\u01c2\7~\2\2\u01c2v\3\2\2\2\u01c3\u01c4\7?\2\2\u01c4x\3"+
		"\2\2\2\u01c5\u01c6\7,\2\2\u01c6\u01c7\7?\2\2\u01c7z\3\2\2\2\u01c8\u01c9"+
		"\7\61\2\2\u01c9\u01ca\7?\2\2\u01ca|\3\2\2\2\u01cb\u01cc\7\'\2\2\u01cc"+
		"\u01cd\7?\2\2\u01cd~\3\2\2\2\u01ce\u01cf\7-\2\2\u01cf\u01d0\7?\2\2\u01d0"+
		"\u0080\3\2\2\2\u01d1\u01d2\7/\2\2\u01d2\u01d3\7?\2\2\u01d3\u0082\3\2\2"+
		"\2\u01d4\u01d5\7(\2\2\u01d5\u01d6\7?\2\2\u01d6\u0084\3\2\2\2\u01d7\u01d8"+
		"\7`\2\2\u01d8\u01d9\7?\2\2\u01d9\u0086\3\2\2\2\u01da\u01db\7~\2\2\u01db"+
		"\u01dc\7?\2\2\u01dc\u0088\3\2\2\2\u01dd\u01de\7-\2\2\u01de\u01df\7-\2"+
		"\2\u01df\u008a\3\2\2\2\u01e0\u01e1\7/\2\2\u01e1\u01e2\7/\2\2\u01e2\u008c"+
		"\3\2\2\2\u01e3\u01e4\7\60\2\2\u01e4\u008e\3\2\2\2\u01e5\u01e6\7/\2\2\u01e6"+
		"\u01e7\7@\2\2\u01e7\u0090\3\2\2\2\u01e8\u01e9\5\67\33\2\u01e9\u01ea\5"+
		"#\21\2\u01ea\u01eb\5E\"\2\u01eb\u01ec\5\33\r\2\u01ec\u01ed\5/\27\2\u01ed"+
		"\u01ee\5\35\16\2\u01ee\u0092\3\2\2\2\u01ef\u01f0\7%\2\2\u01f0\u0094\3"+
		"\2\2\2\u01f1\u01f2\5\23\t\2\u01f2\u01f3\5\31\f\2\u01f3\u01f4\5\31\f\2"+
		"\u01f4\u01f5\5\27\13\2\u01f5\u0096\3\2\2\2\u01f6\u01f7\5\23\t\2\u01f7"+
		"\u01f8\5\31\f\2\u01f8\u01f9\5\31\f\2\u01f9\u01fa\5\65\32\2\u01fa\u0098"+
		"\3\2\2\2\u01fb\u01fc\5\31\f\2\u01fc\u01fd\5\33\r\2\u01fd\u01fe\5)\24\2"+
		"\u01fe\u01ff\5\65\32\2\u01ff\u009a\3\2\2\2\u0200\u0201\7A\2\2\u0201\u009c"+
		"\3\2\2\2\u0202\u0203\5#\21\2\u0203\u0204\5-\26\2\u0204\u0205\5=\36\2\u0205"+
		"\u009e\3\2\2\2\u0206\u0207\59\34\2\u0207\u0208\5\65\32\2\u0208\u0209\5"+
		"\23\t\2\u0209\u020a\5-\26\2\u020a\u020b\5\67\33\2\u020b\u00a0\3\2\2\2"+
		"\u020c\u020d\5\31\f\2\u020d\u020e\5\33\r\2\u020e\u020f\59\34\2\u020f\u00a2"+
		"\3\2\2\2\u0210\u0211\5=\36\2\u0211\u0212\5\67\33\2\u0212\u0213\5#\21\2"+
		"\u0213\u0214\5E\"\2\u0214\u0215\5\33\r\2\u0215\u0216\5/\27\2\u0216\u0217"+
		"\5\35\16\2\u0217\u00a4\3\2\2\2\u0218\u0219\5\33\r\2\u0219\u021a\5\67\33"+
		"\2\u021a\u021b\5#\21\2\u021b\u021c\5E\"\2\u021c\u021d\5\33\r\2\u021d\u021e"+
		"\5/\27\2\u021e\u021f\5\35\16\2\u021f\u00a6\3\2\2\2\u0220\u0221\5=\36\2"+
		"\u0221\u0222\5\23\t\2\u0222\u0223\5)\24\2\u0223\u00a8\3\2\2\2\u0224\u0225"+
		"\7@\2\2\u0225\u0226\7@\2\2\u0226\u00aa\3\2\2\2\u0227\u0228\7>\2\2\u0228"+
		"\u0229\7>\2\2\u0229\u00ac\3\2\2\2\u022a\u022b\5#\21\2\u022b\u022c\5\35"+
		"\16\2\u022c\u00ae\3\2\2\2\u022d\u022e\5\33\r\2\u022e\u022f\5)\24\2\u022f"+
		"\u0230\5\67\33\2\u0230\u0231\5\33\r\2\u0231\u00b0\3\2\2\2\u0232\u0233"+
		"\5\67\33\2\u0233\u0234\5?\37\2\u0234\u0235\5#\21\2\u0235\u0236\59\34\2"+
		"\u0236\u0237\5\27\13\2\u0237\u0238\5!\20\2\u0238\u00b2\3\2\2\2\u0239\u023a"+
		"\5?\37\2\u023a\u023b\5!\20\2\u023b\u023c\5#\21\2\u023c\u023d\5)\24\2\u023d"+
		"\u023e\5\33\r\2\u023e\u00b4\3\2\2\2\u023f\u0240\5\35\16\2\u0240\u0241"+
		"\5/\27\2\u0241\u0242\5\65\32\2\u0242\u00b6\3\2\2\2\u0243\u0244\5\27\13"+
		"\2\u0244\u0245\5\23\t\2\u0245\u0246\5\67\33\2\u0246\u0247\5\33\r\2\u0247"+
		"\u00b8\3\2\2\2\u0248\u0249\5\31\f\2\u0249\u024a\5\33\r\2\u024a\u024b\5"+
		"\35\16\2\u024b\u024c\5\23\t\2\u024c\u024d\5;\35\2\u024d\u024e\5)\24\2"+
		"\u024e\u024f\59\34\2\u024f\u00ba\3\2\2\2\u0250\u0251\7.\2\2\u0251\u00bc"+
		"\3\2\2\2\u0252\u0253\7<\2\2\u0253\u00be\3\2\2\2\u0254\u0255\7=\2\2\u0255"+
		"\u00c0\3\2\2\2\u0256\u0257\7\60\2\2\u0257\u0258\7\60\2\2\u0258\u0259\7"+
		"\60\2\2\u0259\u00c2\3\2\2\2\u025a\u025b\7)\2\2\u025b\u00c4\3\2\2\2\u025c"+
		"\u025d\7$\2\2\u025d\u00c6\3\2\2\2\u025e\u025f\5\27\13\2\u025f\u0260\5"+
		")\24\2\u0260\u0261\5\23\t\2\u0261\u0262\5\67\33\2\u0262\u0263\5\67\33"+
		"\2\u0263\u00c8\3\2\2\2\u0264\u0265\5=\36\2\u0265\u0266\5/\27\2\u0266\u0267"+
		"\5#\21\2\u0267\u0268\5\31\f\2\u0268\u00ca\3\2\2\2\u0269\u026a\5\25\n\2"+
		"\u026a\u026b\5/\27\2\u026b\u026c\5/\27\2\u026c\u026d\5)\24\2\u026d\u00cc"+
		"\3\2\2\2\u026e\u026f\5#\21\2\u026f\u0270\5-\26\2\u0270\u0271\59\34\2\u0271"+
		"\u00ce\3\2\2\2\u0272\u0273\5\35\16\2\u0273\u0274\5)\24\2\u0274\u0275\5"+
		"/\27\2\u0275\u0276\5\23\t\2\u0276\u0277\59\34\2\u0277\u00d0\3\2\2\2\u0278"+
		"\u0279\5\67\33\2\u0279\u027a\59\34\2\u027a\u027b\5\65\32\2\u027b\u027c"+
		"\5#\21\2\u027c\u027d\5-\26\2\u027d\u027e\5\37\17\2\u027e\u00d2\3\2\2\2"+
		"\u027f\u0280\5\37\17\2\u0280\u0281\5\65\32\2\u0281\u0282\5\23\t\2\u0282"+
		"\u0283\5\61\30\2\u0283\u0284\5!\20\2\u0284\u00d4\3\2\2\2\u0285\u0286\5"+
		"\33\r\2\u0286\u0287\5\31\f\2\u0287\u0288\5\37\17\2\u0288\u0289\5\33\r"+
		"\2\u0289\u00d6\3\2\2\2\u028a\u028b\5+\25\2\u028b\u028c\5\23\t\2\u028c"+
		"\u028d\59\34\2\u028d\u028e\5\65\32\2\u028e\u028f\5#\21\2\u028f\u0290\5"+
		"A \2\u0290\u00d8\3\2\2\2\u0291\u0292\5=\36\2\u0292\u0293\5\33\r\2\u0293"+
		"\u0294\5\65\32\2\u0294\u0295\59\34\2\u0295\u0296\5\33\r\2\u0296\u0297"+
		"\5A \2\u0297\u00da\3\2\2\2\u0298\u0299\5)\24\2\u0299\u029a\5/\27\2\u029a"+
		"\u029b\5-\26\2\u029b\u029c\5\37\17\2\u029c\u00dc\3\2\2\2\u029d\u029e\5"+
		";\35\2\u029e\u029f\5-\26\2\u029f\u02a0\5\67\33\2\u02a0\u02a1\5#\21\2\u02a1"+
		"\u02a2\5\37\17\2\u02a2\u02a3\5-\26\2\u02a3\u02a4\5\33\r\2\u02a4\u02a5"+
		"\5\31\f\2\u02a5\u00de\3\2\2\2\u02a6\u02a7\5\31\f\2\u02a7\u02a8\5\33\r"+
		"\2\u02a8\u02a9\5)\24\2\u02a9\u02aa\5\33\r\2\u02aa\u02ab\59\34\2\u02ab"+
		"\u02ac\5\33\r\2\u02ac\u00e0\3\2\2\2\u02ad\u02ae\5/\27\2\u02ae\u02af\5"+
		"\61\30\2\u02af\u02b0\5\33\r\2\u02b0\u02b1\5\65\32\2\u02b1\u02b2\5\23\t"+
		"\2\u02b2\u02b3\59\34\2\u02b3\u02b4\5/\27\2\u02b4\u02b5\5\65\32\2\u02b5"+
		"\u00e2\3\2\2\2\u02b6\u02b7\5\65\32\2\u02b7\u02b8\5\33\r\2\u02b8\u02b9"+
		"\59\34\2\u02b9\u02ba\5;\35\2\u02ba\u02bb\5\65\32\2\u02bb\u02bc\5-\26\2"+
		"\u02bc\u00e4\3\2\2\2\u02bd\u02be\5\27\13\2\u02be\u02bf\5/\27\2\u02bf\u02c0"+
		"\5-\26\2\u02c0\u02c1\5\67\33\2\u02c1\u02c2\59\34\2\u02c2\u00e6\3\2\2\2"+
		"\u02c3\u02c4\7h\2\2\u02c4\u02c5\7c\2\2\u02c5\u02c6\7n\2\2\u02c6\u02c7"+
		"\7u\2\2\u02c7\u02c8\7g\2\2\u02c8\u00e8\3\2\2\2\u02c9\u02ca\7v\2\2\u02ca"+
		"\u02cb\7t\2\2\u02cb\u02cc\7w\2\2\u02cc\u02cd\7g\2\2\u02cd\u00ea\3\2\2"+
		"\2\u02ce\u02d3\5\13\5\2\u02cf\u02d2\5\13\5\2\u02d0\u02d2\5\r\6\2\u02d1"+
		"\u02cf\3\2\2\2\u02d1\u02d0\3\2\2\2\u02d2\u02d5\3\2\2\2\u02d3\u02d1\3\2"+
		"\2\2\u02d3\u02d4\3\2\2\2\u02d4\u00ec\3\2\2\2\u02d5\u02d3\3\2\2\2\u02d6"+
		"\u02d8\5\u00efw\2\u02d7\u02d9\5\u00f1x\2\u02d8\u02d7\3\2\2\2\u02d8\u02d9"+
		"\3\2\2\2\u02d9\u00ee\3\2\2\2\u02da\u02e1\5\17\7\2\u02db\u02dd\7)\2\2\u02dc"+
		"\u02db\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd\u02de\3\2\2\2\u02de\u02e0\5\r"+
		"\6\2\u02df\u02dc\3\2\2\2\u02e0\u02e3\3\2\2\2\u02e1\u02df\3\2\2\2\u02e1"+
		"\u02e2\3\2\2\2\u02e2\u00f0\3\2\2\2\u02e3\u02e1\3\2\2\2\u02e4\u02e6\5\u00f3"+
		"y\2\u02e5\u02e7\5\u00f5z\2\u02e6\u02e5\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7"+
		"\u02f5\3\2\2\2\u02e8\u02ea\5\u00f3y\2\u02e9\u02eb\5\u00f7{\2\u02ea\u02e9"+
		"\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb\u02f5\3\2\2\2\u02ec\u02ee\5\u00f5z"+
		"\2\u02ed\u02ef\5\u00f3y\2\u02ee\u02ed\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef"+
		"\u02f5\3\2\2\2\u02f0\u02f2\5\u00f7{\2\u02f1\u02f3\5\u00f3y\2\u02f2\u02f1"+
		"\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3\u02f5\3\2\2\2\u02f4\u02e4\3\2\2\2\u02f4"+
		"\u02e8\3\2\2\2\u02f4\u02ec\3\2\2\2\u02f4\u02f0\3\2\2\2\u02f5\u00f2\3\2"+
		"\2\2\u02f6\u02f7\t\33\2\2\u02f7\u00f4\3\2\2\2\u02f8\u02f9\t\22\2\2\u02f9"+
		"\u00f6\3\2\2\2\u02fa\u02fb\7n\2\2\u02fb\u02ff\7n\2\2\u02fc\u02fd\7N\2"+
		"\2\u02fd\u02ff\7N\2\2\u02fe\u02fa\3\2\2\2\u02fe\u02fc\3\2\2\2\u02ff\u00f8"+
		"\3\2\2\2\u0300\u0302\5\u00fb}\2\u0301\u0303\5\u00fd~\2\u0302\u0301\3\2"+
		"\2\2\u0302\u0303\3\2\2\2\u0303\u0305\3\2\2\2\u0304\u0306\5\u0103\u0081"+
		"\2\u0305\u0304\3\2\2\2\u0305\u0306\3\2\2\2\u0306\u030d\3\2\2\2\u0307\u0308"+
		"\5\u0101\u0080\2\u0308\u030a\5\u00fd~\2\u0309\u030b\5\u0103\u0081\2\u030a"+
		"\u0309\3\2\2\2\u030a\u030b\3\2\2\2\u030b\u030d\3\2\2\2\u030c\u0300\3\2"+
		"\2\2\u030c\u0307\3\2\2\2\u030d\u00fa\3\2\2\2\u030e\u0310\5\u0101\u0080"+
		"\2\u030f\u030e\3\2\2\2\u030f\u0310\3\2\2\2\u0310\u0311\3\2\2\2\u0311\u0312"+
		"\7\60\2\2\u0312\u0317\5\u0101\u0080\2\u0313\u0314\5\u0101\u0080\2\u0314"+
		"\u0315\7\60\2\2\u0315\u0317\3\2\2\2\u0316\u030f\3\2\2\2\u0316\u0313\3"+
		"\2\2\2\u0317\u00fc\3\2\2\2\u0318\u031a\7g\2\2\u0319\u031b\5\u00ff\177"+
		"\2\u031a\u0319\3\2\2\2\u031a\u031b\3\2\2\2\u031b\u031c\3\2\2\2\u031c\u0323"+
		"\5\u0101\u0080\2\u031d\u031f\7G\2\2\u031e\u0320\5\u00ff\177\2\u031f\u031e"+
		"\3\2\2\2\u031f\u0320\3\2\2\2\u0320\u0321\3\2\2\2\u0321\u0323\5\u0101\u0080"+
		"\2\u0322\u0318\3\2\2\2\u0322\u031d\3\2\2\2\u0323\u00fe\3\2\2\2\u0324\u0325"+
		"\t!\2\2\u0325\u0100\3\2\2\2\u0326\u032d\5\r\6\2\u0327\u0329\7)\2\2\u0328"+
		"\u0327\3\2\2\2\u0328\u0329\3\2\2\2\u0329\u032a\3\2\2\2\u032a\u032c\5\r"+
		"\6\2\u032b\u0328\3\2\2\2\u032c\u032f\3\2\2\2\u032d\u032b\3\2\2\2\u032d"+
		"\u032e\3\2\2\2\u032e\u0102\3\2\2\2\u032f\u032d\3\2\2\2\u0330\u0331\t\""+
		"\2\2\u0331\u0104\3\2\2\2\u0332\u0336\5\u00c5b\2\u0333\u0335\5\u0109\u0084"+
		"\2\u0334\u0333\3\2\2\2\u0335\u0338\3\2\2\2\u0336\u0334\3\2\2\2\u0336\u0337"+
		"\3\2\2\2\u0337\u0339\3\2\2\2\u0338\u0336\3\2\2\2\u0339\u033a\5\u00c5b"+
		"\2\u033a\u0106\3\2\2\2\u033b\u033c\7^\2\2\u033c\u0352\7)\2\2\u033d\u033e"+
		"\7^\2\2\u033e\u0352\7$\2\2\u033f\u0340\7^\2\2\u0340\u0352\7A\2\2\u0341"+
		"\u0342\7^\2\2\u0342\u0352\7^\2\2\u0343\u0344\7^\2\2\u0344\u0352\7c\2\2"+
		"\u0345\u0346\7^\2\2\u0346\u0352\7d\2\2\u0347\u0348\7^\2\2\u0348\u0352"+
		"\7h\2\2\u0349\u034a\7^\2\2\u034a\u0352\7p\2\2\u034b\u034c\7^\2\2\u034c"+
		"\u0352\7t\2\2\u034d\u034e\7^\2\2\u034e\u0352\7v\2\2\u034f\u0350\7^\2\2"+
		"\u0350\u0352\7x\2\2\u0351\u033b\3\2\2\2\u0351\u033d\3\2\2\2\u0351\u033f"+
		"\3\2\2\2\u0351\u0341\3\2\2\2\u0351\u0343\3\2\2\2\u0351\u0345\3\2\2\2\u0351"+
		"\u0347\3\2\2\2\u0351\u0349\3\2\2\2\u0351\u034b\3\2\2\2\u0351\u034d\3\2"+
		"\2\2\u0351\u034f\3\2\2\2\u0352\u0108\3\2\2\2\u0353\u0356\n#\2\2\u0354"+
		"\u0356\5\u0107\u0083\2\u0355\u0353\3\2\2\2\u0355\u0354\3\2\2\2\u0356\u010a"+
		"\3\2\2\2\u0357\u035a\5\u00e7s\2\u0358\u035a\5\u00e9t\2\u0359\u0357\3\2"+
		"\2\2\u0359\u0358\3\2\2\2\u035a\u010c\3\2\2\2\u035b\u035c\5\u00c3a\2\u035c"+
		"\u035d\5\u00ebu\2\u035d\u035e\5\u00c3a\2\u035e\u0360\5\u00bb]\2\u035f"+
		"\u0361\5\u0105\u0082\2\u0360\u035f\3\2\2\2\u0360\u0361\3\2\2\2\u0361\u010e"+
		"\3\2\2\2\u0362\u0364\7\17\2\2\u0363\u0365\7\f\2\2\u0364\u0363\3\2\2\2"+
		"\u0364\u0365\3\2\2\2\u0365\u0368\3\2\2\2\u0366\u0368\7\f\2\2\u0367\u0362"+
		"\3\2\2\2\u0367\u0366\3\2\2\2\u0368\u0369\3\2\2\2\u0369\u036a\b\u0087\2"+
		"\2\u036a\u0110\3\2\2\2\u036b\u036d\t$\2\2\u036c\u036b\3\2\2\2\u036d\u036e"+
		"\3\2\2\2\u036e\u036c\3\2\2\2\u036e\u036f\3\2\2\2\u036f\u0370\3\2\2\2\u0370"+
		"\u0371\b\u0088\2\2\u0371\u0112\3\2\2\2\u0372\u0373\7^\2\2\u0373\u0374"+
		"\n%\2\2\u0374\u0114\3\2\2\2\u0375\u0376\n&\2\2\u0376\u0116\3\2\2\2\u0377"+
		"\u037a\5\u0113\u0089\2\u0378\u037a\5\u0115\u008a\2\u0379\u0377\3\2\2\2"+
		"\u0379\u0378\3\2\2\2\u037a\u037d\3\2\2\2\u037b\u0379\3\2\2\2\u037b\u037c"+
		"\3\2\2\2\u037c\u0118\3\2\2\2\u037d\u037b\3\2\2\2\u037e\u037f\7$\2\2\u037f"+
		"\u0380\5\u0117\u008b\2\u0380\u0381\7\f\2\2\u0381\u0382\b\u008c\3\2\u0382"+
		"\u011a\3\2\2\2\u0383\u0384\7$\2\2\u0384\u0385\5\u0117\u008b\2\u0385\u038a"+
		"\7\2\2\2\u0386\u0389\5\u0113\u0089\2\u0387\u0389\n\'\2\2\u0388\u0386\3"+
		"\2\2\2\u0388\u0387\3\2\2\2\u0389\u038c\3\2\2\2\u038a\u0388\3\2\2\2\u038a"+
		"\u038b\3\2\2\2\u038b\u038e\3\2\2\2\u038c\u038a\3\2\2\2\u038d\u038f\t("+
		"\2\2\u038e\u038d\3\2\2\2\u038f\u0390\3\2\2\2\u0390\u0391\b\u008d\4\2\u0391"+
		"\u011c\3\2\2\2\u0392\u0393\7$\2\2\u0393\u0394\5\u0117\u008b\2\u0394\u0395"+
		"\7^\2\2\u0395\u0396\7\2\2\2\u0396\u039b\3\2\2\2\u0397\u039a\5\u0113\u0089"+
		"\2\u0398\u039a\n\'\2\2\u0399\u0397\3\2\2\2\u0399\u0398\3\2\2\2\u039a\u039d"+
		"\3\2\2\2\u039b\u0399\3\2\2\2\u039b\u039c\3\2\2\2\u039c\u039f\3\2\2\2\u039d"+
		"\u039b\3\2\2\2\u039e\u03a0\t(\2\2\u039f\u039e\3\2\2\2\u03a0\u03a1\3\2"+
		"\2\2\u03a1\u03a2\b\u008e\5\2\u03a2\u011e\3\2\2\2\u03a3\u03a4\7$\2\2\u03a4"+
		"\u03a5\5\u0117\u008b\2\u03a5\u03a6\7^\2\2\u03a6\u03a7\7\2\2\3\u03a7\u03a8"+
		"\b\u008f\6\2\u03a8\u0120\3\2\2\2\u03a9\u03aa\7$\2\2\u03aa\u03ab\5\u0117"+
		"\u008b\2\u03ab\u03ac\7\2\2\3\u03ac\u03ad\b\u0090\7\2\u03ad\u0122\3\2\2"+
		"\2\u03ae\u03af\7*\2\2\u03af\u03b0\7,\2\2\u03b0\u03b1\3\2\2\2\u03b1\u03b2"+
		"\7\2\2\3\u03b2\u03b3\b\u0091\b\2\u03b3\u0124\3\2\2\2\u03b4\u03b5\7,\2"+
		"\2\u03b5\u03b6\7+\2\2\u03b6\u03b7\3\2\2\2\u03b7\u03b8\b\u0092\t\2\u03b8"+
		"\u0126\3\2\2\2\u03b9\u03ba\7\61\2\2\u03ba\u03bb\7\61\2\2\u03bb\u03bf\3"+
		"\2\2\2\u03bc\u03be\13\2\2\2\u03bd\u03bc\3\2\2\2\u03be\u03c1\3\2\2\2\u03bf"+
		"\u03c0\3\2\2\2\u03bf\u03bd\3\2\2\2\u03c0\u03c3\3\2\2\2\u03c1\u03bf\3\2"+
		"\2\2\u03c2\u03c4\t)\2\2\u03c3\u03c2\3\2\2\2\u03c4\u03c5\3\2\2\2\u03c5"+
		"\u03c6\b\u0093\2\2\u03c6\u0128\3\2\2\2\u03c7\u03c8\7*\2\2\u03c8\u03c9"+
		"\7,\2\2\u03c9\u03ca\3\2\2\2\u03ca\u03cb\b\u0094\n\2\u03cb\u03cc\b\u0094"+
		"\2\2\u03cc\u012a\3\2\2\2\u03cd\u03ce\13\2\2\2\u03ce\u03cf\7\2\2\3\u03cf"+
		"\u03d0\b\u0095\13\2\u03d0\u012c\3\2\2\2\u03d1\u03d2\7*\2\2\u03d2\u03d3"+
		"\7,\2\2\u03d3\u03d4\3\2\2\2\u03d4\u03d5\7\2\2\3\u03d5\u03d6\b\u0096\f"+
		"\2\u03d6\u012e\3\2\2\2\u03d7\u03d8\7*\2\2\u03d8\u03d9\7,\2\2\u03d9\u03da"+
		"\3\2\2\2\u03da\u03db\b\u0097\r\2\u03db\u03dc\b\u0097\2\2\u03dc\u0130\3"+
		"\2\2\2\u03dd\u03de\7,\2\2\u03de\u03df\7+\2\2\u03df\u03e0\3\2\2\2\u03e0"+
		"\u03e1\b\u0098\16\2\u03e1\u03e2\b\u0098\2\2\u03e2\u0132\3\2\2\2\u03e3"+
		"\u03e4\13\2\2\2\u03e4\u03e5\3\2\2\2\u03e5\u03e6\b\u0099\2\2\u03e6\u0134"+
		"\3\2\2\2\u03e7\u03e8\13\2\2\2\u03e8\u03e9\7\2\2\3\u03e9\u03ea\b\u009a"+
		"\17\2\u03ea\u0136\3\2\2\2\u03eb\u03ec\7*\2\2\u03ec\u03ed\7,\2\2\u03ed"+
		"\u03ee\3\2\2\2\u03ee\u03ef\7\2\2\3\u03ef\u03f0\b\u009b\20\2\u03f0\u0138"+
		"\3\2\2\2\u03f1\u03f2\7,\2\2\u03f2\u03f3\7+\2\2\u03f3\u03f4\3\2\2\2\u03f4"+
		"\u03f5\7\2\2\3\u03f5\u03f6\b\u009c\21\2\u03f6\u013a\3\2\2\2\u03f7\u03f8"+
		"\7*\2\2\u03f8\u03f9\7,\2\2\u03f9\u03fa\3\2\2\2\u03fa\u03fb\b\u009d\r\2"+
		"\u03fb\u03fc\b\u009d\2\2\u03fc\u013c\3\2\2\2\u03fd\u03fe\7,\2\2\u03fe"+
		"\u03ff\7+\2\2\u03ff\u0400\3\2\2\2\u0400\u0401\b\u009e\16\2\u0401\u0402"+
		"\b\u009e\2\2\u0402\u013e\3\2\2\2\u0403\u0404\13\2\2\2\u0404\u0405\3\2"+
		"\2\2\u0405\u0406\b\u009f\2\2\u0406\u0140\3\2\2\2\u0407\u0408\13\2\2\2"+
		"\u0408\u0409\b\u00a0\22\2\u0409\u0142\3\2\2\2/\2\3\4\u0148\u0151\u02d1"+
		"\u02d3\u02d8\u02dc\u02e1\u02e6\u02ea\u02ee\u02f2\u02f4\u02fe\u0302\u0305"+
		"\u030a\u030c\u030f\u0316\u031a\u031f\u0322\u0328\u032d\u0336\u0351\u0355"+
		"\u0359\u0360\u0364\u0367\u036e\u0379\u037b\u0388\u038a\u038e\u0399\u039b"+
		"\u039f\u03bf\u03c3\23\b\2\2\3\u008c\2\3\u008d\3\3\u008e\4\3\u008f\5\3"+
		"\u0090\6\3\u0091\7\3\u0092\b\7\3\2\3\u0095\t\3\u0096\n\7\4\2\6\2\2\3\u009a"+
		"\13\3\u009b\f\3\u009c\r\3\u00a0\16";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
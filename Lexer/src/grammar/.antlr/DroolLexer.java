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
		ERROR=1, TYPEID=2, OBJECTID=3, BOOL_CONST=4, INT_CONST=5, STR_CONST=6, 
		LPAREN=7, RPAREN=8, COLON=9, ATSYM=10, SEMICOLON=11, COMMA=12, PLUS=13, 
		MINUS=14, STAR=15, SLASH=16, TILDE=17, LT=18, GT=19, EQUALS=20, LBRACE=21, 
		RBRACE=22, DOT=23, DARROW=24, CLASS=25, ELSE=26, FI=27, IF=28, IN=29, 
		INHERITS=30, LET=31, LOOP=32, POOL=33, THEN=34, WHILE=35, CASE=36, ESAC=37, 
		OF=38, NEW=39, ISVOID=40, NOT=41, ASSIGNVAL=42, GRAPH=43, VERTEX=44, EDGE=45, 
		PUSH=46, PULL=47, NEGATION=48, CONTAIN=49, EQ=50, NEQ=51, IS=52, PRINT=53, 
		FOREACH=54, WHITESPACE=55, ESC=56, UNTERM_STR=57, NULL_STR=58, ESC_NULL_STR=59, 
		EOF_BCKSLSH_STR=60, EOF_STR=61, EOF_COMMENT_0=62, OPEN_COMMENT=63, SINGLE_LINE_COMMENT=64, 
		MULTI_LINE_COMMENT=65, OTHER=66, EOF_COMMENT_1=67, EOF_COMMENT_2=68, IN_NEST_MLC_0=69, 
		CLOSE_MLC_0=70, CONTENT_MLC_0=71, EOF_COMMENT_3=72, EOF_COMMENT_4=73, 
		EOF_COMMENT_5=74, IN_NEST_MLC_1=75, CLOSE_MLC_1=76, CONTENT_MLC_1=77;
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
			"SEMICOLON", "DARROW", "COMMA", "DOT", "LPAREN", "RPAREN", "LBRACE", 
			"RBRACE", "PLUS", "MINUS", "STAR", "SLASH", "COLON", "ATSYM", "TILDE", 
			"LT", "GT", "EQUALS", "PUSH", "PULL", "NEGATION", "CONTAIN", "EQ", "NEQ", 
			"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", 
			"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "CLASS", 
			"ELSE", "FI", "IF", "IN", "INHERITS", "LET", "LOOP", "POOL", "THEN", 
			"WHILE", "CASE", "ESAC", "OF", "NEW", "ISVOID", "NOT", "GRAPH", "VERTEX", 
			"EDGE", "IS", "PRINT", "FOREACH", "DIGIT", "UCL", "LCL", "LETTER", "WHITESPACE", 
			"ESC", "STR_INVALID_NEG", "STR_VALID", "UNTERM_STR", "NULL_STR", "ESC_NULL_STR", 
			"EOF_BCKSLSH_STR", "EOF_STR", "EOF_COMMENT_0", "OPEN_COMMENT", "BOOL_CONST", 
			"INT_CONST", "STR_CONST", "TYPEID", "OBJECTID", "SINGLE_LINE_COMMENT", 
			"MULTI_LINE_COMMENT", "OTHER", "EOF_COMMENT_1", "EOF_COMMENT_2", "IN_NEST_MLC_0", 
			"CLOSE_MLC_0", "CONTENT_MLC_0", "EOF_COMMENT_3", "EOF_COMMENT_4", "EOF_COMMENT_5", 
			"IN_NEST_MLC_1", "CLOSE_MLC_1", "CONTENT_MLC_1"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, "'('", "')'", "':'", "'@'", 
			"';'", "','", "'+'", "'-'", "'*'", "'/'", "'~'", "'<'", "'>'", "'='", 
			"'{'", "'}'", "'.'", "'=>'", null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "'<<'", "'>>'", "'!'", "'<?>'", "'=='", "'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ERROR", "TYPEID", "OBJECTID", "BOOL_CONST", "INT_CONST", "STR_CONST", 
			"LPAREN", "RPAREN", "COLON", "ATSYM", "SEMICOLON", "COMMA", "PLUS", "MINUS", 
			"STAR", "SLASH", "TILDE", "LT", "GT", "EQUALS", "LBRACE", "RBRACE", "DOT", 
			"DARROW", "CLASS", "ELSE", "FI", "IF", "IN", "INHERITS", "LET", "LOOP", 
			"POOL", "THEN", "WHILE", "CASE", "ESAC", "OF", "NEW", "ISVOID", "NOT", 
			"ASSIGNVAL", "GRAPH", "VERTEX", "EDGE", "PUSH", "PULL", "NEGATION", "CONTAIN", 
			"EQ", "NEQ", "IS", "PRINT", "FOREACH", "WHITESPACE", "ESC", "UNTERM_STR", 
			"NULL_STR", "ESC_NULL_STR", "EOF_BCKSLSH_STR", "EOF_STR", "EOF_COMMENT_0", 
			"OPEN_COMMENT", "SINGLE_LINE_COMMENT", "MULTI_LINE_COMMENT", "OTHER", 
			"EOF_COMMENT_1", "EOF_COMMENT_2", "IN_NEST_MLC_0", "CLOSE_MLC_0", "CONTENT_MLC_0", 
			"EOF_COMMENT_3", "EOF_COMMENT_4", "EOF_COMMENT_5", "IN_NEST_MLC_1", "CLOSE_MLC_1", 
			"CONTENT_MLC_1"
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
		case 81:
			UNTERM_STR_action((RuleContext)_localctx, actionIndex);
			break;
		case 82:
			NULL_STR_action((RuleContext)_localctx, actionIndex);
			break;
		case 83:
			ESC_NULL_STR_action((RuleContext)_localctx, actionIndex);
			break;
		case 84:
			EOF_BCKSLSH_STR_action((RuleContext)_localctx, actionIndex);
			break;
		case 85:
			EOF_STR_action((RuleContext)_localctx, actionIndex);
			break;
		case 86:
			EOF_COMMENT_0_action((RuleContext)_localctx, actionIndex);
			break;
		case 87:
			OPEN_COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 90:
			STR_CONST_action((RuleContext)_localctx, actionIndex);
			break;
		case 95:
			OTHER_action((RuleContext)_localctx, actionIndex);
			break;
		case 96:
			EOF_COMMENT_1_action((RuleContext)_localctx, actionIndex);
			break;
		case 97:
			EOF_COMMENT_2_action((RuleContext)_localctx, actionIndex);
			break;
		case 101:
			EOF_COMMENT_3_action((RuleContext)_localctx, actionIndex);
			break;
		case 102:
			EOF_COMMENT_4_action((RuleContext)_localctx, actionIndex);
			break;
		case 103:
			EOF_COMMENT_5_action((RuleContext)_localctx, actionIndex);
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
	private void STR_CONST_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7:
			 processString(); 
			break;
		}
	}
	private void OTHER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8:
			invalidToken();
			break;
		}
	}
	private void EOF_COMMENT_1_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9:
			reportError("EOF in comment");
			break;
		}
	}
	private void EOF_COMMENT_2_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 10:
			reportError("EOF in comment");
			break;
		}
	}
	private void EOF_COMMENT_3_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 11:
			reportError("EOF in comment");
			break;
		}
	}
	private void EOF_COMMENT_4_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 12:
			reportError("EOF in comment");
			break;
		}
	}
	private void EOF_COMMENT_5_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 13:
			reportError("EOF in comment");
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2O\u028d\b\1\b\1\b"+
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
		"\tj\4k\tk\4l\tl\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3"+
		"\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3"+
		"\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3"+
		"\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3"+
		"#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3."+
		"\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\38\3"+
		"8\38\39\39\39\39\39\39\39\39\39\3:\3:\3:\3:\3;\3;\3;\3;\3;\3<\3<\3<\3"+
		"<\3<\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3"+
		"A\3A\3A\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3C\3D\3D\3D\3D\3E\3E\3E\3E\3E\3"+
		"E\3F\3F\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G\3H\3H\3H\3I\3I\3I\3I\3I\3I\3J\3"+
		"J\3J\3J\3J\3J\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\5N\u01c4\nN\3O\6O\u01c7\n"+
		"O\rO\16O\u01c8\3O\3O\3P\3P\3P\3Q\3Q\3R\3R\7R\u01d4\nR\fR\16R\u01d7\13"+
		"R\3S\3S\3S\3S\3S\3T\3T\3T\3T\3T\7T\u01e3\nT\fT\16T\u01e6\13T\3T\5T\u01e9"+
		"\nT\3T\3T\3U\3U\3U\3U\3U\3U\3U\7U\u01f4\nU\fU\16U\u01f7\13U\3U\5U\u01fa"+
		"\nU\3U\3U\3V\3V\3V\3V\3V\3V\3W\3W\3W\3W\3W\3X\3X\3X\3X\3X\3X\3Y\3Y\3Y"+
		"\3Y\3Y\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u021f\nZ\3[\6[\u0222\n[\r["+
		"\16[\u0223\3\\\3\\\3\\\3\\\3\\\3]\3]\3]\3]\7]\u022f\n]\f]\16]\u0232\13"+
		"]\3^\3^\3^\3^\7^\u0238\n^\f^\16^\u023b\13^\3_\3_\3_\3_\7_\u0241\n_\f_"+
		"\16_\u0244\13_\3_\5_\u0247\n_\3_\3_\3`\3`\3`\3`\3`\3`\3a\3a\3a\3b\3b\3"+
		"b\3b\3c\3c\3c\3c\3c\3c\3d\3d\3d\3d\3d\3d\3e\3e\3e\3e\3e\3e\3f\3f\3f\3"+
		"f\3g\3g\3g\3g\3h\3h\3h\3h\3h\3h\3i\3i\3i\3i\3i\3i\3j\3j\3j\3j\3j\3j\3"+
		"k\3k\3k\3k\3k\3k\3l\3l\3l\3l\3\u0242\2m\5\r\7\32\t\16\13\31\r\t\17\n\21"+
		"\27\23\30\25\17\27\20\31\21\33\22\35\13\37\f!\23#\24%\25\'\26)\60+\61"+
		"-\62/\63\61\64\63\65\65\2\67\29\2;\2=\2?\2A\2C\2E\2G\2I\2K\2M\2O\2Q\2"+
		"S\2U\2W\2Y\2[\2]\2_\2a\2c\2e\2g\2i\33k\34m\35o\36q\37s u!w\"y#{$}%\177"+
		"&\u0081\'\u0083(\u0085)\u0087*\u0089+\u008b-\u008d.\u008f/\u0091\66\u0093"+
		"\67\u00958\u0097\2\u0099\2\u009b\2\u009d\2\u009f9\u00a1:\u00a3\2\u00a5"+
		"\2\u00a7;\u00a9<\u00ab=\u00ad>\u00af?\u00b1@\u00b3A\u00b5\6\u00b7\7\u00b9"+
		"\b\u00bb\4\u00bd\5\u00bfB\u00c1C\u00c3D\u00c5E\u00c7F\u00c9G\u00cbH\u00cd"+
		"I\u00cfJ\u00d1K\u00d3L\u00d5M\u00d7N\u00d9O\5\2\3\4%\4\2CCcc\4\2DDdd\4"+
		"\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMm"+
		"m\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2"+
		"VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\3\2\62;\3\2C\\"+
		"\3\2c|\4\2\13\17\"\"\3\2\2\2\6\2\2\2\f\f$$^^\5\2\f\f$$^^\4\3\f\f$$\3\3"+
		"\f\f\2\u027b\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2"+
		"\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2"+
		"}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2"+
		"\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f"+
		"\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u009f\3\2\2"+
		"\2\2\u00a1\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad"+
		"\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2"+
		"\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf"+
		"\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2\2\3\u00c5\3\2\2\2\3\u00c7\3\2\2"+
		"\2\3\u00c9\3\2\2\2\3\u00cb\3\2\2\2\3\u00cd\3\2\2\2\4\u00cf\3\2\2\2\4\u00d1"+
		"\3\2\2\2\4\u00d3\3\2\2\2\4\u00d5\3\2\2\2\4\u00d7\3\2\2\2\4\u00d9\3\2\2"+
		"\2\5\u00db\3\2\2\2\7\u00dd\3\2\2\2\t\u00e0\3\2\2\2\13\u00e2\3\2\2\2\r"+
		"\u00e4\3\2\2\2\17\u00e6\3\2\2\2\21\u00e8\3\2\2\2\23\u00ea\3\2\2\2\25\u00ec"+
		"\3\2\2\2\27\u00ee\3\2\2\2\31\u00f0\3\2\2\2\33\u00f2\3\2\2\2\35\u00f4\3"+
		"\2\2\2\37\u00f6\3\2\2\2!\u00f8\3\2\2\2#\u00fa\3\2\2\2%\u00fc\3\2\2\2\'"+
		"\u00fe\3\2\2\2)\u0100\3\2\2\2+\u0103\3\2\2\2-\u0106\3\2\2\2/\u0108\3\2"+
		"\2\2\61\u010c\3\2\2\2\63\u010f\3\2\2\2\65\u0112\3\2\2\2\67\u0114\3\2\2"+
		"\29\u0116\3\2\2\2;\u0118\3\2\2\2=\u011a\3\2\2\2?\u011c\3\2\2\2A\u011e"+
		"\3\2\2\2C\u0120\3\2\2\2E\u0122\3\2\2\2G\u0124\3\2\2\2I\u0126\3\2\2\2K"+
		"\u0128\3\2\2\2M\u012a\3\2\2\2O\u012c\3\2\2\2Q\u012e\3\2\2\2S\u0130\3\2"+
		"\2\2U\u0132\3\2\2\2W\u0134\3\2\2\2Y\u0136\3\2\2\2[\u0138\3\2\2\2]\u013a"+
		"\3\2\2\2_\u013c\3\2\2\2a\u013e\3\2\2\2c\u0140\3\2\2\2e\u0142\3\2\2\2g"+
		"\u0144\3\2\2\2i\u0146\3\2\2\2k\u014c\3\2\2\2m\u0151\3\2\2\2o\u0154\3\2"+
		"\2\2q\u0157\3\2\2\2s\u015a\3\2\2\2u\u0163\3\2\2\2w\u0167\3\2\2\2y\u016c"+
		"\3\2\2\2{\u0171\3\2\2\2}\u0176\3\2\2\2\177\u017c\3\2\2\2\u0081\u0181\3"+
		"\2\2\2\u0083\u0186\3\2\2\2\u0085\u0189\3\2\2\2\u0087\u018d\3\2\2\2\u0089"+
		"\u0194\3\2\2\2\u008b\u0198\3\2\2\2\u008d\u019e\3\2\2\2\u008f\u01a5\3\2"+
		"\2\2\u0091\u01aa\3\2\2\2\u0093\u01ad\3\2\2\2\u0095\u01b3\3\2\2\2\u0097"+
		"\u01bb\3\2\2\2\u0099\u01bd\3\2\2\2\u009b\u01bf\3\2\2\2\u009d\u01c3\3\2"+
		"\2\2\u009f\u01c6\3\2\2\2\u00a1\u01cc\3\2\2\2\u00a3\u01cf\3\2\2\2\u00a5"+
		"\u01d5\3\2\2\2\u00a7\u01d8\3\2\2\2\u00a9\u01dd\3\2\2\2\u00ab\u01ec\3\2"+
		"\2\2\u00ad\u01fd\3\2\2\2\u00af\u0203\3\2\2\2\u00b1\u0208\3\2\2\2\u00b3"+
		"\u020e\3\2\2\2\u00b5\u021e\3\2\2\2\u00b7\u0221\3\2\2\2\u00b9\u0225\3\2"+
		"\2\2\u00bb\u022a\3\2\2\2\u00bd\u0233\3\2\2\2\u00bf\u023c\3\2\2\2\u00c1"+
		"\u024a\3\2\2\2\u00c3\u0250\3\2\2\2\u00c5\u0253\3\2\2\2\u00c7\u0257\3\2"+
		"\2\2\u00c9\u025d\3\2\2\2\u00cb\u0263\3\2\2\2\u00cd\u0269\3\2\2\2\u00cf"+
		"\u026d\3\2\2\2\u00d1\u0271\3\2\2\2\u00d3\u0277\3\2\2\2\u00d5\u027d\3\2"+
		"\2\2\u00d7\u0283\3\2\2\2\u00d9\u0289\3\2\2\2\u00db\u00dc\7=\2\2\u00dc"+
		"\6\3\2\2\2\u00dd\u00de\7?\2\2\u00de\u00df\7@\2\2\u00df\b\3\2\2\2\u00e0"+
		"\u00e1\7.\2\2\u00e1\n\3\2\2\2\u00e2\u00e3\7\60\2\2\u00e3\f\3\2\2\2\u00e4"+
		"\u00e5\7*\2\2\u00e5\16\3\2\2\2\u00e6\u00e7\7+\2\2\u00e7\20\3\2\2\2\u00e8"+
		"\u00e9\7}\2\2\u00e9\22\3\2\2\2\u00ea\u00eb\7\177\2\2\u00eb\24\3\2\2\2"+
		"\u00ec\u00ed\7-\2\2\u00ed\26\3\2\2\2\u00ee\u00ef\7/\2\2\u00ef\30\3\2\2"+
		"\2\u00f0\u00f1\7,\2\2\u00f1\32\3\2\2\2\u00f2\u00f3\7\61\2\2\u00f3\34\3"+
		"\2\2\2\u00f4\u00f5\7<\2\2\u00f5\36\3\2\2\2\u00f6\u00f7\7B\2\2\u00f7 \3"+
		"\2\2\2\u00f8\u00f9\7\u0080\2\2\u00f9\"\3\2\2\2\u00fa\u00fb\7>\2\2\u00fb"+
		"$\3\2\2\2\u00fc\u00fd\7@\2\2\u00fd&\3\2\2\2\u00fe\u00ff\7?\2\2\u00ff("+
		"\3\2\2\2\u0100\u0101\7>\2\2\u0101\u0102\7>\2\2\u0102*\3\2\2\2\u0103\u0104"+
		"\7@\2\2\u0104\u0105\7@\2\2\u0105,\3\2\2\2\u0106\u0107\7#\2\2\u0107.\3"+
		"\2\2\2\u0108\u0109\7>\2\2\u0109\u010a\7A\2\2\u010a\u010b\7@\2\2\u010b"+
		"\60\3\2\2\2\u010c\u010d\7?\2\2\u010d\u010e\7?\2\2\u010e\62\3\2\2\2\u010f"+
		"\u0110\7#\2\2\u0110\u0111\7?\2\2\u0111\64\3\2\2\2\u0112\u0113\t\2\2\2"+
		"\u0113\66\3\2\2\2\u0114\u0115\t\3\2\2\u01158\3\2\2\2\u0116\u0117\t\4\2"+
		"\2\u0117:\3\2\2\2\u0118\u0119\t\5\2\2\u0119<\3\2\2\2\u011a\u011b\t\6\2"+
		"\2\u011b>\3\2\2\2\u011c\u011d\t\7\2\2\u011d@\3\2\2\2\u011e\u011f\t\b\2"+
		"\2\u011fB\3\2\2\2\u0120\u0121\t\t\2\2\u0121D\3\2\2\2\u0122\u0123\t\n\2"+
		"\2\u0123F\3\2\2\2\u0124\u0125\t\13\2\2\u0125H\3\2\2\2\u0126\u0127\t\f"+
		"\2\2\u0127J\3\2\2\2\u0128\u0129\t\r\2\2\u0129L\3\2\2\2\u012a\u012b\t\16"+
		"\2\2\u012bN\3\2\2\2\u012c\u012d\t\17\2\2\u012dP\3\2\2\2\u012e\u012f\t"+
		"\20\2\2\u012fR\3\2\2\2\u0130\u0131\t\21\2\2\u0131T\3\2\2\2\u0132\u0133"+
		"\t\22\2\2\u0133V\3\2\2\2\u0134\u0135\t\23\2\2\u0135X\3\2\2\2\u0136\u0137"+
		"\t\24\2\2\u0137Z\3\2\2\2\u0138\u0139\t\25\2\2\u0139\\\3\2\2\2\u013a\u013b"+
		"\t\26\2\2\u013b^\3\2\2\2\u013c\u013d\t\27\2\2\u013d`\3\2\2\2\u013e\u013f"+
		"\t\30\2\2\u013fb\3\2\2\2\u0140\u0141\t\31\2\2\u0141d\3\2\2\2\u0142\u0143"+
		"\t\32\2\2\u0143f\3\2\2\2\u0144\u0145\t\33\2\2\u0145h\3\2\2\2\u0146\u0147"+
		"\59\34\2\u0147\u0148\5K%\2\u0148\u0149\5\65\32\2\u0149\u014a\5Y,\2\u014a"+
		"\u014b\5Y,\2\u014bj\3\2\2\2\u014c\u014d\5=\36\2\u014d\u014e\5K%\2\u014e"+
		"\u014f\5Y,\2\u014f\u0150\5=\36\2\u0150l\3\2\2\2\u0151\u0152\5?\37\2\u0152"+
		"\u0153\5E\"\2\u0153n\3\2\2\2\u0154\u0155\5E\"\2\u0155\u0156\5?\37\2\u0156"+
		"p\3\2\2\2\u0157\u0158\5E\"\2\u0158\u0159\5O\'\2\u0159r\3\2\2\2\u015a\u015b"+
		"\5E\"\2\u015b\u015c\5O\'\2\u015c\u015d\5C!\2\u015d\u015e\5=\36\2\u015e"+
		"\u015f\5W+\2\u015f\u0160\5E\"\2\u0160\u0161\5[-\2\u0161\u0162\5Y,\2\u0162"+
		"t\3\2\2\2\u0163\u0164\5K%\2\u0164\u0165\5=\36\2\u0165\u0166\5[-\2\u0166"+
		"v\3\2\2\2\u0167\u0168\5K%\2\u0168\u0169\5Q(\2\u0169\u016a\5Q(\2\u016a"+
		"\u016b\5S)\2\u016bx\3\2\2\2\u016c\u016d\5S)\2\u016d\u016e\5Q(\2\u016e"+
		"\u016f\5Q(\2\u016f\u0170\5K%\2\u0170z\3\2\2\2\u0171\u0172\5[-\2\u0172"+
		"\u0173\5C!\2\u0173\u0174\5=\36\2\u0174\u0175\5O\'\2\u0175|\3\2\2\2\u0176"+
		"\u0177\5a\60\2\u0177\u0178\5C!\2\u0178\u0179\5E\"\2\u0179\u017a\5K%\2"+
		"\u017a\u017b\5=\36\2\u017b~\3\2\2\2\u017c\u017d\59\34\2\u017d\u017e\5"+
		"\65\32\2\u017e\u017f\5Y,\2\u017f\u0180\5=\36\2\u0180\u0080\3\2\2\2\u0181"+
		"\u0182\5=\36\2\u0182\u0183\5Y,\2\u0183\u0184\5\65\32\2\u0184\u0185\59"+
		"\34\2\u0185\u0082\3\2\2\2\u0186\u0187\5Q(\2\u0187\u0188\5?\37\2\u0188"+
		"\u0084\3\2\2\2\u0189\u018a\5O\'\2\u018a\u018b\5=\36\2\u018b\u018c\5a\60"+
		"\2\u018c\u0086\3\2\2\2\u018d\u018e\5E\"\2\u018e\u018f\5Y,\2\u018f\u0190"+
		"\5_/\2\u0190\u0191\5Q(\2\u0191\u0192\5E\"\2\u0192\u0193\5;\35\2\u0193"+
		"\u0088\3\2\2\2\u0194\u0195\5O\'\2\u0195\u0196\5Q(\2\u0196\u0197\5[-\2"+
		"\u0197\u008a\3\2\2\2\u0198\u0199\5A \2\u0199\u019a\5W+\2\u019a\u019b\5"+
		"\65\32\2\u019b\u019c\5S)\2\u019c\u019d\5C!\2\u019d\u008c\3\2\2\2\u019e"+
		"\u019f\5_/\2\u019f\u01a0\5=\36\2\u01a0\u01a1\5W+\2\u01a1\u01a2\5[-\2\u01a2"+
		"\u01a3\5=\36\2\u01a3\u01a4\5c\61\2\u01a4\u008e\3\2\2\2\u01a5\u01a6\5="+
		"\36\2\u01a6\u01a7\5;\35\2\u01a7\u01a8\5A \2\u01a8\u01a9\5=\36\2\u01a9"+
		"\u0090\3\2\2\2\u01aa\u01ab\5E\"\2\u01ab\u01ac\5Y,\2\u01ac\u0092\3\2\2"+
		"\2\u01ad\u01ae\5S)\2\u01ae\u01af\5W+\2\u01af\u01b0\5E\"\2\u01b0\u01b1"+
		"\5O\'\2\u01b1\u01b2\5[-\2\u01b2\u0094\3\2\2\2\u01b3\u01b4\5?\37\2\u01b4"+
		"\u01b5\5Q(\2\u01b5\u01b6\5W+\2\u01b6\u01b7\5=\36\2\u01b7\u01b8\5\65\32"+
		"\2\u01b8\u01b9\59\34\2\u01b9\u01ba\5C!\2\u01ba\u0096\3\2\2\2\u01bb\u01bc"+
		"\t\34\2\2\u01bc\u0098\3\2\2\2\u01bd\u01be\t\35\2\2\u01be\u009a\3\2\2\2"+
		"\u01bf\u01c0\t\36\2\2\u01c0\u009c\3\2\2\2\u01c1\u01c4\5\u0099L\2\u01c2"+
		"\u01c4\5\u009bM\2\u01c3\u01c1\3\2\2\2\u01c3\u01c2\3\2\2\2\u01c4\u009e"+
		"\3\2\2\2\u01c5\u01c7\t\37\2\2\u01c6\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2"+
		"\u01c8\u01c6\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cb"+
		"\bO\2\2\u01cb\u00a0\3\2\2\2\u01cc\u01cd\7^\2\2\u01cd\u01ce\n \2\2\u01ce"+
		"\u00a2\3\2\2\2\u01cf\u01d0\n!\2\2\u01d0\u00a4\3\2\2\2\u01d1\u01d4\5\u00a1"+
		"P\2\u01d2\u01d4\5\u00a3Q\2\u01d3\u01d1\3\2\2\2\u01d3\u01d2\3\2\2\2\u01d4"+
		"\u01d7\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u00a6\3\2"+
		"\2\2\u01d7\u01d5\3\2\2\2\u01d8\u01d9\7$\2\2\u01d9\u01da\5\u00a5R\2\u01da"+
		"\u01db\7\f\2\2\u01db\u01dc\bS\3\2\u01dc\u00a8\3\2\2\2\u01dd\u01de\7$\2"+
		"\2\u01de\u01df\5\u00a5R\2\u01df\u01e4\7\2\2\2\u01e0\u01e3\5\u00a1P\2\u01e1"+
		"\u01e3\n\"\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e1\3\2\2\2\u01e3\u01e6\3\2"+
		"\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e8\3\2\2\2\u01e6"+
		"\u01e4\3\2\2\2\u01e7\u01e9\t#\2\2\u01e8\u01e7\3\2\2\2\u01e9\u01ea\3\2"+
		"\2\2\u01ea\u01eb\bT\4\2\u01eb\u00aa\3\2\2\2\u01ec\u01ed\7$\2\2\u01ed\u01ee"+
		"\5\u00a5R\2\u01ee\u01ef\7^\2\2\u01ef\u01f0\7\2\2\2\u01f0\u01f5\3\2\2\2"+
		"\u01f1\u01f4\5\u00a1P\2\u01f2\u01f4\n\"\2\2\u01f3\u01f1\3\2\2\2\u01f3"+
		"\u01f2\3\2\2\2\u01f4\u01f7\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f5\u01f6\3\2"+
		"\2\2\u01f6\u01f9\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f8\u01fa\t#\2\2\u01f9"+
		"\u01f8\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fc\bU\5\2\u01fc\u00ac\3\2"+
		"\2\2\u01fd\u01fe\7$\2\2\u01fe\u01ff\5\u00a5R\2\u01ff\u0200\7^\2\2\u0200"+
		"\u0201\7\2\2\3\u0201\u0202\bV\6\2\u0202\u00ae\3\2\2\2\u0203\u0204\7$\2"+
		"\2\u0204\u0205\5\u00a5R\2\u0205\u0206\7\2\2\3\u0206\u0207\bW\7\2\u0207"+
		"\u00b0\3\2\2\2\u0208\u0209\7*\2\2\u0209\u020a\7,\2\2\u020a\u020b\3\2\2"+
		"\2\u020b\u020c\7\2\2\3\u020c\u020d\bX\b\2\u020d\u00b2\3\2\2\2\u020e\u020f"+
		"\7,\2\2\u020f\u0210\7+\2\2\u0210\u0211\3\2\2\2\u0211\u0212\bY\t\2\u0212"+
		"\u00b4\3\2\2\2\u0213\u0214\7v\2\2\u0214\u0215\5W+\2\u0215\u0216\5].\2"+
		"\u0216\u0217\5=\36\2\u0217\u021f\3\2\2\2\u0218\u0219\7h\2\2\u0219\u021a"+
		"\5\65\32\2\u021a\u021b\5K%\2\u021b\u021c\5Y,\2\u021c\u021d\5=\36\2\u021d"+
		"\u021f\3\2\2\2\u021e\u0213\3\2\2\2\u021e\u0218\3\2\2\2\u021f\u00b6\3\2"+
		"\2\2\u0220\u0222\5\u0097K\2\u0221\u0220\3\2\2\2\u0222\u0223\3\2\2\2\u0223"+
		"\u0221\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u00b8\3\2\2\2\u0225\u0226\7$"+
		"\2\2\u0226\u0227\5\u00a5R\2\u0227\u0228\7$\2\2\u0228\u0229\b\\\n\2\u0229"+
		"\u00ba\3\2\2\2\u022a\u0230\5\u0099L\2\u022b\u022f\5\u009dN\2\u022c\u022f"+
		"\5\u0097K\2\u022d\u022f\7a\2\2\u022e\u022b\3\2\2\2\u022e\u022c\3\2\2\2"+
		"\u022e\u022d\3\2\2\2\u022f\u0232\3\2\2\2\u0230\u022e\3\2\2\2\u0230\u0231"+
		"\3\2\2\2\u0231\u00bc\3\2\2\2\u0232\u0230\3\2\2\2\u0233\u0239\5\u009bM"+
		"\2\u0234\u0238\5\u009dN\2\u0235\u0238\5\u0097K\2\u0236\u0238\7a\2\2\u0237"+
		"\u0234\3\2\2\2\u0237\u0235\3\2\2\2\u0237\u0236\3\2\2\2\u0238\u023b\3\2"+
		"\2\2\u0239\u0237\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u00be\3\2\2\2\u023b"+
		"\u0239\3\2\2\2\u023c\u023d\7/\2\2\u023d\u023e\7/\2\2\u023e\u0242\3\2\2"+
		"\2\u023f\u0241\13\2\2\2\u0240\u023f\3\2\2\2\u0241\u0244\3\2\2\2\u0242"+
		"\u0243\3\2\2\2\u0242\u0240\3\2\2\2\u0243\u0246\3\2\2\2\u0244\u0242\3\2"+
		"\2\2\u0245\u0247\t$\2\2\u0246\u0245\3\2\2\2\u0247\u0248\3\2\2\2\u0248"+
		"\u0249\b_\2\2\u0249\u00c0\3\2\2\2\u024a\u024b\7*\2\2\u024b\u024c\7,\2"+
		"\2\u024c\u024d\3\2\2\2\u024d\u024e\b`\13\2\u024e\u024f\b`\2\2\u024f\u00c2"+
		"\3\2\2\2\u0250\u0251\13\2\2\2\u0251\u0252\ba\f\2\u0252\u00c4\3\2\2\2\u0253"+
		"\u0254\13\2\2\2\u0254\u0255\7\2\2\3\u0255\u0256\bb\r\2\u0256\u00c6\3\2"+
		"\2\2\u0257\u0258\7*\2\2\u0258\u0259\7,\2\2\u0259\u025a\3\2\2\2\u025a\u025b"+
		"\7\2\2\3\u025b\u025c\bc\16\2\u025c\u00c8\3\2\2\2\u025d\u025e\7*\2\2\u025e"+
		"\u025f\7,\2\2\u025f\u0260\3\2\2\2\u0260\u0261\bd\17\2\u0261\u0262\bd\2"+
		"\2\u0262\u00ca\3\2\2\2\u0263\u0264\7,\2\2\u0264\u0265\7+\2\2\u0265\u0266"+
		"\3\2\2\2\u0266\u0267\be\20\2\u0267\u0268\be\2\2\u0268\u00cc\3\2\2\2\u0269"+
		"\u026a\13\2\2\2\u026a\u026b\3\2\2\2\u026b\u026c\bf\2\2\u026c\u00ce\3\2"+
		"\2\2\u026d\u026e\13\2\2\2\u026e\u026f\7\2\2\3\u026f\u0270\bg\21\2\u0270"+
		"\u00d0\3\2\2\2\u0271\u0272\7*\2\2\u0272\u0273\7,\2\2\u0273\u0274\3\2\2"+
		"\2\u0274\u0275\7\2\2\3\u0275\u0276\bh\22\2\u0276\u00d2\3\2\2\2\u0277\u0278"+
		"\7,\2\2\u0278\u0279\7+\2\2\u0279\u027a\3\2\2\2\u027a\u027b\7\2\2\3\u027b"+
		"\u027c\bi\23\2\u027c\u00d4\3\2\2\2\u027d\u027e\7*\2\2\u027e\u027f\7,\2"+
		"\2\u027f\u0280\3\2\2\2\u0280\u0281\bj\17\2\u0281\u0282\bj\2\2\u0282\u00d6"+
		"\3\2\2\2\u0283\u0284\7,\2\2\u0284\u0285\7+\2\2\u0285\u0286\3\2\2\2\u0286"+
		"\u0287\bk\20\2\u0287\u0288\bk\2\2\u0288\u00d8\3\2\2\2\u0289\u028a\13\2"+
		"\2\2\u028a\u028b\3\2\2\2\u028b\u028c\bl\2\2\u028c\u00da\3\2\2\2\27\2\3"+
		"\4\u01c3\u01c8\u01d3\u01d5\u01e2\u01e4\u01e8\u01f3\u01f5\u01f9\u021e\u0223"+
		"\u022e\u0230\u0237\u0239\u0242\u0246\24\b\2\2\3S\2\3T\3\3U\4\3V\5\3W\6"+
		"\3X\7\3Y\b\3\\\t\7\3\2\3a\n\3b\13\3c\f\7\4\2\6\2\2\3g\r\3h\16\3i\17";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
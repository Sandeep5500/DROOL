// Generated from /home/manya/Desktop/COMPILERS2/DROOL/semantic/DroolParser.g4 by ANTLR 4.8

	import java.util.List;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DroolParser extends Parser {
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
		Arrow=39, Sizeof=40, Hashtag=41, DoubleHashtag=42, Addc=43, Addr=44, Delr=45, 
		Delc=46, Questionmark=47, Inv=48, Trans=49, Det=50, Vsizeof=51, Esizeof=52, 
		Val=53, Pull=54, Push=55, HyphenD=56, If=57, Else=58, Switch=59, While=60, 
		For=61, Case=62, Default=63, Comma=64, Colon=65, Semi=66, SingleQuote=67, 
		DoubleQuote=68, Class=69, Void=70, Bool=71, Int=72, Float=73, String=74, 
		Graph=75, Edge=76, Matrix=77, Vertex=78, Long=79, Unsigned=80, Delete=81, 
		Continue=82, Break=83, Return=84, Input=85, Output=86, Const=87, False_=88, 
		True_=89, Identifier=90, IntegerLiteral=91, DecimalLiteral=92, Integersuffix=93, 
		FloatingLiteral=94, StringLiteral=95, BooleanLiteral=96, VertexLiteral=97, 
		Newline=98, WHITESPACE=99, ESC=100, UNTERM_STR=101, NULL_STR=102, ESC_NULL_STR=103, 
		EOF_BCKSLSH_STR=104, EOF_STR=105, EOF_COMMENT_0=106, OPEN_COMMENT=107, 
		SINGLE_LINE_COMMENT=108, MULTI_LINE_COMMENT=109, EOF_COMMENT_1=110, EOF_COMMENT_2=111, 
		IN_NEST_MLC_0=112, CLOSE_MLC_0=113, CONTENT_MLC_0=114, EOF_COMMENT_3=115, 
		EOF_COMMENT_4=116, EOF_COMMENT_5=117, IN_NEST_MLC_1=118, CLOSE_MLC_1=119, 
		CONTENT_MLC_1=120, OTHER=121;
	public static final int
		RULE_program = 0, RULE_primaryExpr = 1, RULE_postfixExpr = 2, RULE_exprList = 3, 
		RULE_unaryExpr = 4, RULE_unaryOpr = 5, RULE_addrcExpr = 6, RULE_multiplicationExpr = 7, 
		RULE_additiveExpr = 8, RULE_comparisonExpr = 9, RULE_equalityExpr = 10, 
		RULE_binAndExpr = 11, RULE_binXorExpr = 12, RULE_binOrExpr = 13, RULE_andExpr = 14, 
		RULE_orExpr = 15, RULE_assignExpr = 16, RULE_assignOpr = 17, RULE_graph = 18, 
		RULE_pushpullExpr = 19, RULE_pushpullOpr = 20, RULE_graphMemberArrayInit = 21, 
		RULE_expr = 22, RULE_constexpr = 23, RULE_inputStatement = 24, RULE_outputStatement = 25, 
		RULE_statement = 26, RULE_jumpStatement = 27, RULE_caseStatement = 28, 
		RULE_exprStatement = 29, RULE_compoundStatement = 30, RULE_statementSeq = 31, 
		RULE_selectStatement = 32, RULE_condition = 33, RULE_iterStatement = 34, 
		RULE_forInitStatement = 35, RULE_declarationStatement = 36, RULE_declarseq = 37, 
		RULE_declaration = 38, RULE_blockDeclaration = 39, RULE_simpleDeclaration = 40, 
		RULE_dataType = 41, RULE_initDeclaratorSeq = 42, RULE_initDeclarator = 43, 
		RULE_declarator = 44, RULE_parameters = 45, RULE_parameterDeclarationSeq = 46, 
		RULE_parameterDeclaration = 47, RULE_functionDefn = 48, RULE_functionBody = 49, 
		RULE_initializer = 50, RULE_braceOrEqualInitializer = 51, RULE_initializationClause = 52, 
		RULE_bracedInitSeq = 53, RULE_initializationseq = 54, RULE_className = 55, 
		RULE_classDefn = 56, RULE_classHead = 57, RULE_memberlist = 58, RULE_memberdeclaration = 59, 
		RULE_memberDeclaratorList = 60, RULE_memberDeclarator = 61, RULE_inheritanceClause = 62, 
		RULE_inheriterList = 63;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "primaryExpr", "postfixExpr", "exprList", "unaryExpr", "unaryOpr", 
			"addrcExpr", "multiplicationExpr", "additiveExpr", "comparisonExpr", 
			"equalityExpr", "binAndExpr", "binXorExpr", "binOrExpr", "andExpr", "orExpr", 
			"assignExpr", "assignOpr", "graph", "pushpullExpr", "pushpullOpr", "graphMemberArrayInit", 
			"expr", "constexpr", "inputStatement", "outputStatement", "statement", 
			"jumpStatement", "caseStatement", "exprStatement", "compoundStatement", 
			"statementSeq", "selectStatement", "condition", "iterStatement", "forInitStatement", 
			"declarationStatement", "declarseq", "declaration", "blockDeclaration", 
			"simpleDeclaration", "dataType", "initDeclaratorSeq", "initDeclarator", 
			"declarator", "parameters", "parameterDeclarationSeq", "parameterDeclaration", 
			"functionDefn", "functionBody", "initializer", "braceOrEqualInitializer", 
			"initializationClause", "bracedInitSeq", "initializationseq", "className", 
			"classDefn", "classHead", "memberlist", "memberdeclaration", "memberDeclaratorList", 
			"memberDeclarator", "inheritanceClause", "inheriterList"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'('", "')'", "'{'", "'}'", "'['", "']'", "'|'", "'*'", 
			"'&'", "'+'", "'-'", "'~'", "'!'", "'/'", "'%'", "'<'", "'>'", "'<='", 
			"'>='", "'=='", "'!='", "'^'", "'&&'", "'||'", "'='", "'*='", "'/='", 
			"'%='", "'+='", "'-='", "'&='", "'^='", "'|='", "'++'", "'--'", "'.'", 
			"'->'", null, "'#'", "'##'", null, null, null, null, "'?'", null, null, 
			null, null, null, null, "'>>'", "'<<'", null, null, null, null, null, 
			null, null, null, "','", "':'", "';'", "'''", "'\"'"
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
			"DoubleHashtag", "Addc", "Addr", "Delr", "Delc", "Questionmark", "Inv", 
			"Trans", "Det", "Vsizeof", "Esizeof", "Val", "Pull", "Push", "HyphenD", 
			"If", "Else", "Switch", "While", "For", "Case", "Default", "Comma", "Colon", 
			"Semi", "SingleQuote", "DoubleQuote", "Class", "Void", "Bool", "Int", 
			"Float", "String", "Graph", "Edge", "Matrix", "Vertex", "Long", "Unsigned", 
			"Delete", "Continue", "Break", "Return", "Input", "Output", "Const", 
			"False_", "True_", "Identifier", "IntegerLiteral", "DecimalLiteral", 
			"Integersuffix", "FloatingLiteral", "StringLiteral", "BooleanLiteral", 
			"VertexLiteral", "Newline", "WHITESPACE", "ESC", "UNTERM_STR", "NULL_STR", 
			"ESC_NULL_STR", "EOF_BCKSLSH_STR", "EOF_STR", "EOF_COMMENT_0", "OPEN_COMMENT", 
			"SINGLE_LINE_COMMENT", "MULTI_LINE_COMMENT", "EOF_COMMENT_1", "EOF_COMMENT_2", 
			"IN_NEST_MLC_0", "CLOSE_MLC_0", "CONTENT_MLC_0", "EOF_COMMENT_3", "EOF_COMMENT_4", 
			"EOF_COMMENT_5", "IN_NEST_MLC_1", "CLOSE_MLC_1", "CONTENT_MLC_1", "OTHER"
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

	@Override
	public String getGrammarFileName() { return "DroolParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		String filename;
		public void setFilename(String f){
			filename = f;
		}


	public DroolParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(DroolParser.EOF, 0); }
		public DeclarseqContext declarseq() {
			return getRuleContext(DeclarseqContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Semi - 66)) | (1L << (Class - 66)) | (1L << (Void - 66)) | (1L << (Bool - 66)) | (1L << (Int - 66)) | (1L << (Float - 66)) | (1L << (String - 66)) | (1L << (Graph - 66)) | (1L << (Edge - 66)) | (1L << (Matrix - 66)) | (1L << (Vertex - 66)) | (1L << (Identifier - 66)))) != 0)) {
				{
				setState(128);
				declarseq();
				}
			}

			setState(131);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryExprContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(DroolParser.IntegerLiteral, 0); }
		public TerminalNode DecimalLiteral() { return getToken(DroolParser.DecimalLiteral, 0); }
		public TerminalNode Integersuffix() { return getToken(DroolParser.Integersuffix, 0); }
		public TerminalNode FloatingLiteral() { return getToken(DroolParser.FloatingLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(DroolParser.StringLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(DroolParser.BooleanLiteral, 0); }
		public TerminalNode VertexLiteral() { return getToken(DroolParser.VertexLiteral, 0); }
		public TerminalNode Questionmark() { return getToken(DroolParser.Questionmark, 0); }
		public List<TerminalNode> Identifier() { return getTokens(DroolParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(DroolParser.Identifier, i);
		}
		public TerminalNode LeftParen() { return getToken(DroolParser.LeftParen, 0); }
		public TerminalNode Comma() { return getToken(DroolParser.Comma, 0); }
		public TerminalNode RightParen() { return getToken(DroolParser.RightParen, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> LeftBracket() { return getTokens(DroolParser.LeftBracket); }
		public TerminalNode LeftBracket(int i) {
			return getToken(DroolParser.LeftBracket, i);
		}
		public List<TerminalNode> RightBracket() { return getTokens(DroolParser.RightBracket); }
		public TerminalNode RightBracket(int i) {
			return getToken(DroolParser.RightBracket, i);
		}
		public List<ConstexprContext> constexpr() {
			return getRuleContexts(ConstexprContext.class);
		}
		public ConstexprContext constexpr(int i) {
			return getRuleContext(ConstexprContext.class,i);
		}
		public PrimaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpr; }
	}

	public final PrimaryExprContext primaryExpr() throws RecognitionException {
		PrimaryExprContext _localctx = new PrimaryExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_primaryExpr);
		int _la;
		try {
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				match(IntegerLiteral);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				match(DecimalLiteral);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(135);
				match(Integersuffix);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(136);
				match(FloatingLiteral);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(137);
				match(StringLiteral);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(138);
				match(BooleanLiteral);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(139);
				match(VertexLiteral);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(146);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(140);
					match(Identifier);
					}
					break;
				case LeftParen:
					{
					{
					setState(141);
					match(LeftParen);
					setState(142);
					match(Identifier);
					setState(143);
					match(Comma);
					setState(144);
					match(Identifier);
					setState(145);
					match(RightParen);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(148);
				match(Questionmark);
				setState(149);
				match(Identifier);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(150);
				match(LeftParen);
				setState(151);
				expr();
				setState(152);
				match(RightParen);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(154);
				match(Identifier);
				setState(167);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(155);
					match(LeftBracket);
					setState(157);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << Or) | (1L << Star) | (1L << And) | (1L << Plus) | (1L << Minus) | (1L << Tildae) | (1L << Not) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Sizeof) | (1L << Inv) | (1L << Trans) | (1L << Det) | (1L << Vsizeof) | (1L << Esizeof) | (1L << Val))) != 0) || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (Identifier - 90)) | (1L << (IntegerLiteral - 90)) | (1L << (DecimalLiteral - 90)) | (1L << (Integersuffix - 90)) | (1L << (FloatingLiteral - 90)) | (1L << (StringLiteral - 90)) | (1L << (BooleanLiteral - 90)) | (1L << (VertexLiteral - 90)))) != 0)) {
						{
						setState(156);
						constexpr();
						}
					}

					setState(159);
					match(RightBracket);
					setState(165);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						setState(160);
						match(LeftBracket);
						setState(162);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << Or) | (1L << Star) | (1L << And) | (1L << Plus) | (1L << Minus) | (1L << Tildae) | (1L << Not) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Sizeof) | (1L << Inv) | (1L << Trans) | (1L << Det) | (1L << Vsizeof) | (1L << Esizeof) | (1L << Val))) != 0) || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (Identifier - 90)) | (1L << (IntegerLiteral - 90)) | (1L << (DecimalLiteral - 90)) | (1L << (Integersuffix - 90)) | (1L << (FloatingLiteral - 90)) | (1L << (StringLiteral - 90)) | (1L << (BooleanLiteral - 90)) | (1L << (VertexLiteral - 90)))) != 0)) {
							{
							setState(161);
							constexpr();
							}
						}

						setState(164);
						match(RightBracket);
						}
						break;
					}
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixExprContext extends ParserRuleContext {
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public PostfixExprContext postfixExpr() {
			return getRuleContext(PostfixExprContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(DroolParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(DroolParser.RightParen, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(DroolParser.Identifier, 0); }
		public TerminalNode Dot() { return getToken(DroolParser.Dot, 0); }
		public TerminalNode Arrow() { return getToken(DroolParser.Arrow, 0); }
		public TerminalNode PlusPlus() { return getToken(DroolParser.PlusPlus, 0); }
		public TerminalNode MinusMinus() { return getToken(DroolParser.MinusMinus, 0); }
		public TerminalNode Delr() { return getToken(DroolParser.Delr, 0); }
		public TerminalNode Delc() { return getToken(DroolParser.Delc, 0); }
		public PostfixExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpr; }
	}

	public final PostfixExprContext postfixExpr() throws RecognitionException {
		return postfixExpr(0);
	}

	private PostfixExprContext postfixExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PostfixExprContext _localctx = new PostfixExprContext(_ctx, _parentState);
		PostfixExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_postfixExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(172);
			primaryExpr();
			}
			_ctx.stop = _input.LT(-1);
			setState(187);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(185);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new PostfixExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpr);
						setState(174);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(175);
						match(LeftParen);
						setState(177);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << LeftBrace) | (1L << Or) | (1L << Star) | (1L << And) | (1L << Plus) | (1L << Minus) | (1L << Tildae) | (1L << Not) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Sizeof) | (1L << Inv) | (1L << Trans) | (1L << Det) | (1L << Vsizeof) | (1L << Esizeof) | (1L << Val))) != 0) || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (Identifier - 90)) | (1L << (IntegerLiteral - 90)) | (1L << (DecimalLiteral - 90)) | (1L << (Integersuffix - 90)) | (1L << (FloatingLiteral - 90)) | (1L << (StringLiteral - 90)) | (1L << (BooleanLiteral - 90)) | (1L << (VertexLiteral - 90)))) != 0)) {
							{
							setState(176);
							exprList();
							}
						}

						setState(179);
						match(RightParen);
						}
						break;
					case 2:
						{
						_localctx = new PostfixExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpr);
						setState(180);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(181);
						_la = _input.LA(1);
						if ( !(_la==Dot || _la==Arrow) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(182);
						match(Identifier);
						}
						break;
					case 3:
						{
						_localctx = new PostfixExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpr);
						setState(183);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(184);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PlusPlus) | (1L << MinusMinus) | (1L << Delr) | (1L << Delc))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(189);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExprListContext extends ParserRuleContext {
		public InitializationseqContext initializationseq() {
			return getRuleContext(InitializationseqContext.class,0);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_exprList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			initializationseq();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExprContext extends ParserRuleContext {
		public PostfixExprContext postfixExpr() {
			return getRuleContext(PostfixExprContext.class,0);
		}
		public UnaryOprContext unaryOpr() {
			return getRuleContext(UnaryOprContext.class,0);
		}
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(DroolParser.LeftParen, 0); }
		public TerminalNode Identifier() { return getToken(DroolParser.Identifier, 0); }
		public TerminalNode RightParen() { return getToken(DroolParser.RightParen, 0); }
		public TerminalNode Sizeof() { return getToken(DroolParser.Sizeof, 0); }
		public TerminalNode Esizeof() { return getToken(DroolParser.Esizeof, 0); }
		public TerminalNode Vsizeof() { return getToken(DroolParser.Vsizeof, 0); }
		public TerminalNode Val() { return getToken(DroolParser.Val, 0); }
		public TerminalNode Inv() { return getToken(DroolParser.Inv, 0); }
		public TerminalNode Det() { return getToken(DroolParser.Det, 0); }
		public TerminalNode Trans() { return getToken(DroolParser.Trans, 0); }
		public UnaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpr; }
	}

	public final UnaryExprContext unaryExpr() throws RecognitionException {
		UnaryExprContext _localctx = new UnaryExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_unaryExpr);
		int _la;
		try {
			setState(200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
			case Identifier:
			case IntegerLiteral:
			case DecimalLiteral:
			case Integersuffix:
			case FloatingLiteral:
			case StringLiteral:
			case BooleanLiteral:
			case VertexLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				postfixExpr(0);
				}
				break;
			case Or:
			case Star:
			case And:
			case Plus:
			case Minus:
			case Tildae:
			case Not:
			case PlusPlus:
			case MinusMinus:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				unaryOpr();
				setState(194);
				unaryExpr();
				}
				break;
			case Sizeof:
			case Inv:
			case Trans:
			case Det:
			case Vsizeof:
			case Esizeof:
			case Val:
				enterOuterAlt(_localctx, 3);
				{
				setState(196);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Sizeof) | (1L << Inv) | (1L << Trans) | (1L << Det) | (1L << Vsizeof) | (1L << Esizeof) | (1L << Val))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(197);
				match(LeftParen);
				setState(198);
				match(Identifier);
				setState(199);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryOprContext extends ParserRuleContext {
		public TerminalNode Or() { return getToken(DroolParser.Or, 0); }
		public TerminalNode Star() { return getToken(DroolParser.Star, 0); }
		public TerminalNode And() { return getToken(DroolParser.And, 0); }
		public TerminalNode Plus() { return getToken(DroolParser.Plus, 0); }
		public TerminalNode Tildae() { return getToken(DroolParser.Tildae, 0); }
		public TerminalNode Minus() { return getToken(DroolParser.Minus, 0); }
		public TerminalNode Not() { return getToken(DroolParser.Not, 0); }
		public TerminalNode PlusPlus() { return getToken(DroolParser.PlusPlus, 0); }
		public TerminalNode MinusMinus() { return getToken(DroolParser.MinusMinus, 0); }
		public UnaryOprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOpr; }
	}

	public final UnaryOprContext unaryOpr() throws RecognitionException {
		UnaryOprContext _localctx = new UnaryOprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_unaryOpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Or) | (1L << Star) | (1L << And) | (1L << Plus) | (1L << Minus) | (1L << Tildae) | (1L << Not) | (1L << PlusPlus) | (1L << MinusMinus))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddrcExprContext extends ParserRuleContext {
		public List<UnaryExprContext> unaryExpr() {
			return getRuleContexts(UnaryExprContext.class);
		}
		public UnaryExprContext unaryExpr(int i) {
			return getRuleContext(UnaryExprContext.class,i);
		}
		public TerminalNode Addc() { return getToken(DroolParser.Addc, 0); }
		public TerminalNode Addr() { return getToken(DroolParser.Addr, 0); }
		public AddrcExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addrcExpr; }
	}

	public final AddrcExprContext addrcExpr() throws RecognitionException {
		AddrcExprContext _localctx = new AddrcExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_addrcExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			unaryExpr();
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Addc || _la==Addr) {
				{
				setState(205);
				_la = _input.LA(1);
				if ( !(_la==Addc || _la==Addr) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(206);
				unaryExpr();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicationExprContext extends ParserRuleContext {
		public List<AddrcExprContext> addrcExpr() {
			return getRuleContexts(AddrcExprContext.class);
		}
		public AddrcExprContext addrcExpr(int i) {
			return getRuleContext(AddrcExprContext.class,i);
		}
		public List<TerminalNode> Star() { return getTokens(DroolParser.Star); }
		public TerminalNode Star(int i) {
			return getToken(DroolParser.Star, i);
		}
		public List<TerminalNode> Div() { return getTokens(DroolParser.Div); }
		public TerminalNode Div(int i) {
			return getToken(DroolParser.Div, i);
		}
		public List<TerminalNode> Mod() { return getTokens(DroolParser.Mod); }
		public TerminalNode Mod(int i) {
			return getToken(DroolParser.Mod, i);
		}
		public MultiplicationExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicationExpr; }
	}

	public final MultiplicationExprContext multiplicationExpr() throws RecognitionException {
		MultiplicationExprContext _localctx = new MultiplicationExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_multiplicationExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			addrcExpr();
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Star) | (1L << Div) | (1L << Mod))) != 0)) {
				{
				{
				setState(210);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Star) | (1L << Div) | (1L << Mod))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(211);
				addrcExpr();
				}
				}
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditiveExprContext extends ParserRuleContext {
		public List<MultiplicationExprContext> multiplicationExpr() {
			return getRuleContexts(MultiplicationExprContext.class);
		}
		public MultiplicationExprContext multiplicationExpr(int i) {
			return getRuleContext(MultiplicationExprContext.class,i);
		}
		public List<TerminalNode> Plus() { return getTokens(DroolParser.Plus); }
		public TerminalNode Plus(int i) {
			return getToken(DroolParser.Plus, i);
		}
		public List<TerminalNode> Minus() { return getTokens(DroolParser.Minus); }
		public TerminalNode Minus(int i) {
			return getToken(DroolParser.Minus, i);
		}
		public AdditiveExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpr; }
	}

	public final AdditiveExprContext additiveExpr() throws RecognitionException {
		AdditiveExprContext _localctx = new AdditiveExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_additiveExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			multiplicationExpr();
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Plus || _la==Minus) {
				{
				{
				setState(218);
				_la = _input.LA(1);
				if ( !(_la==Plus || _la==Minus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(219);
				multiplicationExpr();
				}
				}
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonExprContext extends ParserRuleContext {
		public List<AdditiveExprContext> additiveExpr() {
			return getRuleContexts(AdditiveExprContext.class);
		}
		public AdditiveExprContext additiveExpr(int i) {
			return getRuleContext(AdditiveExprContext.class,i);
		}
		public List<TerminalNode> Less() { return getTokens(DroolParser.Less); }
		public TerminalNode Less(int i) {
			return getToken(DroolParser.Less, i);
		}
		public List<TerminalNode> Greater() { return getTokens(DroolParser.Greater); }
		public TerminalNode Greater(int i) {
			return getToken(DroolParser.Greater, i);
		}
		public List<TerminalNode> LessEqual() { return getTokens(DroolParser.LessEqual); }
		public TerminalNode LessEqual(int i) {
			return getToken(DroolParser.LessEqual, i);
		}
		public List<TerminalNode> GreaterEqual() { return getTokens(DroolParser.GreaterEqual); }
		public TerminalNode GreaterEqual(int i) {
			return getToken(DroolParser.GreaterEqual, i);
		}
		public ComparisonExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonExpr; }
	}

	public final ComparisonExprContext comparisonExpr() throws RecognitionException {
		ComparisonExprContext _localctx = new ComparisonExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_comparisonExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			additiveExpr();
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Less) | (1L << Greater) | (1L << LessEqual) | (1L << GreaterEqual))) != 0)) {
				{
				{
				setState(226);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Less) | (1L << Greater) | (1L << LessEqual) | (1L << GreaterEqual))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(227);
				additiveExpr();
				}
				}
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualityExprContext extends ParserRuleContext {
		public List<ComparisonExprContext> comparisonExpr() {
			return getRuleContexts(ComparisonExprContext.class);
		}
		public ComparisonExprContext comparisonExpr(int i) {
			return getRuleContext(ComparisonExprContext.class,i);
		}
		public List<TerminalNode> Equal() { return getTokens(DroolParser.Equal); }
		public TerminalNode Equal(int i) {
			return getToken(DroolParser.Equal, i);
		}
		public List<TerminalNode> NotEqual() { return getTokens(DroolParser.NotEqual); }
		public TerminalNode NotEqual(int i) {
			return getToken(DroolParser.NotEqual, i);
		}
		public EqualityExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpr; }
	}

	public final EqualityExprContext equalityExpr() throws RecognitionException {
		EqualityExprContext _localctx = new EqualityExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_equalityExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			comparisonExpr();
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Equal || _la==NotEqual) {
				{
				{
				setState(234);
				_la = _input.LA(1);
				if ( !(_la==Equal || _la==NotEqual) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(235);
				comparisonExpr();
				}
				}
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinAndExprContext extends ParserRuleContext {
		public List<EqualityExprContext> equalityExpr() {
			return getRuleContexts(EqualityExprContext.class);
		}
		public EqualityExprContext equalityExpr(int i) {
			return getRuleContext(EqualityExprContext.class,i);
		}
		public List<TerminalNode> And() { return getTokens(DroolParser.And); }
		public TerminalNode And(int i) {
			return getToken(DroolParser.And, i);
		}
		public BinAndExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binAndExpr; }
	}

	public final BinAndExprContext binAndExpr() throws RecognitionException {
		BinAndExprContext _localctx = new BinAndExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_binAndExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			equalityExpr();
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==And) {
				{
				{
				setState(242);
				match(And);
				setState(243);
				equalityExpr();
				}
				}
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinXorExprContext extends ParserRuleContext {
		public List<BinAndExprContext> binAndExpr() {
			return getRuleContexts(BinAndExprContext.class);
		}
		public BinAndExprContext binAndExpr(int i) {
			return getRuleContext(BinAndExprContext.class,i);
		}
		public List<TerminalNode> Caret() { return getTokens(DroolParser.Caret); }
		public TerminalNode Caret(int i) {
			return getToken(DroolParser.Caret, i);
		}
		public BinXorExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binXorExpr; }
	}

	public final BinXorExprContext binXorExpr() throws RecognitionException {
		BinXorExprContext _localctx = new BinXorExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_binXorExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			binAndExpr();
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Caret) {
				{
				{
				setState(250);
				match(Caret);
				setState(251);
				binAndExpr();
				}
				}
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinOrExprContext extends ParserRuleContext {
		public List<BinXorExprContext> binXorExpr() {
			return getRuleContexts(BinXorExprContext.class);
		}
		public BinXorExprContext binXorExpr(int i) {
			return getRuleContext(BinXorExprContext.class,i);
		}
		public List<TerminalNode> Or() { return getTokens(DroolParser.Or); }
		public TerminalNode Or(int i) {
			return getToken(DroolParser.Or, i);
		}
		public BinOrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binOrExpr; }
	}

	public final BinOrExprContext binOrExpr() throws RecognitionException {
		BinOrExprContext _localctx = new BinOrExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_binOrExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			binXorExpr();
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Or) {
				{
				{
				setState(258);
				match(Or);
				setState(259);
				binXorExpr();
				}
				}
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndExprContext extends ParserRuleContext {
		public List<BinOrExprContext> binOrExpr() {
			return getRuleContexts(BinOrExprContext.class);
		}
		public BinOrExprContext binOrExpr(int i) {
			return getRuleContext(BinOrExprContext.class,i);
		}
		public List<TerminalNode> AndAnd() { return getTokens(DroolParser.AndAnd); }
		public TerminalNode AndAnd(int i) {
			return getToken(DroolParser.AndAnd, i);
		}
		public AndExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpr; }
	}

	public final AndExprContext andExpr() throws RecognitionException {
		AndExprContext _localctx = new AndExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_andExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			binOrExpr();
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AndAnd) {
				{
				{
				setState(266);
				match(AndAnd);
				setState(267);
				binOrExpr();
				}
				}
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrExprContext extends ParserRuleContext {
		public List<AndExprContext> andExpr() {
			return getRuleContexts(AndExprContext.class);
		}
		public AndExprContext andExpr(int i) {
			return getRuleContext(AndExprContext.class,i);
		}
		public List<TerminalNode> OrOr() { return getTokens(DroolParser.OrOr); }
		public TerminalNode OrOr(int i) {
			return getToken(DroolParser.OrOr, i);
		}
		public OrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpr; }
	}

	public final OrExprContext orExpr() throws RecognitionException {
		OrExprContext _localctx = new OrExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_orExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			andExpr();
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OrOr) {
				{
				{
				setState(274);
				match(OrOr);
				setState(275);
				andExpr();
				}
				}
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignExprContext extends ParserRuleContext {
		public OrExprContext orExpr() {
			return getRuleContext(OrExprContext.class,0);
		}
		public AssignOprContext assignOpr() {
			return getRuleContext(AssignOprContext.class,0);
		}
		public InitializationClauseContext initializationClause() {
			return getRuleContext(InitializationClauseContext.class,0);
		}
		public AssignExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignExpr; }
	}

	public final AssignExprContext assignExpr() throws RecognitionException {
		AssignExprContext _localctx = new AssignExprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assignExpr);
		try {
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				orExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				orExpr();
				setState(283);
				assignOpr();
				setState(284);
				initializationClause();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignOprContext extends ParserRuleContext {
		public TerminalNode Assign() { return getToken(DroolParser.Assign, 0); }
		public TerminalNode DivAssign() { return getToken(DroolParser.DivAssign, 0); }
		public TerminalNode StarAssign() { return getToken(DroolParser.StarAssign, 0); }
		public TerminalNode ModAssign() { return getToken(DroolParser.ModAssign, 0); }
		public TerminalNode MinusAssign() { return getToken(DroolParser.MinusAssign, 0); }
		public TerminalNode PlusAssign() { return getToken(DroolParser.PlusAssign, 0); }
		public TerminalNode AndAssign() { return getToken(DroolParser.AndAssign, 0); }
		public TerminalNode XorAssign() { return getToken(DroolParser.XorAssign, 0); }
		public TerminalNode OrAssign() { return getToken(DroolParser.OrAssign, 0); }
		public AssignOprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignOpr; }
	}

	public final AssignOprContext assignOpr() throws RecognitionException {
		AssignOprContext _localctx = new AssignOprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assignOpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Assign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << AndAssign) | (1L << XorAssign) | (1L << OrAssign))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GraphContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(DroolParser.Semi, 0); }
		public PushpullExprContext pushpullExpr() {
			return getRuleContext(PushpullExprContext.class,0);
		}
		public GraphMemberArrayInitContext graphMemberArrayInit() {
			return getRuleContext(GraphMemberArrayInitContext.class,0);
		}
		public GraphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graph; }
	}

	public final GraphContext graph() throws RecognitionException {
		GraphContext _localctx = new GraphContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_graph);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(290);
				pushpullExpr();
				}
				break;
			case 2:
				{
				setState(291);
				graphMemberArrayInit();
				}
				break;
			}
			setState(294);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PushpullExprContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(DroolParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(DroolParser.Identifier, i);
		}
		public List<PushpullOprContext> pushpullOpr() {
			return getRuleContexts(PushpullOprContext.class);
		}
		public PushpullOprContext pushpullOpr(int i) {
			return getRuleContext(PushpullOprContext.class,i);
		}
		public List<TerminalNode> LeftParen() { return getTokens(DroolParser.LeftParen); }
		public TerminalNode LeftParen(int i) {
			return getToken(DroolParser.LeftParen, i);
		}
		public List<TerminalNode> Comma() { return getTokens(DroolParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(DroolParser.Comma, i);
		}
		public List<TerminalNode> RightParen() { return getTokens(DroolParser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(DroolParser.RightParen, i);
		}
		public List<TerminalNode> Literal() { return getTokens(DroolParser.Literal); }
		public TerminalNode Literal(int i) {
			return getToken(DroolParser.Literal, i);
		}
		public PushpullExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pushpullExpr; }
	}

	public final PushpullExprContext pushpullExpr() throws RecognitionException {
		PushpullExprContext _localctx = new PushpullExprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_pushpullExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(Identifier);
			setState(311); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(297);
				pushpullOpr();
				setState(309);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(298);
					match(Identifier);
					}
					break;
				case LeftParen:
					{
					{
					setState(299);
					match(LeftParen);
					setState(300);
					match(Identifier);
					setState(301);
					match(Comma);
					setState(302);
					match(Identifier);
					setState(307);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case RightParen:
						{
						setState(303);
						match(RightParen);
						}
						break;
					case Comma:
						{
						setState(304);
						match(Comma);
						setState(305);
						_la = _input.LA(1);
						if ( !(_la==Literal || _la==Identifier) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(306);
						match(RightParen);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(313); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Pull || _la==Push );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PushpullOprContext extends ParserRuleContext {
		public TerminalNode Push() { return getToken(DroolParser.Push, 0); }
		public TerminalNode Pull() { return getToken(DroolParser.Pull, 0); }
		public PushpullOprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pushpullOpr; }
	}

	public final PushpullOprContext pushpullOpr() throws RecognitionException {
		PushpullOprContext _localctx = new PushpullOprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_pushpullOpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			_la = _input.LA(1);
			if ( !(_la==Pull || _la==Push) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GraphMemberArrayInitContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public List<TerminalNode> Identifier() { return getTokens(DroolParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(DroolParser.Identifier, i);
		}
		public TerminalNode LeftBracket() { return getToken(DroolParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(DroolParser.RightBracket, 0); }
		public TerminalNode Assign() { return getToken(DroolParser.Assign, 0); }
		public TerminalNode Hashtag() { return getToken(DroolParser.Hashtag, 0); }
		public TerminalNode DoubleHashtag() { return getToken(DroolParser.DoubleHashtag, 0); }
		public ConstexprContext constexpr() {
			return getRuleContext(ConstexprContext.class,0);
		}
		public GraphMemberArrayInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graphMemberArrayInit; }
	}

	public final GraphMemberArrayInitContext graphMemberArrayInit() throws RecognitionException {
		GraphMemberArrayInitContext _localctx = new GraphMemberArrayInitContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_graphMemberArrayInit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			dataType();
			setState(318);
			match(Identifier);
			setState(319);
			match(LeftBracket);
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << Or) | (1L << Star) | (1L << And) | (1L << Plus) | (1L << Minus) | (1L << Tildae) | (1L << Not) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Sizeof) | (1L << Inv) | (1L << Trans) | (1L << Det) | (1L << Vsizeof) | (1L << Esizeof) | (1L << Val))) != 0) || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (Identifier - 90)) | (1L << (IntegerLiteral - 90)) | (1L << (DecimalLiteral - 90)) | (1L << (Integersuffix - 90)) | (1L << (FloatingLiteral - 90)) | (1L << (StringLiteral - 90)) | (1L << (BooleanLiteral - 90)) | (1L << (VertexLiteral - 90)))) != 0)) {
				{
				setState(320);
				constexpr();
				}
			}

			setState(323);
			match(RightBracket);
			setState(324);
			match(Assign);
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(325);
				match(Identifier);
				}
			}

			setState(328);
			_la = _input.LA(1);
			if ( !(_la==Hashtag || _la==DoubleHashtag) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(329);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public List<AssignExprContext> assignExpr() {
			return getRuleContexts(AssignExprContext.class);
		}
		public AssignExprContext assignExpr(int i) {
			return getRuleContext(AssignExprContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(DroolParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(DroolParser.Comma, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			assignExpr();
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(332);
				match(Comma);
				setState(333);
				assignExpr();
				}
				}
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstexprContext extends ParserRuleContext {
		public OrExprContext orExpr() {
			return getRuleContext(OrExprContext.class,0);
		}
		public ConstexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constexpr; }
	}

	public final ConstexprContext constexpr() throws RecognitionException {
		ConstexprContext _localctx = new ConstexprContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_constexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			orExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputStatementContext extends ParserRuleContext {
		public TerminalNode Input() { return getToken(DroolParser.Input, 0); }
		public TerminalNode LeftParen() { return getToken(DroolParser.LeftParen, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(DroolParser.RightParen, 0); }
		public TerminalNode Semi() { return getToken(DroolParser.Semi, 0); }
		public InputStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputStatement; }
	}

	public final InputStatementContext inputStatement() throws RecognitionException {
		InputStatementContext _localctx = new InputStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_inputStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(Input);
			setState(342);
			match(LeftParen);
			setState(343);
			exprList();
			setState(344);
			match(RightParen);
			setState(345);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutputStatementContext extends ParserRuleContext {
		public TerminalNode Output() { return getToken(DroolParser.Output, 0); }
		public TerminalNode LeftParen() { return getToken(DroolParser.LeftParen, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(DroolParser.RightParen, 0); }
		public TerminalNode Semi() { return getToken(DroolParser.Semi, 0); }
		public OutputStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputStatement; }
	}

	public final OutputStatementContext outputStatement() throws RecognitionException {
		OutputStatementContext _localctx = new OutputStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_outputStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(Output);
			setState(348);
			match(LeftParen);
			setState(349);
			exprList();
			setState(350);
			match(RightParen);
			setState(351);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public CaseStatementContext caseStatement() {
			return getRuleContext(CaseStatementContext.class,0);
		}
		public ExprStatementContext exprStatement() {
			return getRuleContext(ExprStatementContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public IterStatementContext iterStatement() {
			return getRuleContext(IterStatementContext.class,0);
		}
		public DeclarationStatementContext declarationStatement() {
			return getRuleContext(DeclarationStatementContext.class,0);
		}
		public JumpStatementContext jumpStatement() {
			return getRuleContext(JumpStatementContext.class,0);
		}
		public InputStatementContext inputStatement() {
			return getRuleContext(InputStatementContext.class,0);
		}
		public OutputStatementContext outputStatement() {
			return getRuleContext(OutputStatementContext.class,0);
		}
		public GraphContext graph() {
			return getRuleContext(GraphContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_statement);
		try {
			setState(363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(353);
				caseStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(354);
				exprStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(355);
				compoundStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(356);
				selectStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(357);
				iterStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(358);
				declarationStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(359);
				jumpStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(360);
				inputStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(361);
				outputStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(362);
				graph();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JumpStatementContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(DroolParser.Semi, 0); }
		public TerminalNode Break() { return getToken(DroolParser.Break, 0); }
		public TerminalNode Continue() { return getToken(DroolParser.Continue, 0); }
		public TerminalNode Return() { return getToken(DroolParser.Return, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BracedInitSeqContext bracedInitSeq() {
			return getRuleContext(BracedInitSeqContext.class,0);
		}
		public JumpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpStatement; }
	}

	public final JumpStatementContext jumpStatement() throws RecognitionException {
		JumpStatementContext _localctx = new JumpStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_jumpStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Break:
				{
				setState(365);
				match(Break);
				}
				break;
			case Continue:
				{
				setState(366);
				match(Continue);
				}
				break;
			case Return:
				{
				setState(367);
				match(Return);
				setState(370);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LeftParen:
				case Or:
				case Star:
				case And:
				case Plus:
				case Minus:
				case Tildae:
				case Not:
				case PlusPlus:
				case MinusMinus:
				case Sizeof:
				case Inv:
				case Trans:
				case Det:
				case Vsizeof:
				case Esizeof:
				case Val:
				case Identifier:
				case IntegerLiteral:
				case DecimalLiteral:
				case Integersuffix:
				case FloatingLiteral:
				case StringLiteral:
				case BooleanLiteral:
				case VertexLiteral:
					{
					setState(368);
					expr();
					}
					break;
				case LeftBrace:
					{
					setState(369);
					bracedInitSeq();
					}
					break;
				case Semi:
					break;
				default:
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(374);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseStatementContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(DroolParser.Colon, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Case() { return getToken(DroolParser.Case, 0); }
		public ConstexprContext constexpr() {
			return getRuleContext(ConstexprContext.class,0);
		}
		public TerminalNode Default() { return getToken(DroolParser.Default, 0); }
		public CaseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseStatement; }
	}

	public final CaseStatementContext caseStatement() throws RecognitionException {
		CaseStatementContext _localctx = new CaseStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_caseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Case:
				{
				setState(376);
				match(Case);
				setState(377);
				constexpr();
				}
				break;
			case Default:
				{
				setState(378);
				match(Default);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(381);
			match(Colon);
			setState(382);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprStatementContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(DroolParser.Semi, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprStatement; }
	}

	public final ExprStatementContext exprStatement() throws RecognitionException {
		ExprStatementContext _localctx = new ExprStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_exprStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << Or) | (1L << Star) | (1L << And) | (1L << Plus) | (1L << Minus) | (1L << Tildae) | (1L << Not) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Sizeof) | (1L << Inv) | (1L << Trans) | (1L << Det) | (1L << Vsizeof) | (1L << Esizeof) | (1L << Val))) != 0) || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (Identifier - 90)) | (1L << (IntegerLiteral - 90)) | (1L << (DecimalLiteral - 90)) | (1L << (Integersuffix - 90)) | (1L << (FloatingLiteral - 90)) | (1L << (StringLiteral - 90)) | (1L << (BooleanLiteral - 90)) | (1L << (VertexLiteral - 90)))) != 0)) {
				{
				setState(384);
				expr();
				}
			}

			setState(387);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompoundStatementContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(DroolParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(DroolParser.RightBrace, 0); }
		public StatementSeqContext statementSeq() {
			return getRuleContext(StatementSeqContext.class,0);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(LeftBrace);
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << LeftBrace) | (1L << Or) | (1L << Star) | (1L << And) | (1L << Plus) | (1L << Minus) | (1L << Tildae) | (1L << Not) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Sizeof) | (1L << Inv) | (1L << Trans) | (1L << Det) | (1L << Vsizeof) | (1L << Esizeof) | (1L << Val) | (1L << If) | (1L << Switch) | (1L << While) | (1L << For) | (1L << Case) | (1L << Default))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Semi - 66)) | (1L << (Void - 66)) | (1L << (Bool - 66)) | (1L << (Int - 66)) | (1L << (Float - 66)) | (1L << (String - 66)) | (1L << (Graph - 66)) | (1L << (Edge - 66)) | (1L << (Matrix - 66)) | (1L << (Vertex - 66)) | (1L << (Continue - 66)) | (1L << (Break - 66)) | (1L << (Return - 66)) | (1L << (Input - 66)) | (1L << (Output - 66)) | (1L << (Identifier - 66)) | (1L << (IntegerLiteral - 66)) | (1L << (DecimalLiteral - 66)) | (1L << (Integersuffix - 66)) | (1L << (FloatingLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (VertexLiteral - 66)))) != 0)) {
				{
				setState(390);
				statementSeq();
				}
			}

			setState(393);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementSeqContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementSeq; }
	}

	public final StatementSeqContext statementSeq() throws RecognitionException {
		StatementSeqContext _localctx = new StatementSeqContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_statementSeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(395);
				statement();
				}
				}
				setState(398); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << LeftBrace) | (1L << Or) | (1L << Star) | (1L << And) | (1L << Plus) | (1L << Minus) | (1L << Tildae) | (1L << Not) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Sizeof) | (1L << Inv) | (1L << Trans) | (1L << Det) | (1L << Vsizeof) | (1L << Esizeof) | (1L << Val) | (1L << If) | (1L << Switch) | (1L << While) | (1L << For) | (1L << Case) | (1L << Default))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Semi - 66)) | (1L << (Void - 66)) | (1L << (Bool - 66)) | (1L << (Int - 66)) | (1L << (Float - 66)) | (1L << (String - 66)) | (1L << (Graph - 66)) | (1L << (Edge - 66)) | (1L << (Matrix - 66)) | (1L << (Vertex - 66)) | (1L << (Continue - 66)) | (1L << (Break - 66)) | (1L << (Return - 66)) | (1L << (Input - 66)) | (1L << (Output - 66)) | (1L << (Identifier - 66)) | (1L << (IntegerLiteral - 66)) | (1L << (DecimalLiteral - 66)) | (1L << (Integersuffix - 66)) | (1L << (FloatingLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (VertexLiteral - 66)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(DroolParser.If, 0); }
		public TerminalNode LeftParen() { return getToken(DroolParser.LeftParen, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(DroolParser.RightParen, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(DroolParser.Else, 0); }
		public TerminalNode Switch() { return getToken(DroolParser.Switch, 0); }
		public TerminalNode LeftBrace() { return getToken(DroolParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(DroolParser.RightBrace, 0); }
		public List<CaseStatementContext> caseStatement() {
			return getRuleContexts(CaseStatementContext.class);
		}
		public CaseStatementContext caseStatement(int i) {
			return getRuleContext(CaseStatementContext.class,i);
		}
		public SelectStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStatement; }
	}

	public final SelectStatementContext selectStatement() throws RecognitionException {
		SelectStatementContext _localctx = new SelectStatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_selectStatement);
		int _la;
		try {
			setState(422);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case If:
				enterOuterAlt(_localctx, 1);
				{
				setState(400);
				match(If);
				setState(401);
				match(LeftParen);
				setState(402);
				condition();
				setState(403);
				match(RightParen);
				setState(404);
				statement();
				setState(407);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(405);
					match(Else);
					setState(406);
					statement();
					}
					break;
				}
				}
				break;
			case Switch:
				enterOuterAlt(_localctx, 2);
				{
				setState(409);
				match(Switch);
				setState(410);
				match(LeftParen);
				setState(411);
				condition();
				setState(412);
				match(RightParen);
				setState(413);
				match(LeftBrace);
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Case || _la==Default) {
					{
					{
					setState(414);
					caseStatement();
					}
					}
					setState(419);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(420);
				match(RightBrace);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode Assign() { return getToken(DroolParser.Assign, 0); }
		public InitializationClauseContext initializationClause() {
			return getRuleContext(InitializationClauseContext.class,0);
		}
		public BracedInitSeqContext bracedInitSeq() {
			return getRuleContext(BracedInitSeqContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_condition);
		try {
			setState(431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(424);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(425);
				declarator();
				setState(429);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Assign:
					{
					setState(426);
					match(Assign);
					setState(427);
					initializationClause();
					}
					break;
				case LeftBrace:
					{
					setState(428);
					bracedInitSeq();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterStatementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(DroolParser.While, 0); }
		public TerminalNode LeftParen() { return getToken(DroolParser.LeftParen, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(DroolParser.RightParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode For() { return getToken(DroolParser.For, 0); }
		public ForInitStatementContext forInitStatement() {
			return getRuleContext(ForInitStatementContext.class,0);
		}
		public TerminalNode Semi() { return getToken(DroolParser.Semi, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IterStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterStatement; }
	}

	public final IterStatementContext iterStatement() throws RecognitionException {
		IterStatementContext _localctx = new IterStatementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_iterStatement);
		int _la;
		try {
			setState(452);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case While:
				enterOuterAlt(_localctx, 1);
				{
				setState(433);
				match(While);
				setState(434);
				match(LeftParen);
				setState(435);
				condition();
				setState(436);
				match(RightParen);
				setState(437);
				statement();
				}
				break;
			case For:
				enterOuterAlt(_localctx, 2);
				{
				setState(439);
				match(For);
				setState(440);
				match(LeftParen);
				{
				setState(441);
				forInitStatement();
				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << Or) | (1L << Star) | (1L << And) | (1L << Plus) | (1L << Minus) | (1L << Tildae) | (1L << Not) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Sizeof) | (1L << Inv) | (1L << Trans) | (1L << Det) | (1L << Vsizeof) | (1L << Esizeof) | (1L << Val))) != 0) || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (Identifier - 90)) | (1L << (IntegerLiteral - 90)) | (1L << (DecimalLiteral - 90)) | (1L << (Integersuffix - 90)) | (1L << (FloatingLiteral - 90)) | (1L << (StringLiteral - 90)) | (1L << (BooleanLiteral - 90)) | (1L << (VertexLiteral - 90)))) != 0)) {
					{
					setState(442);
					condition();
					}
				}

				setState(445);
				match(Semi);
				setState(447);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << Or) | (1L << Star) | (1L << And) | (1L << Plus) | (1L << Minus) | (1L << Tildae) | (1L << Not) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Sizeof) | (1L << Inv) | (1L << Trans) | (1L << Det) | (1L << Vsizeof) | (1L << Esizeof) | (1L << Val))) != 0) || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (Identifier - 90)) | (1L << (IntegerLiteral - 90)) | (1L << (DecimalLiteral - 90)) | (1L << (Integersuffix - 90)) | (1L << (FloatingLiteral - 90)) | (1L << (StringLiteral - 90)) | (1L << (BooleanLiteral - 90)) | (1L << (VertexLiteral - 90)))) != 0)) {
					{
					setState(446);
					expr();
					}
				}

				}
				setState(449);
				match(RightParen);
				setState(450);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitStatementContext extends ParserRuleContext {
		public ExprStatementContext exprStatement() {
			return getRuleContext(ExprStatementContext.class,0);
		}
		public SimpleDeclarationContext simpleDeclaration() {
			return getRuleContext(SimpleDeclarationContext.class,0);
		}
		public TerminalNode Semi() { return getToken(DroolParser.Semi, 0); }
		public ForInitStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInitStatement; }
	}

	public final ForInitStatementContext forInitStatement() throws RecognitionException {
		ForInitStatementContext _localctx = new ForInitStatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_forInitStatement);
		try {
			setState(458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(454);
				exprStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(455);
				simpleDeclaration();
				setState(456);
				match(Semi);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationStatementContext extends ParserRuleContext {
		public BlockDeclarationContext blockDeclaration() {
			return getRuleContext(BlockDeclarationContext.class,0);
		}
		public DeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationStatement; }
	}

	public final DeclarationStatementContext declarationStatement() throws RecognitionException {
		DeclarationStatementContext _localctx = new DeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_declarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			blockDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarseqContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public DeclarseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarseq; }
	}

	public final DeclarseqContext declarseq() throws RecognitionException {
		DeclarseqContext _localctx = new DeclarseqContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_declarseq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(462);
				declaration();
				}
				}
				setState(465); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Semi - 66)) | (1L << (Class - 66)) | (1L << (Void - 66)) | (1L << (Bool - 66)) | (1L << (Int - 66)) | (1L << (Float - 66)) | (1L << (String - 66)) | (1L << (Graph - 66)) | (1L << (Edge - 66)) | (1L << (Matrix - 66)) | (1L << (Vertex - 66)) | (1L << (Identifier - 66)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public BlockDeclarationContext blockDeclaration() {
			return getRuleContext(BlockDeclarationContext.class,0);
		}
		public FunctionDefnContext functionDefn() {
			return getRuleContext(FunctionDefnContext.class,0);
		}
		public ClassDefnContext classDefn() {
			return getRuleContext(ClassDefnContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_declaration);
		try {
			setState(470);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(467);
				blockDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(468);
				functionDefn();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(469);
				classDefn();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockDeclarationContext extends ParserRuleContext {
		public SimpleDeclarationContext simpleDeclaration() {
			return getRuleContext(SimpleDeclarationContext.class,0);
		}
		public TerminalNode Semi() { return getToken(DroolParser.Semi, 0); }
		public BlockDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockDeclaration; }
	}

	public final BlockDeclarationContext blockDeclaration() throws RecognitionException {
		BlockDeclarationContext _localctx = new BlockDeclarationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_blockDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			simpleDeclaration();
			setState(473);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleDeclarationContext extends ParserRuleContext {
		public InitDeclaratorSeqContext initDeclaratorSeq() {
			return getRuleContext(InitDeclaratorSeqContext.class,0);
		}
		public SimpleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleDeclaration; }
	}

	public final SimpleDeclarationContext simpleDeclaration() throws RecognitionException {
		SimpleDeclarationContext _localctx = new SimpleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_simpleDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (Void - 70)) | (1L << (Bool - 70)) | (1L << (Int - 70)) | (1L << (Float - 70)) | (1L << (String - 70)) | (1L << (Graph - 70)) | (1L << (Edge - 70)) | (1L << (Matrix - 70)) | (1L << (Vertex - 70)) | (1L << (Identifier - 70)))) != 0)) {
				{
				setState(475);
				initDeclaratorSeq();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeContext extends ParserRuleContext {
		public TerminalNode Bool() { return getToken(DroolParser.Bool, 0); }
		public TerminalNode String() { return getToken(DroolParser.String, 0); }
		public TerminalNode Int() { return getToken(DroolParser.Int, 0); }
		public TerminalNode Float() { return getToken(DroolParser.Float, 0); }
		public TerminalNode Matrix() { return getToken(DroolParser.Matrix, 0); }
		public TerminalNode Vertex() { return getToken(DroolParser.Vertex, 0); }
		public TerminalNode Graph() { return getToken(DroolParser.Graph, 0); }
		public TerminalNode Edge() { return getToken(DroolParser.Edge, 0); }
		public TerminalNode Void() { return getToken(DroolParser.Void, 0); }
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_dataType);
		try {
			setState(488);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Bool:
				enterOuterAlt(_localctx, 1);
				{
				setState(478);
				match(Bool);
				}
				break;
			case String:
				enterOuterAlt(_localctx, 2);
				{
				setState(479);
				match(String);
				}
				break;
			case Int:
				enterOuterAlt(_localctx, 3);
				{
				setState(480);
				match(Int);
				}
				break;
			case Float:
				enterOuterAlt(_localctx, 4);
				{
				setState(481);
				match(Float);
				}
				break;
			case Matrix:
				enterOuterAlt(_localctx, 5);
				{
				setState(482);
				match(Matrix);
				}
				break;
			case Vertex:
				enterOuterAlt(_localctx, 6);
				{
				setState(483);
				match(Vertex);
				}
				break;
			case Graph:
				enterOuterAlt(_localctx, 7);
				{
				setState(484);
				match(Graph);
				}
				break;
			case Edge:
				enterOuterAlt(_localctx, 8);
				{
				setState(485);
				match(Edge);
				}
				break;
			case Void:
				enterOuterAlt(_localctx, 9);
				{
				setState(486);
				match(Void);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 10);
				{
				setState(487);
				className();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitDeclaratorSeqContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public List<InitDeclaratorContext> initDeclarator() {
			return getRuleContexts(InitDeclaratorContext.class);
		}
		public InitDeclaratorContext initDeclarator(int i) {
			return getRuleContext(InitDeclaratorContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(DroolParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(DroolParser.Comma, i);
		}
		public InitDeclaratorSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclaratorSeq; }
	}

	public final InitDeclaratorSeqContext initDeclaratorSeq() throws RecognitionException {
		InitDeclaratorSeqContext _localctx = new InitDeclaratorSeqContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_initDeclaratorSeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			dataType();
			setState(491);
			initDeclarator();
			setState(496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(492);
				match(Comma);
				setState(493);
				initDeclarator();
				}
				}
				setState(498);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitDeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public InitDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclarator; }
	}

	public final InitDeclaratorContext initDeclarator() throws RecognitionException {
		InitDeclaratorContext _localctx = new InitDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_initDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			declarator();
			setState(501);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(500);
				initializer();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(DroolParser.Identifier, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public List<TerminalNode> LeftBracket() { return getTokens(DroolParser.LeftBracket); }
		public TerminalNode LeftBracket(int i) {
			return getToken(DroolParser.LeftBracket, i);
		}
		public List<TerminalNode> RightBracket() { return getTokens(DroolParser.RightBracket); }
		public TerminalNode RightBracket(int i) {
			return getToken(DroolParser.RightBracket, i);
		}
		public List<ConstexprContext> constexpr() {
			return getRuleContexts(ConstexprContext.class);
		}
		public ConstexprContext constexpr(int i) {
			return getRuleContext(ConstexprContext.class,i);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			match(Identifier);
			setState(517);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(504);
				parameters();
				}
				break;
			case 2:
				{
				setState(505);
				match(LeftBracket);
				setState(507);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << Or) | (1L << Star) | (1L << And) | (1L << Plus) | (1L << Minus) | (1L << Tildae) | (1L << Not) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Sizeof) | (1L << Inv) | (1L << Trans) | (1L << Det) | (1L << Vsizeof) | (1L << Esizeof) | (1L << Val))) != 0) || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (Identifier - 90)) | (1L << (IntegerLiteral - 90)) | (1L << (DecimalLiteral - 90)) | (1L << (Integersuffix - 90)) | (1L << (FloatingLiteral - 90)) | (1L << (StringLiteral - 90)) | (1L << (BooleanLiteral - 90)) | (1L << (VertexLiteral - 90)))) != 0)) {
					{
					setState(506);
					constexpr();
					}
				}

				setState(509);
				match(RightBracket);
				setState(515);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftBracket) {
					{
					setState(510);
					match(LeftBracket);
					setState(512);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << Or) | (1L << Star) | (1L << And) | (1L << Plus) | (1L << Minus) | (1L << Tildae) | (1L << Not) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Sizeof) | (1L << Inv) | (1L << Trans) | (1L << Det) | (1L << Vsizeof) | (1L << Esizeof) | (1L << Val))) != 0) || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (Identifier - 90)) | (1L << (IntegerLiteral - 90)) | (1L << (DecimalLiteral - 90)) | (1L << (Integersuffix - 90)) | (1L << (FloatingLiteral - 90)) | (1L << (StringLiteral - 90)) | (1L << (BooleanLiteral - 90)) | (1L << (VertexLiteral - 90)))) != 0)) {
						{
						setState(511);
						constexpr();
						}
					}

					setState(514);
					match(RightBracket);
					}
				}

				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametersContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(DroolParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(DroolParser.RightParen, 0); }
		public ParameterDeclarationSeqContext parameterDeclarationSeq() {
			return getRuleContext(ParameterDeclarationSeqContext.class,0);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_parameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			match(LeftParen);
			setState(521);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(520);
				parameterDeclarationSeq();
				}
				break;
			}
			setState(523);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterDeclarationSeqContext extends ParserRuleContext {
		public List<ParameterDeclarationContext> parameterDeclaration() {
			return getRuleContexts(ParameterDeclarationContext.class);
		}
		public ParameterDeclarationContext parameterDeclaration(int i) {
			return getRuleContext(ParameterDeclarationContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(DroolParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(DroolParser.Comma, i);
		}
		public ParameterDeclarationSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclarationSeq; }
	}

	public final ParameterDeclarationSeqContext parameterDeclarationSeq() throws RecognitionException {
		ParameterDeclarationSeqContext _localctx = new ParameterDeclarationSeqContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_parameterDeclarationSeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			parameterDeclaration();
			setState(530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(526);
				match(Comma);
				setState(527);
				parameterDeclaration();
				}
				}
				setState(532);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterDeclarationContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public ParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclaration; }
	}

	public final ParameterDeclarationContext parameterDeclaration() throws RecognitionException {
		ParameterDeclarationContext _localctx = new ParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_parameterDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (Void - 70)) | (1L << (Bool - 70)) | (1L << (Int - 70)) | (1L << (Float - 70)) | (1L << (String - 70)) | (1L << (Graph - 70)) | (1L << (Edge - 70)) | (1L << (Matrix - 70)) | (1L << (Vertex - 70)) | (1L << (Identifier - 70)))) != 0)) {
				{
				setState(533);
				dataType();
				setState(538);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(534);
					declarator();
					setState(536);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << LeftBrace) | (1L << Assign) | (1L << HyphenD))) != 0)) {
						{
						setState(535);
						initializer();
						}
					}

					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDefnContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(DroolParser.Identifier, 0); }
		public TerminalNode LeftParen() { return getToken(DroolParser.LeftParen, 0); }
		public ParameterDeclarationSeqContext parameterDeclarationSeq() {
			return getRuleContext(ParameterDeclarationSeqContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(DroolParser.RightParen, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public FunctionDefnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefn; }
	}

	public final FunctionDefnContext functionDefn() throws RecognitionException {
		FunctionDefnContext _localctx = new FunctionDefnContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_functionDefn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			dataType();
			setState(543);
			match(Identifier);
			setState(544);
			match(LeftParen);
			setState(545);
			parameterDeclarationSeq();
			setState(546);
			match(RightParen);
			setState(547);
			functionBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionBodyContext extends ParserRuleContext {
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_functionBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			compoundStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerContext extends ParserRuleContext {
		public BraceOrEqualInitializerContext braceOrEqualInitializer() {
			return getRuleContext(BraceOrEqualInitializerContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(DroolParser.LeftParen, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(DroolParser.RightParen, 0); }
		public TerminalNode HyphenD() { return getToken(DroolParser.HyphenD, 0); }
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_initializer);
		try {
			setState(557);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBrace:
			case Assign:
				enterOuterAlt(_localctx, 1);
				{
				setState(551);
				braceOrEqualInitializer();
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(552);
				match(LeftParen);
				setState(553);
				exprList();
				setState(554);
				match(RightParen);
				}
				break;
			case HyphenD:
				enterOuterAlt(_localctx, 3);
				{
				setState(556);
				match(HyphenD);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BraceOrEqualInitializerContext extends ParserRuleContext {
		public TerminalNode Assign() { return getToken(DroolParser.Assign, 0); }
		public InitializationClauseContext initializationClause() {
			return getRuleContext(InitializationClauseContext.class,0);
		}
		public BracedInitSeqContext bracedInitSeq() {
			return getRuleContext(BracedInitSeqContext.class,0);
		}
		public BraceOrEqualInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_braceOrEqualInitializer; }
	}

	public final BraceOrEqualInitializerContext braceOrEqualInitializer() throws RecognitionException {
		BraceOrEqualInitializerContext _localctx = new BraceOrEqualInitializerContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_braceOrEqualInitializer);
		try {
			setState(562);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Assign:
				enterOuterAlt(_localctx, 1);
				{
				setState(559);
				match(Assign);
				setState(560);
				initializationClause();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(561);
				bracedInitSeq();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializationClauseContext extends ParserRuleContext {
		public AssignExprContext assignExpr() {
			return getRuleContext(AssignExprContext.class,0);
		}
		public BracedInitSeqContext bracedInitSeq() {
			return getRuleContext(BracedInitSeqContext.class,0);
		}
		public InitializationClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializationClause; }
	}

	public final InitializationClauseContext initializationClause() throws RecognitionException {
		InitializationClauseContext _localctx = new InitializationClauseContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_initializationClause);
		try {
			setState(566);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
			case Or:
			case Star:
			case And:
			case Plus:
			case Minus:
			case Tildae:
			case Not:
			case PlusPlus:
			case MinusMinus:
			case Sizeof:
			case Inv:
			case Trans:
			case Det:
			case Vsizeof:
			case Esizeof:
			case Val:
			case Identifier:
			case IntegerLiteral:
			case DecimalLiteral:
			case Integersuffix:
			case FloatingLiteral:
			case StringLiteral:
			case BooleanLiteral:
			case VertexLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(564);
				assignExpr();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(565);
				bracedInitSeq();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BracedInitSeqContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(DroolParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(DroolParser.RightBrace, 0); }
		public InitializationseqContext initializationseq() {
			return getRuleContext(InitializationseqContext.class,0);
		}
		public TerminalNode Comma() { return getToken(DroolParser.Comma, 0); }
		public BracedInitSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracedInitSeq; }
	}

	public final BracedInitSeqContext bracedInitSeq() throws RecognitionException {
		BracedInitSeqContext _localctx = new BracedInitSeqContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_bracedInitSeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			match(LeftBrace);
			setState(573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << LeftBrace) | (1L << Or) | (1L << Star) | (1L << And) | (1L << Plus) | (1L << Minus) | (1L << Tildae) | (1L << Not) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Sizeof) | (1L << Inv) | (1L << Trans) | (1L << Det) | (1L << Vsizeof) | (1L << Esizeof) | (1L << Val))) != 0) || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (Identifier - 90)) | (1L << (IntegerLiteral - 90)) | (1L << (DecimalLiteral - 90)) | (1L << (Integersuffix - 90)) | (1L << (FloatingLiteral - 90)) | (1L << (StringLiteral - 90)) | (1L << (BooleanLiteral - 90)) | (1L << (VertexLiteral - 90)))) != 0)) {
				{
				setState(569);
				initializationseq();
				setState(571);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(570);
					match(Comma);
					}
				}

				}
			}

			setState(575);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializationseqContext extends ParserRuleContext {
		public List<InitializationClauseContext> initializationClause() {
			return getRuleContexts(InitializationClauseContext.class);
		}
		public InitializationClauseContext initializationClause(int i) {
			return getRuleContext(InitializationClauseContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(DroolParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(DroolParser.Comma, i);
		}
		public InitializationseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializationseq; }
	}

	public final InitializationseqContext initializationseq() throws RecognitionException {
		InitializationseqContext _localctx = new InitializationseqContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_initializationseq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			initializationClause();
			setState(582);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(578);
					match(Comma);
					setState(579);
					initializationClause();
					}
					} 
				}
				setState(584);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(DroolParser.Identifier, 0); }
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDefnContext extends ParserRuleContext {
		public ClassHeadContext classHead() {
			return getRuleContext(ClassHeadContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(DroolParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(DroolParser.RightBrace, 0); }
		public TerminalNode Semi() { return getToken(DroolParser.Semi, 0); }
		public MemberlistContext memberlist() {
			return getRuleContext(MemberlistContext.class,0);
		}
		public ClassDefnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDefn; }
	}

	public final ClassDefnContext classDefn() throws RecognitionException {
		ClassDefnContext _localctx = new ClassDefnContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_classDefn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			classHead();
			setState(588);
			match(LeftBrace);
			setState(590);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Semi - 66)) | (1L << (Void - 66)) | (1L << (Bool - 66)) | (1L << (Int - 66)) | (1L << (Float - 66)) | (1L << (String - 66)) | (1L << (Graph - 66)) | (1L << (Edge - 66)) | (1L << (Matrix - 66)) | (1L << (Vertex - 66)) | (1L << (Identifier - 66)))) != 0)) {
				{
				setState(589);
				memberlist();
				}
			}

			setState(592);
			match(RightBrace);
			setState(593);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassHeadContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(DroolParser.Class, 0); }
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public InheritanceClauseContext inheritanceClause() {
			return getRuleContext(InheritanceClauseContext.class,0);
		}
		public ClassHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classHead; }
	}

	public final ClassHeadContext classHead() throws RecognitionException {
		ClassHeadContext _localctx = new ClassHeadContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_classHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			match(Class);
			setState(596);
			className();
			setState(598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(597);
				inheritanceClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberlistContext extends ParserRuleContext {
		public List<MemberdeclarationContext> memberdeclaration() {
			return getRuleContexts(MemberdeclarationContext.class);
		}
		public MemberdeclarationContext memberdeclaration(int i) {
			return getRuleContext(MemberdeclarationContext.class,i);
		}
		public MemberlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberlist; }
	}

	public final MemberlistContext memberlist() throws RecognitionException {
		MemberlistContext _localctx = new MemberlistContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_memberlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(600);
				memberdeclaration();
				}
				}
				setState(603); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Semi - 66)) | (1L << (Void - 66)) | (1L << (Bool - 66)) | (1L << (Int - 66)) | (1L << (Float - 66)) | (1L << (String - 66)) | (1L << (Graph - 66)) | (1L << (Edge - 66)) | (1L << (Matrix - 66)) | (1L << (Vertex - 66)) | (1L << (Identifier - 66)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberdeclarationContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(DroolParser.Semi, 0); }
		public MemberDeclaratorListContext memberDeclaratorList() {
			return getRuleContext(MemberDeclaratorListContext.class,0);
		}
		public FunctionDefnContext functionDefn() {
			return getRuleContext(FunctionDefnContext.class,0);
		}
		public MemberdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberdeclaration; }
	}

	public final MemberdeclarationContext memberdeclaration() throws RecognitionException {
		MemberdeclarationContext _localctx = new MemberdeclarationContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_memberdeclaration);
		int _la;
		try {
			setState(610);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(606);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (Void - 70)) | (1L << (Bool - 70)) | (1L << (Int - 70)) | (1L << (Float - 70)) | (1L << (String - 70)) | (1L << (Graph - 70)) | (1L << (Edge - 70)) | (1L << (Matrix - 70)) | (1L << (Vertex - 70)) | (1L << (Identifier - 70)))) != 0)) {
					{
					setState(605);
					memberDeclaratorList();
					}
				}

				setState(608);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(609);
				functionDefn();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberDeclaratorListContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public List<MemberDeclaratorContext> memberDeclarator() {
			return getRuleContexts(MemberDeclaratorContext.class);
		}
		public MemberDeclaratorContext memberDeclarator(int i) {
			return getRuleContext(MemberDeclaratorContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(DroolParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(DroolParser.Comma, i);
		}
		public MemberDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaratorList; }
	}

	public final MemberDeclaratorListContext memberDeclaratorList() throws RecognitionException {
		MemberDeclaratorListContext _localctx = new MemberDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_memberDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			dataType();
			setState(613);
			memberDeclarator();
			setState(618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(614);
				match(Comma);
				setState(615);
				memberDeclarator();
				}
				}
				setState(620);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberDeclaratorContext extends ParserRuleContext {
		public InitDeclaratorContext initDeclarator() {
			return getRuleContext(InitDeclaratorContext.class,0);
		}
		public BraceOrEqualInitializerContext braceOrEqualInitializer() {
			return getRuleContext(BraceOrEqualInitializerContext.class,0);
		}
		public MemberDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclarator; }
	}

	public final MemberDeclaratorContext memberDeclarator() throws RecognitionException {
		MemberDeclaratorContext _localctx = new MemberDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_memberDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			initDeclarator();
			setState(623);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftBrace || _la==Assign) {
				{
				setState(622);
				braceOrEqualInitializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InheritanceClauseContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(DroolParser.Colon, 0); }
		public InheriterListContext inheriterList() {
			return getRuleContext(InheriterListContext.class,0);
		}
		public InheritanceClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inheritanceClause; }
	}

	public final InheritanceClauseContext inheritanceClause() throws RecognitionException {
		InheritanceClauseContext _localctx = new InheritanceClauseContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_inheritanceClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			match(Colon);
			setState(626);
			inheriterList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InheriterListContext extends ParserRuleContext {
		public List<ClassNameContext> className() {
			return getRuleContexts(ClassNameContext.class);
		}
		public ClassNameContext className(int i) {
			return getRuleContext(ClassNameContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(DroolParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(DroolParser.Comma, i);
		}
		public InheriterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inheriterList; }
	}

	public final InheriterListContext inheriterList() throws RecognitionException {
		InheriterListContext _localctx = new InheriterListContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_inheriterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			className();
			setState(633);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(629);
				match(Comma);
				setState(630);
				className();
				}
				}
				setState(635);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return postfixExpr_sempred((PostfixExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean postfixExpr_sempred(PostfixExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3{\u027f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\3\2\5\2\u0084\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0095\n\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\3\u00a0\n\3\3\3\3\3\3\3\5\3\u00a5\n\3\3\3\5\3\u00a8\n\3"+
		"\5\3\u00aa\n\3\5\3\u00ac\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00b4\n\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\7\4\u00bc\n\4\f\4\16\4\u00bf\13\4\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00cb\n\6\3\7\3\7\3\b\3\b\3\b\5\b\u00d2\n"+
		"\b\3\t\3\t\3\t\7\t\u00d7\n\t\f\t\16\t\u00da\13\t\3\n\3\n\3\n\7\n\u00df"+
		"\n\n\f\n\16\n\u00e2\13\n\3\13\3\13\3\13\7\13\u00e7\n\13\f\13\16\13\u00ea"+
		"\13\13\3\f\3\f\3\f\7\f\u00ef\n\f\f\f\16\f\u00f2\13\f\3\r\3\r\3\r\7\r\u00f7"+
		"\n\r\f\r\16\r\u00fa\13\r\3\16\3\16\3\16\7\16\u00ff\n\16\f\16\16\16\u0102"+
		"\13\16\3\17\3\17\3\17\7\17\u0107\n\17\f\17\16\17\u010a\13\17\3\20\3\20"+
		"\3\20\7\20\u010f\n\20\f\20\16\20\u0112\13\20\3\21\3\21\3\21\7\21\u0117"+
		"\n\21\f\21\16\21\u011a\13\21\3\22\3\22\3\22\3\22\3\22\5\22\u0121\n\22"+
		"\3\23\3\23\3\24\3\24\5\24\u0127\n\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0136\n\25\5\25\u0138\n\25\6\25\u013a"+
		"\n\25\r\25\16\25\u013b\3\26\3\26\3\27\3\27\3\27\3\27\5\27\u0144\n\27\3"+
		"\27\3\27\3\27\5\27\u0149\n\27\3\27\3\27\3\27\3\30\3\30\3\30\7\30\u0151"+
		"\n\30\f\30\16\30\u0154\13\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\5\34\u016e\n\34\3\35\3\35\3\35\3\35\3\35\5\35\u0175\n\35\5\35"+
		"\u0177\n\35\3\35\3\35\3\36\3\36\3\36\5\36\u017e\n\36\3\36\3\36\3\36\3"+
		"\37\5\37\u0184\n\37\3\37\3\37\3 \3 \5 \u018a\n \3 \3 \3!\6!\u018f\n!\r"+
		"!\16!\u0190\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u019a\n\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\7\"\u01a2\n\"\f\"\16\"\u01a5\13\"\3\"\3\"\5\"\u01a9\n\"\3#\3"+
		"#\3#\3#\3#\5#\u01b0\n#\5#\u01b2\n#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u01be"+
		"\n$\3$\3$\5$\u01c2\n$\3$\3$\3$\5$\u01c7\n$\3%\3%\3%\3%\5%\u01cd\n%\3&"+
		"\3&\3\'\6\'\u01d2\n\'\r\'\16\'\u01d3\3(\3(\3(\5(\u01d9\n(\3)\3)\3)\3*"+
		"\5*\u01df\n*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u01eb\n+\3,\3,\3,\3,\7,"+
		"\u01f1\n,\f,\16,\u01f4\13,\3-\3-\5-\u01f8\n-\3.\3.\3.\3.\5.\u01fe\n.\3"+
		".\3.\3.\5.\u0203\n.\3.\5.\u0206\n.\5.\u0208\n.\3/\3/\5/\u020c\n/\3/\3"+
		"/\3\60\3\60\3\60\7\60\u0213\n\60\f\60\16\60\u0216\13\60\3\61\3\61\3\61"+
		"\5\61\u021b\n\61\5\61\u021d\n\61\5\61\u021f\n\61\3\62\3\62\3\62\3\62\3"+
		"\62\3\62\3\62\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u0230\n\64"+
		"\3\65\3\65\3\65\5\65\u0235\n\65\3\66\3\66\5\66\u0239\n\66\3\67\3\67\3"+
		"\67\5\67\u023e\n\67\5\67\u0240\n\67\3\67\3\67\38\38\38\78\u0247\n8\f8"+
		"\168\u024a\138\39\39\3:\3:\3:\5:\u0251\n:\3:\3:\3:\3;\3;\3;\5;\u0259\n"+
		";\3<\6<\u025c\n<\r<\16<\u025d\3=\5=\u0261\n=\3=\3=\5=\u0265\n=\3>\3>\3"+
		">\3>\7>\u026b\n>\f>\16>\u026e\13>\3?\3?\5?\u0272\n?\3@\3@\3@\3A\3A\3A"+
		"\7A\u027a\nA\fA\16A\u027d\13A\3A\2\3\6B\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\2\17\3\2()\4\2&\'/\60\4\2**\62\67\4\2\13\21&\'\3\2-.\4\2\f\f\22\23\3"+
		"\2\16\17\3\2\24\27\3\2\30\31\3\2\35%\4\2\4\4\\\\\3\289\3\2+,\2\u02a7\2"+
		"\u0083\3\2\2\2\4\u00ab\3\2\2\2\6\u00ad\3\2\2\2\b\u00c0\3\2\2\2\n\u00ca"+
		"\3\2\2\2\f\u00cc\3\2\2\2\16\u00ce\3\2\2\2\20\u00d3\3\2\2\2\22\u00db\3"+
		"\2\2\2\24\u00e3\3\2\2\2\26\u00eb\3\2\2\2\30\u00f3\3\2\2\2\32\u00fb\3\2"+
		"\2\2\34\u0103\3\2\2\2\36\u010b\3\2\2\2 \u0113\3\2\2\2\"\u0120\3\2\2\2"+
		"$\u0122\3\2\2\2&\u0126\3\2\2\2(\u012a\3\2\2\2*\u013d\3\2\2\2,\u013f\3"+
		"\2\2\2.\u014d\3\2\2\2\60\u0155\3\2\2\2\62\u0157\3\2\2\2\64\u015d\3\2\2"+
		"\2\66\u016d\3\2\2\28\u0176\3\2\2\2:\u017d\3\2\2\2<\u0183\3\2\2\2>\u0187"+
		"\3\2\2\2@\u018e\3\2\2\2B\u01a8\3\2\2\2D\u01b1\3\2\2\2F\u01c6\3\2\2\2H"+
		"\u01cc\3\2\2\2J\u01ce\3\2\2\2L\u01d1\3\2\2\2N\u01d8\3\2\2\2P\u01da\3\2"+
		"\2\2R\u01de\3\2\2\2T\u01ea\3\2\2\2V\u01ec\3\2\2\2X\u01f5\3\2\2\2Z\u01f9"+
		"\3\2\2\2\\\u0209\3\2\2\2^\u020f\3\2\2\2`\u021e\3\2\2\2b\u0220\3\2\2\2"+
		"d\u0227\3\2\2\2f\u022f\3\2\2\2h\u0234\3\2\2\2j\u0238\3\2\2\2l\u023a\3"+
		"\2\2\2n\u0243\3\2\2\2p\u024b\3\2\2\2r\u024d\3\2\2\2t\u0255\3\2\2\2v\u025b"+
		"\3\2\2\2x\u0264\3\2\2\2z\u0266\3\2\2\2|\u026f\3\2\2\2~\u0273\3\2\2\2\u0080"+
		"\u0276\3\2\2\2\u0082\u0084\5L\'\2\u0083\u0082\3\2\2\2\u0083\u0084\3\2"+
		"\2\2\u0084\u0085\3\2\2\2\u0085\u0086\7\2\2\3\u0086\3\3\2\2\2\u0087\u00ac"+
		"\7]\2\2\u0088\u00ac\7^\2\2\u0089\u00ac\7_\2\2\u008a\u00ac\7`\2\2\u008b"+
		"\u00ac\7a\2\2\u008c\u00ac\7b\2\2\u008d\u00ac\7c\2\2\u008e\u0095\7\\\2"+
		"\2\u008f\u0090\7\5\2\2\u0090\u0091\7\\\2\2\u0091\u0092\7B\2\2\u0092\u0093"+
		"\7\\\2\2\u0093\u0095\7\6\2\2\u0094\u008e\3\2\2\2\u0094\u008f\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\u0097\7\61\2\2\u0097\u00ac\7\\\2\2\u0098\u0099\7"+
		"\5\2\2\u0099\u009a\5.\30\2\u009a\u009b\7\6\2\2\u009b\u00ac\3\2\2\2\u009c"+
		"\u00a9\7\\\2\2\u009d\u009f\7\t\2\2\u009e\u00a0\5\60\31\2\u009f\u009e\3"+
		"\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a7\7\n\2\2\u00a2"+
		"\u00a4\7\t\2\2\u00a3\u00a5\5\60\31\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5\3"+
		"\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\7\n\2\2\u00a7\u00a2\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9\u009d\3\2\2\2\u00a9\u00aa\3\2"+
		"\2\2\u00aa\u00ac\3\2\2\2\u00ab\u0087\3\2\2\2\u00ab\u0088\3\2\2\2\u00ab"+
		"\u0089\3\2\2\2\u00ab\u008a\3\2\2\2\u00ab\u008b\3\2\2\2\u00ab\u008c\3\2"+
		"\2\2\u00ab\u008d\3\2\2\2\u00ab\u0094\3\2\2\2\u00ab\u0098\3\2\2\2\u00ab"+
		"\u009c\3\2\2\2\u00ac\5\3\2\2\2\u00ad\u00ae\b\4\1\2\u00ae\u00af\5\4\3\2"+
		"\u00af\u00bd\3\2\2\2\u00b0\u00b1\f\5\2\2\u00b1\u00b3\7\5\2\2\u00b2\u00b4"+
		"\5\b\5\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\u00bc\7\6\2\2\u00b6\u00b7\f\4\2\2\u00b7\u00b8\t\2\2\2\u00b8\u00bc\7\\"+
		"\2\2\u00b9\u00ba\f\3\2\2\u00ba\u00bc\t\3\2\2\u00bb\u00b0\3\2\2\2\u00bb"+
		"\u00b6\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2"+
		"\2\2\u00bd\u00be\3\2\2\2\u00be\7\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1"+
		"\5n8\2\u00c1\t\3\2\2\2\u00c2\u00cb\5\6\4\2\u00c3\u00c4\5\f\7\2\u00c4\u00c5"+
		"\5\n\6\2\u00c5\u00cb\3\2\2\2\u00c6\u00c7\t\4\2\2\u00c7\u00c8\7\5\2\2\u00c8"+
		"\u00c9\7\\\2\2\u00c9\u00cb\7\6\2\2\u00ca\u00c2\3\2\2\2\u00ca\u00c3\3\2"+
		"\2\2\u00ca\u00c6\3\2\2\2\u00cb\13\3\2\2\2\u00cc\u00cd\t\5\2\2\u00cd\r"+
		"\3\2\2\2\u00ce\u00d1\5\n\6\2\u00cf\u00d0\t\6\2\2\u00d0\u00d2\5\n\6\2\u00d1"+
		"\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\17\3\2\2\2\u00d3\u00d8\5\16\b"+
		"\2\u00d4\u00d5\t\7\2\2\u00d5\u00d7\5\16\b\2\u00d6\u00d4\3\2\2\2\u00d7"+
		"\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\21\3\2\2"+
		"\2\u00da\u00d8\3\2\2\2\u00db\u00e0\5\20\t\2\u00dc\u00dd\t\b\2\2\u00dd"+
		"\u00df\5\20\t\2\u00de\u00dc\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3"+
		"\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\23\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3"+
		"\u00e8\5\22\n\2\u00e4\u00e5\t\t\2\2\u00e5\u00e7\5\22\n\2\u00e6\u00e4\3"+
		"\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
		"\25\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00f0\5\24\13\2\u00ec\u00ed\t\n"+
		"\2\2\u00ed\u00ef\5\24\13\2\u00ee\u00ec\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0"+
		"\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\27\3\2\2\2\u00f2\u00f0\3\2\2"+
		"\2\u00f3\u00f8\5\26\f\2\u00f4\u00f5\7\r\2\2\u00f5\u00f7\5\26\f\2\u00f6"+
		"\u00f4\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2"+
		"\2\2\u00f9\31\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u0100\5\30\r\2\u00fc\u00fd"+
		"\7\32\2\2\u00fd\u00ff\5\30\r\2\u00fe\u00fc\3\2\2\2\u00ff\u0102\3\2\2\2"+
		"\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\33\3\2\2\2\u0102\u0100"+
		"\3\2\2\2\u0103\u0108\5\32\16\2\u0104\u0105\7\13\2\2\u0105\u0107\5\32\16"+
		"\2\u0106\u0104\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109"+
		"\3\2\2\2\u0109\35\3\2\2\2\u010a\u0108\3\2\2\2\u010b\u0110\5\34\17\2\u010c"+
		"\u010d\7\33\2\2\u010d\u010f\5\34\17\2\u010e\u010c\3\2\2\2\u010f\u0112"+
		"\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\37\3\2\2\2\u0112"+
		"\u0110\3\2\2\2\u0113\u0118\5\36\20\2\u0114\u0115\7\34\2\2\u0115\u0117"+
		"\5\36\20\2\u0116\u0114\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2"+
		"\u0118\u0119\3\2\2\2\u0119!\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u0121\5"+
		" \21\2\u011c\u011d\5 \21\2\u011d\u011e\5$\23\2\u011e\u011f\5j\66\2\u011f"+
		"\u0121\3\2\2\2\u0120\u011b\3\2\2\2\u0120\u011c\3\2\2\2\u0121#\3\2\2\2"+
		"\u0122\u0123\t\13\2\2\u0123%\3\2\2\2\u0124\u0127\5(\25\2\u0125\u0127\5"+
		",\27\2\u0126\u0124\3\2\2\2\u0126\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128"+
		"\u0129\7D\2\2\u0129\'\3\2\2\2\u012a\u0139\7\\\2\2\u012b\u0137\5*\26\2"+
		"\u012c\u0138\7\\\2\2\u012d\u012e\7\5\2\2\u012e\u012f\7\\\2\2\u012f\u0130"+
		"\7B\2\2\u0130\u0135\7\\\2\2\u0131\u0136\7\6\2\2\u0132\u0133\7B\2\2\u0133"+
		"\u0134\t\f\2\2\u0134\u0136\7\6\2\2\u0135\u0131\3\2\2\2\u0135\u0132\3\2"+
		"\2\2\u0136\u0138\3\2\2\2\u0137\u012c\3\2\2\2\u0137\u012d\3\2\2\2\u0138"+
		"\u013a\3\2\2\2\u0139\u012b\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u0139\3\2"+
		"\2\2\u013b\u013c\3\2\2\2\u013c)\3\2\2\2\u013d\u013e\t\r\2\2\u013e+\3\2"+
		"\2\2\u013f\u0140\5T+\2\u0140\u0141\7\\\2\2\u0141\u0143\7\t\2\2\u0142\u0144"+
		"\5\60\31\2\u0143\u0142\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0145\3\2\2\2"+
		"\u0145\u0146\7\n\2\2\u0146\u0148\7\35\2\2\u0147\u0149\7\\\2\2\u0148\u0147"+
		"\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b\t\16\2\2"+
		"\u014b\u014c\7\\\2\2\u014c-\3\2\2\2\u014d\u0152\5\"\22\2\u014e\u014f\7"+
		"B\2\2\u014f\u0151\5\"\22\2\u0150\u014e\3\2\2\2\u0151\u0154\3\2\2\2\u0152"+
		"\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153/\3\2\2\2\u0154\u0152\3\2\2\2"+
		"\u0155\u0156\5 \21\2\u0156\61\3\2\2\2\u0157\u0158\7W\2\2\u0158\u0159\7"+
		"\5\2\2\u0159\u015a\5\b\5\2\u015a\u015b\7\6\2\2\u015b\u015c\7D\2\2\u015c"+
		"\63\3\2\2\2\u015d\u015e\7X\2\2\u015e\u015f\7\5\2\2\u015f\u0160\5\b\5\2"+
		"\u0160\u0161\7\6\2\2\u0161\u0162\7D\2\2\u0162\65\3\2\2\2\u0163\u016e\5"+
		":\36\2\u0164\u016e\5<\37\2\u0165\u016e\5> \2\u0166\u016e\5B\"\2\u0167"+
		"\u016e\5F$\2\u0168\u016e\5J&\2\u0169\u016e\58\35\2\u016a\u016e\5\62\32"+
		"\2\u016b\u016e\5\64\33\2\u016c\u016e\5&\24\2\u016d\u0163\3\2\2\2\u016d"+
		"\u0164\3\2\2\2\u016d\u0165\3\2\2\2\u016d\u0166\3\2\2\2\u016d\u0167\3\2"+
		"\2\2\u016d\u0168\3\2\2\2\u016d\u0169\3\2\2\2\u016d\u016a\3\2\2\2\u016d"+
		"\u016b\3\2\2\2\u016d\u016c\3\2\2\2\u016e\67\3\2\2\2\u016f\u0177\7U\2\2"+
		"\u0170\u0177\7T\2\2\u0171\u0174\7V\2\2\u0172\u0175\5.\30\2\u0173\u0175"+
		"\5l\67\2\u0174\u0172\3\2\2\2\u0174\u0173\3\2\2\2\u0174\u0175\3\2\2\2\u0175"+
		"\u0177\3\2\2\2\u0176\u016f\3\2\2\2\u0176\u0170\3\2\2\2\u0176\u0171\3\2"+
		"\2\2\u0177\u0178\3\2\2\2\u0178\u0179\7D\2\2\u01799\3\2\2\2\u017a\u017b"+
		"\7@\2\2\u017b\u017e\5\60\31\2\u017c\u017e\7A\2\2\u017d\u017a\3\2\2\2\u017d"+
		"\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0180\7C\2\2\u0180\u0181\5\66"+
		"\34\2\u0181;\3\2\2\2\u0182\u0184\5.\30\2\u0183\u0182\3\2\2\2\u0183\u0184"+
		"\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186\7D\2\2\u0186=\3\2\2\2\u0187\u0189"+
		"\7\7\2\2\u0188\u018a\5@!\2\u0189\u0188\3\2\2\2\u0189\u018a\3\2\2\2\u018a"+
		"\u018b\3\2\2\2\u018b\u018c\7\b\2\2\u018c?\3\2\2\2\u018d\u018f\5\66\34"+
		"\2\u018e\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191"+
		"\3\2\2\2\u0191A\3\2\2\2\u0192\u0193\7;\2\2\u0193\u0194\7\5\2\2\u0194\u0195"+
		"\5D#\2\u0195\u0196\7\6\2\2\u0196\u0199\5\66\34\2\u0197\u0198\7<\2\2\u0198"+
		"\u019a\5\66\34\2\u0199\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u01a9\3"+
		"\2\2\2\u019b\u019c\7=\2\2\u019c\u019d\7\5\2\2\u019d\u019e\5D#\2\u019e"+
		"\u019f\7\6\2\2\u019f\u01a3\7\7\2\2\u01a0\u01a2\5:\36\2\u01a1\u01a0\3\2"+
		"\2\2\u01a2\u01a5\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4"+
		"\u01a6\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a6\u01a7\7\b\2\2\u01a7\u01a9\3\2"+
		"\2\2\u01a8\u0192\3\2\2\2\u01a8\u019b\3\2\2\2\u01a9C\3\2\2\2\u01aa\u01b2"+
		"\5.\30\2\u01ab\u01af\5Z.\2\u01ac\u01ad\7\35\2\2\u01ad\u01b0\5j\66\2\u01ae"+
		"\u01b0\5l\67\2\u01af\u01ac\3\2\2\2\u01af\u01ae\3\2\2\2\u01b0\u01b2\3\2"+
		"\2\2\u01b1\u01aa\3\2\2\2\u01b1\u01ab\3\2\2\2\u01b2E\3\2\2\2\u01b3\u01b4"+
		"\7>\2\2\u01b4\u01b5\7\5\2\2\u01b5\u01b6\5D#\2\u01b6\u01b7\7\6\2\2\u01b7"+
		"\u01b8\5\66\34\2\u01b8\u01c7\3\2\2\2\u01b9\u01ba\7?\2\2\u01ba\u01bb\7"+
		"\5\2\2\u01bb\u01bd\5H%\2\u01bc\u01be\5D#\2\u01bd\u01bc\3\2\2\2\u01bd\u01be"+
		"\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c1\7D\2\2\u01c0\u01c2\5.\30\2\u01c1"+
		"\u01c0\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c4\7\6"+
		"\2\2\u01c4\u01c5\5\66\34\2\u01c5\u01c7\3\2\2\2\u01c6\u01b3\3\2\2\2\u01c6"+
		"\u01b9\3\2\2\2\u01c7G\3\2\2\2\u01c8\u01cd\5<\37\2\u01c9\u01ca\5R*\2\u01ca"+
		"\u01cb\7D\2\2\u01cb\u01cd\3\2\2\2\u01cc\u01c8\3\2\2\2\u01cc\u01c9\3\2"+
		"\2\2\u01cdI\3\2\2\2\u01ce\u01cf\5P)\2\u01cfK\3\2\2\2\u01d0\u01d2\5N(\2"+
		"\u01d1\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3\u01d4"+
		"\3\2\2\2\u01d4M\3\2\2\2\u01d5\u01d9\5P)\2\u01d6\u01d9\5b\62\2\u01d7\u01d9"+
		"\5r:\2\u01d8\u01d5\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d8\u01d7\3\2\2\2\u01d9"+
		"O\3\2\2\2\u01da\u01db\5R*\2\u01db\u01dc\7D\2\2\u01dcQ\3\2\2\2\u01dd\u01df"+
		"\5V,\2\u01de\u01dd\3\2\2\2\u01de\u01df\3\2\2\2\u01dfS\3\2\2\2\u01e0\u01eb"+
		"\7I\2\2\u01e1\u01eb\7L\2\2\u01e2\u01eb\7J\2\2\u01e3\u01eb\7K\2\2\u01e4"+
		"\u01eb\7O\2\2\u01e5\u01eb\7P\2\2\u01e6\u01eb\7M\2\2\u01e7\u01eb\7N\2\2"+
		"\u01e8\u01eb\7H\2\2\u01e9\u01eb\5p9\2\u01ea\u01e0\3\2\2\2\u01ea\u01e1"+
		"\3\2\2\2\u01ea\u01e2\3\2\2\2\u01ea\u01e3\3\2\2\2\u01ea\u01e4\3\2\2\2\u01ea"+
		"\u01e5\3\2\2\2\u01ea\u01e6\3\2\2\2\u01ea\u01e7\3\2\2\2\u01ea\u01e8\3\2"+
		"\2\2\u01ea\u01e9\3\2\2\2\u01ebU\3\2\2\2\u01ec\u01ed\5T+\2\u01ed\u01f2"+
		"\5X-\2\u01ee\u01ef\7B\2\2\u01ef\u01f1\5X-\2\u01f0\u01ee\3\2\2\2\u01f1"+
		"\u01f4\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3W\3\2\2\2"+
		"\u01f4\u01f2\3\2\2\2\u01f5\u01f7\5Z.\2\u01f6\u01f8\5f\64\2\u01f7\u01f6"+
		"\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8Y\3\2\2\2\u01f9\u0207\7\\\2\2\u01fa"+
		"\u0208\5\\/\2\u01fb\u01fd\7\t\2\2\u01fc\u01fe\5\60\31\2\u01fd\u01fc\3"+
		"\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0205\7\n\2\2\u0200"+
		"\u0202\7\t\2\2\u0201\u0203\5\60\31\2\u0202\u0201\3\2\2\2\u0202\u0203\3"+
		"\2\2\2\u0203\u0204\3\2\2\2\u0204\u0206\7\n\2\2\u0205\u0200\3\2\2\2\u0205"+
		"\u0206\3\2\2\2\u0206\u0208\3\2\2\2\u0207\u01fa\3\2\2\2\u0207\u01fb\3\2"+
		"\2\2\u0207\u0208\3\2\2\2\u0208[\3\2\2\2\u0209\u020b\7\5\2\2\u020a\u020c"+
		"\5^\60\2\u020b\u020a\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020d\3\2\2\2\u020d"+
		"\u020e\7\6\2\2\u020e]\3\2\2\2\u020f\u0214\5`\61\2\u0210\u0211\7B\2\2\u0211"+
		"\u0213\5`\61\2\u0212\u0210\3\2\2\2\u0213\u0216\3\2\2\2\u0214\u0212\3\2"+
		"\2\2\u0214\u0215\3\2\2\2\u0215_\3\2\2\2\u0216\u0214\3\2\2\2\u0217\u021c"+
		"\5T+\2\u0218\u021a\5Z.\2\u0219\u021b\5f\64\2\u021a\u0219\3\2\2\2\u021a"+
		"\u021b\3\2\2\2\u021b\u021d\3\2\2\2\u021c\u0218\3\2\2\2\u021c\u021d\3\2"+
		"\2\2\u021d\u021f\3\2\2\2\u021e\u0217\3\2\2\2\u021e\u021f\3\2\2\2\u021f"+
		"a\3\2\2\2\u0220\u0221\5T+\2\u0221\u0222\7\\\2\2\u0222\u0223\7\5\2\2\u0223"+
		"\u0224\5^\60\2\u0224\u0225\7\6\2\2\u0225\u0226\5d\63\2\u0226c\3\2\2\2"+
		"\u0227\u0228\5> \2\u0228e\3\2\2\2\u0229\u0230\5h\65\2\u022a\u022b\7\5"+
		"\2\2\u022b\u022c\5\b\5\2\u022c\u022d\7\6\2\2\u022d\u0230\3\2\2\2\u022e"+
		"\u0230\7:\2\2\u022f\u0229\3\2\2\2\u022f\u022a\3\2\2\2\u022f\u022e\3\2"+
		"\2\2\u0230g\3\2\2\2\u0231\u0232\7\35\2\2\u0232\u0235\5j\66\2\u0233\u0235"+
		"\5l\67\2\u0234\u0231\3\2\2\2\u0234\u0233\3\2\2\2\u0235i\3\2\2\2\u0236"+
		"\u0239\5\"\22\2\u0237\u0239\5l\67\2\u0238\u0236\3\2\2\2\u0238\u0237\3"+
		"\2\2\2\u0239k\3\2\2\2\u023a\u023f\7\7\2\2\u023b\u023d\5n8\2\u023c\u023e"+
		"\7B\2\2\u023d\u023c\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u0240\3\2\2\2\u023f"+
		"\u023b\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0242\7\b"+
		"\2\2\u0242m\3\2\2\2\u0243\u0248\5j\66\2\u0244\u0245\7B\2\2\u0245\u0247"+
		"\5j\66\2\u0246\u0244\3\2\2\2\u0247\u024a\3\2\2\2\u0248\u0246\3\2\2\2\u0248"+
		"\u0249\3\2\2\2\u0249o\3\2\2\2\u024a\u0248\3\2\2\2\u024b\u024c\7\\\2\2"+
		"\u024cq\3\2\2\2\u024d\u024e\5t;\2\u024e\u0250\7\7\2\2\u024f\u0251\5v<"+
		"\2\u0250\u024f\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0253"+
		"\7\b\2\2\u0253\u0254\7D\2\2\u0254s\3\2\2\2\u0255\u0256\7G\2\2\u0256\u0258"+
		"\5p9\2\u0257\u0259\5~@\2\u0258\u0257\3\2\2\2\u0258\u0259\3\2\2\2\u0259"+
		"u\3\2\2\2\u025a\u025c\5x=\2\u025b\u025a\3\2\2\2\u025c\u025d\3\2\2\2\u025d"+
		"\u025b\3\2\2\2\u025d\u025e\3\2\2\2\u025ew\3\2\2\2\u025f\u0261\5z>\2\u0260"+
		"\u025f\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0262\3\2\2\2\u0262\u0265\7D"+
		"\2\2\u0263\u0265\5b\62\2\u0264\u0260\3\2\2\2\u0264\u0263\3\2\2\2\u0265"+
		"y\3\2\2\2\u0266\u0267\5T+\2\u0267\u026c\5|?\2\u0268\u0269\7B\2\2\u0269"+
		"\u026b\5|?\2\u026a\u0268\3\2\2\2\u026b\u026e\3\2\2\2\u026c\u026a\3\2\2"+
		"\2\u026c\u026d\3\2\2\2\u026d{\3\2\2\2\u026e\u026c\3\2\2\2\u026f\u0271"+
		"\5X-\2\u0270\u0272\5h\65\2\u0271\u0270\3\2\2\2\u0271\u0272\3\2\2\2\u0272"+
		"}\3\2\2\2\u0273\u0274\7C\2\2\u0274\u0275\5\u0080A\2\u0275\177\3\2\2\2"+
		"\u0276\u027b\5p9\2\u0277\u0278\7B\2\2\u0278\u027a\5p9\2\u0279\u0277\3"+
		"\2\2\2\u027a\u027d\3\2\2\2\u027b\u0279\3\2\2\2\u027b\u027c\3\2\2\2\u027c"+
		"\u0081\3\2\2\2\u027d\u027b\3\2\2\2L\u0083\u0094\u009f\u00a4\u00a7\u00a9"+
		"\u00ab\u00b3\u00bb\u00bd\u00ca\u00d1\u00d8\u00e0\u00e8\u00f0\u00f8\u0100"+
		"\u0108\u0110\u0118\u0120\u0126\u0135\u0137\u013b\u0143\u0148\u0152\u016d"+
		"\u0174\u0176\u017d\u0183\u0189\u0190\u0199\u01a3\u01a8\u01af\u01b1\u01bd"+
		"\u01c1\u01c6\u01cc\u01d3\u01d8\u01de\u01ea\u01f2\u01f7\u01fd\u0202\u0205"+
		"\u0207\u020b\u0214\u021a\u021c\u021e\u022f\u0234\u0238\u023d\u023f\u0248"+
		"\u0250\u0258\u025d\u0260\u0264\u026c\u0271\u027b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
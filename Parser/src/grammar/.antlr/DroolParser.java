// Generated from /home/sandeep/homework/compilers2/DROOL/Parser/src/grammar/DroolParser.g4 by ANTLR 4.8

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
		Arrow=39, Sizeof=40, Hashtag=41, Addc=42, Addr=43, Delr=44, Delc=45, Questionmark=46, 
		Inv=47, Trans=48, Det=49, Vsizeof=50, Esizeof=51, Val=52, Pull=53, Push=54, 
		If=55, Else=56, Switch=57, While=58, For=59, Case=60, Default=61, Comma=62, 
		Colon=63, Semi=64, SingleQuote=65, DoubleQuote=66, Class=67, Void=68, 
		Bool=69, Int=70, Float=71, String=72, Graph=73, Edge=74, Matrix=75, Vertex=76, 
		Long=77, Unsigned=78, Delete=79, Continue=80, Break=81, Return=82, Input=83, 
		Output=84, Const=85, False_=86, True_=87, Identifier=88, IntegerLiteral=89, 
		DecimalLiteral=90, Integersuffix=91, FloatingLiteral=92, StringLiteral=93, 
		BooleanLiteral=94, VertexLiteral=95, Newline=96, WHITESPACE=97, ESC=98, 
		UNTERM_STR=99, NULL_STR=100, ESC_NULL_STR=101, EOF_BCKSLSH_STR=102, EOF_STR=103, 
		EOF_COMMENT_0=104, OPEN_COMMENT=105, SINGLE_LINE_COMMENT=106, MULTI_LINE_COMMENT=107, 
		EOF_COMMENT_1=108, EOF_COMMENT_2=109, IN_NEST_MLC_0=110, CLOSE_MLC_0=111, 
		CONTENT_MLC_0=112, EOF_COMMENT_3=113, EOF_COMMENT_4=114, EOF_COMMENT_5=115, 
		IN_NEST_MLC_1=116, CLOSE_MLC_1=117, CONTENT_MLC_1=118, OTHER=119;
	public static final int
		RULE_program = 0, RULE_primaryExpr = 1, RULE_postfixExpr = 2, RULE_exprList = 3, 
		RULE_unaryExpr = 4, RULE_unaryOpr = 5, RULE_graphmemberExpr = 6, RULE_addrcExpr = 7, 
		RULE_questionExpr = 8, RULE_multiplicationExpr = 9, RULE_additiveExpr = 10, 
		RULE_pushpullExpr = 11, RULE_pushpullOpr = 12, RULE_comparisonExpr = 13, 
		RULE_equalityExpr = 14, RULE_binAndExpr = 15, RULE_binXorExpr = 16, RULE_binOrExpr = 17, 
		RULE_andExpr = 18, RULE_orExpr = 19, RULE_assignExpr = 20, RULE_assignOpr = 21, 
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
			"graphmemberExpr", "addrcExpr", "questionExpr", "multiplicationExpr", 
			"additiveExpr", "pushpullExpr", "pushpullOpr", "comparisonExpr", "equalityExpr", 
			"binAndExpr", "binXorExpr", "binOrExpr", "andExpr", "orExpr", "assignExpr", 
			"assignOpr", "expr", "constexpr", "inputStatement", "outputStatement", 
			"statement", "jumpStatement", "caseStatement", "exprStatement", "compoundStatement", 
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
			"'->'", null, "'#'", null, null, null, null, "'?'", null, null, null, 
			null, null, null, "'>>'", "'<<'", null, null, null, null, null, null, 
			null, "','", "':'", "';'", "'''", "'\"'"
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
			"Addc", "Addr", "Delr", "Delc", "Questionmark", "Inv", "Trans", "Det", 
			"Vsizeof", "Esizeof", "Val", "Pull", "Push", "If", "Else", "Switch", 
			"While", "For", "Case", "Default", "Comma", "Colon", "Semi", "SingleQuote", 
			"DoubleQuote", "Class", "Void", "Bool", "Int", "Float", "String", "Graph", 
			"Edge", "Matrix", "Vertex", "Long", "Unsigned", "Delete", "Continue", 
			"Break", "Return", "Input", "Output", "Const", "False_", "True_", "Identifier", 
			"IntegerLiteral", "DecimalLiteral", "Integersuffix", "FloatingLiteral", 
			"StringLiteral", "BooleanLiteral", "VertexLiteral", "Newline", "WHITESPACE", 
			"ESC", "UNTERM_STR", "NULL_STR", "ESC_NULL_STR", "EOF_BCKSLSH_STR", "EOF_STR", 
			"EOF_COMMENT_0", "OPEN_COMMENT", "SINGLE_LINE_COMMENT", "MULTI_LINE_COMMENT", 
			"EOF_COMMENT_1", "EOF_COMMENT_2", "IN_NEST_MLC_0", "CLOSE_MLC_0", "CONTENT_MLC_0", 
			"EOF_COMMENT_3", "EOF_COMMENT_4", "EOF_COMMENT_5", "IN_NEST_MLC_1", "CLOSE_MLC_1", 
			"CONTENT_MLC_1", "OTHER"
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

	/*
		DO NOT EDIT THE FILE ABOVE THIS LINE
		Add member functions, variables below.
	*/


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
			if (((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Semi - 64)) | (1L << (Class - 64)) | (1L << (Void - 64)) | (1L << (Bool - 64)) | (1L << (Int - 64)) | (1L << (Float - 64)) | (1L << (String - 64)) | (1L << (Graph - 64)) | (1L << (Edge - 64)) | (1L << (Matrix - 64)) | (1L << (Vertex - 64)) | (1L << (Identifier - 64)))) != 0)) {
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
		public TerminalNode Literal() { return getToken(DroolParser.Literal, 0); }
		public TerminalNode LeftParen() { return getToken(DroolParser.LeftParen, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(DroolParser.RightParen, 0); }
		public TerminalNode Identifier() { return getToken(DroolParser.Identifier, 0); }
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
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Literal:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				match(Literal);
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				match(LeftParen);
				setState(135);
				expr();
				setState(136);
				match(RightParen);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				match(Identifier);
				setState(151);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(139);
					match(LeftBracket);
					setState(141);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Literal) | (1L << LeftParen) | (1L << Or) | (1L << Star) | (1L << And) | (1L << Plus) | (1L << Minus) | (1L << Tildae) | (1L << Not) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Sizeof) | (1L << Hashtag) | (1L << Inv) | (1L << Trans) | (1L << Det) | (1L << Vsizeof) | (1L << Esizeof) | (1L << Val))) != 0) || _la==Identifier) {
						{
						setState(140);
						constexpr();
						}
					}

					setState(143);
					match(RightBracket);
					setState(149);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						setState(144);
						match(LeftBracket);
						setState(146);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Literal) | (1L << LeftParen) | (1L << Or) | (1L << Star) | (1L << And) | (1L << Plus) | (1L << Minus) | (1L << Tildae) | (1L << Not) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Sizeof) | (1L << Hashtag) | (1L << Inv) | (1L << Trans) | (1L << Det) | (1L << Vsizeof) | (1L << Esizeof) | (1L << Val))) != 0) || _la==Identifier) {
							{
							setState(145);
							constexpr();
							}
						}

						setState(148);
						match(RightBracket);
						}
						break;
					}
					}
					break;
				}
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
			setState(156);
			primaryExpr();
			}
			_ctx.stop = _input.LT(-1);
			setState(171);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(169);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new PostfixExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpr);
						setState(158);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(159);
						match(LeftParen);
						setState(161);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Literal) | (1L << LeftParen) | (1L << LeftBrace) | (1L << Or) | (1L << Star) | (1L << And) | (1L << Plus) | (1L << Minus) | (1L << Tildae) | (1L << Not) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Sizeof) | (1L << Hashtag) | (1L << Inv) | (1L << Trans) | (1L << Det) | (1L << Vsizeof) | (1L << Esizeof) | (1L << Val))) != 0) || _la==Identifier) {
							{
							setState(160);
							exprList();
							}
						}

						setState(163);
						match(RightParen);
						}
						break;
					case 2:
						{
						_localctx = new PostfixExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpr);
						setState(164);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(165);
						_la = _input.LA(1);
						if ( !(_la==Dot || _la==Arrow) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(166);
						match(Identifier);
						}
						break;
					case 3:
						{
						_localctx = new PostfixExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpr);
						setState(167);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(168);
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
				setState(173);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
			setState(174);
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
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Literal:
			case LeftParen:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
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
				setState(177);
				unaryOpr();
				setState(178);
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
				setState(180);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Sizeof) | (1L << Inv) | (1L << Trans) | (1L << Det) | (1L << Vsizeof) | (1L << Esizeof) | (1L << Val))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(181);
				match(LeftParen);
				setState(182);
				match(Identifier);
				setState(183);
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
			setState(186);
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

	public static class GraphmemberExprContext extends ParserRuleContext {
		public List<UnaryExprContext> unaryExpr() {
			return getRuleContexts(UnaryExprContext.class);
		}
		public UnaryExprContext unaryExpr(int i) {
			return getRuleContext(UnaryExprContext.class,i);
		}
		public List<TerminalNode> Hashtag() { return getTokens(DroolParser.Hashtag); }
		public TerminalNode Hashtag(int i) {
			return getToken(DroolParser.Hashtag, i);
		}
		public GraphmemberExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graphmemberExpr; }
	}

	public final GraphmemberExprContext graphmemberExpr() throws RecognitionException {
		GraphmemberExprContext _localctx = new GraphmemberExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_graphmemberExpr);
		int _la;
		try {
			setState(201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Literal:
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
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				unaryExpr();
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Hashtag) {
					{
					setState(189);
					match(Hashtag);
					setState(191);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Hashtag) {
						{
						setState(190);
						match(Hashtag);
						}
					}

					setState(193);
					unaryExpr();
					}
				}

				}
				break;
			case Hashtag:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				match(Hashtag);
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Hashtag) {
					{
					setState(197);
					match(Hashtag);
					}
				}

				setState(200);
				unaryExpr();
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

	public static class AddrcExprContext extends ParserRuleContext {
		public List<GraphmemberExprContext> graphmemberExpr() {
			return getRuleContexts(GraphmemberExprContext.class);
		}
		public GraphmemberExprContext graphmemberExpr(int i) {
			return getRuleContext(GraphmemberExprContext.class,i);
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
		enterRule(_localctx, 14, RULE_addrcExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			graphmemberExpr();
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Addc || _la==Addr) {
				{
				setState(204);
				_la = _input.LA(1);
				if ( !(_la==Addc || _la==Addr) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(205);
				graphmemberExpr();
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

	public static class QuestionExprContext extends ParserRuleContext {
		public List<AddrcExprContext> addrcExpr() {
			return getRuleContexts(AddrcExprContext.class);
		}
		public AddrcExprContext addrcExpr(int i) {
			return getRuleContext(AddrcExprContext.class,i);
		}
		public TerminalNode Questionmark() { return getToken(DroolParser.Questionmark, 0); }
		public QuestionExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questionExpr; }
	}

	public final QuestionExprContext questionExpr() throws RecognitionException {
		QuestionExprContext _localctx = new QuestionExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_questionExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			addrcExpr();
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Questionmark) {
				{
				setState(209);
				match(Questionmark);
				setState(210);
				addrcExpr();
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
		public List<QuestionExprContext> questionExpr() {
			return getRuleContexts(QuestionExprContext.class);
		}
		public QuestionExprContext questionExpr(int i) {
			return getRuleContext(QuestionExprContext.class,i);
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
		enterRule(_localctx, 18, RULE_multiplicationExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			questionExpr();
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Star) | (1L << Div) | (1L << Mod))) != 0)) {
				{
				{
				setState(214);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Star) | (1L << Div) | (1L << Mod))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(215);
				questionExpr();
				}
				}
				setState(220);
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
		enterRule(_localctx, 20, RULE_additiveExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			multiplicationExpr();
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Plus || _la==Minus) {
				{
				{
				setState(222);
				_la = _input.LA(1);
				if ( !(_la==Plus || _la==Minus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(223);
				multiplicationExpr();
				}
				}
				setState(228);
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

	public static class PushpullExprContext extends ParserRuleContext {
		public List<AdditiveExprContext> additiveExpr() {
			return getRuleContexts(AdditiveExprContext.class);
		}
		public AdditiveExprContext additiveExpr(int i) {
			return getRuleContext(AdditiveExprContext.class,i);
		}
		public List<PushpullOprContext> pushpullOpr() {
			return getRuleContexts(PushpullOprContext.class);
		}
		public PushpullOprContext pushpullOpr(int i) {
			return getRuleContext(PushpullOprContext.class,i);
		}
		public PushpullExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pushpullExpr; }
	}

	public final PushpullExprContext pushpullExpr() throws RecognitionException {
		PushpullExprContext _localctx = new PushpullExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_pushpullExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			additiveExpr();
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Pull || _la==Push) {
				{
				{
				setState(230);
				pushpullOpr();
				setState(231);
				additiveExpr();
				}
				}
				setState(237);
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
		enterRule(_localctx, 24, RULE_pushpullOpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
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

	public static class ComparisonExprContext extends ParserRuleContext {
		public List<PushpullExprContext> pushpullExpr() {
			return getRuleContexts(PushpullExprContext.class);
		}
		public PushpullExprContext pushpullExpr(int i) {
			return getRuleContext(PushpullExprContext.class,i);
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
		enterRule(_localctx, 26, RULE_comparisonExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			pushpullExpr();
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Less) | (1L << Greater) | (1L << LessEqual) | (1L << GreaterEqual))) != 0)) {
				{
				{
				setState(241);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Less) | (1L << Greater) | (1L << LessEqual) | (1L << GreaterEqual))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(242);
				pushpullExpr();
				}
				}
				setState(247);
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
		enterRule(_localctx, 28, RULE_equalityExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			comparisonExpr();
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Equal || _la==NotEqual) {
				{
				{
				setState(249);
				_la = _input.LA(1);
				if ( !(_la==Equal || _la==NotEqual) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(250);
				comparisonExpr();
				}
				}
				setState(255);
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
		enterRule(_localctx, 30, RULE_binAndExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			equalityExpr();
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==And) {
				{
				{
				setState(257);
				match(And);
				setState(258);
				equalityExpr();
				}
				}
				setState(263);
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
		enterRule(_localctx, 32, RULE_binXorExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			binAndExpr();
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Caret) {
				{
				{
				setState(265);
				match(Caret);
				setState(266);
				binAndExpr();
				}
				}
				setState(271);
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
		enterRule(_localctx, 34, RULE_binOrExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			binXorExpr();
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Or) {
				{
				{
				setState(273);
				match(Or);
				setState(274);
				binXorExpr();
				}
				}
				setState(279);
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
		enterRule(_localctx, 36, RULE_andExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			binOrExpr();
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AndAnd) {
				{
				{
				setState(281);
				match(AndAnd);
				setState(282);
				binOrExpr();
				}
				}
				setState(287);
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
		enterRule(_localctx, 38, RULE_orExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			andExpr();
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OrOr) {
				{
				{
				setState(289);
				match(OrOr);
				setState(290);
				andExpr();
				}
				}
				setState(295);
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
		enterRule(_localctx, 40, RULE_assignExpr);
		try {
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				orExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				orExpr();
				setState(298);
				assignOpr();
				setState(299);
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
		enterRule(_localctx, 42, RULE_assignOpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
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
			setState(305);
			assignExpr();
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(306);
				match(Comma);
				setState(307);
				assignExpr();
				}
				}
				setState(312);
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
			setState(313);
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
			setState(315);
			match(Input);
			setState(316);
			match(LeftParen);
			setState(317);
			exprList();
			setState(318);
			match(RightParen);
			setState(319);
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
			setState(321);
			match(Output);
			setState(322);
			match(LeftParen);
			setState(323);
			exprList();
			setState(324);
			match(RightParen);
			setState(325);
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_statement);
		try {
			setState(336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				caseStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				exprStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(329);
				compoundStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(330);
				selectStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(331);
				iterStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(332);
				declarationStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(333);
				jumpStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(334);
				inputStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(335);
				outputStatement();
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
			setState(345);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Break:
				{
				setState(338);
				match(Break);
				}
				break;
			case Continue:
				{
				setState(339);
				match(Continue);
				}
				break;
			case Return:
				{
				setState(340);
				match(Return);
				setState(343);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Literal:
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
				case Hashtag:
				case Inv:
				case Trans:
				case Det:
				case Vsizeof:
				case Esizeof:
				case Val:
				case Identifier:
					{
					setState(341);
					expr();
					}
					break;
				case LeftBrace:
					{
					setState(342);
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
			setState(347);
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
			setState(352);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Case:
				{
				setState(349);
				match(Case);
				setState(350);
				constexpr();
				}
				break;
			case Default:
				{
				setState(351);
				match(Default);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(354);
			match(Colon);
			setState(355);
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
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Literal) | (1L << LeftParen) | (1L << Or) | (1L << Star) | (1L << And) | (1L << Plus) | (1L << Minus) | (1L << Tildae) | (1L << Not) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Sizeof) | (1L << Hashtag) | (1L << Inv) | (1L << Trans) | (1L << Det) | (1L << Vsizeof) | (1L << Esizeof) | (1L << Val))) != 0) || _la==Identifier) {
				{
				setState(357);
				expr();
				}
			}

			setState(360);
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
			setState(362);
			match(LeftBrace);
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Literal) | (1L << LeftParen) | (1L << LeftBrace) | (1L << Or) | (1L << Star) | (1L << And) | (1L << Plus) | (1L << Minus) | (1L << Tildae) | (1L << Not) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Sizeof) | (1L << Hashtag) | (1L << Inv) | (1L << Trans) | (1L << Det) | (1L << Vsizeof) | (1L << Esizeof) | (1L << Val) | (1L << If) | (1L << Switch) | (1L << While) | (1L << For) | (1L << Case) | (1L << Default))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Semi - 64)) | (1L << (Void - 64)) | (1L << (Bool - 64)) | (1L << (Int - 64)) | (1L << (Float - 64)) | (1L << (String - 64)) | (1L << (Graph - 64)) | (1L << (Edge - 64)) | (1L << (Matrix - 64)) | (1L << (Vertex - 64)) | (1L << (Continue - 64)) | (1L << (Break - 64)) | (1L << (Return - 64)) | (1L << (Input - 64)) | (1L << (Output - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(363);
				statementSeq();
				}
			}

			setState(366);
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
			setState(369); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(368);
				statement();
				}
				}
				setState(371); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Literal) | (1L << LeftParen) | (1L << LeftBrace) | (1L << Or) | (1L << Star) | (1L << And) | (1L << Plus) | (1L << Minus) | (1L << Tildae) | (1L << Not) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Sizeof) | (1L << Hashtag) | (1L << Inv) | (1L << Trans) | (1L << Det) | (1L << Vsizeof) | (1L << Esizeof) | (1L << Val) | (1L << If) | (1L << Switch) | (1L << While) | (1L << For) | (1L << Case) | (1L << Default))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Semi - 64)) | (1L << (Void - 64)) | (1L << (Bool - 64)) | (1L << (Int - 64)) | (1L << (Float - 64)) | (1L << (String - 64)) | (1L << (Graph - 64)) | (1L << (Edge - 64)) | (1L << (Matrix - 64)) | (1L << (Vertex - 64)) | (1L << (Continue - 64)) | (1L << (Break - 64)) | (1L << (Return - 64)) | (1L << (Input - 64)) | (1L << (Output - 64)) | (1L << (Identifier - 64)))) != 0) );
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
			setState(395);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case If:
				enterOuterAlt(_localctx, 1);
				{
				setState(373);
				match(If);
				setState(374);
				match(LeftParen);
				setState(375);
				condition();
				setState(376);
				match(RightParen);
				setState(377);
				statement();
				setState(380);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(378);
					match(Else);
					setState(379);
					statement();
					}
					break;
				}
				}
				break;
			case Switch:
				enterOuterAlt(_localctx, 2);
				{
				setState(382);
				match(Switch);
				setState(383);
				match(LeftParen);
				setState(384);
				condition();
				setState(385);
				match(RightParen);
				setState(386);
				match(LeftBrace);
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Case || _la==Default) {
					{
					{
					setState(387);
					caseStatement();
					}
					}
					setState(392);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(393);
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
			setState(404);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(397);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(398);
				declarator();
				setState(402);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Assign:
					{
					setState(399);
					match(Assign);
					setState(400);
					initializationClause();
					}
					break;
				case LeftBrace:
					{
					setState(401);
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
			setState(425);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case While:
				enterOuterAlt(_localctx, 1);
				{
				setState(406);
				match(While);
				setState(407);
				match(LeftParen);
				setState(408);
				condition();
				setState(409);
				match(RightParen);
				setState(410);
				statement();
				}
				break;
			case For:
				enterOuterAlt(_localctx, 2);
				{
				setState(412);
				match(For);
				setState(413);
				match(LeftParen);
				{
				setState(414);
				forInitStatement();
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Literal) | (1L << LeftParen) | (1L << Or) | (1L << Star) | (1L << And) | (1L << Plus) | (1L << Minus) | (1L << Tildae) | (1L << Not) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Sizeof) | (1L << Hashtag) | (1L << Inv) | (1L << Trans) | (1L << Det) | (1L << Vsizeof) | (1L << Esizeof) | (1L << Val))) != 0) || _la==Identifier) {
					{
					setState(415);
					condition();
					}
				}

				setState(418);
				match(Semi);
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Literal) | (1L << LeftParen) | (1L << Or) | (1L << Star) | (1L << And) | (1L << Plus) | (1L << Minus) | (1L << Tildae) | (1L << Not) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Sizeof) | (1L << Hashtag) | (1L << Inv) | (1L << Trans) | (1L << Det) | (1L << Vsizeof) | (1L << Esizeof) | (1L << Val))) != 0) || _la==Identifier) {
					{
					setState(419);
					expr();
					}
				}

				}
				setState(422);
				match(RightParen);
				setState(423);
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
			setState(431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(427);
				exprStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(428);
				simpleDeclaration();
				setState(429);
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
			setState(433);
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
			setState(436); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(435);
				declaration();
				}
				}
				setState(438); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Semi - 64)) | (1L << (Class - 64)) | (1L << (Void - 64)) | (1L << (Bool - 64)) | (1L << (Int - 64)) | (1L << (Float - 64)) | (1L << (String - 64)) | (1L << (Graph - 64)) | (1L << (Edge - 64)) | (1L << (Matrix - 64)) | (1L << (Vertex - 64)) | (1L << (Identifier - 64)))) != 0) );
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
			setState(443);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(440);
				blockDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(441);
				functionDefn();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(442);
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
			setState(445);
			simpleDeclaration();
			setState(446);
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
			setState(449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (Void - 68)) | (1L << (Bool - 68)) | (1L << (Int - 68)) | (1L << (Float - 68)) | (1L << (String - 68)) | (1L << (Graph - 68)) | (1L << (Edge - 68)) | (1L << (Matrix - 68)) | (1L << (Vertex - 68)) | (1L << (Identifier - 68)))) != 0)) {
				{
				setState(448);
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
			setState(461);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Bool:
				enterOuterAlt(_localctx, 1);
				{
				setState(451);
				match(Bool);
				}
				break;
			case String:
				enterOuterAlt(_localctx, 2);
				{
				setState(452);
				match(String);
				}
				break;
			case Int:
				enterOuterAlt(_localctx, 3);
				{
				setState(453);
				match(Int);
				}
				break;
			case Float:
				enterOuterAlt(_localctx, 4);
				{
				setState(454);
				match(Float);
				}
				break;
			case Matrix:
				enterOuterAlt(_localctx, 5);
				{
				setState(455);
				match(Matrix);
				}
				break;
			case Vertex:
				enterOuterAlt(_localctx, 6);
				{
				setState(456);
				match(Vertex);
				}
				break;
			case Graph:
				enterOuterAlt(_localctx, 7);
				{
				setState(457);
				match(Graph);
				}
				break;
			case Edge:
				enterOuterAlt(_localctx, 8);
				{
				setState(458);
				match(Edge);
				}
				break;
			case Void:
				enterOuterAlt(_localctx, 9);
				{
				setState(459);
				match(Void);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 10);
				{
				setState(460);
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
			setState(463);
			dataType();
			setState(464);
			initDeclarator();
			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(465);
				match(Comma);
				setState(466);
				initDeclarator();
				}
				}
				setState(471);
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
			setState(472);
			declarator();
			setState(474);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(473);
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
			setState(476);
			match(Identifier);
			setState(490);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(477);
				parameters();
				}
				break;
			case 2:
				{
				setState(478);
				match(LeftBracket);
				setState(480);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Literal) | (1L << LeftParen) | (1L << Or) | (1L << Star) | (1L << And) | (1L << Plus) | (1L << Minus) | (1L << Tildae) | (1L << Not) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Sizeof) | (1L << Hashtag) | (1L << Inv) | (1L << Trans) | (1L << Det) | (1L << Vsizeof) | (1L << Esizeof) | (1L << Val))) != 0) || _la==Identifier) {
					{
					setState(479);
					constexpr();
					}
				}

				setState(482);
				match(RightBracket);
				setState(488);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftBracket) {
					{
					setState(483);
					match(LeftBracket);
					setState(485);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Literal) | (1L << LeftParen) | (1L << Or) | (1L << Star) | (1L << And) | (1L << Plus) | (1L << Minus) | (1L << Tildae) | (1L << Not) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Sizeof) | (1L << Hashtag) | (1L << Inv) | (1L << Trans) | (1L << Det) | (1L << Vsizeof) | (1L << Esizeof) | (1L << Val))) != 0) || _la==Identifier) {
						{
						setState(484);
						constexpr();
						}
					}

					setState(487);
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
			setState(492);
			match(LeftParen);
			setState(494);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(493);
				parameterDeclarationSeq();
				}
				break;
			}
			setState(496);
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
			setState(498);
			parameterDeclaration();
			setState(503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(499);
				match(Comma);
				setState(500);
				parameterDeclaration();
				}
				}
				setState(505);
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
			setState(513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (Void - 68)) | (1L << (Bool - 68)) | (1L << (Int - 68)) | (1L << (Float - 68)) | (1L << (String - 68)) | (1L << (Graph - 68)) | (1L << (Edge - 68)) | (1L << (Matrix - 68)) | (1L << (Vertex - 68)) | (1L << (Identifier - 68)))) != 0)) {
				{
				setState(506);
				dataType();
				setState(511);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(507);
					declarator();
					setState(509);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << LeftBrace) | (1L << Assign))) != 0)) {
						{
						setState(508);
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
			setState(515);
			dataType();
			setState(516);
			match(Identifier);
			setState(517);
			match(LeftParen);
			setState(518);
			parameterDeclarationSeq();
			setState(519);
			match(RightParen);
			setState(520);
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
			setState(522);
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
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_initializer);
		try {
			setState(529);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBrace:
			case Assign:
				enterOuterAlt(_localctx, 1);
				{
				setState(524);
				braceOrEqualInitializer();
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(525);
				match(LeftParen);
				setState(526);
				exprList();
				setState(527);
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
			setState(534);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Assign:
				enterOuterAlt(_localctx, 1);
				{
				setState(531);
				match(Assign);
				setState(532);
				initializationClause();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(533);
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
			setState(538);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Literal:
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
			case Hashtag:
			case Inv:
			case Trans:
			case Det:
			case Vsizeof:
			case Esizeof:
			case Val:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(536);
				assignExpr();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(537);
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
			setState(540);
			match(LeftBrace);
			setState(545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Literal) | (1L << LeftParen) | (1L << LeftBrace) | (1L << Or) | (1L << Star) | (1L << And) | (1L << Plus) | (1L << Minus) | (1L << Tildae) | (1L << Not) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Sizeof) | (1L << Hashtag) | (1L << Inv) | (1L << Trans) | (1L << Det) | (1L << Vsizeof) | (1L << Esizeof) | (1L << Val))) != 0) || _la==Identifier) {
				{
				setState(541);
				initializationseq();
				setState(543);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(542);
					match(Comma);
					}
				}

				}
			}

			setState(547);
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
			setState(549);
			initializationClause();
			setState(554);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(550);
					match(Comma);
					setState(551);
					initializationClause();
					}
					} 
				}
				setState(556);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
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
			setState(557);
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
			setState(559);
			classHead();
			setState(560);
			match(LeftBrace);
			setState(562);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Semi - 64)) | (1L << (Void - 64)) | (1L << (Bool - 64)) | (1L << (Int - 64)) | (1L << (Float - 64)) | (1L << (String - 64)) | (1L << (Graph - 64)) | (1L << (Edge - 64)) | (1L << (Matrix - 64)) | (1L << (Vertex - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(561);
				memberlist();
				}
			}

			setState(564);
			match(RightBrace);
			setState(565);
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
			setState(567);
			match(Class);
			setState(568);
			className();
			setState(570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(569);
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
			setState(573); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(572);
				memberdeclaration();
				}
				}
				setState(575); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Semi - 64)) | (1L << (Void - 64)) | (1L << (Bool - 64)) | (1L << (Int - 64)) | (1L << (Float - 64)) | (1L << (String - 64)) | (1L << (Graph - 64)) | (1L << (Edge - 64)) | (1L << (Matrix - 64)) | (1L << (Vertex - 64)) | (1L << (Identifier - 64)))) != 0) );
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
			setState(582);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(578);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (Void - 68)) | (1L << (Bool - 68)) | (1L << (Int - 68)) | (1L << (Float - 68)) | (1L << (String - 68)) | (1L << (Graph - 68)) | (1L << (Edge - 68)) | (1L << (Matrix - 68)) | (1L << (Vertex - 68)) | (1L << (Identifier - 68)))) != 0)) {
					{
					setState(577);
					memberDeclaratorList();
					}
				}

				setState(580);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(581);
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
			setState(584);
			dataType();
			setState(585);
			memberDeclarator();
			setState(590);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(586);
				match(Comma);
				setState(587);
				memberDeclarator();
				}
				}
				setState(592);
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
			setState(593);
			initDeclarator();
			setState(595);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftBrace || _la==Assign) {
				{
				setState(594);
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
			setState(597);
			match(Colon);
			setState(598);
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
			setState(600);
			className();
			setState(605);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(601);
				match(Comma);
				setState(602);
				className();
				}
				}
				setState(607);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3y\u0263\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\3\2\5\2\u0084\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\3\u0090\n\3\3\3\3\3\3\3\5\3\u0095\n\3\3\3\5\3\u0098\n\3"+
		"\5\3\u009a\n\3\5\3\u009c\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00a4\n\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\7\4\u00ac\n\4\f\4\16\4\u00af\13\4\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00bb\n\6\3\7\3\7\3\b\3\b\3\b\5\b\u00c2\n"+
		"\b\3\b\5\b\u00c5\n\b\3\b\3\b\5\b\u00c9\n\b\3\b\5\b\u00cc\n\b\3\t\3\t\3"+
		"\t\5\t\u00d1\n\t\3\n\3\n\3\n\5\n\u00d6\n\n\3\13\3\13\3\13\7\13\u00db\n"+
		"\13\f\13\16\13\u00de\13\13\3\f\3\f\3\f\7\f\u00e3\n\f\f\f\16\f\u00e6\13"+
		"\f\3\r\3\r\3\r\3\r\7\r\u00ec\n\r\f\r\16\r\u00ef\13\r\3\16\3\16\3\17\3"+
		"\17\3\17\7\17\u00f6\n\17\f\17\16\17\u00f9\13\17\3\20\3\20\3\20\7\20\u00fe"+
		"\n\20\f\20\16\20\u0101\13\20\3\21\3\21\3\21\7\21\u0106\n\21\f\21\16\21"+
		"\u0109\13\21\3\22\3\22\3\22\7\22\u010e\n\22\f\22\16\22\u0111\13\22\3\23"+
		"\3\23\3\23\7\23\u0116\n\23\f\23\16\23\u0119\13\23\3\24\3\24\3\24\7\24"+
		"\u011e\n\24\f\24\16\24\u0121\13\24\3\25\3\25\3\25\7\25\u0126\n\25\f\25"+
		"\16\25\u0129\13\25\3\26\3\26\3\26\3\26\3\26\5\26\u0130\n\26\3\27\3\27"+
		"\3\30\3\30\3\30\7\30\u0137\n\30\f\30\16\30\u013a\13\30\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0153\n\34\3\35\3\35\3\35\3\35\3\35"+
		"\5\35\u015a\n\35\5\35\u015c\n\35\3\35\3\35\3\36\3\36\3\36\5\36\u0163\n"+
		"\36\3\36\3\36\3\36\3\37\5\37\u0169\n\37\3\37\3\37\3 \3 \5 \u016f\n \3"+
		" \3 \3!\6!\u0174\n!\r!\16!\u0175\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u017f"+
		"\n\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u0187\n\"\f\"\16\"\u018a\13\"\3\"\3\""+
		"\5\"\u018e\n\"\3#\3#\3#\3#\3#\5#\u0195\n#\5#\u0197\n#\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\5$\u01a3\n$\3$\3$\5$\u01a7\n$\3$\3$\3$\5$\u01ac\n$\3%\3"+
		"%\3%\3%\5%\u01b2\n%\3&\3&\3\'\6\'\u01b7\n\'\r\'\16\'\u01b8\3(\3(\3(\5"+
		"(\u01be\n(\3)\3)\3)\3*\5*\u01c4\n*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u01d0"+
		"\n+\3,\3,\3,\3,\7,\u01d6\n,\f,\16,\u01d9\13,\3-\3-\5-\u01dd\n-\3.\3.\3"+
		".\3.\5.\u01e3\n.\3.\3.\3.\5.\u01e8\n.\3.\5.\u01eb\n.\5.\u01ed\n.\3/\3"+
		"/\5/\u01f1\n/\3/\3/\3\60\3\60\3\60\7\60\u01f8\n\60\f\60\16\60\u01fb\13"+
		"\60\3\61\3\61\3\61\5\61\u0200\n\61\5\61\u0202\n\61\5\61\u0204\n\61\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\64\3\64\3\64\3\64\3\64\5\64"+
		"\u0214\n\64\3\65\3\65\3\65\5\65\u0219\n\65\3\66\3\66\5\66\u021d\n\66\3"+
		"\67\3\67\3\67\5\67\u0222\n\67\5\67\u0224\n\67\3\67\3\67\38\38\38\78\u022b"+
		"\n8\f8\168\u022e\138\39\39\3:\3:\3:\5:\u0235\n:\3:\3:\3:\3;\3;\3;\5;\u023d"+
		"\n;\3<\6<\u0240\n<\r<\16<\u0241\3=\5=\u0245\n=\3=\3=\5=\u0249\n=\3>\3"+
		">\3>\3>\7>\u024f\n>\f>\16>\u0252\13>\3?\3?\5?\u0256\n?\3@\3@\3@\3A\3A"+
		"\3A\7A\u025e\nA\fA\16A\u0261\13A\3A\2\3\6B\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|"+
		"~\u0080\2\r\3\2()\4\2&\'./\4\2**\61\66\4\2\13\21&\'\3\2,-\4\2\f\f\22\23"+
		"\3\2\16\17\3\2\678\3\2\24\27\3\2\30\31\3\2\35%\2\u0281\2\u0083\3\2\2\2"+
		"\4\u009b\3\2\2\2\6\u009d\3\2\2\2\b\u00b0\3\2\2\2\n\u00ba\3\2\2\2\f\u00bc"+
		"\3\2\2\2\16\u00cb\3\2\2\2\20\u00cd\3\2\2\2\22\u00d2\3\2\2\2\24\u00d7\3"+
		"\2\2\2\26\u00df\3\2\2\2\30\u00e7\3\2\2\2\32\u00f0\3\2\2\2\34\u00f2\3\2"+
		"\2\2\36\u00fa\3\2\2\2 \u0102\3\2\2\2\"\u010a\3\2\2\2$\u0112\3\2\2\2&\u011a"+
		"\3\2\2\2(\u0122\3\2\2\2*\u012f\3\2\2\2,\u0131\3\2\2\2.\u0133\3\2\2\2\60"+
		"\u013b\3\2\2\2\62\u013d\3\2\2\2\64\u0143\3\2\2\2\66\u0152\3\2\2\28\u015b"+
		"\3\2\2\2:\u0162\3\2\2\2<\u0168\3\2\2\2>\u016c\3\2\2\2@\u0173\3\2\2\2B"+
		"\u018d\3\2\2\2D\u0196\3\2\2\2F\u01ab\3\2\2\2H\u01b1\3\2\2\2J\u01b3\3\2"+
		"\2\2L\u01b6\3\2\2\2N\u01bd\3\2\2\2P\u01bf\3\2\2\2R\u01c3\3\2\2\2T\u01cf"+
		"\3\2\2\2V\u01d1\3\2\2\2X\u01da\3\2\2\2Z\u01de\3\2\2\2\\\u01ee\3\2\2\2"+
		"^\u01f4\3\2\2\2`\u0203\3\2\2\2b\u0205\3\2\2\2d\u020c\3\2\2\2f\u0213\3"+
		"\2\2\2h\u0218\3\2\2\2j\u021c\3\2\2\2l\u021e\3\2\2\2n\u0227\3\2\2\2p\u022f"+
		"\3\2\2\2r\u0231\3\2\2\2t\u0239\3\2\2\2v\u023f\3\2\2\2x\u0248\3\2\2\2z"+
		"\u024a\3\2\2\2|\u0253\3\2\2\2~\u0257\3\2\2\2\u0080\u025a\3\2\2\2\u0082"+
		"\u0084\5L\'\2\u0083\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2"+
		"\2\2\u0085\u0086\7\2\2\3\u0086\3\3\2\2\2\u0087\u009c\7\4\2\2\u0088\u0089"+
		"\7\5\2\2\u0089\u008a\5.\30\2\u008a\u008b\7\6\2\2\u008b\u009c\3\2\2\2\u008c"+
		"\u0099\7Z\2\2\u008d\u008f\7\t\2\2\u008e\u0090\5\60\31\2\u008f\u008e\3"+
		"\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0097\7\n\2\2\u0092"+
		"\u0094\7\t\2\2\u0093\u0095\5\60\31\2\u0094\u0093\3\2\2\2\u0094\u0095\3"+
		"\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\7\n\2\2\u0097\u0092\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u008d\3\2\2\2\u0099\u009a\3\2"+
		"\2\2\u009a\u009c\3\2\2\2\u009b\u0087\3\2\2\2\u009b\u0088\3\2\2\2\u009b"+
		"\u008c\3\2\2\2\u009c\5\3\2\2\2\u009d\u009e\b\4\1\2\u009e\u009f\5\4\3\2"+
		"\u009f\u00ad\3\2\2\2\u00a0\u00a1\f\5\2\2\u00a1\u00a3\7\5\2\2\u00a2\u00a4"+
		"\5\b\5\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00ac\7\6\2\2\u00a6\u00a7\f\4\2\2\u00a7\u00a8\t\2\2\2\u00a8\u00ac\7Z"+
		"\2\2\u00a9\u00aa\f\3\2\2\u00aa\u00ac\t\3\2\2\u00ab\u00a0\3\2\2\2\u00ab"+
		"\u00a6\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2"+
		"\2\2\u00ad\u00ae\3\2\2\2\u00ae\7\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1"+
		"\5n8\2\u00b1\t\3\2\2\2\u00b2\u00bb\5\6\4\2\u00b3\u00b4\5\f\7\2\u00b4\u00b5"+
		"\5\n\6\2\u00b5\u00bb\3\2\2\2\u00b6\u00b7\t\4\2\2\u00b7\u00b8\7\5\2\2\u00b8"+
		"\u00b9\7Z\2\2\u00b9\u00bb\7\6\2\2\u00ba\u00b2\3\2\2\2\u00ba\u00b3\3\2"+
		"\2\2\u00ba\u00b6\3\2\2\2\u00bb\13\3\2\2\2\u00bc\u00bd\t\5\2\2\u00bd\r"+
		"\3\2\2\2\u00be\u00c4\5\n\6\2\u00bf\u00c1\7+\2\2\u00c0\u00c2\7+\2\2\u00c1"+
		"\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\5\n"+
		"\6\2\u00c4\u00bf\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00cc\3\2\2\2\u00c6"+
		"\u00c8\7+\2\2\u00c7\u00c9\7+\2\2\u00c8\u00c7\3\2\2\2\u00c8\u00c9\3\2\2"+
		"\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\5\n\6\2\u00cb\u00be\3\2\2\2\u00cb\u00c6"+
		"\3\2\2\2\u00cc\17\3\2\2\2\u00cd\u00d0\5\16\b\2\u00ce\u00cf\t\6\2\2\u00cf"+
		"\u00d1\5\16\b\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\21\3\2\2"+
		"\2\u00d2\u00d5\5\20\t\2\u00d3\u00d4\7\60\2\2\u00d4\u00d6\5\20\t\2\u00d5"+
		"\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\23\3\2\2\2\u00d7\u00dc\5\22\n"+
		"\2\u00d8\u00d9\t\7\2\2\u00d9\u00db\5\22\n\2\u00da\u00d8\3\2\2\2\u00db"+
		"\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\25\3\2\2"+
		"\2\u00de\u00dc\3\2\2\2\u00df\u00e4\5\24\13\2\u00e0\u00e1\t\b\2\2\u00e1"+
		"\u00e3\5\24\13\2\u00e2\u00e0\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3"+
		"\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\27\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7"+
		"\u00ed\5\26\f\2\u00e8\u00e9\5\32\16\2\u00e9\u00ea\5\26\f\2\u00ea\u00ec"+
		"\3\2\2\2\u00eb\u00e8\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00ee\31\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f1\t\t\2"+
		"\2\u00f1\33\3\2\2\2\u00f2\u00f7\5\30\r\2\u00f3\u00f4\t\n\2\2\u00f4\u00f6"+
		"\5\30\r\2\u00f5\u00f3\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2"+
		"\u00f7\u00f8\3\2\2\2\u00f8\35\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00ff"+
		"\5\34\17\2\u00fb\u00fc\t\13\2\2\u00fc\u00fe\5\34\17\2\u00fd\u00fb\3\2"+
		"\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100"+
		"\37\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0107\5\36\20\2\u0103\u0104\7\r"+
		"\2\2\u0104\u0106\5\36\20\2\u0105\u0103\3\2\2\2\u0106\u0109\3\2\2\2\u0107"+
		"\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108!\3\2\2\2\u0109\u0107\3\2\2\2"+
		"\u010a\u010f\5 \21\2\u010b\u010c\7\32\2\2\u010c\u010e\5 \21\2\u010d\u010b"+
		"\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110"+
		"#\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0117\5\"\22\2\u0113\u0114\7\13\2"+
		"\2\u0114\u0116\5\"\22\2\u0115\u0113\3\2\2\2\u0116\u0119\3\2\2\2\u0117"+
		"\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118%\3\2\2\2\u0119\u0117\3\2\2\2"+
		"\u011a\u011f\5$\23\2\u011b\u011c\7\33\2\2\u011c\u011e\5$\23\2\u011d\u011b"+
		"\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120"+
		"\'\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0127\5&\24\2\u0123\u0124\7\34\2"+
		"\2\u0124\u0126\5&\24\2\u0125\u0123\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125"+
		"\3\2\2\2\u0127\u0128\3\2\2\2\u0128)\3\2\2\2\u0129\u0127\3\2\2\2\u012a"+
		"\u0130\5(\25\2\u012b\u012c\5(\25\2\u012c\u012d\5,\27\2\u012d\u012e\5j"+
		"\66\2\u012e\u0130\3\2\2\2\u012f\u012a\3\2\2\2\u012f\u012b\3\2\2\2\u0130"+
		"+\3\2\2\2\u0131\u0132\t\f\2\2\u0132-\3\2\2\2\u0133\u0138\5*\26\2\u0134"+
		"\u0135\7@\2\2\u0135\u0137\5*\26\2\u0136\u0134\3\2\2\2\u0137\u013a\3\2"+
		"\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139/\3\2\2\2\u013a\u0138"+
		"\3\2\2\2\u013b\u013c\5(\25\2\u013c\61\3\2\2\2\u013d\u013e\7U\2\2\u013e"+
		"\u013f\7\5\2\2\u013f\u0140\5\b\5\2\u0140\u0141\7\6\2\2\u0141\u0142\7B"+
		"\2\2\u0142\63\3\2\2\2\u0143\u0144\7V\2\2\u0144\u0145\7\5\2\2\u0145\u0146"+
		"\5\b\5\2\u0146\u0147\7\6\2\2\u0147\u0148\7B\2\2\u0148\65\3\2\2\2\u0149"+
		"\u0153\5:\36\2\u014a\u0153\5<\37\2\u014b\u0153\5> \2\u014c\u0153\5B\""+
		"\2\u014d\u0153\5F$\2\u014e\u0153\5J&\2\u014f\u0153\58\35\2\u0150\u0153"+
		"\5\62\32\2\u0151\u0153\5\64\33\2\u0152\u0149\3\2\2\2\u0152\u014a\3\2\2"+
		"\2\u0152\u014b\3\2\2\2\u0152\u014c\3\2\2\2\u0152\u014d\3\2\2\2\u0152\u014e"+
		"\3\2\2\2\u0152\u014f\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0151\3\2\2\2\u0153"+
		"\67\3\2\2\2\u0154\u015c\7S\2\2\u0155\u015c\7R\2\2\u0156\u0159\7T\2\2\u0157"+
		"\u015a\5.\30\2\u0158\u015a\5l\67\2\u0159\u0157\3\2\2\2\u0159\u0158\3\2"+
		"\2\2\u0159\u015a\3\2\2\2\u015a\u015c\3\2\2\2\u015b\u0154\3\2\2\2\u015b"+
		"\u0155\3\2\2\2\u015b\u0156\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015e\7B"+
		"\2\2\u015e9\3\2\2\2\u015f\u0160\7>\2\2\u0160\u0163\5\60\31\2\u0161\u0163"+
		"\7?\2\2\u0162\u015f\3\2\2\2\u0162\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164"+
		"\u0165\7A\2\2\u0165\u0166\5\66\34\2\u0166;\3\2\2\2\u0167\u0169\5.\30\2"+
		"\u0168\u0167\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016b"+
		"\7B\2\2\u016b=\3\2\2\2\u016c\u016e\7\7\2\2\u016d\u016f\5@!\2\u016e\u016d"+
		"\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0171\7\b\2\2\u0171"+
		"?\3\2\2\2\u0172\u0174\5\66\34\2\u0173\u0172\3\2\2\2\u0174\u0175\3\2\2"+
		"\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176A\3\2\2\2\u0177\u0178"+
		"\79\2\2\u0178\u0179\7\5\2\2\u0179\u017a\5D#\2\u017a\u017b\7\6\2\2\u017b"+
		"\u017e\5\66\34\2\u017c\u017d\7:\2\2\u017d\u017f\5\66\34\2\u017e\u017c"+
		"\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u018e\3\2\2\2\u0180\u0181\7;\2\2\u0181"+
		"\u0182\7\5\2\2\u0182\u0183\5D#\2\u0183\u0184\7\6\2\2\u0184\u0188\7\7\2"+
		"\2\u0185\u0187\5:\36\2\u0186\u0185\3\2\2\2\u0187\u018a\3\2\2\2\u0188\u0186"+
		"\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018b\3\2\2\2\u018a\u0188\3\2\2\2\u018b"+
		"\u018c\7\b\2\2\u018c\u018e\3\2\2\2\u018d\u0177\3\2\2\2\u018d\u0180\3\2"+
		"\2\2\u018eC\3\2\2\2\u018f\u0197\5.\30\2\u0190\u0194\5Z.\2\u0191\u0192"+
		"\7\35\2\2\u0192\u0195\5j\66\2\u0193\u0195\5l\67\2\u0194\u0191\3\2\2\2"+
		"\u0194\u0193\3\2\2\2\u0195\u0197\3\2\2\2\u0196\u018f\3\2\2\2\u0196\u0190"+
		"\3\2\2\2\u0197E\3\2\2\2\u0198\u0199\7<\2\2\u0199\u019a\7\5\2\2\u019a\u019b"+
		"\5D#\2\u019b\u019c\7\6\2\2\u019c\u019d\5\66\34\2\u019d\u01ac\3\2\2\2\u019e"+
		"\u019f\7=\2\2\u019f\u01a0\7\5\2\2\u01a0\u01a2\5H%\2\u01a1\u01a3\5D#\2"+
		"\u01a2\u01a1\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a6"+
		"\7B\2\2\u01a5\u01a7\5.\30\2\u01a6\u01a5\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7"+
		"\u01a8\3\2\2\2\u01a8\u01a9\7\6\2\2\u01a9\u01aa\5\66\34\2\u01aa\u01ac\3"+
		"\2\2\2\u01ab\u0198\3\2\2\2\u01ab\u019e\3\2\2\2\u01acG\3\2\2\2\u01ad\u01b2"+
		"\5<\37\2\u01ae\u01af\5R*\2\u01af\u01b0\7B\2\2\u01b0\u01b2\3\2\2\2\u01b1"+
		"\u01ad\3\2\2\2\u01b1\u01ae\3\2\2\2\u01b2I\3\2\2\2\u01b3\u01b4\5P)\2\u01b4"+
		"K\3\2\2\2\u01b5\u01b7\5N(\2\u01b6\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8"+
		"\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9M\3\2\2\2\u01ba\u01be\5P)\2\u01bb"+
		"\u01be\5b\62\2\u01bc\u01be\5r:\2\u01bd\u01ba\3\2\2\2\u01bd\u01bb\3\2\2"+
		"\2\u01bd\u01bc\3\2\2\2\u01beO\3\2\2\2\u01bf\u01c0\5R*\2\u01c0\u01c1\7"+
		"B\2\2\u01c1Q\3\2\2\2\u01c2\u01c4\5V,\2\u01c3\u01c2\3\2\2\2\u01c3\u01c4"+
		"\3\2\2\2\u01c4S\3\2\2\2\u01c5\u01d0\7G\2\2\u01c6\u01d0\7J\2\2\u01c7\u01d0"+
		"\7H\2\2\u01c8\u01d0\7I\2\2\u01c9\u01d0\7M\2\2\u01ca\u01d0\7N\2\2\u01cb"+
		"\u01d0\7K\2\2\u01cc\u01d0\7L\2\2\u01cd\u01d0\7F\2\2\u01ce\u01d0\5p9\2"+
		"\u01cf\u01c5\3\2\2\2\u01cf\u01c6\3\2\2\2\u01cf\u01c7\3\2\2\2\u01cf\u01c8"+
		"\3\2\2\2\u01cf\u01c9\3\2\2\2\u01cf\u01ca\3\2\2\2\u01cf\u01cb\3\2\2\2\u01cf"+
		"\u01cc\3\2\2\2\u01cf\u01cd\3\2\2\2\u01cf\u01ce\3\2\2\2\u01d0U\3\2\2\2"+
		"\u01d1\u01d2\5T+\2\u01d2\u01d7\5X-\2\u01d3\u01d4\7@\2\2\u01d4\u01d6\5"+
		"X-\2\u01d5\u01d3\3\2\2\2\u01d6\u01d9\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d7"+
		"\u01d8\3\2\2\2\u01d8W\3\2\2\2\u01d9\u01d7\3\2\2\2\u01da\u01dc\5Z.\2\u01db"+
		"\u01dd\5f\64\2\u01dc\u01db\3\2\2\2\u01dc\u01dd\3\2\2\2\u01ddY\3\2\2\2"+
		"\u01de\u01ec\7Z\2\2\u01df\u01ed\5\\/\2\u01e0\u01e2\7\t\2\2\u01e1\u01e3"+
		"\5\60\31\2\u01e2\u01e1\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e4\3\2\2\2"+
		"\u01e4\u01ea\7\n\2\2\u01e5\u01e7\7\t\2\2\u01e6\u01e8\5\60\31\2\u01e7\u01e6"+
		"\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01eb\7\n\2\2\u01ea"+
		"\u01e5\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ed\3\2\2\2\u01ec\u01df\3\2"+
		"\2\2\u01ec\u01e0\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed[\3\2\2\2\u01ee\u01f0"+
		"\7\5\2\2\u01ef\u01f1\5^\60\2\u01f0\u01ef\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1"+
		"\u01f2\3\2\2\2\u01f2\u01f3\7\6\2\2\u01f3]\3\2\2\2\u01f4\u01f9\5`\61\2"+
		"\u01f5\u01f6\7@\2\2\u01f6\u01f8\5`\61\2\u01f7\u01f5\3\2\2\2\u01f8\u01fb"+
		"\3\2\2\2\u01f9\u01f7\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa_\3\2\2\2\u01fb"+
		"\u01f9\3\2\2\2\u01fc\u0201\5T+\2\u01fd\u01ff\5Z.\2\u01fe\u0200\5f\64\2"+
		"\u01ff\u01fe\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0202\3\2\2\2\u0201\u01fd"+
		"\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0204\3\2\2\2\u0203\u01fc\3\2\2\2\u0203"+
		"\u0204\3\2\2\2\u0204a\3\2\2\2\u0205\u0206\5T+\2\u0206\u0207\7Z\2\2\u0207"+
		"\u0208\7\5\2\2\u0208\u0209\5^\60\2\u0209\u020a\7\6\2\2\u020a\u020b\5d"+
		"\63\2\u020bc\3\2\2\2\u020c\u020d\5> \2\u020de\3\2\2\2\u020e\u0214\5h\65"+
		"\2\u020f\u0210\7\5\2\2\u0210\u0211\5\b\5\2\u0211\u0212\7\6\2\2\u0212\u0214"+
		"\3\2\2\2\u0213\u020e\3\2\2\2\u0213\u020f\3\2\2\2\u0214g\3\2\2\2\u0215"+
		"\u0216\7\35\2\2\u0216\u0219\5j\66\2\u0217\u0219\5l\67\2\u0218\u0215\3"+
		"\2\2\2\u0218\u0217\3\2\2\2\u0219i\3\2\2\2\u021a\u021d\5*\26\2\u021b\u021d"+
		"\5l\67\2\u021c\u021a\3\2\2\2\u021c\u021b\3\2\2\2\u021dk\3\2\2\2\u021e"+
		"\u0223\7\7\2\2\u021f\u0221\5n8\2\u0220\u0222\7@\2\2\u0221\u0220\3\2\2"+
		"\2\u0221\u0222\3\2\2\2\u0222\u0224\3\2\2\2\u0223\u021f\3\2\2\2\u0223\u0224"+
		"\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0226\7\b\2\2\u0226m\3\2\2\2\u0227"+
		"\u022c\5j\66\2\u0228\u0229\7@\2\2\u0229\u022b\5j\66\2\u022a\u0228\3\2"+
		"\2\2\u022b\u022e\3\2\2\2\u022c\u022a\3\2\2\2\u022c\u022d\3\2\2\2\u022d"+
		"o\3\2\2\2\u022e\u022c\3\2\2\2\u022f\u0230\7Z\2\2\u0230q\3\2\2\2\u0231"+
		"\u0232\5t;\2\u0232\u0234\7\7\2\2\u0233\u0235\5v<\2\u0234\u0233\3\2\2\2"+
		"\u0234\u0235\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0237\7\b\2\2\u0237\u0238"+
		"\7B\2\2\u0238s\3\2\2\2\u0239\u023a\7E\2\2\u023a\u023c\5p9\2\u023b\u023d"+
		"\5~@\2\u023c\u023b\3\2\2\2\u023c\u023d\3\2\2\2\u023du\3\2\2\2\u023e\u0240"+
		"\5x=\2\u023f\u023e\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u023f\3\2\2\2\u0241"+
		"\u0242\3\2\2\2\u0242w\3\2\2\2\u0243\u0245\5z>\2\u0244\u0243\3\2\2\2\u0244"+
		"\u0245\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0249\7B\2\2\u0247\u0249\5b\62"+
		"\2\u0248\u0244\3\2\2\2\u0248\u0247\3\2\2\2\u0249y\3\2\2\2\u024a\u024b"+
		"\5T+\2\u024b\u0250\5|?\2\u024c\u024d\7@\2\2\u024d\u024f\5|?\2\u024e\u024c"+
		"\3\2\2\2\u024f\u0252\3\2\2\2\u0250\u024e\3\2\2\2\u0250\u0251\3\2\2\2\u0251"+
		"{\3\2\2\2\u0252\u0250\3\2\2\2\u0253\u0255\5X-\2\u0254\u0256\5h\65\2\u0255"+
		"\u0254\3\2\2\2\u0255\u0256\3\2\2\2\u0256}\3\2\2\2\u0257\u0258\7A\2\2\u0258"+
		"\u0259\5\u0080A\2\u0259\177\3\2\2\2\u025a\u025f\5p9\2\u025b\u025c\7@\2"+
		"\2\u025c\u025e\5p9\2\u025d\u025b\3\2\2\2\u025e\u0261\3\2\2\2\u025f\u025d"+
		"\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u0081\3\2\2\2\u0261\u025f\3\2\2\2K"+
		"\u0083\u008f\u0094\u0097\u0099\u009b\u00a3\u00ab\u00ad\u00ba\u00c1\u00c4"+
		"\u00c8\u00cb\u00d0\u00d5\u00dc\u00e4\u00ed\u00f7\u00ff\u0107\u010f\u0117"+
		"\u011f\u0127\u012f\u0138\u0152\u0159\u015b\u0162\u0168\u016e\u0175\u017e"+
		"\u0188\u018d\u0194\u0196\u01a2\u01a6\u01ab\u01b1\u01b8\u01bd\u01c3\u01cf"+
		"\u01d7\u01dc\u01e2\u01e7\u01ea\u01ec\u01f0\u01f9\u01ff\u0201\u0203\u0213"+
		"\u0218\u021c\u0221\u0223\u022c\u0234\u023c\u0241\u0244\u0248\u0250\u0255"+
		"\u025f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
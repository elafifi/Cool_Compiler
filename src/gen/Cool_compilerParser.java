package gen;// Generated from C:/Users/elafi/IdeaProjects/Afifi_Lexer/src\Cool_compiler.g4 by ANTLR 4.8

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Cool_compilerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PLUSMINUS=1, MULDIV=2, INHERITS=3, CLASS=4, IF=5, THEN=6, ELSE=7, FI=8, 
		WHILE=9, LOOP=10, POOL=11, LET=12, IN=13, CASE=14, OF=15, ESAC=16, ISVOID=17, 
		NOT=18, NEW=19, TRUE=20, FALSE=21, NUM=22, LITERAL=23, TYPE=24, ID=25, 
		ASSIGN_OPERATOR=26, CASE_ARROW=27, EQUAL=28, LT=29, LE=30, PLUS=31, MINUS=32, 
		DIV=33, MUL=34, TILDE=35, WS=36, NEWLINE=37, MULTI_LINE_COMMENT=38, LINE_COMMENT=39, 
		LEFT_CURLY=40, RIGHT_CURLY=41, LEFT_PRANSIS=42, RIGHT_PRANSIS=43, LEFT_SQUARE=44, 
		RIGHT_SQUARE=45, SEMICOLUN=46, COLUN=47, COMMA=48, DOT=49, AT=50, ERROR=51;
	public static final int
		RULE_program = 0, RULE_classDefinition = 1, RULE_classBody = 2, RULE_methodDefinition = 3, 
		RULE_methodCall = 4, RULE_formalParamList = 5, RULE_param = 6, RULE_actualParamList = 7, 
		RULE_varDefinition = 8, RULE_expr = 9, RULE_op = 10, RULE_value = 11, 
		RULE_ifStmt = 12, RULE_whileStmt = 13, RULE_letStmt = 14, RULE_caseStmt = 15, 
		RULE_caseBody = 16, RULE_assignmentStmt = 17, RULE_blockStmt = 18, RULE_newObjStmt = 19, 
		RULE_isvoidStmt = 20, RULE_notExprStmt = 21, RULE_invExprStmt = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "classDefinition", "classBody", "methodDefinition", "methodCall", 
			"formalParamList", "param", "actualParamList", "varDefinition", "expr", 
			"op", "value", "ifStmt", "whileStmt", "letStmt", "caseStmt", "caseBody", 
			"assignmentStmt", "blockStmt", "newObjStmt", "isvoidStmt", "notExprStmt", 
			"invExprStmt"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "'<-'", "'=>'", "'='", "'<'", "'<='", "'+'", "'-'", "'/'", 
			"'*'", "'~'", null, null, null, null, "'{'", "'}'", "'('", "')'", "'['", 
			"']'", "';'", "':'", "','", "'.'", "'@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PLUSMINUS", "MULDIV", "INHERITS", "CLASS", "IF", "THEN", "ELSE", 
			"FI", "WHILE", "LOOP", "POOL", "LET", "IN", "CASE", "OF", "ESAC", "ISVOID", 
			"NOT", "NEW", "TRUE", "FALSE", "NUM", "LITERAL", "TYPE", "ID", "ASSIGN_OPERATOR", 
			"CASE_ARROW", "EQUAL", "LT", "LE", "PLUS", "MINUS", "DIV", "MUL", "TILDE", 
			"WS", "NEWLINE", "MULTI_LINE_COMMENT", "LINE_COMMENT", "LEFT_CURLY", 
			"RIGHT_CURLY", "LEFT_PRANSIS", "RIGHT_PRANSIS", "LEFT_SQUARE", "RIGHT_SQUARE", 
			"SEMICOLUN", "COLUN", "COMMA", "DOT", "AT", "ERROR"
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
	public String getGrammarFileName() { return "Cool_compiler.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Cool_compilerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<ClassDefinitionContext> classDefinition() {
			return getRuleContexts(ClassDefinitionContext.class);
		}
		public ClassDefinitionContext classDefinition(int i) {
			return getRuleContext(ClassDefinitionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_compilerVisitor) return ((Cool_compilerVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(46);
				classDefinition();
				}
				}
				setState(51);
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

	public static class ClassDefinitionContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(Cool_compilerParser.CLASS, 0); }
		public List<TerminalNode> TYPE() { return getTokens(Cool_compilerParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(Cool_compilerParser.TYPE, i);
		}
		public TerminalNode LEFT_CURLY() { return getToken(Cool_compilerParser.LEFT_CURLY, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode RIGHT_CURLY() { return getToken(Cool_compilerParser.RIGHT_CURLY, 0); }
		public TerminalNode SEMICOLUN() { return getToken(Cool_compilerParser.SEMICOLUN, 0); }
		public TerminalNode INHERITS() { return getToken(Cool_compilerParser.INHERITS, 0); }
		public ClassDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).enterClassDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).exitClassDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_compilerVisitor) return ((Cool_compilerVisitor<? extends T>)visitor).visitClassDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDefinitionContext classDefinition() throws RecognitionException {
		ClassDefinitionContext _localctx = new ClassDefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(CLASS);
			setState(53);
			match(TYPE);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INHERITS) {
				{
				setState(54);
				match(INHERITS);
				setState(55);
				match(TYPE);
				}
			}

			setState(58);
			match(LEFT_CURLY);
			setState(59);
			classBody();
			setState(60);
			match(RIGHT_CURLY);
			setState(61);
			match(SEMICOLUN);
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

	public static class ClassBodyContext extends ParserRuleContext {
		public List<TerminalNode> SEMICOLUN() { return getTokens(Cool_compilerParser.SEMICOLUN); }
		public TerminalNode SEMICOLUN(int i) {
			return getToken(Cool_compilerParser.SEMICOLUN, i);
		}
		public List<VarDefinitionContext> varDefinition() {
			return getRuleContexts(VarDefinitionContext.class);
		}
		public VarDefinitionContext varDefinition(int i) {
			return getRuleContext(VarDefinitionContext.class,i);
		}
		public List<MethodDefinitionContext> methodDefinition() {
			return getRuleContexts(MethodDefinitionContext.class);
		}
		public MethodDefinitionContext methodDefinition(int i) {
			return getRuleContext(MethodDefinitionContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_compilerVisitor) return ((Cool_compilerVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(65);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(63);
					varDefinition();
					}
					break;
				case 2:
					{
					setState(64);
					methodDefinition();
					}
					break;
				}
				setState(67);
				match(SEMICOLUN);
				}
				}
				setState(73);
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

	public static class MethodDefinitionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Cool_compilerParser.ID, 0); }
		public TerminalNode LEFT_PRANSIS() { return getToken(Cool_compilerParser.LEFT_PRANSIS, 0); }
		public FormalParamListContext formalParamList() {
			return getRuleContext(FormalParamListContext.class,0);
		}
		public TerminalNode RIGHT_PRANSIS() { return getToken(Cool_compilerParser.RIGHT_PRANSIS, 0); }
		public TerminalNode COLUN() { return getToken(Cool_compilerParser.COLUN, 0); }
		public TerminalNode TYPE() { return getToken(Cool_compilerParser.TYPE, 0); }
		public TerminalNode LEFT_CURLY() { return getToken(Cool_compilerParser.LEFT_CURLY, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RIGHT_CURLY() { return getToken(Cool_compilerParser.RIGHT_CURLY, 0); }
		public MethodDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).enterMethodDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).exitMethodDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_compilerVisitor) return ((Cool_compilerVisitor<? extends T>)visitor).visitMethodDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDefinitionContext methodDefinition() throws RecognitionException {
		MethodDefinitionContext _localctx = new MethodDefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_methodDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(ID);
			setState(75);
			match(LEFT_PRANSIS);
			setState(76);
			formalParamList();
			setState(77);
			match(RIGHT_PRANSIS);
			setState(78);
			match(COLUN);
			setState(79);
			match(TYPE);
			setState(80);
			match(LEFT_CURLY);
			setState(81);
			expr(0);
			setState(82);
			match(RIGHT_CURLY);
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

	public static class MethodCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Cool_compilerParser.ID, 0); }
		public TerminalNode LEFT_PRANSIS() { return getToken(Cool_compilerParser.LEFT_PRANSIS, 0); }
		public ActualParamListContext actualParamList() {
			return getRuleContext(ActualParamListContext.class,0);
		}
		public TerminalNode RIGHT_PRANSIS() { return getToken(Cool_compilerParser.RIGHT_PRANSIS, 0); }
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_compilerVisitor) return ((Cool_compilerVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_methodCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(ID);
			setState(85);
			match(LEFT_PRANSIS);
			setState(86);
			actualParamList();
			setState(87);
			match(RIGHT_PRANSIS);
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

	public static class FormalParamListContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Cool_compilerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Cool_compilerParser.COMMA, i);
		}
		public FormalParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParamList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).enterFormalParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).exitFormalParamList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_compilerVisitor) return ((Cool_compilerVisitor<? extends T>)visitor).visitFormalParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParamListContext formalParamList() throws RecognitionException {
		FormalParamListContext _localctx = new FormalParamListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_formalParamList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(89);
				param();
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(90);
					match(COMMA);
					setState(91);
					param();
					}
					}
					setState(96);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(101);
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

	public static class ParamContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Cool_compilerParser.ID, 0); }
		public TerminalNode COLUN() { return getToken(Cool_compilerParser.COLUN, 0); }
		public TerminalNode TYPE() { return getToken(Cool_compilerParser.TYPE, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_compilerVisitor) return ((Cool_compilerVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(ID);
			setState(103);
			match(COLUN);
			setState(104);
			match(TYPE);
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

	public static class ActualParamListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Cool_compilerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Cool_compilerParser.COMMA, i);
		}
		public ActualParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualParamList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).enterActualParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).exitActualParamList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_compilerVisitor) return ((Cool_compilerVisitor<? extends T>)visitor).visitActualParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActualParamListContext actualParamList() throws RecognitionException {
		ActualParamListContext _localctx = new ActualParamListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_actualParamList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			expr(0);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(107);
				match(COMMA);
				setState(108);
				expr(0);
				}
				}
				setState(113);
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

	public static class VarDefinitionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Cool_compilerParser.ID, 0); }
		public TerminalNode COLUN() { return getToken(Cool_compilerParser.COLUN, 0); }
		public TerminalNode TYPE() { return getToken(Cool_compilerParser.TYPE, 0); }
		public TerminalNode ASSIGN_OPERATOR() { return getToken(Cool_compilerParser.ASSIGN_OPERATOR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).enterVarDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).exitVarDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_compilerVisitor) return ((Cool_compilerVisitor<? extends T>)visitor).visitVarDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDefinitionContext varDefinition() throws RecognitionException {
		VarDefinitionContext _localctx = new VarDefinitionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_varDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(ID);
			setState(115);
			match(COLUN);
			setState(116);
			match(TYPE);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN_OPERATOR) {
				{
				setState(117);
				match(ASSIGN_OPERATOR);
				setState(118);
				expr(0);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }

		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class New_obj_stmtContext extends ExprContext {
		public NewObjStmtContext newObjStmt() {
			return getRuleContext(NewObjStmtContext.class,0);
		}
		public New_obj_stmtContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).enterNew_obj_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).exitNew_obj_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_compilerVisitor) return ((Cool_compilerVisitor<? extends T>)visitor).visitNew_obj_stmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Assignment_stmtContext extends ExprContext {
		public AssignmentStmtContext assignmentStmt() {
			return getRuleContext(AssignmentStmtContext.class,0);
		}
		public Assignment_stmtContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).enterAssignment_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).exitAssignment_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_compilerVisitor) return ((Cool_compilerVisitor<? extends T>)visitor).visitAssignment_stmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class While_stmtContext extends ExprContext {
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public While_stmtContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).exitWhile_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_compilerVisitor) return ((Cool_compilerVisitor<? extends T>)visitor).visitWhile_stmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BracExprStmtContext extends ExprContext {
		public TerminalNode LEFT_PRANSIS() { return getToken(Cool_compilerParser.LEFT_PRANSIS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RIGHT_PRANSIS() { return getToken(Cool_compilerParser.RIGHT_PRANSIS, 0); }
		public BracExprStmtContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).enterBracExprStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).exitBracExprStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_compilerVisitor) return ((Cool_compilerVisitor<? extends T>)visitor).visitBracExprStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValueStmtContext extends ExprContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ValueStmtContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).enterValueStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).exitValueStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_compilerVisitor) return ((Cool_compilerVisitor<? extends T>)visitor).visitValueStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class If_stmtContext extends ExprContext {
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public If_stmtContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).exitIf_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_compilerVisitor) return ((Cool_compilerVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Case_stmtContext extends ExprContext {
		public CaseStmtContext caseStmt() {
			return getRuleContext(CaseStmtContext.class,0);
		}
		public Case_stmtContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).enterCase_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).exitCase_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_compilerVisitor) return ((Cool_compilerVisitor<? extends T>)visitor).visitCase_stmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MethodCallStmtContext extends ExprContext {
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public MethodCallStmtContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).enterMethodCallStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).exitMethodCallStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_compilerVisitor) return ((Cool_compilerVisitor<? extends T>)visitor).visitMethodCallStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivStmtContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULDIV() { return getToken(Cool_compilerParser.MULDIV, 0); }
		public MulDivStmtContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).enterMulDivStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).exitMulDivStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_compilerVisitor) return ((Cool_compilerVisitor<? extends T>)visitor).visitMulDivStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Not_expr_stmtContext extends ExprContext {
		public NotExprStmtContext notExprStmt() {
			return getRuleContext(NotExprStmtContext.class,0);
		}
		public Not_expr_stmtContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).enterNot_expr_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).exitNot_expr_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_compilerVisitor) return ((Cool_compilerVisitor<? extends T>)visitor).visitNot_expr_stmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelOpStmtContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public RelOpStmtContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).enterRelOpStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).exitRelOpStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_compilerVisitor) return ((Cool_compilerVisitor<? extends T>)visitor).visitRelOpStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Block_stmtContext extends ExprContext {
		public BlockStmtContext blockStmt() {
			return getRuleContext(BlockStmtContext.class,0);
		}
		public Block_stmtContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).enterBlock_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).exitBlock_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_compilerVisitor) return ((Cool_compilerVisitor<? extends T>)visitor).visitBlock_stmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Is_void_stmtContext extends ExprContext {
		public IsvoidStmtContext isvoidStmt() {
			return getRuleContext(IsvoidStmtContext.class,0);
		}
		public Is_void_stmtContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).enterIs_void_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).exitIs_void_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_compilerVisitor) return ((Cool_compilerVisitor<? extends T>)visitor).visitIs_void_stmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusMinusStmtContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUSMINUS() { return getToken(Cool_compilerParser.PLUSMINUS, 0); }
		public PlusMinusStmtContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).enterPlusMinusStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).exitPlusMinusStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_compilerVisitor) return ((Cool_compilerVisitor<? extends T>)visitor).visitPlusMinusStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Inv_expr_stmtContext extends ExprContext {
		public InvExprStmtContext invExprStmt() {
			return getRuleContext(InvExprStmtContext.class,0);
		}
		public Inv_expr_stmtContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).enterInv_expr_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).exitInv_expr_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_compilerVisitor) return ((Cool_compilerVisitor<? extends T>)visitor).visitInv_expr_stmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Let_stmtContext extends ExprContext {
		public LetStmtContext letStmt() {
			return getRuleContext(LetStmtContext.class,0);
		}
		public Let_stmtContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).enterLet_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).exitLet_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_compilerVisitor) return ((Cool_compilerVisitor<? extends T>)visitor).visitLet_stmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Feature_access_stmtContext extends ExprContext {
		public ExprContext featureAccess;
		public TerminalNode DOT() { return getToken(Cool_compilerParser.DOT, 0); }
		public TerminalNode ID() { return getToken(Cool_compilerParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AT() { return getToken(Cool_compilerParser.AT, 0); }
		public TerminalNode TYPE() { return getToken(Cool_compilerParser.TYPE, 0); }
		public TerminalNode LEFT_PRANSIS() { return getToken(Cool_compilerParser.LEFT_PRANSIS, 0); }
		public TerminalNode RIGHT_PRANSIS() { return getToken(Cool_compilerParser.RIGHT_PRANSIS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(Cool_compilerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Cool_compilerParser.COMMA, i);
		}
		public Feature_access_stmtContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).enterFeature_access_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).exitFeature_access_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_compilerVisitor) return ((Cool_compilerVisitor<? extends T>)visitor).visitFeature_access_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				_localctx = new Inv_expr_stmtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(122);
				invExprStmt();
				}
				break;
			case 2:
				{
				_localctx = new Is_void_stmtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(123);
				isvoidStmt();
				}
				break;
			case 3:
				{
				_localctx = new Not_expr_stmtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(124);
				notExprStmt();
				}
				break;
			case 4:
				{
				_localctx = new BracExprStmtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(125);
				match(LEFT_PRANSIS);
				setState(126);
				expr(0);
				setState(127);
				match(RIGHT_PRANSIS);
				}
				break;
			case 5:
				{
				_localctx = new ValueStmtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(129);
				value();
				}
				break;
			case 6:
				{
				_localctx = new Block_stmtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(130);
				blockStmt();
				}
				break;
			case 7:
				{
				_localctx = new MethodCallStmtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(131);
				methodCall();
				}
				break;
			case 8:
				{
				_localctx = new Let_stmtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(132);
				letStmt();
				}
				break;
			case 9:
				{
				_localctx = new While_stmtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(133);
				whileStmt();
				}
				break;
			case 10:
				{
				_localctx = new If_stmtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(134);
				ifStmt();
				}
				break;
			case 11:
				{
				_localctx = new New_obj_stmtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(135);
				newObjStmt();
				}
				break;
			case 12:
				{
				_localctx = new Case_stmtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(136);
				caseStmt();
				}
				break;
			case 13:
				{
				_localctx = new Assignment_stmtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(137);
				assignmentStmt();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(172);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(170);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivStmtContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(140);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(141);
						match(MULDIV);
						setState(142);
						expr(16);
						}
						break;
					case 2:
						{
						_localctx = new PlusMinusStmtContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(143);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(144);
						match(PLUSMINUS);
						setState(145);
						expr(15);
						}
						break;
					case 3:
						{
						_localctx = new RelOpStmtContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(146);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(147);
						op();
						setState(148);
						expr(14);
						}
						break;
					case 4:
						{
						_localctx = new Feature_access_stmtContext(new ExprContext(_parentctx, _parentState));
						((Feature_access_stmtContext)_localctx).featureAccess = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(150);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(153);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==AT) {
							{
							setState(151);
							match(AT);
							setState(152);
							match(TYPE);
							}
						}

						setState(155);
						match(DOT);
						setState(156);
						match(ID);
						setState(168);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
						case 1:
							{
							setState(157);
							match(LEFT_PRANSIS);
							setState(158);
							expr(0);
							setState(163);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==COMMA) {
								{
								{
								setState(159);
								match(COMMA);
								setState(160);
								expr(0);
								}
								}
								setState(165);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(166);
							match(RIGHT_PRANSIS);
							}
							break;
						}
						}
						break;
					}
					}
				}
				setState(174);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class OpContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(Cool_compilerParser.EQUAL, 0); }
		public TerminalNode LT() { return getToken(Cool_compilerParser.LT, 0); }
		public TerminalNode LE() { return getToken(Cool_compilerParser.LE, 0); }
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).exitOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_compilerVisitor) return ((Cool_compilerVisitor<? extends T>)visitor).visitOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << LT) | (1L << LE))) != 0)) ) {
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode LITERAL() { return getToken(Cool_compilerParser.LITERAL, 0); }
		public TerminalNode NUM() { return getToken(Cool_compilerParser.NUM, 0); }
		public TerminalNode ID() { return getToken(Cool_compilerParser.ID, 0); }
		public TerminalNode TRUE() { return getToken(Cool_compilerParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(Cool_compilerParser.FALSE, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_compilerVisitor) return ((Cool_compilerVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NUM) | (1L << LITERAL) | (1L << ID))) != 0)) ) {
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

	public static class IfStmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(Cool_compilerParser.IF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode THEN() { return getToken(Cool_compilerParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(Cool_compilerParser.ELSE, 0); }
		public TerminalNode FI() { return getToken(Cool_compilerParser.FI, 0); }
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_compilerVisitor) return ((Cool_compilerVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ifStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(IF);
			setState(180);
			expr(0);
			setState(181);
			match(THEN);
			setState(182);
			expr(0);
			setState(183);
			match(ELSE);
			setState(184);
			expr(0);
			setState(185);
			match(FI);
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

	public static class WhileStmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(Cool_compilerParser.WHILE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode THEN() { return getToken(Cool_compilerParser.THEN, 0); }
		public TerminalNode POOL() { return getToken(Cool_compilerParser.POOL, 0); }
		public WhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).exitWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_compilerVisitor) return ((Cool_compilerVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_whileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(WHILE);
			setState(188);
			expr(0);
			setState(189);
			match(THEN);
			setState(190);
			expr(0);
			setState(191);
			match(POOL);
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

	public static class LetStmtContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(Cool_compilerParser.LET, 0); }
		public TerminalNode IN() { return getToken(Cool_compilerParser.IN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<VarDefinitionContext> varDefinition() {
			return getRuleContexts(VarDefinitionContext.class);
		}
		public VarDefinitionContext varDefinition(int i) {
			return getRuleContext(VarDefinitionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Cool_compilerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Cool_compilerParser.COMMA, i);
		}
		public LetStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).enterLetStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).exitLetStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_compilerVisitor) return ((Cool_compilerVisitor<? extends T>)visitor).visitLetStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetStmtContext letStmt() throws RecognitionException {
		LetStmtContext _localctx = new LetStmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_letStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(LET);
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(194);
				varDefinition();
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(195);
					match(COMMA);
					setState(196);
					varDefinition();
					}
					}
					setState(201);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(207);
			match(IN);
			setState(208);
			expr(0);
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

	public static class CaseStmtContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(Cool_compilerParser.CASE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode OF() { return getToken(Cool_compilerParser.OF, 0); }
		public TerminalNode ESAC() { return getToken(Cool_compilerParser.ESAC, 0); }
		public List<CaseBodyContext> caseBody() {
			return getRuleContexts(CaseBodyContext.class);
		}
		public CaseBodyContext caseBody(int i) {
			return getRuleContext(CaseBodyContext.class,i);
		}
		public CaseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).enterCaseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).exitCaseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_compilerVisitor) return ((Cool_compilerVisitor<? extends T>)visitor).visitCaseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseStmtContext caseStmt() throws RecognitionException {
		CaseStmtContext _localctx = new CaseStmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_caseStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(CASE);
			setState(211);
			expr(0);
			setState(212);
			match(OF);
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(213);
				caseBody();
				}
				}
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(218);
			match(ESAC);
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

	public static class CaseBodyContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Cool_compilerParser.ID, 0); }
		public TerminalNode COLUN() { return getToken(Cool_compilerParser.COLUN, 0); }
		public TerminalNode TYPE() { return getToken(Cool_compilerParser.TYPE, 0); }
		public TerminalNode CASE_ARROW() { return getToken(Cool_compilerParser.CASE_ARROW, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLUN() { return getToken(Cool_compilerParser.SEMICOLUN, 0); }
		public CaseBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).enterCaseBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).exitCaseBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_compilerVisitor) return ((Cool_compilerVisitor<? extends T>)visitor).visitCaseBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseBodyContext caseBody() throws RecognitionException {
		CaseBodyContext _localctx = new CaseBodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_caseBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(ID);
			setState(221);
			match(COLUN);
			setState(222);
			match(TYPE);
			setState(223);
			match(CASE_ARROW);
			setState(224);
			expr(0);
			setState(225);
			match(SEMICOLUN);
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

	public static class AssignmentStmtContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Cool_compilerParser.ID, 0); }
		public TerminalNode ASSIGN_OPERATOR() { return getToken(Cool_compilerParser.ASSIGN_OPERATOR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).enterAssignmentStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).exitAssignmentStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_compilerVisitor) return ((Cool_compilerVisitor<? extends T>)visitor).visitAssignmentStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStmtContext assignmentStmt() throws RecognitionException {
		AssignmentStmtContext _localctx = new AssignmentStmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assignmentStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(ID);
			setState(228);
			match(ASSIGN_OPERATOR);
			setState(229);
			expr(0);
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

	public static class BlockStmtContext extends ParserRuleContext {
		public TerminalNode LEFT_CURLY() { return getToken(Cool_compilerParser.LEFT_CURLY, 0); }
		public TerminalNode RIGHT_CURLY() { return getToken(Cool_compilerParser.RIGHT_CURLY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> SEMICOLUN() { return getTokens(Cool_compilerParser.SEMICOLUN); }
		public TerminalNode SEMICOLUN(int i) {
			return getToken(Cool_compilerParser.SEMICOLUN, i);
		}
		public BlockStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).enterBlockStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).exitBlockStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_compilerVisitor) return ((Cool_compilerVisitor<? extends T>)visitor).visitBlockStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStmtContext blockStmt() throws RecognitionException {
		BlockStmtContext _localctx = new BlockStmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_blockStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(LEFT_CURLY);
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(232);
				expr(0);
				setState(233);
				match(SEMICOLUN);
				}
				}
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << LET) | (1L << CASE) | (1L << ISVOID) | (1L << NOT) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NUM) | (1L << LITERAL) | (1L << ID) | (1L << TILDE) | (1L << LEFT_CURLY) | (1L << LEFT_PRANSIS))) != 0) );
			setState(239);
			match(RIGHT_CURLY);
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

	public static class NewObjStmtContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(Cool_compilerParser.NEW, 0); }
		public TerminalNode TYPE() { return getToken(Cool_compilerParser.TYPE, 0); }
		public NewObjStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newObjStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).enterNewObjStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).exitNewObjStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_compilerVisitor) return ((Cool_compilerVisitor<? extends T>)visitor).visitNewObjStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewObjStmtContext newObjStmt() throws RecognitionException {
		NewObjStmtContext _localctx = new NewObjStmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_newObjStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(NEW);
			setState(242);
			match(TYPE);
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

	public static class IsvoidStmtContext extends ParserRuleContext {
		public TerminalNode ISVOID() { return getToken(Cool_compilerParser.ISVOID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IsvoidStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isvoidStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).enterIsvoidStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).exitIsvoidStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_compilerVisitor) return ((Cool_compilerVisitor<? extends T>)visitor).visitIsvoidStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsvoidStmtContext isvoidStmt() throws RecognitionException {
		IsvoidStmtContext _localctx = new IsvoidStmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_isvoidStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(ISVOID);
			setState(245);
			expr(0);
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

	public static class NotExprStmtContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(Cool_compilerParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotExprStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notExprStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).enterNotExprStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).exitNotExprStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_compilerVisitor) return ((Cool_compilerVisitor<? extends T>)visitor).visitNotExprStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotExprStmtContext notExprStmt() throws RecognitionException {
		NotExprStmtContext _localctx = new NotExprStmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_notExprStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(NOT);
			setState(248);
			expr(0);
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

	public static class InvExprStmtContext extends ParserRuleContext {
		public TerminalNode TILDE() { return getToken(Cool_compilerParser.TILDE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InvExprStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invExprStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).enterInvExprStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener) ((Cool_compilerListener)listener).exitInvExprStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_compilerVisitor) return ((Cool_compilerVisitor<? extends T>)visitor).visitInvExprStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InvExprStmtContext invExprStmt() throws RecognitionException {
		InvExprStmtContext _localctx = new InvExprStmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_invExprStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(TILDE);
			setState(251);
			expr(0);
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
		case 9:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 15);
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\65\u0100\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\7\2\62"+
		"\n\2\f\2\16\2\65\13\2\3\3\3\3\3\3\3\3\5\3;\n\3\3\3\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\5\4D\n\4\3\4\3\4\7\4H\n\4\f\4\16\4K\13\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7_\n\7\f\7\16\7b\13"+
		"\7\7\7d\n\7\f\7\16\7g\13\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\7\tp\n\t\f\t\16"+
		"\ts\13\t\3\n\3\n\3\n\3\n\3\n\5\nz\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u008d\n\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u009c\n\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00a4\n\13\f\13\16\13\u00a7"+
		"\13\13\3\13\3\13\5\13\u00ab\n\13\7\13\u00ad\n\13\f\13\16\13\u00b0\13\13"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\7\20\u00c8\n\20\f\20\16\20\u00cb\13"+
		"\20\7\20\u00cd\n\20\f\20\16\20\u00d0\13\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\6\21\u00d9\n\21\r\21\16\21\u00da\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\6\24\u00ee\n\24"+
		"\r\24\16\24\u00ef\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\2\3\24\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\2\4\3\2\36 \4\2\26\31\33\33\2\u0107\2\63\3\2\2\2\4\66\3\2"+
		"\2\2\6I\3\2\2\2\bL\3\2\2\2\nV\3\2\2\2\fe\3\2\2\2\16h\3\2\2\2\20l\3\2\2"+
		"\2\22t\3\2\2\2\24\u008c\3\2\2\2\26\u00b1\3\2\2\2\30\u00b3\3\2\2\2\32\u00b5"+
		"\3\2\2\2\34\u00bd\3\2\2\2\36\u00c3\3\2\2\2 \u00d4\3\2\2\2\"\u00de\3\2"+
		"\2\2$\u00e5\3\2\2\2&\u00e9\3\2\2\2(\u00f3\3\2\2\2*\u00f6\3\2\2\2,\u00f9"+
		"\3\2\2\2.\u00fc\3\2\2\2\60\62\5\4\3\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61"+
		"\3\2\2\2\63\64\3\2\2\2\64\3\3\2\2\2\65\63\3\2\2\2\66\67\7\6\2\2\67:\7"+
		"\32\2\289\7\5\2\29;\7\32\2\2:8\3\2\2\2:;\3\2\2\2;<\3\2\2\2<=\7*\2\2=>"+
		"\5\6\4\2>?\7+\2\2?@\7\60\2\2@\5\3\2\2\2AD\5\22\n\2BD\5\b\5\2CA\3\2\2\2"+
		"CB\3\2\2\2DE\3\2\2\2EF\7\60\2\2FH\3\2\2\2GC\3\2\2\2HK\3\2\2\2IG\3\2\2"+
		"\2IJ\3\2\2\2J\7\3\2\2\2KI\3\2\2\2LM\7\33\2\2MN\7,\2\2NO\5\f\7\2OP\7-\2"+
		"\2PQ\7\61\2\2QR\7\32\2\2RS\7*\2\2ST\5\24\13\2TU\7+\2\2U\t\3\2\2\2VW\7"+
		"\33\2\2WX\7,\2\2XY\5\20\t\2YZ\7-\2\2Z\13\3\2\2\2[`\5\16\b\2\\]\7\62\2"+
		"\2]_\5\16\b\2^\\\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2ad\3\2\2\2b`\3\2"+
		"\2\2c[\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\r\3\2\2\2ge\3\2\2\2hi\7"+
		"\33\2\2ij\7\61\2\2jk\7\32\2\2k\17\3\2\2\2lq\5\24\13\2mn\7\62\2\2np\5\24"+
		"\13\2om\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\21\3\2\2\2sq\3\2\2\2tu"+
		"\7\33\2\2uv\7\61\2\2vy\7\32\2\2wx\7\34\2\2xz\5\24\13\2yw\3\2\2\2yz\3\2"+
		"\2\2z\23\3\2\2\2{|\b\13\1\2|\u008d\5.\30\2}\u008d\5*\26\2~\u008d\5,\27"+
		"\2\177\u0080\7,\2\2\u0080\u0081\5\24\13\2\u0081\u0082\7-\2\2\u0082\u008d"+
		"\3\2\2\2\u0083\u008d\5\30\r\2\u0084\u008d\5&\24\2\u0085\u008d\5\n\6\2"+
		"\u0086\u008d\5\36\20\2\u0087\u008d\5\34\17\2\u0088\u008d\5\32\16\2\u0089"+
		"\u008d\5(\25\2\u008a\u008d\5 \21\2\u008b\u008d\5$\23\2\u008c{\3\2\2\2"+
		"\u008c}\3\2\2\2\u008c~\3\2\2\2\u008c\177\3\2\2\2\u008c\u0083\3\2\2\2\u008c"+
		"\u0084\3\2\2\2\u008c\u0085\3\2\2\2\u008c\u0086\3\2\2\2\u008c\u0087\3\2"+
		"\2\2\u008c\u0088\3\2\2\2\u008c\u0089\3\2\2\2\u008c\u008a\3\2\2\2\u008c"+
		"\u008b\3\2\2\2\u008d\u00ae\3\2\2\2\u008e\u008f\f\21\2\2\u008f\u0090\7"+
		"\4\2\2\u0090\u00ad\5\24\13\22\u0091\u0092\f\20\2\2\u0092\u0093\7\3\2\2"+
		"\u0093\u00ad\5\24\13\21\u0094\u0095\f\17\2\2\u0095\u0096\5\26\f\2\u0096"+
		"\u0097\5\24\13\20\u0097\u00ad\3\2\2\2\u0098\u009b\f\4\2\2\u0099\u009a"+
		"\7\64\2\2\u009a\u009c\7\32\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2"+
		"\u009c\u009d\3\2\2\2\u009d\u009e\7\63\2\2\u009e\u00aa\7\33\2\2\u009f\u00a0"+
		"\7,\2\2\u00a0\u00a5\5\24\13\2\u00a1\u00a2\7\62\2\2\u00a2\u00a4\5\24\13"+
		"\2\u00a3\u00a1\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6"+
		"\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\7-\2\2\u00a9"+
		"\u00ab\3\2\2\2\u00aa\u009f\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2"+
		"\2\2\u00ac\u008e\3\2\2\2\u00ac\u0091\3\2\2\2\u00ac\u0094\3\2\2\2\u00ac"+
		"\u0098\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2"+
		"\2\2\u00af\25\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\t\2\2\2\u00b2\27"+
		"\3\2\2\2\u00b3\u00b4\t\3\2\2\u00b4\31\3\2\2\2\u00b5\u00b6\7\7\2\2\u00b6"+
		"\u00b7\5\24\13\2\u00b7\u00b8\7\b\2\2\u00b8\u00b9\5\24\13\2\u00b9\u00ba"+
		"\7\t\2\2\u00ba\u00bb\5\24\13\2\u00bb\u00bc\7\n\2\2\u00bc\33\3\2\2\2\u00bd"+
		"\u00be\7\13\2\2\u00be\u00bf\5\24\13\2\u00bf\u00c0\7\b\2\2\u00c0\u00c1"+
		"\5\24\13\2\u00c1\u00c2\7\r\2\2\u00c2\35\3\2\2\2\u00c3\u00ce\7\16\2\2\u00c4"+
		"\u00c9\5\22\n\2\u00c5\u00c6\7\62\2\2\u00c6\u00c8\5\22\n\2\u00c7\u00c5"+
		"\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00c4\3\2\2\2\u00cd\u00d0\3\2"+
		"\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0"+
		"\u00ce\3\2\2\2\u00d1\u00d2\7\17\2\2\u00d2\u00d3\5\24\13\2\u00d3\37\3\2"+
		"\2\2\u00d4\u00d5\7\20\2\2\u00d5\u00d6\5\24\13\2\u00d6\u00d8\7\21\2\2\u00d7"+
		"\u00d9\5\"\22\2\u00d8\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00d8\3"+
		"\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\7\22\2\2\u00dd"+
		"!\3\2\2\2\u00de\u00df\7\33\2\2\u00df\u00e0\7\61\2\2\u00e0\u00e1\7\32\2"+
		"\2\u00e1\u00e2\7\35\2\2\u00e2\u00e3\5\24\13\2\u00e3\u00e4\7\60\2\2\u00e4"+
		"#\3\2\2\2\u00e5\u00e6\7\33\2\2\u00e6\u00e7\7\34\2\2\u00e7\u00e8\5\24\13"+
		"\2\u00e8%\3\2\2\2\u00e9\u00ed\7*\2\2\u00ea\u00eb\5\24\13\2\u00eb\u00ec"+
		"\7\60\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00ea\3\2\2\2\u00ee\u00ef\3\2\2\2"+
		"\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2"+
		"\7+\2\2\u00f2\'\3\2\2\2\u00f3\u00f4\7\25\2\2\u00f4\u00f5\7\32\2\2\u00f5"+
		")\3\2\2\2\u00f6\u00f7\7\23\2\2\u00f7\u00f8\5\24\13\2\u00f8+\3\2\2\2\u00f9"+
		"\u00fa\7\24\2\2\u00fa\u00fb\5\24\13\2\u00fb-\3\2\2\2\u00fc\u00fd\7%\2"+
		"\2\u00fd\u00fe\5\24\13\2\u00fe/\3\2\2\2\24\63:CI`eqy\u008c\u009b\u00a5"+
		"\u00aa\u00ac\u00ae\u00c9\u00ce\u00da\u00ef";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
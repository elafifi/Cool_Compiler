// Generated from C:/Users/elafi/IdeaProjects/Afifi_Lexer/src\Cool_compiler.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

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
		RULE_varDeclaration = 8, RULE_expr = 9, RULE_op = 10, RULE_value = 11, 
		RULE_ifStmt = 12, RULE_whileStmt = 13, RULE_letStmt = 14, RULE_caseStmt = 15, 
		RULE_caseBody = 16, RULE_assignmentStmt = 17, RULE_blockStmt = 18, RULE_newObjStmt = 19, 
		RULE_isvoidStmt = 20, RULE_notExprStmt = 21, RULE_invExprStmt = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "classDefinition", "classBody", "methodDefinition", "methodCall", 
			"formalParamList", "param", "actualParamList", "varDeclaration", "expr", 
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
			if ( listener instanceof Cool_compilerListener ) ((Cool_compilerListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener ) ((Cool_compilerListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_compilerVisitor ) return ((Cool_compilerVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(47); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(46);
				classDefinition();
				}
				}
				setState(49); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CLASS );
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
			if ( listener instanceof Cool_compilerListener ) ((Cool_compilerListener)listener).enterClassDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener ) ((Cool_compilerListener)listener).exitClassDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_compilerVisitor ) return ((Cool_compilerVisitor<? extends T>)visitor).visitClassDefinition(this);
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
			setState(51);
			match(CLASS);
			setState(52);
			match(TYPE);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INHERITS) {
				{
				setState(53);
				match(INHERITS);
				setState(54);
				match(TYPE);
				}
			}

			setState(57);
			match(LEFT_CURLY);
			setState(58);
			classBody();
			setState(59);
			match(RIGHT_CURLY);
			setState(60);
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
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
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
			if ( listener instanceof Cool_compilerListener ) ((Cool_compilerListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener ) ((Cool_compilerListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_compilerVisitor ) return ((Cool_compilerVisitor<? extends T>)visitor).visitClassBody(this);
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
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(64);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(62);
					varDeclaration();
					}
					break;
				case 2:
					{
					setState(63);
					methodDefinition();
					}
					break;
				}
				setState(66);
				match(SEMICOLUN);
				}
				}
				setState(72);
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
		public TerminalNode RIGHT_PRANSIS() { return getToken(Cool_compilerParser.RIGHT_PRANSIS, 0); }
		public TerminalNode COLUN() { return getToken(Cool_compilerParser.COLUN, 0); }
		public TerminalNode TYPE() { return getToken(Cool_compilerParser.TYPE, 0); }
		public TerminalNode LEFT_CURLY() { return getToken(Cool_compilerParser.LEFT_CURLY, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RIGHT_CURLY() { return getToken(Cool_compilerParser.RIGHT_CURLY, 0); }
		public List<FormalParamListContext> formalParamList() {
			return getRuleContexts(FormalParamListContext.class);
		}
		public FormalParamListContext formalParamList(int i) {
			return getRuleContext(FormalParamListContext.class,i);
		}
		public MethodDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener ) ((Cool_compilerListener)listener).enterMethodDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener ) ((Cool_compilerListener)listener).exitMethodDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_compilerVisitor ) return ((Cool_compilerVisitor<? extends T>)visitor).visitMethodDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDefinitionContext methodDefinition() throws RecognitionException {
		MethodDefinitionContext _localctx = new MethodDefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_methodDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(ID);
			setState(74);
			match(LEFT_PRANSIS);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(75);
				formalParamList();
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81);
			match(RIGHT_PRANSIS);
			setState(82);
			match(COLUN);
			setState(83);
			match(TYPE);
			setState(84);
			match(LEFT_CURLY);
			setState(85);
			expr(0);
			setState(86);
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
		public TerminalNode SEMICOLUN() { return getToken(Cool_compilerParser.SEMICOLUN, 0); }
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener ) ((Cool_compilerListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener ) ((Cool_compilerListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_compilerVisitor ) return ((Cool_compilerVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_methodCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(ID);
			setState(89);
			match(LEFT_PRANSIS);
			setState(90);
			actualParamList();
			setState(91);
			match(RIGHT_PRANSIS);
			setState(92);
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
			if ( listener instanceof Cool_compilerListener ) ((Cool_compilerListener)listener).enterFormalParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener ) ((Cool_compilerListener)listener).exitFormalParamList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_compilerVisitor ) return ((Cool_compilerVisitor<? extends T>)visitor).visitFormalParamList(this);
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
			setState(94);
			param();
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(95);
				match(COMMA);
				setState(96);
				param();
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
			if ( listener instanceof Cool_compilerListener ) ((Cool_compilerListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener ) ((Cool_compilerListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_compilerVisitor ) return ((Cool_compilerVisitor<? extends T>)visitor).visitParam(this);
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
			if ( listener instanceof Cool_compilerListener ) ((Cool_compilerListener)listener).enterActualParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener ) ((Cool_compilerListener)listener).exitActualParamList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_compilerVisitor ) return ((Cool_compilerVisitor<? extends T>)visitor).visitActualParamList(this);
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
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << LET) | (1L << CASE) | (1L << ISVOID) | (1L << NOT) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NUM) | (1L << LITERAL) | (1L << ID) | (1L << TILDE) | (1L << LEFT_CURLY) | (1L << LEFT_PRANSIS))) != 0)) {
				{
				{
				setState(107);
				expr(0);
				setState(108);
				match(COMMA);
				}
				}
				setState(114);
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Cool_compilerParser.ID, 0); }
		public TerminalNode COLUN() { return getToken(Cool_compilerParser.COLUN, 0); }
		public TerminalNode TYPE() { return getToken(Cool_compilerParser.TYPE, 0); }
		public TerminalNode ASSIGN_OPERATOR() { return getToken(Cool_compilerParser.ASSIGN_OPERATOR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener ) ((Cool_compilerListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener ) ((Cool_compilerListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_compilerVisitor ) return ((Cool_compilerVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_varDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(ID);
			setState(116);
			match(COLUN);
			setState(117);
			match(TYPE);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN_OPERATOR) {
				{
				setState(118);
				match(ASSIGN_OPERATOR);
				setState(119);
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
		public ExprContext featureAccess;
		public TerminalNode LEFT_PRANSIS() { return getToken(Cool_compilerParser.LEFT_PRANSIS, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RIGHT_PRANSIS() { return getToken(Cool_compilerParser.RIGHT_PRANSIS, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public BlockStmtContext blockStmt() {
			return getRuleContext(BlockStmtContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public LetStmtContext letStmt() {
			return getRuleContext(LetStmtContext.class,0);
		}
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public AssignmentStmtContext assignmentStmt() {
			return getRuleContext(AssignmentStmtContext.class,0);
		}
		public InvExprStmtContext invExprStmt() {
			return getRuleContext(InvExprStmtContext.class,0);
		}
		public NotExprStmtContext notExprStmt() {
			return getRuleContext(NotExprStmtContext.class,0);
		}
		public NewObjStmtContext newObjStmt() {
			return getRuleContext(NewObjStmtContext.class,0);
		}
		public IsvoidStmtContext isvoidStmt() {
			return getRuleContext(IsvoidStmtContext.class,0);
		}
		public CaseStmtContext caseStmt() {
			return getRuleContext(CaseStmtContext.class,0);
		}
		public TerminalNode MULDIV() { return getToken(Cool_compilerParser.MULDIV, 0); }
		public TerminalNode PLUSMINUS() { return getToken(Cool_compilerParser.PLUSMINUS, 0); }
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Cool_compilerParser.DOT, 0); }
		public TerminalNode ID() { return getToken(Cool_compilerParser.ID, 0); }
		public TerminalNode AT() { return getToken(Cool_compilerParser.AT, 0); }
		public TerminalNode TYPE() { return getToken(Cool_compilerParser.TYPE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(Cool_compilerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Cool_compilerParser.COMMA, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener ) ((Cool_compilerListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener ) ((Cool_compilerListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_compilerVisitor ) return ((Cool_compilerVisitor<? extends T>)visitor).visitExpr(this);
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
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(123);
				match(LEFT_PRANSIS);
				setState(124);
				expr(0);
				setState(125);
				match(RIGHT_PRANSIS);
				}
				break;
			case 2:
				{
				setState(127);
				value();
				}
				break;
			case 3:
				{
				setState(128);
				blockStmt();
				}
				break;
			case 4:
				{
				setState(129);
				methodCall();
				}
				break;
			case 5:
				{
				setState(130);
				letStmt();
				}
				break;
			case 6:
				{
				setState(131);
				whileStmt();
				}
				break;
			case 7:
				{
				setState(132);
				ifStmt();
				}
				break;
			case 8:
				{
				setState(133);
				assignmentStmt();
				}
				break;
			case 9:
				{
				setState(134);
				invExprStmt();
				}
				break;
			case 10:
				{
				setState(135);
				notExprStmt();
				}
				break;
			case 11:
				{
				setState(136);
				newObjStmt();
				}
				break;
			case 12:
				{
				setState(137);
				isvoidStmt();
				}
				break;
			case 13:
				{
				setState(138);
				caseStmt();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(173);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(171);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(141);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(142);
						match(MULDIV);
						setState(143);
						expr(18);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(144);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(145);
						match(PLUSMINUS);
						setState(146);
						expr(17);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(147);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(148);
						op();
						setState(149);
						expr(16);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.featureAccess = _prevctx;
						_localctx.featureAccess = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(151);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(154);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==AT) {
							{
							setState(152);
							match(AT);
							setState(153);
							match(TYPE);
							}
						}

						setState(156);
						match(DOT);
						setState(157);
						match(ID);
						setState(169);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
						case 1:
							{
							setState(158);
							match(LEFT_PRANSIS);
							setState(159);
							expr(0);
							setState(164);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==COMMA) {
								{
								{
								setState(160);
								match(COMMA);
								setState(161);
								expr(0);
								}
								}
								setState(166);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(167);
							match(RIGHT_PRANSIS);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(175);
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
			if ( listener instanceof Cool_compilerListener ) ((Cool_compilerListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener ) ((Cool_compilerListener)listener).exitOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_compilerVisitor ) return ((Cool_compilerVisitor<? extends T>)visitor).visitOp(this);
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
			setState(176);
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
		public TerminalNode ASSIGN_OPERATOR() { return getToken(Cool_compilerParser.ASSIGN_OPERATOR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TRUE() { return getToken(Cool_compilerParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(Cool_compilerParser.FALSE, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener ) ((Cool_compilerListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener ) ((Cool_compilerListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_compilerVisitor ) return ((Cool_compilerVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_value);
		try {
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				match(LITERAL);
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				match(NUM);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
				match(ID);
				setState(183);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(181);
					match(ASSIGN_OPERATOR);
					setState(182);
					expr(0);
					}
					break;
				}
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(185);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(186);
				match(FALSE);
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
			if ( listener instanceof Cool_compilerListener ) ((Cool_compilerListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener ) ((Cool_compilerListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_compilerVisitor ) return ((Cool_compilerVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ifStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(IF);
			setState(190);
			expr(0);
			setState(191);
			match(THEN);
			setState(192);
			expr(0);
			setState(193);
			match(ELSE);
			setState(194);
			expr(0);
			setState(195);
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
			if ( listener instanceof Cool_compilerListener ) ((Cool_compilerListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener ) ((Cool_compilerListener)listener).exitWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_compilerVisitor ) return ((Cool_compilerVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_whileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(WHILE);
			setState(198);
			expr(0);
			setState(199);
			match(THEN);
			setState(200);
			expr(0);
			setState(201);
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
		public List<AssignmentStmtContext> assignmentStmt() {
			return getRuleContexts(AssignmentStmtContext.class);
		}
		public AssignmentStmtContext assignmentStmt(int i) {
			return getRuleContext(AssignmentStmtContext.class,i);
		}
		public LetStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener ) ((Cool_compilerListener)listener).enterLetStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener ) ((Cool_compilerListener)listener).exitLetStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_compilerVisitor ) return ((Cool_compilerVisitor<? extends T>)visitor).visitLetStmt(this);
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
			setState(203);
			match(LET);
			setState(205); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(204);
				assignmentStmt();
				}
				}
				setState(207); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(209);
			match(IN);
			setState(210);
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
		public CaseBodyContext caseBody() {
			return getRuleContext(CaseBodyContext.class,0);
		}
		public TerminalNode ESAC() { return getToken(Cool_compilerParser.ESAC, 0); }
		public CaseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener ) ((Cool_compilerListener)listener).enterCaseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener ) ((Cool_compilerListener)listener).exitCaseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_compilerVisitor ) return ((Cool_compilerVisitor<? extends T>)visitor).visitCaseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseStmtContext caseStmt() throws RecognitionException {
		CaseStmtContext _localctx = new CaseStmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_caseStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(CASE);
			setState(213);
			expr(0);
			setState(214);
			match(OF);
			setState(215);
			caseBody();
			setState(216);
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
		public List<TerminalNode> ID() { return getTokens(Cool_compilerParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Cool_compilerParser.ID, i);
		}
		public List<TerminalNode> COLUN() { return getTokens(Cool_compilerParser.COLUN); }
		public TerminalNode COLUN(int i) {
			return getToken(Cool_compilerParser.COLUN, i);
		}
		public List<TerminalNode> TYPE() { return getTokens(Cool_compilerParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(Cool_compilerParser.TYPE, i);
		}
		public List<TerminalNode> CASE_ARROW() { return getTokens(Cool_compilerParser.CASE_ARROW); }
		public TerminalNode CASE_ARROW(int i) {
			return getToken(Cool_compilerParser.CASE_ARROW, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CaseBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener ) ((Cool_compilerListener)listener).enterCaseBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener ) ((Cool_compilerListener)listener).exitCaseBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_compilerVisitor ) return ((Cool_compilerVisitor<? extends T>)visitor).visitCaseBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseBodyContext caseBody() throws RecognitionException {
		CaseBodyContext _localctx = new CaseBodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_caseBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(218);
				match(ID);
				setState(219);
				match(COLUN);
				setState(220);
				match(TYPE);
				setState(221);
				match(CASE_ARROW);
				setState(222);
				expr(0);
				}
				}
				setState(225); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
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
		public TerminalNode COLUN() { return getToken(Cool_compilerParser.COLUN, 0); }
		public TerminalNode TYPE() { return getToken(Cool_compilerParser.TYPE, 0); }
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
			if ( listener instanceof Cool_compilerListener ) ((Cool_compilerListener)listener).enterAssignmentStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener ) ((Cool_compilerListener)listener).exitAssignmentStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_compilerVisitor ) return ((Cool_compilerVisitor<? extends T>)visitor).visitAssignmentStmt(this);
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
			match(COLUN);
			setState(229);
			match(TYPE);
			setState(230);
			match(ASSIGN_OPERATOR);
			setState(231);
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
			if ( listener instanceof Cool_compilerListener ) ((Cool_compilerListener)listener).enterBlockStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener ) ((Cool_compilerListener)listener).exitBlockStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_compilerVisitor ) return ((Cool_compilerVisitor<? extends T>)visitor).visitBlockStmt(this);
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
			setState(233);
			match(LEFT_CURLY);
			setState(237); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(234);
				expr(0);
				setState(235);
				match(SEMICOLUN);
				}
				}
				setState(239); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << LET) | (1L << CASE) | (1L << ISVOID) | (1L << NOT) | (1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NUM) | (1L << LITERAL) | (1L << ID) | (1L << TILDE) | (1L << LEFT_CURLY) | (1L << LEFT_PRANSIS))) != 0) );
			setState(241);
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
			if ( listener instanceof Cool_compilerListener ) ((Cool_compilerListener)listener).enterNewObjStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener ) ((Cool_compilerListener)listener).exitNewObjStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_compilerVisitor ) return ((Cool_compilerVisitor<? extends T>)visitor).visitNewObjStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewObjStmtContext newObjStmt() throws RecognitionException {
		NewObjStmtContext _localctx = new NewObjStmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_newObjStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(NEW);
			setState(244);
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
			if ( listener instanceof Cool_compilerListener ) ((Cool_compilerListener)listener).enterIsvoidStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener ) ((Cool_compilerListener)listener).exitIsvoidStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_compilerVisitor ) return ((Cool_compilerVisitor<? extends T>)visitor).visitIsvoidStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsvoidStmtContext isvoidStmt() throws RecognitionException {
		IsvoidStmtContext _localctx = new IsvoidStmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_isvoidStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(ISVOID);
			setState(247);
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
			if ( listener instanceof Cool_compilerListener ) ((Cool_compilerListener)listener).enterNotExprStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener ) ((Cool_compilerListener)listener).exitNotExprStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_compilerVisitor ) return ((Cool_compilerVisitor<? extends T>)visitor).visitNotExprStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotExprStmtContext notExprStmt() throws RecognitionException {
		NotExprStmtContext _localctx = new NotExprStmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_notExprStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(NOT);
			setState(250);
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
			if ( listener instanceof Cool_compilerListener ) ((Cool_compilerListener)listener).enterInvExprStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cool_compilerListener ) ((Cool_compilerListener)listener).exitInvExprStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Cool_compilerVisitor ) return ((Cool_compilerVisitor<? extends T>)visitor).visitInvExprStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InvExprStmtContext invExprStmt() throws RecognitionException {
		InvExprStmtContext _localctx = new InvExprStmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_invExprStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(TILDE);
			setState(253);
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
			return precpred(_ctx, 17);
		case 1:
			return precpred(_ctx, 16);
		case 2:
			return precpred(_ctx, 15);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\65\u0102\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\6\2\62"+
		"\n\2\r\2\16\2\63\3\3\3\3\3\3\3\3\5\3:\n\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\5\4C\n\4\3\4\3\4\7\4G\n\4\f\4\16\4J\13\4\3\5\3\5\3\5\7\5O\n\5\f\5\16"+
		"\5R\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\7\7d\n\7\f\7\16\7g\13\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\7\tq\n\t\f"+
		"\t\16\tt\13\t\3\n\3\n\3\n\3\n\3\n\5\n{\n\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u008e"+
		"\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u009d\n\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00a5\n\13\f\13\16"+
		"\13\u00a8\13\13\3\13\3\13\5\13\u00ac\n\13\7\13\u00ae\n\13\f\13\16\13\u00b1"+
		"\13\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\5\r\u00ba\n\r\3\r\3\r\5\r\u00be\n\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\6\20\u00d0\n\20\r\20\16\20\u00d1\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\6\22\u00e2\n\22\r\22\16\22"+
		"\u00e3\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\6\24\u00f0\n"+
		"\24\r\24\16\24\u00f1\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\2\3\24\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\2\3\3\2\36 \2\u010d\2\61\3\2\2\2\4\65\3\2\2\2\6H\3\2\2\2"+
		"\bK\3\2\2\2\nZ\3\2\2\2\f`\3\2\2\2\16h\3\2\2\2\20l\3\2\2\2\22u\3\2\2\2"+
		"\24\u008d\3\2\2\2\26\u00b2\3\2\2\2\30\u00bd\3\2\2\2\32\u00bf\3\2\2\2\34"+
		"\u00c7\3\2\2\2\36\u00cd\3\2\2\2 \u00d6\3\2\2\2\"\u00e1\3\2\2\2$\u00e5"+
		"\3\2\2\2&\u00eb\3\2\2\2(\u00f5\3\2\2\2*\u00f8\3\2\2\2,\u00fb\3\2\2\2."+
		"\u00fe\3\2\2\2\60\62\5\4\3\2\61\60\3\2\2\2\62\63\3\2\2\2\63\61\3\2\2\2"+
		"\63\64\3\2\2\2\64\3\3\2\2\2\65\66\7\6\2\2\669\7\32\2\2\678\7\5\2\28:\7"+
		"\32\2\29\67\3\2\2\29:\3\2\2\2:;\3\2\2\2;<\7*\2\2<=\5\6\4\2=>\7+\2\2>?"+
		"\7\60\2\2?\5\3\2\2\2@C\5\22\n\2AC\5\b\5\2B@\3\2\2\2BA\3\2\2\2CD\3\2\2"+
		"\2DE\7\60\2\2EG\3\2\2\2FB\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2I\7\3\2"+
		"\2\2JH\3\2\2\2KL\7\33\2\2LP\7,\2\2MO\5\f\7\2NM\3\2\2\2OR\3\2\2\2PN\3\2"+
		"\2\2PQ\3\2\2\2QS\3\2\2\2RP\3\2\2\2ST\7-\2\2TU\7\61\2\2UV\7\32\2\2VW\7"+
		"*\2\2WX\5\24\13\2XY\7+\2\2Y\t\3\2\2\2Z[\7\33\2\2[\\\7,\2\2\\]\5\20\t\2"+
		"]^\7-\2\2^_\7\60\2\2_\13\3\2\2\2`e\5\16\b\2ab\7\62\2\2bd\5\16\b\2ca\3"+
		"\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\r\3\2\2\2ge\3\2\2\2hi\7\33\2\2i"+
		"j\7\61\2\2jk\7\32\2\2k\17\3\2\2\2lr\5\24\13\2mn\5\24\13\2no\7\62\2\2o"+
		"q\3\2\2\2pm\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2s\21\3\2\2\2tr\3\2\2"+
		"\2uv\7\33\2\2vw\7\61\2\2wz\7\32\2\2xy\7\34\2\2y{\5\24\13\2zx\3\2\2\2z"+
		"{\3\2\2\2{\23\3\2\2\2|}\b\13\1\2}~\7,\2\2~\177\5\24\13\2\177\u0080\7-"+
		"\2\2\u0080\u008e\3\2\2\2\u0081\u008e\5\30\r\2\u0082\u008e\5&\24\2\u0083"+
		"\u008e\5\n\6\2\u0084\u008e\5\36\20\2\u0085\u008e\5\34\17\2\u0086\u008e"+
		"\5\32\16\2\u0087\u008e\5$\23\2\u0088\u008e\5.\30\2\u0089\u008e\5,\27\2"+
		"\u008a\u008e\5(\25\2\u008b\u008e\5*\26\2\u008c\u008e\5 \21\2\u008d|\3"+
		"\2\2\2\u008d\u0081\3\2\2\2\u008d\u0082\3\2\2\2\u008d\u0083\3\2\2\2\u008d"+
		"\u0084\3\2\2\2\u008d\u0085\3\2\2\2\u008d\u0086\3\2\2\2\u008d\u0087\3\2"+
		"\2\2\u008d\u0088\3\2\2\2\u008d\u0089\3\2\2\2\u008d\u008a\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008d\u008c\3\2\2\2\u008e\u00af\3\2\2\2\u008f\u0090\f\23"+
		"\2\2\u0090\u0091\7\4\2\2\u0091\u00ae\5\24\13\24\u0092\u0093\f\22\2\2\u0093"+
		"\u0094\7\3\2\2\u0094\u00ae\5\24\13\23\u0095\u0096\f\21\2\2\u0096\u0097"+
		"\5\26\f\2\u0097\u0098\5\24\13\22\u0098\u00ae\3\2\2\2\u0099\u009c\f\3\2"+
		"\2\u009a\u009b\7\64\2\2\u009b\u009d\7\32\2\2\u009c\u009a\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\7\63\2\2\u009f\u00ab\7"+
		"\33\2\2\u00a0\u00a1\7,\2\2\u00a1\u00a6\5\24\13\2\u00a2\u00a3\7\62\2\2"+
		"\u00a3\u00a5\5\24\13\2\u00a4\u00a2\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4"+
		"\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9"+
		"\u00aa\7-\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a0\3\2\2\2\u00ab\u00ac\3\2"+
		"\2\2\u00ac\u00ae\3\2\2\2\u00ad\u008f\3\2\2\2\u00ad\u0092\3\2\2\2\u00ad"+
		"\u0095\3\2\2\2\u00ad\u0099\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2"+
		"\2\2\u00af\u00b0\3\2\2\2\u00b0\25\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3"+
		"\t\2\2\2\u00b3\27\3\2\2\2\u00b4\u00be\7\31\2\2\u00b5\u00be\7\30\2\2\u00b6"+
		"\u00b9\7\33\2\2\u00b7\u00b8\7\34\2\2\u00b8\u00ba\5\24\13\2\u00b9\u00b7"+
		"\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00be\3\2\2\2\u00bb\u00be\7\26\2\2"+
		"\u00bc\u00be\7\27\2\2\u00bd\u00b4\3\2\2\2\u00bd\u00b5\3\2\2\2\u00bd\u00b6"+
		"\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be\31\3\2\2\2\u00bf"+
		"\u00c0\7\7\2\2\u00c0\u00c1\5\24\13\2\u00c1\u00c2\7\b\2\2\u00c2\u00c3\5"+
		"\24\13\2\u00c3\u00c4\7\t\2\2\u00c4\u00c5\5\24\13\2\u00c5\u00c6\7\n\2\2"+
		"\u00c6\33\3\2\2\2\u00c7\u00c8\7\13\2\2\u00c8\u00c9\5\24\13\2\u00c9\u00ca"+
		"\7\b\2\2\u00ca\u00cb\5\24\13\2\u00cb\u00cc\7\r\2\2\u00cc\35\3\2\2\2\u00cd"+
		"\u00cf\7\16\2\2\u00ce\u00d0\5$\23\2\u00cf\u00ce\3\2\2\2\u00d0\u00d1\3"+
		"\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\u00d4\7\17\2\2\u00d4\u00d5\5\24\13\2\u00d5\37\3\2\2\2\u00d6\u00d7\7\20"+
		"\2\2\u00d7\u00d8\5\24\13\2\u00d8\u00d9\7\21\2\2\u00d9\u00da\5\"\22\2\u00da"+
		"\u00db\7\22\2\2\u00db!\3\2\2\2\u00dc\u00dd\7\33\2\2\u00dd\u00de\7\61\2"+
		"\2\u00de\u00df\7\32\2\2\u00df\u00e0\7\35\2\2\u00e0\u00e2\5\24\13\2\u00e1"+
		"\u00dc\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2"+
		"\2\2\u00e4#\3\2\2\2\u00e5\u00e6\7\33\2\2\u00e6\u00e7\7\61\2\2\u00e7\u00e8"+
		"\7\32\2\2\u00e8\u00e9\7\34\2\2\u00e9\u00ea\5\24\13\2\u00ea%\3\2\2\2\u00eb"+
		"\u00ef\7*\2\2\u00ec\u00ed\5\24\13\2\u00ed\u00ee\7\60\2\2\u00ee\u00f0\3"+
		"\2\2\2\u00ef\u00ec\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\7+\2\2\u00f4\'\3\2\2\2"+
		"\u00f5\u00f6\7\25\2\2\u00f6\u00f7\7\32\2\2\u00f7)\3\2\2\2\u00f8\u00f9"+
		"\7\23\2\2\u00f9\u00fa\5\24\13\2\u00fa+\3\2\2\2\u00fb\u00fc\7\24\2\2\u00fc"+
		"\u00fd\5\24\13\2\u00fd-\3\2\2\2\u00fe\u00ff\7%\2\2\u00ff\u0100\5\24\13"+
		"\2\u0100/\3\2\2\2\25\639BHPerz\u008d\u009c\u00a6\u00ab\u00ad\u00af\u00b9"+
		"\u00bd\u00d1\u00e3\u00f1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
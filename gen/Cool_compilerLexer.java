// Generated from C:/Users/elafi/IdeaProjects/Afifi_Lexer/src\Cool_compiler.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Cool_compilerLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PLUSMINUS", "MULDIV", "INHERITS", "CLASS", "IF", "THEN", "ELSE", "FI", 
			"WHILE", "LOOP", "POOL", "LET", "IN", "CASE", "OF", "ESAC", "ISVOID", 
			"NOT", "NEW", "TRUE", "FALSE", "NUM", "LITERAL", "TYPE", "ID", "ASSIGN_OPERATOR", 
			"CASE_ARROW", "EQUAL", "LT", "LE", "PLUS", "MINUS", "DIV", "MUL", "TILDE", 
			"WS", "NEWLINE", "MULTI_LINE_COMMENT", "LINE_COMMENT", "LEFT_CURLY", 
			"RIGHT_CURLY", "LEFT_PRANSIS", "RIGHT_PRANSIS", "LEFT_SQUARE", "RIGHT_SQUARE", 
			"SEMICOLUN", "COLUN", "COMMA", "DOT", "AT", "ERROR", "A", "C", "D", "E", 
			"F", "H", "I", "L", "N", "O", "P", "R", "S", "T", "U", "V", "W"
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


	public Cool_compilerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Cool_compiler.g4"; }

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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\65\u0187\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\3\2\3\2\5\2\u008e\n"+
		"\2\3\3\3\3\5\3\u0092\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\6\27\u00f2\n\27\r\27\16\27\u00f3\3\30\3"+
		"\30\7\30\u00f8\n\30\f\30\16\30\u00fb\13\30\3\30\3\30\3\31\3\31\7\31\u0101"+
		"\n\31\f\31\16\31\u0104\13\31\3\32\3\32\7\32\u0108\n\32\f\32\16\32\u010b"+
		"\13\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37"+
		"\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3%\3&\5&\u0129\n&\3&\3&\5&\u012d"+
		"\n&\3&\3&\3\'\3\'\3\'\3\'\3\'\7\'\u0136\n\'\f\'\16\'\u0139\13\'\3\'\3"+
		"\'\3\'\3\'\3\'\3(\3(\3(\3(\7(\u0144\n(\f(\16(\u0147\13(\3(\5(\u014a\n"+
		"(\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61"+
		"\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39"+
		"\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D"+
		"\3E\3E\3\u0137\2F\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64"+
		"g\65i\2k\2m\2o\2q\2s\2u\2w\2y\2{\2}\2\177\2\u0081\2\u0083\2\u0085\2\u0087"+
		"\2\u0089\2\3\2\32\3\2\62;\6\2\n\n\f\f\16\17$$\3\2C\\\6\2\62;C\\aac|\4"+
		"\2C\\c|\4\2\13\13\"\"\3\2\f\f\4\2CCcc\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh"+
		"\4\2JJjj\4\2KKkk\4\2NNnn\4\2PPpp\4\2QQqq\4\2RRrr\4\2TTtt\4\2UUuu\4\2V"+
		"Vvv\4\2WWww\4\2XXxx\4\2YYyy\2\u0181\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2["+
		"\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2"+
		"\2\2\3\u008d\3\2\2\2\5\u0091\3\2\2\2\7\u0093\3\2\2\2\t\u009c\3\2\2\2\13"+
		"\u00a2\3\2\2\2\r\u00a5\3\2\2\2\17\u00aa\3\2\2\2\21\u00af\3\2\2\2\23\u00b2"+
		"\3\2\2\2\25\u00b8\3\2\2\2\27\u00bd\3\2\2\2\31\u00c2\3\2\2\2\33\u00c6\3"+
		"\2\2\2\35\u00c9\3\2\2\2\37\u00ce\3\2\2\2!\u00d1\3\2\2\2#\u00d6\3\2\2\2"+
		"%\u00dd\3\2\2\2\'\u00e1\3\2\2\2)\u00e5\3\2\2\2+\u00ea\3\2\2\2-\u00f1\3"+
		"\2\2\2/\u00f5\3\2\2\2\61\u00fe\3\2\2\2\63\u0105\3\2\2\2\65\u010c\3\2\2"+
		"\2\67\u010f\3\2\2\29\u0112\3\2\2\2;\u0114\3\2\2\2=\u0116\3\2\2\2?\u0119"+
		"\3\2\2\2A\u011b\3\2\2\2C\u011d\3\2\2\2E\u011f\3\2\2\2G\u0121\3\2\2\2I"+
		"\u0123\3\2\2\2K\u012c\3\2\2\2M\u0130\3\2\2\2O\u013f\3\2\2\2Q\u014d\3\2"+
		"\2\2S\u014f\3\2\2\2U\u0151\3\2\2\2W\u0153\3\2\2\2Y\u0155\3\2\2\2[\u0157"+
		"\3\2\2\2]\u0159\3\2\2\2_\u015b\3\2\2\2a\u015d\3\2\2\2c\u015f\3\2\2\2e"+
		"\u0161\3\2\2\2g\u0163\3\2\2\2i\u0165\3\2\2\2k\u0167\3\2\2\2m\u0169\3\2"+
		"\2\2o\u016b\3\2\2\2q\u016d\3\2\2\2s\u016f\3\2\2\2u\u0171\3\2\2\2w\u0173"+
		"\3\2\2\2y\u0175\3\2\2\2{\u0177\3\2\2\2}\u0179\3\2\2\2\177\u017b\3\2\2"+
		"\2\u0081\u017d\3\2\2\2\u0083\u017f\3\2\2\2\u0085\u0181\3\2\2\2\u0087\u0183"+
		"\3\2\2\2\u0089\u0185\3\2\2\2\u008b\u008e\5? \2\u008c\u008e\5A!\2\u008d"+
		"\u008b\3\2\2\2\u008d\u008c\3\2\2\2\u008e\4\3\2\2\2\u008f\u0092\5E#\2\u0090"+
		"\u0092\5C\"\2\u0091\u008f\3\2\2\2\u0091\u0090\3\2\2\2\u0092\6\3\2\2\2"+
		"\u0093\u0094\5u;\2\u0094\u0095\5y=\2\u0095\u0096\5s:\2\u0096\u0097\5o"+
		"8\2\u0097\u0098\5\177@\2\u0098\u0099\5u;\2\u0099\u009a\5\u0083B\2\u009a"+
		"\u009b\5\u0081A\2\u009b\b\3\2\2\2\u009c\u009d\5k\66\2\u009d\u009e\5w<"+
		"\2\u009e\u009f\5i\65\2\u009f\u00a0\5\u0081A\2\u00a0\u00a1\5\u0081A\2\u00a1"+
		"\n\3\2\2\2\u00a2\u00a3\5u;\2\u00a3\u00a4\5q9\2\u00a4\f\3\2\2\2\u00a5\u00a6"+
		"\5\u0083B\2\u00a6\u00a7\5s:\2\u00a7\u00a8\5o8\2\u00a8\u00a9\5y=\2\u00a9"+
		"\16\3\2\2\2\u00aa\u00ab\5o8\2\u00ab\u00ac\5w<\2\u00ac\u00ad\5\u0081A\2"+
		"\u00ad\u00ae\5o8\2\u00ae\20\3\2\2\2\u00af\u00b0\5q9\2\u00b0\u00b1\5u;"+
		"\2\u00b1\22\3\2\2\2\u00b2\u00b3\5\u0089E\2\u00b3\u00b4\5s:\2\u00b4\u00b5"+
		"\5u;\2\u00b5\u00b6\5w<\2\u00b6\u00b7\5o8\2\u00b7\24\3\2\2\2\u00b8\u00b9"+
		"\5w<\2\u00b9\u00ba\5{>\2\u00ba\u00bb\5{>\2\u00bb\u00bc\5}?\2\u00bc\26"+
		"\3\2\2\2\u00bd\u00be\5}?\2\u00be\u00bf\5{>\2\u00bf\u00c0\5{>\2\u00c0\u00c1"+
		"\5w<\2\u00c1\30\3\2\2\2\u00c2\u00c3\5w<\2\u00c3\u00c4\5o8\2\u00c4\u00c5"+
		"\5\u0083B\2\u00c5\32\3\2\2\2\u00c6\u00c7\5u;\2\u00c7\u00c8\5y=\2\u00c8"+
		"\34\3\2\2\2\u00c9\u00ca\5k\66\2\u00ca\u00cb\5i\65\2\u00cb\u00cc\5\u0081"+
		"A\2\u00cc\u00cd\5o8\2\u00cd\36\3\2\2\2\u00ce\u00cf\5{>\2\u00cf\u00d0\5"+
		"q9\2\u00d0 \3\2\2\2\u00d1\u00d2\5o8\2\u00d2\u00d3\5\u0081A\2\u00d3\u00d4"+
		"\5i\65\2\u00d4\u00d5\5k\66\2\u00d5\"\3\2\2\2\u00d6\u00d7\5u;\2\u00d7\u00d8"+
		"\5\u0081A\2\u00d8\u00d9\5\u0087D\2\u00d9\u00da\5{>\2\u00da\u00db\5u;\2"+
		"\u00db\u00dc\5m\67\2\u00dc$\3\2\2\2\u00dd\u00de\5y=\2\u00de\u00df\5{>"+
		"\2\u00df\u00e0\5\u0083B\2\u00e0&\3\2\2\2\u00e1\u00e2\5y=\2\u00e2\u00e3"+
		"\5o8\2\u00e3\u00e4\5\u0089E\2\u00e4(\3\2\2\2\u00e5\u00e6\7v\2\2\u00e6"+
		"\u00e7\5\177@\2\u00e7\u00e8\5\u0085C\2\u00e8\u00e9\5o8\2\u00e9*\3\2\2"+
		"\2\u00ea\u00eb\7h\2\2\u00eb\u00ec\5i\65\2\u00ec\u00ed\5w<\2\u00ed\u00ee"+
		"\5\u0081A\2\u00ee\u00ef\5o8\2\u00ef,\3\2\2\2\u00f0\u00f2\t\2\2\2\u00f1"+
		"\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2"+
		"\2\2\u00f4.\3\2\2\2\u00f5\u00f9\7$\2\2\u00f6\u00f8\n\3\2\2\u00f7\u00f6"+
		"\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		"\u00fc\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00fd\7$\2\2\u00fd\60\3\2\2\2"+
		"\u00fe\u0102\t\4\2\2\u00ff\u0101\t\5\2\2\u0100\u00ff\3\2\2\2\u0101\u0104"+
		"\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\62\3\2\2\2\u0104"+
		"\u0102\3\2\2\2\u0105\u0109\t\6\2\2\u0106\u0108\t\5\2\2\u0107\u0106\3\2"+
		"\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a"+
		"\64\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u010d\7>\2\2\u010d\u010e\7/\2\2"+
		"\u010e\66\3\2\2\2\u010f\u0110\7?\2\2\u0110\u0111\7@\2\2\u01118\3\2\2\2"+
		"\u0112\u0113\7?\2\2\u0113:\3\2\2\2\u0114\u0115\7>\2\2\u0115<\3\2\2\2\u0116"+
		"\u0117\7>\2\2\u0117\u0118\7?\2\2\u0118>\3\2\2\2\u0119\u011a\7-\2\2\u011a"+
		"@\3\2\2\2\u011b\u011c\7/\2\2\u011cB\3\2\2\2\u011d\u011e\7\61\2\2\u011e"+
		"D\3\2\2\2\u011f\u0120\7,\2\2\u0120F\3\2\2\2\u0121\u0122\7\u0080\2\2\u0122"+
		"H\3\2\2\2\u0123\u0124\t\7\2\2\u0124\u0125\3\2\2\2\u0125\u0126\b%\2\2\u0126"+
		"J\3\2\2\2\u0127\u0129\7\17\2\2\u0128\u0127\3\2\2\2\u0128\u0129\3\2\2\2"+
		"\u0129\u012a\3\2\2\2\u012a\u012d\7\f\2\2\u012b\u012d\7\17\2\2\u012c\u0128"+
		"\3\2\2\2\u012c\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\b&\2\2\u012f"+
		"L\3\2\2\2\u0130\u0131\7*\2\2\u0131\u0132\7,\2\2\u0132\u0137\3\2\2\2\u0133"+
		"\u0136\5M\'\2\u0134\u0136\13\2\2\2\u0135\u0133\3\2\2\2\u0135\u0134\3\2"+
		"\2\2\u0136\u0139\3\2\2\2\u0137\u0138\3\2\2\2\u0137\u0135\3\2\2\2\u0138"+
		"\u013a\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u013b\7,\2\2\u013b\u013c\7+\2"+
		"\2\u013c\u013d\3\2\2\2\u013d\u013e\b\'\2\2\u013eN\3\2\2\2\u013f\u0140"+
		"\7/\2\2\u0140\u0141\7/\2\2\u0141\u0145\3\2\2\2\u0142\u0144\n\b\2\2\u0143"+
		"\u0142\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2"+
		"\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0148\u014a\7\f\2\2\u0149"+
		"\u0148\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014c\b("+
		"\2\2\u014cP\3\2\2\2\u014d\u014e\7}\2\2\u014eR\3\2\2\2\u014f\u0150\7\177"+
		"\2\2\u0150T\3\2\2\2\u0151\u0152\7*\2\2\u0152V\3\2\2\2\u0153\u0154\7+\2"+
		"\2\u0154X\3\2\2\2\u0155\u0156\7]\2\2\u0156Z\3\2\2\2\u0157\u0158\7_\2\2"+
		"\u0158\\\3\2\2\2\u0159\u015a\7=\2\2\u015a^\3\2\2\2\u015b\u015c\7<\2\2"+
		"\u015c`\3\2\2\2\u015d\u015e\7.\2\2\u015eb\3\2\2\2\u015f\u0160\7\60\2\2"+
		"\u0160d\3\2\2\2\u0161\u0162\7B\2\2\u0162f\3\2\2\2\u0163\u0164\13\2\2\2"+
		"\u0164h\3\2\2\2\u0165\u0166\t\t\2\2\u0166j\3\2\2\2\u0167\u0168\t\n\2\2"+
		"\u0168l\3\2\2\2\u0169\u016a\t\13\2\2\u016an\3\2\2\2\u016b\u016c\t\f\2"+
		"\2\u016cp\3\2\2\2\u016d\u016e\t\r\2\2\u016er\3\2\2\2\u016f\u0170\t\16"+
		"\2\2\u0170t\3\2\2\2\u0171\u0172\t\17\2\2\u0172v\3\2\2\2\u0173\u0174\t"+
		"\20\2\2\u0174x\3\2\2\2\u0175\u0176\t\21\2\2\u0176z\3\2\2\2\u0177\u0178"+
		"\t\22\2\2\u0178|\3\2\2\2\u0179\u017a\t\23\2\2\u017a~\3\2\2\2\u017b\u017c"+
		"\t\24\2\2\u017c\u0080\3\2\2\2\u017d\u017e\t\25\2\2\u017e\u0082\3\2\2\2"+
		"\u017f\u0180\t\26\2\2\u0180\u0084\3\2\2\2\u0181\u0182\t\27\2\2\u0182\u0086"+
		"\3\2\2\2\u0183\u0184\t\30\2\2\u0184\u0088\3\2\2\2\u0185\u0186\t\31\2\2"+
		"\u0186\u008a\3\2\2\2\17\2\u008d\u0091\u00f3\u00f9\u0102\u0109\u0128\u012c"+
		"\u0135\u0137\u0145\u0149\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from /home/joao/unit/compiladores/AnalisadorLexico/src/antlr4Grammar/LabeledExpr.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LabeledExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, INTEGER=2, BOOLEAN=3, STRING=4, BEGIN=5, END=6, WHILE=7, IF=8, 
		THEN=9, ELSE=10, DO=11, READ=12, VAR=13, FALSE=14, TRUE=15, WRITE=16, 
		IDENTIFIER=17, CTE=18, CADEIA=19, OPAD=20, OPMULT=21, OPLOG=22, OPNEG=23, 
		OPREL=24, PVIG=25, PONTO=26, DPONTOS=27, VIG=28, ABPAR=29, FPAR=30, ATRIB=31, 
		WS=32;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PROGRAM", "INTEGER", "BOOLEAN", "STRING", "BEGIN", "END", "WHILE", "IF", 
			"THEN", "ELSE", "DO", "READ", "VAR", "FALSE", "TRUE", "WRITE", "IDENTIFIER", 
			"CTE", "CADEIA", "OPAD", "OPMULT", "OPLOG", "OPNEG", "OPREL", "PVIG", 
			"PONTO", "DPONTOS", "VIG", "ABPAR", "FPAR", "ATRIB", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'PROGRAM'", "'INTEGER'", "'BOOLEAN'", "'STRING'", "'BEGIN'", "'END'", 
			"'WHILE'", "'IF'", "'THEN'", "'ELSE'", "'DO'", "'READ'", "'VAR'", "'FALSE'", 
			"'TRUE'", "'WRITE'", null, null, null, null, null, null, "'~'", null, 
			"';'", "'.'", "':'", "','", "'('", "')'", "':='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAM", "INTEGER", "BOOLEAN", "STRING", "BEGIN", "END", "WHILE", 
			"IF", "THEN", "ELSE", "DO", "READ", "VAR", "FALSE", "TRUE", "WRITE", 
			"IDENTIFIER", "CTE", "CADEIA", "OPAD", "OPMULT", "OPLOG", "OPNEG", "OPREL", 
			"PVIG", "PONTO", "DPONTOS", "VIG", "ABPAR", "FPAR", "ATRIB", "WS"
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


	public LabeledExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LabeledExpr.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\"\u00e7\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\7\22\u009f\n\22\f\22"+
		"\16\22\u00a2\13\22\3\23\6\23\u00a5\n\23\r\23\16\23\u00a6\3\23\3\23\6\23"+
		"\u00ab\n\23\r\23\16\23\u00ac\5\23\u00af\n\23\3\24\3\24\6\24\u00b3\n\24"+
		"\r\24\16\24\u00b4\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3"+
		"\27\5\27\u00c2\n\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\5\31\u00d0\n\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36"+
		"\3\36\3\37\3\37\3 \3 \3 \3!\6!\u00e2\n!\r!\16!\u00e3\3!\3!\2\2\"\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"\3\2\b\4\2C\\c|\5\2\62;C\\c|\7\2\"\"/<C\\aac|\4\2--//\4\2,,\61\61\5"+
		"\2\13\f\17\17\"\"\2\u00f2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\3C\3\2"+
		"\2\2\5K\3\2\2\2\7S\3\2\2\2\t[\3\2\2\2\13b\3\2\2\2\rh\3\2\2\2\17l\3\2\2"+
		"\2\21r\3\2\2\2\23u\3\2\2\2\25z\3\2\2\2\27\177\3\2\2\2\31\u0082\3\2\2\2"+
		"\33\u0087\3\2\2\2\35\u008b\3\2\2\2\37\u0091\3\2\2\2!\u0096\3\2\2\2#\u009c"+
		"\3\2\2\2%\u00ae\3\2\2\2\'\u00b0\3\2\2\2)\u00b8\3\2\2\2+\u00ba\3\2\2\2"+
		"-\u00c1\3\2\2\2/\u00c3\3\2\2\2\61\u00cf\3\2\2\2\63\u00d1\3\2\2\2\65\u00d3"+
		"\3\2\2\2\67\u00d5\3\2\2\29\u00d7\3\2\2\2;\u00d9\3\2\2\2=\u00db\3\2\2\2"+
		"?\u00dd\3\2\2\2A\u00e1\3\2\2\2CD\7R\2\2DE\7T\2\2EF\7Q\2\2FG\7I\2\2GH\7"+
		"T\2\2HI\7C\2\2IJ\7O\2\2J\4\3\2\2\2KL\7K\2\2LM\7P\2\2MN\7V\2\2NO\7G\2\2"+
		"OP\7I\2\2PQ\7G\2\2QR\7T\2\2R\6\3\2\2\2ST\7D\2\2TU\7Q\2\2UV\7Q\2\2VW\7"+
		"N\2\2WX\7G\2\2XY\7C\2\2YZ\7P\2\2Z\b\3\2\2\2[\\\7U\2\2\\]\7V\2\2]^\7T\2"+
		"\2^_\7K\2\2_`\7P\2\2`a\7I\2\2a\n\3\2\2\2bc\7D\2\2cd\7G\2\2de\7I\2\2ef"+
		"\7K\2\2fg\7P\2\2g\f\3\2\2\2hi\7G\2\2ij\7P\2\2jk\7F\2\2k\16\3\2\2\2lm\7"+
		"Y\2\2mn\7J\2\2no\7K\2\2op\7N\2\2pq\7G\2\2q\20\3\2\2\2rs\7K\2\2st\7H\2"+
		"\2t\22\3\2\2\2uv\7V\2\2vw\7J\2\2wx\7G\2\2xy\7P\2\2y\24\3\2\2\2z{\7G\2"+
		"\2{|\7N\2\2|}\7U\2\2}~\7G\2\2~\26\3\2\2\2\177\u0080\7F\2\2\u0080\u0081"+
		"\7Q\2\2\u0081\30\3\2\2\2\u0082\u0083\7T\2\2\u0083\u0084\7G\2\2\u0084\u0085"+
		"\7C\2\2\u0085\u0086\7F\2\2\u0086\32\3\2\2\2\u0087\u0088\7X\2\2\u0088\u0089"+
		"\7C\2\2\u0089\u008a\7T\2\2\u008a\34\3\2\2\2\u008b\u008c\7H\2\2\u008c\u008d"+
		"\7C\2\2\u008d\u008e\7N\2\2\u008e\u008f\7U\2\2\u008f\u0090\7G\2\2\u0090"+
		"\36\3\2\2\2\u0091\u0092\7V\2\2\u0092\u0093\7T\2\2\u0093\u0094\7W\2\2\u0094"+
		"\u0095\7G\2\2\u0095 \3\2\2\2\u0096\u0097\7Y\2\2\u0097\u0098\7T\2\2\u0098"+
		"\u0099\7K\2\2\u0099\u009a\7V\2\2\u009a\u009b\7G\2\2\u009b\"\3\2\2\2\u009c"+
		"\u00a0\t\2\2\2\u009d\u009f\t\3\2\2\u009e\u009d\3\2\2\2\u009f\u00a2\3\2"+
		"\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1$\3\2\2\2\u00a2\u00a0"+
		"\3\2\2\2\u00a3\u00a5\4\62;\2\u00a4\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00af\3\2\2\2\u00a8\u00aa\7/"+
		"\2\2\u00a9\u00ab\4\62;\2\u00aa\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae\u00a4\3\2"+
		"\2\2\u00ae\u00a8\3\2\2\2\u00af&\3\2\2\2\u00b0\u00b2\7$\2\2\u00b1\u00b3"+
		"\t\4\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\7$\2\2\u00b7(\3\2\2\2\u00b8"+
		"\u00b9\t\5\2\2\u00b9*\3\2\2\2\u00ba\u00bb\t\6\2\2\u00bb,\3\2\2\2\u00bc"+
		"\u00bd\7Q\2\2\u00bd\u00c2\7T\2\2\u00be\u00bf\7C\2\2\u00bf\u00c0\7P\2\2"+
		"\u00c0\u00c2\7F\2\2\u00c1\u00bc\3\2\2\2\u00c1\u00be\3\2\2\2\u00c2.\3\2"+
		"\2\2\u00c3\u00c4\7\u0080\2\2\u00c4\60\3\2\2\2\u00c5\u00d0\7>\2\2\u00c6"+
		"\u00c7\7>\2\2\u00c7\u00d0\7?\2\2\u00c8\u00d0\7@\2\2\u00c9\u00ca\7@\2\2"+
		"\u00ca\u00d0\7?\2\2\u00cb\u00cc\7?\2\2\u00cc\u00d0\7?\2\2\u00cd\u00ce"+
		"\7>\2\2\u00ce\u00d0\7@\2\2\u00cf\u00c5\3\2\2\2\u00cf\u00c6\3\2\2\2\u00cf"+
		"\u00c8\3\2\2\2\u00cf\u00c9\3\2\2\2\u00cf\u00cb\3\2\2\2\u00cf\u00cd\3\2"+
		"\2\2\u00d0\62\3\2\2\2\u00d1\u00d2\7=\2\2\u00d2\64\3\2\2\2\u00d3\u00d4"+
		"\7\60\2\2\u00d4\66\3\2\2\2\u00d5\u00d6\7<\2\2\u00d68\3\2\2\2\u00d7\u00d8"+
		"\7.\2\2\u00d8:\3\2\2\2\u00d9\u00da\7*\2\2\u00da<\3\2\2\2\u00db\u00dc\7"+
		"+\2\2\u00dc>\3\2\2\2\u00dd\u00de\7<\2\2\u00de\u00df\7?\2\2\u00df@\3\2"+
		"\2\2\u00e0\u00e2\t\7\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3"+
		"\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\b!"+
		"\2\2\u00e6B\3\2\2\2\13\2\u00a0\u00a6\u00ac\u00ae\u00b4\u00c1\u00cf\u00e3"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
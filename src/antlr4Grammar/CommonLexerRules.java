// Generated from CommonLexerRules.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CommonLexerRules extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, INTEGER=2, BOOLEAN=3, BEGIN=4, END=5, WHILE=6, IF=7, THEN=8, 
		ELSE=9, DO=10, READ=11, VAR=12, FALSE=13, TRUE=14, WRITE=15, IDENTIFIER=16, 
		CTE=17, STRING=18, OPAD=19, OPMULT=20, OPLOG=21, OPNEG=22, OPREL=23, PVIG=24, 
		PONTO=25, DPONTOS=26, VIG=27, ABPAR=28, FPAR=29, ATRIB=30, WS=31;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PROGRAM", "INTEGER", "BOOLEAN", "BEGIN", "END", "WHILE", "IF", "THEN", 
			"ELSE", "DO", "READ", "VAR", "FALSE", "TRUE", "WRITE", "IDENTIFIER", 
			"CTE", "STRING", "OPAD", "OPMULT", "OPLOG", "OPNEG", "OPREL", "PVIG", 
			"PONTO", "DPONTOS", "VIG", "ABPAR", "FPAR", "ATRIB", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'PROGRAM'", "'INTEGER'", "'BOOLEAN'", "'BEGIN'", "'END'", "'WHILE'", 
			"'IF'", "'THEN'", "'ELSE'", "'DO'", "'READ'", "'VAR'", "'FALSE'", "'TRUE'", 
			"'WRITE'", null, null, null, null, null, null, "'~'", null, "';'", "'.'", 
			"':'", "','", "'('", "')'", "':='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAM", "INTEGER", "BOOLEAN", "BEGIN", "END", "WHILE", "IF", 
			"THEN", "ELSE", "DO", "READ", "VAR", "FALSE", "TRUE", "WRITE", "IDENTIFIER", 
			"CTE", "STRING", "OPAD", "OPMULT", "OPLOG", "OPNEG", "OPREL", "PVIG", 
			"PONTO", "DPONTOS", "VIG", "ABPAR", "FPAR", "ATRIB", "WS"
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


	public CommonLexerRules(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CommonLexerRules.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u00dd\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\7\21\u0096\n\21\f\21\16\21\u0099\13\21\3\22\6\22\u009c\n\22\r\22"+
		"\16\22\u009d\3\22\3\22\6\22\u00a2\n\22\r\22\16\22\u00a3\3\23\3\23\7\23"+
		"\u00a8\n\23\f\23\16\23\u00ab\13\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\5\26\u00b8\n\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\5\30\u00c6\n\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \6 \u00d8\n \r \16 \u00d9"+
		"\3 \3 \3\u009d\2!\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!\3\2\b\4\2C\\c|\5\2\62;C\\c|\3\2\62;\4\2--//\4\2"+
		",,\61\61\5\2\13\f\17\17\"\"\2\u00e7\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\3A\3\2"+
		"\2\2\5I\3\2\2\2\7Q\3\2\2\2\tY\3\2\2\2\13_\3\2\2\2\rc\3\2\2\2\17i\3\2\2"+
		"\2\21l\3\2\2\2\23q\3\2\2\2\25v\3\2\2\2\27y\3\2\2\2\31~\3\2\2\2\33\u0082"+
		"\3\2\2\2\35\u0088\3\2\2\2\37\u008d\3\2\2\2!\u0093\3\2\2\2#\u009b\3\2\2"+
		"\2%\u00a5\3\2\2\2\'\u00ae\3\2\2\2)\u00b0\3\2\2\2+\u00b7\3\2\2\2-\u00b9"+
		"\3\2\2\2/\u00c5\3\2\2\2\61\u00c7\3\2\2\2\63\u00c9\3\2\2\2\65\u00cb\3\2"+
		"\2\2\67\u00cd\3\2\2\29\u00cf\3\2\2\2;\u00d1\3\2\2\2=\u00d3\3\2\2\2?\u00d7"+
		"\3\2\2\2AB\7R\2\2BC\7T\2\2CD\7Q\2\2DE\7I\2\2EF\7T\2\2FG\7C\2\2GH\7O\2"+
		"\2H\4\3\2\2\2IJ\7K\2\2JK\7P\2\2KL\7V\2\2LM\7G\2\2MN\7I\2\2NO\7G\2\2OP"+
		"\7T\2\2P\6\3\2\2\2QR\7D\2\2RS\7Q\2\2ST\7Q\2\2TU\7N\2\2UV\7G\2\2VW\7C\2"+
		"\2WX\7P\2\2X\b\3\2\2\2YZ\7D\2\2Z[\7G\2\2[\\\7I\2\2\\]\7K\2\2]^\7P\2\2"+
		"^\n\3\2\2\2_`\7G\2\2`a\7P\2\2ab\7F\2\2b\f\3\2\2\2cd\7Y\2\2de\7J\2\2ef"+
		"\7K\2\2fg\7N\2\2gh\7G\2\2h\16\3\2\2\2ij\7K\2\2jk\7H\2\2k\20\3\2\2\2lm"+
		"\7V\2\2mn\7J\2\2no\7G\2\2op\7P\2\2p\22\3\2\2\2qr\7G\2\2rs\7N\2\2st\7U"+
		"\2\2tu\7G\2\2u\24\3\2\2\2vw\7F\2\2wx\7Q\2\2x\26\3\2\2\2yz\7T\2\2z{\7G"+
		"\2\2{|\7C\2\2|}\7F\2\2}\30\3\2\2\2~\177\7X\2\2\177\u0080\7C\2\2\u0080"+
		"\u0081\7T\2\2\u0081\32\3\2\2\2\u0082\u0083\7H\2\2\u0083\u0084\7C\2\2\u0084"+
		"\u0085\7N\2\2\u0085\u0086\7U\2\2\u0086\u0087\7G\2\2\u0087\34\3\2\2\2\u0088"+
		"\u0089\7V\2\2\u0089\u008a\7T\2\2\u008a\u008b\7W\2\2\u008b\u008c\7G\2\2"+
		"\u008c\36\3\2\2\2\u008d\u008e\7Y\2\2\u008e\u008f\7T\2\2\u008f\u0090\7"+
		"K\2\2\u0090\u0091\7V\2\2\u0091\u0092\7G\2\2\u0092 \3\2\2\2\u0093\u0097"+
		"\t\2\2\2\u0094\u0096\t\3\2\2\u0095\u0094\3\2\2\2\u0096\u0099\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\"\3\2\2\2\u0099\u0097\3\2\2\2"+
		"\u009a\u009c\t\4\2\2\u009b\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e"+
		"\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a1\7/\2\2\u00a0"+
		"\u00a2\t\4\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a1\3\2"+
		"\2\2\u00a3\u00a4\3\2\2\2\u00a4$\3\2\2\2\u00a5\u00a9\7$\2\2\u00a6\u00a8"+
		"\t\3\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad\7$"+
		"\2\2\u00ad&\3\2\2\2\u00ae\u00af\t\5\2\2\u00af(\3\2\2\2\u00b0\u00b1\t\6"+
		"\2\2\u00b1*\3\2\2\2\u00b2\u00b3\7Q\2\2\u00b3\u00b8\7T\2\2\u00b4\u00b5"+
		"\7C\2\2\u00b5\u00b6\7P\2\2\u00b6\u00b8\7F\2\2\u00b7\u00b2\3\2\2\2\u00b7"+
		"\u00b4\3\2\2\2\u00b8,\3\2\2\2\u00b9\u00ba\7\u0080\2\2\u00ba.\3\2\2\2\u00bb"+
		"\u00c6\7>\2\2\u00bc\u00bd\7>\2\2\u00bd\u00c6\7?\2\2\u00be\u00c6\7@\2\2"+
		"\u00bf\u00c0\7@\2\2\u00c0\u00c6\7?\2\2\u00c1\u00c2\7?\2\2\u00c2\u00c6"+
		"\7?\2\2\u00c3\u00c4\7>\2\2\u00c4\u00c6\7@\2\2\u00c5\u00bb\3\2\2\2\u00c5"+
		"\u00bc\3\2\2\2\u00c5\u00be\3\2\2\2\u00c5\u00bf\3\2\2\2\u00c5\u00c1\3\2"+
		"\2\2\u00c5\u00c3\3\2\2\2\u00c6\60\3\2\2\2\u00c7\u00c8\7=\2\2\u00c8\62"+
		"\3\2\2\2\u00c9\u00ca\7\60\2\2\u00ca\64\3\2\2\2\u00cb\u00cc\7<\2\2\u00cc"+
		"\66\3\2\2\2\u00cd\u00ce\7.\2\2\u00ce8\3\2\2\2\u00cf\u00d0\7*\2\2\u00d0"+
		":\3\2\2\2\u00d1\u00d2\7+\2\2\u00d2<\3\2\2\2\u00d3\u00d4\7<\2\2\u00d4\u00d5"+
		"\7?\2\2\u00d5>\3\2\2\2\u00d6\u00d8\t\7\2\2\u00d7\u00d6\3\2\2\2\u00d8\u00d9"+
		"\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\3\2\2\2\u00db"+
		"\u00dc\b \2\2\u00dc@\3\2\2\2\n\2\u0097\u009d\u00a3\u00a9\u00b7\u00c5\u00d9"+
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
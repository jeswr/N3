// Generated from n3.g4 by ANTLR 4.7.2

    package w3c.n3dev.parser.antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class n3Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, COMMENT=29, BooleanLiteral=30, 
		String=31, IRIREF=32, PNAME_NS=33, PNAME_LN=34, BLANK_NODE_LABEL=35, LANGTAG=36, 
		INTEGER=37, DECIMAL=38, DOUBLE=39, EXPONENT=40, STRING_LITERAL_LONG_SINGLE_QUOTE=41, 
		STRING_LITERAL_LONG_QUOTE=42, STRING_LITERAL_QUOTE=43, STRING_LITERAL_SINGLE_QUOTE=44, 
		UCHAR=45, ECHAR=46, WS=47, ANON=48, QuickVarName=49, PN_CHARS_U=50, PN_CHARS_BASE=51, 
		PN_CHARS=52, BASE=53, PREFIX=54, PN_PREFIX=55, PN_LOCAL=56, PLX=57, PERCENT=58, 
		HEX=59, PN_LOCAL_ESC=60;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "COMMENT", "BooleanLiteral", "String", "IRIREF", 
			"PNAME_NS", "PNAME_LN", "BLANK_NODE_LABEL", "LANGTAG", "INTEGER", "DECIMAL", 
			"DOUBLE", "EXPONENT", "STRING_LITERAL_LONG_SINGLE_QUOTE", "STRING_LITERAL_LONG_QUOTE", 
			"STRING_LITERAL_QUOTE", "STRING_LITERAL_SINGLE_QUOTE", "UCHAR", "ECHAR", 
			"WS", "ANON", "QuickVarName", "PN_CHARS_U", "PN_CHARS_BASE", "PN_CHARS", 
			"BASE", "PREFIX", "PN_PREFIX", "PN_LOCAL", "PLX", "PERCENT", "HEX", "PN_LOCAL_ESC"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'@prefix'", "'@base'", "';'", "','", "'a'", "'@a'", "'has'", 
			"'@has'", "'is'", "'of'", "'@is'", "'@of'", "'='", "'<='", "'=>'", "'<-'", 
			"'!'", "'^'", "'['", "']'", "'('", "')'", "'{'", "'}'", "'^^'", "'@forSome'", 
			"'@forAll'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "COMMENT", "BooleanLiteral", "String", 
			"IRIREF", "PNAME_NS", "PNAME_LN", "BLANK_NODE_LABEL", "LANGTAG", "INTEGER", 
			"DECIMAL", "DOUBLE", "EXPONENT", "STRING_LITERAL_LONG_SINGLE_QUOTE", 
			"STRING_LITERAL_LONG_QUOTE", "STRING_LITERAL_QUOTE", "STRING_LITERAL_SINGLE_QUOTE", 
			"UCHAR", "ECHAR", "WS", "ANON", "QuickVarName", "PN_CHARS_U", "PN_CHARS_BASE", 
			"PN_CHARS", "BASE", "PREFIX", "PN_PREFIX", "PN_LOCAL", "PLX", "PERCENT", 
			"HEX", "PN_LOCAL_ESC"
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


	public n3Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "n3.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2>\u0228\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3"+
		"\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\36\3\36\7\36\u00dd\n\36\f\36\16\36\u00e0\13\36\3\36\3"+
		"\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u00f8\n\37\3 \3 \3 \3 \5 \u00fe"+
		"\n \3!\3!\3!\7!\u0103\n!\f!\16!\u0106\13!\3!\3!\3\"\5\"\u010b\n\"\3\""+
		"\3\"\3#\3#\3#\3$\3$\3$\3$\3$\5$\u0117\n$\3$\3$\7$\u011b\n$\f$\16$\u011e"+
		"\13$\3$\5$\u0121\n$\3%\3%\6%\u0125\n%\r%\16%\u0126\3%\3%\6%\u012b\n%\r"+
		"%\16%\u012c\7%\u012f\n%\f%\16%\u0132\13%\3&\5&\u0135\n&\3&\6&\u0138\n"+
		"&\r&\16&\u0139\3\'\5\'\u013d\n\'\3\'\7\'\u0140\n\'\f\'\16\'\u0143\13\'"+
		"\3\'\3\'\6\'\u0147\n\'\r\'\16\'\u0148\3(\5(\u014c\n(\3(\6(\u014f\n(\r"+
		"(\16(\u0150\3(\3(\7(\u0155\n(\f(\16(\u0158\13(\3(\3(\3(\6(\u015d\n(\r"+
		"(\16(\u015e\3(\3(\6(\u0163\n(\r(\16(\u0164\3(\5(\u0168\n(\3)\3)\5)\u016c"+
		"\n)\3)\6)\u016f\n)\r)\16)\u0170\3*\3*\3*\3*\3*\3*\3*\5*\u017a\n*\3*\3"+
		"*\3*\5*\u017f\n*\7*\u0181\n*\f*\16*\u0184\13*\3*\3*\3*\3*\3+\3+\3+\3+"+
		"\3+\3+\3+\5+\u0191\n+\3+\3+\3+\5+\u0196\n+\7+\u0198\n+\f+\16+\u019b\13"+
		"+\3+\3+\3+\3+\3,\3,\3,\3,\7,\u01a5\n,\f,\16,\u01a8\13,\3,\3,\3-\3-\3-"+
		"\3-\7-\u01b0\n-\f-\16-\u01b3\13-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3"+
		".\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u01cb\n.\3/\3/\3/\3\60\3\60\3\60\3\60"+
		"\3\61\3\61\7\61\u01d6\n\61\f\61\16\61\u01d9\13\61\3\61\3\61\3\62\3\62"+
		"\3\62\7\62\u01e0\n\62\f\62\16\62\u01e3\13\62\3\63\3\63\5\63\u01e7\n\63"+
		"\3\64\5\64\u01ea\n\64\3\65\3\65\5\65\u01ee\n\65\3\66\3\66\3\66\3\66\3"+
		"\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\78\u01ff\n8\f8\168\u0202"+
		"\138\38\58\u0205\n8\39\39\39\59\u020a\n9\39\39\39\79\u020f\n9\f9\169\u0212"+
		"\139\39\39\39\59\u0217\n9\59\u0219\n9\3:\3:\5:\u021d\n:\3;\3;\3;\3;\3"+
		"<\5<\u0224\n<\3=\3=\3=\2\2>\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a"+
		"\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>\3\2\34\4\2\f\f\16\17\n\2\2\"$$>"+
		">@@^^``bb}\177\3\2\62;\4\2C\\c|\5\2\62;C\\c|\4\2--//\4\2GGgg\4\2))^^\4"+
		"\2$$^^\6\2\f\f\17\17$$^^\6\2\f\f\17\17))^^\n\2$$))^^ddhhppttvv\5\2\13"+
		"\f\17\17\"\"\17\2C\\c|\u00c2\u00d8\u00da\u00f8\u00fa\u0301\u0372\u037f"+
		"\u0381\u2001\u200e\u200f\u2072\u2191\u2c02\u2ff1\u3003\ud801\uf902\ufdd1"+
		"\ufdf2\uffff\7\2//\62;\u00b9\u00b9\u0302\u0371\u2041\u2042\4\2DDdd\4\2"+
		"CCcc\4\2UUuu\4\2RRrr\4\2TTtt\4\2HHhh\4\2KKkk\4\2ZZzz\4\2\60\60<<\5\2\62"+
		";CHch\t\2##%\61==??ABaa\u0080\u0080\2\u0267\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3"+
		"\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2"+
		"\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2"+
		"s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\3{\3\2\2\2\5}\3\2\2\2\7\u0085"+
		"\3\2\2\2\t\u008b\3\2\2\2\13\u008d\3\2\2\2\r\u008f\3\2\2\2\17\u0091\3\2"+
		"\2\2\21\u0094\3\2\2\2\23\u0098\3\2\2\2\25\u009d\3\2\2\2\27\u00a0\3\2\2"+
		"\2\31\u00a3\3\2\2\2\33\u00a7\3\2\2\2\35\u00ab\3\2\2\2\37\u00ad\3\2\2\2"+
		"!\u00b0\3\2\2\2#\u00b3\3\2\2\2%\u00b6\3\2\2\2\'\u00b8\3\2\2\2)\u00ba\3"+
		"\2\2\2+\u00bc\3\2\2\2-\u00be\3\2\2\2/\u00c0\3\2\2\2\61\u00c2\3\2\2\2\63"+
		"\u00c4\3\2\2\2\65\u00c6\3\2\2\2\67\u00c9\3\2\2\29\u00d2\3\2\2\2;\u00da"+
		"\3\2\2\2=\u00f7\3\2\2\2?\u00fd\3\2\2\2A\u00ff\3\2\2\2C\u010a\3\2\2\2E"+
		"\u010e\3\2\2\2G\u0111\3\2\2\2I\u0122\3\2\2\2K\u0134\3\2\2\2M\u013c\3\2"+
		"\2\2O\u014b\3\2\2\2Q\u0169\3\2\2\2S\u0172\3\2\2\2U\u0189\3\2\2\2W\u01a0"+
		"\3\2\2\2Y\u01ab\3\2\2\2[\u01ca\3\2\2\2]\u01cc\3\2\2\2_\u01cf\3\2\2\2a"+
		"\u01d3\3\2\2\2c\u01dc\3\2\2\2e\u01e6\3\2\2\2g\u01e9\3\2\2\2i\u01ed\3\2"+
		"\2\2k\u01ef\3\2\2\2m\u01f4\3\2\2\2o\u01fb\3\2\2\2q\u0209\3\2\2\2s\u021c"+
		"\3\2\2\2u\u021e\3\2\2\2w\u0223\3\2\2\2y\u0225\3\2\2\2{|\7\60\2\2|\4\3"+
		"\2\2\2}~\7B\2\2~\177\7r\2\2\177\u0080\7t\2\2\u0080\u0081\7g\2\2\u0081"+
		"\u0082\7h\2\2\u0082\u0083\7k\2\2\u0083\u0084\7z\2\2\u0084\6\3\2\2\2\u0085"+
		"\u0086\7B\2\2\u0086\u0087\7d\2\2\u0087\u0088\7c\2\2\u0088\u0089\7u\2\2"+
		"\u0089\u008a\7g\2\2\u008a\b\3\2\2\2\u008b\u008c\7=\2\2\u008c\n\3\2\2\2"+
		"\u008d\u008e\7.\2\2\u008e\f\3\2\2\2\u008f\u0090\7c\2\2\u0090\16\3\2\2"+
		"\2\u0091\u0092\7B\2\2\u0092\u0093\7c\2\2\u0093\20\3\2\2\2\u0094\u0095"+
		"\7j\2\2\u0095\u0096\7c\2\2\u0096\u0097\7u\2\2\u0097\22\3\2\2\2\u0098\u0099"+
		"\7B\2\2\u0099\u009a\7j\2\2\u009a\u009b\7c\2\2\u009b\u009c\7u\2\2\u009c"+
		"\24\3\2\2\2\u009d\u009e\7k\2\2\u009e\u009f\7u\2\2\u009f\26\3\2\2\2\u00a0"+
		"\u00a1\7q\2\2\u00a1\u00a2\7h\2\2\u00a2\30\3\2\2\2\u00a3\u00a4\7B\2\2\u00a4"+
		"\u00a5\7k\2\2\u00a5\u00a6\7u\2\2\u00a6\32\3\2\2\2\u00a7\u00a8\7B\2\2\u00a8"+
		"\u00a9\7q\2\2\u00a9\u00aa\7h\2\2\u00aa\34\3\2\2\2\u00ab\u00ac\7?\2\2\u00ac"+
		"\36\3\2\2\2\u00ad\u00ae\7>\2\2\u00ae\u00af\7?\2\2\u00af \3\2\2\2\u00b0"+
		"\u00b1\7?\2\2\u00b1\u00b2\7@\2\2\u00b2\"\3\2\2\2\u00b3\u00b4\7>\2\2\u00b4"+
		"\u00b5\7/\2\2\u00b5$\3\2\2\2\u00b6\u00b7\7#\2\2\u00b7&\3\2\2\2\u00b8\u00b9"+
		"\7`\2\2\u00b9(\3\2\2\2\u00ba\u00bb\7]\2\2\u00bb*\3\2\2\2\u00bc\u00bd\7"+
		"_\2\2\u00bd,\3\2\2\2\u00be\u00bf\7*\2\2\u00bf.\3\2\2\2\u00c0\u00c1\7+"+
		"\2\2\u00c1\60\3\2\2\2\u00c2\u00c3\7}\2\2\u00c3\62\3\2\2\2\u00c4\u00c5"+
		"\7\177\2\2\u00c5\64\3\2\2\2\u00c6\u00c7\7`\2\2\u00c7\u00c8\7`\2\2\u00c8"+
		"\66\3\2\2\2\u00c9\u00ca\7B\2\2\u00ca\u00cb\7h\2\2\u00cb\u00cc\7q\2\2\u00cc"+
		"\u00cd\7t\2\2\u00cd\u00ce\7U\2\2\u00ce\u00cf\7q\2\2\u00cf\u00d0\7o\2\2"+
		"\u00d0\u00d1\7g\2\2\u00d18\3\2\2\2\u00d2\u00d3\7B\2\2\u00d3\u00d4\7h\2"+
		"\2\u00d4\u00d5\7q\2\2\u00d5\u00d6\7t\2\2\u00d6\u00d7\7C\2\2\u00d7\u00d8"+
		"\7n\2\2\u00d8\u00d9\7n\2\2\u00d9:\3\2\2\2\u00da\u00de\7%\2\2\u00db\u00dd"+
		"\n\2\2\2\u00dc\u00db\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de"+
		"\u00df\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e2\b\36"+
		"\2\2\u00e2<\3\2\2\2\u00e3\u00e4\7v\2\2\u00e4\u00e5\7t\2\2\u00e5\u00e6"+
		"\7w\2\2\u00e6\u00f8\7g\2\2\u00e7\u00e8\7h\2\2\u00e8\u00e9\7c\2\2\u00e9"+
		"\u00ea\7n\2\2\u00ea\u00eb\7u\2\2\u00eb\u00f8\7g\2\2\u00ec\u00ed\7B\2\2"+
		"\u00ed\u00ee\7v\2\2\u00ee\u00ef\7t\2\2\u00ef\u00f0\7w\2\2\u00f0\u00f8"+
		"\7g\2\2\u00f1\u00f2\7B\2\2\u00f2\u00f3\7h\2\2\u00f3\u00f4\7c\2\2\u00f4"+
		"\u00f5\7n\2\2\u00f5\u00f6\7u\2\2\u00f6\u00f8\7g\2\2\u00f7\u00e3\3\2\2"+
		"\2\u00f7\u00e7\3\2\2\2\u00f7\u00ec\3\2\2\2\u00f7\u00f1\3\2\2\2\u00f8>"+
		"\3\2\2\2\u00f9\u00fe\5W,\2\u00fa\u00fe\5Y-\2\u00fb\u00fe\5S*\2\u00fc\u00fe"+
		"\5U+\2\u00fd\u00f9\3\2\2\2\u00fd\u00fa\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd"+
		"\u00fc\3\2\2\2\u00fe@\3\2\2\2\u00ff\u0104\7>\2\2\u0100\u0103\n\3\2\2\u0101"+
		"\u0103\5[.\2\u0102\u0100\3\2\2\2\u0102\u0101\3\2\2\2\u0103\u0106\3\2\2"+
		"\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0107\3\2\2\2\u0106\u0104"+
		"\3\2\2\2\u0107\u0108\7@\2\2\u0108B\3\2\2\2\u0109\u010b\5o8\2\u010a\u0109"+
		"\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\7<\2\2\u010d"+
		"D\3\2\2\2\u010e\u010f\5C\"\2\u010f\u0110\5q9\2\u0110F\3\2\2\2\u0111\u0112"+
		"\7a\2\2\u0112\u0113\7<\2\2\u0113\u0116\3\2\2\2\u0114\u0117\5e\63\2\u0115"+
		"\u0117\t\4\2\2\u0116\u0114\3\2\2\2\u0116\u0115\3\2\2\2\u0117\u0120\3\2"+
		"\2\2\u0118\u011b\5i\65\2\u0119\u011b\7\60\2\2\u011a\u0118\3\2\2\2\u011a"+
		"\u0119\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2"+
		"\2\2\u011d\u011f\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0121\5i\65\2\u0120"+
		"\u011c\3\2\2\2\u0120\u0121\3\2\2\2\u0121H\3\2\2\2\u0122\u0124\7B\2\2\u0123"+
		"\u0125\t\5\2\2\u0124\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0124\3\2"+
		"\2\2\u0126\u0127\3\2\2\2\u0127\u0130\3\2\2\2\u0128\u012a\7/\2\2\u0129"+
		"\u012b\t\6\2\2\u012a\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012a\3\2"+
		"\2\2\u012c\u012d\3\2\2\2\u012d\u012f\3\2\2\2\u012e\u0128\3\2\2\2\u012f"+
		"\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131J\3\2\2\2"+
		"\u0132\u0130\3\2\2\2\u0133\u0135\t\7\2\2\u0134\u0133\3\2\2\2\u0134\u0135"+
		"\3\2\2\2\u0135\u0137\3\2\2\2\u0136\u0138\t\4\2\2\u0137\u0136\3\2\2\2\u0138"+
		"\u0139\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013aL\3\2\2\2"+
		"\u013b\u013d\t\7\2\2\u013c\u013b\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u0141"+
		"\3\2\2\2\u013e\u0140\t\4\2\2\u013f\u013e\3\2\2\2\u0140\u0143\3\2\2\2\u0141"+
		"\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0144\3\2\2\2\u0143\u0141\3\2"+
		"\2\2\u0144\u0146\7\60\2\2\u0145\u0147\t\4\2\2\u0146\u0145\3\2\2\2\u0147"+
		"\u0148\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149N\3\2\2\2"+
		"\u014a\u014c\t\7\2\2\u014b\u014a\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u0167"+
		"\3\2\2\2\u014d\u014f\t\4\2\2\u014e\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150"+
		"\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0156\7\60"+
		"\2\2\u0153\u0155\t\4\2\2\u0154\u0153\3\2\2\2\u0155\u0158\3\2\2\2\u0156"+
		"\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0159\3\2\2\2\u0158\u0156\3\2"+
		"\2\2\u0159\u0168\5Q)\2\u015a\u015c\7\60\2\2\u015b\u015d\t\4\2\2\u015c"+
		"\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2"+
		"\2\2\u015f\u0160\3\2\2\2\u0160\u0168\5Q)\2\u0161\u0163\t\4\2\2\u0162\u0161"+
		"\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165"+
		"\u0166\3\2\2\2\u0166\u0168\5Q)\2\u0167\u014e\3\2\2\2\u0167\u015a\3\2\2"+
		"\2\u0167\u0162\3\2\2\2\u0168P\3\2\2\2\u0169\u016b\t\b\2\2\u016a\u016c"+
		"\t\7\2\2\u016b\u016a\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016e\3\2\2\2\u016d"+
		"\u016f\t\4\2\2\u016e\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u016e\3\2"+
		"\2\2\u0170\u0171\3\2\2\2\u0171R\3\2\2\2\u0172\u0173\7)\2\2\u0173\u0174"+
		"\7)\2\2\u0174\u0175\7)\2\2\u0175\u0182\3\2\2\2\u0176\u017a\7)\2\2\u0177"+
		"\u0178\7)\2\2\u0178\u017a\7)\2\2\u0179\u0176\3\2\2\2\u0179\u0177\3\2\2"+
		"\2\u0179\u017a\3\2\2\2\u017a\u017e\3\2\2\2\u017b\u017f\n\t\2\2\u017c\u017f"+
		"\5]/\2\u017d\u017f\5[.\2\u017e\u017b\3\2\2\2\u017e\u017c\3\2\2\2\u017e"+
		"\u017d\3\2\2\2\u017f\u0181\3\2\2\2\u0180\u0179\3\2\2\2\u0181\u0184\3\2"+
		"\2\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0185\3\2\2\2\u0184"+
		"\u0182\3\2\2\2\u0185\u0186\7)\2\2\u0186\u0187\7)\2\2\u0187\u0188\7)\2"+
		"\2\u0188T\3\2\2\2\u0189\u018a\7$\2\2\u018a\u018b\7$\2\2\u018b\u018c\7"+
		"$\2\2\u018c\u0199\3\2\2\2\u018d\u0191\7$\2\2\u018e\u018f\7$\2\2\u018f"+
		"\u0191\7$\2\2\u0190\u018d\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2"+
		"\2\2\u0191\u0195\3\2\2\2\u0192\u0196\n\n\2\2\u0193\u0196\5]/\2\u0194\u0196"+
		"\5[.\2\u0195\u0192\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0194\3\2\2\2\u0196"+
		"\u0198\3\2\2\2\u0197\u0190\3\2\2\2\u0198\u019b\3\2\2\2\u0199\u0197\3\2"+
		"\2\2\u0199\u019a\3\2\2\2\u019a\u019c\3\2\2\2\u019b\u0199\3\2\2\2\u019c"+
		"\u019d\7$\2\2\u019d\u019e\7$\2\2\u019e\u019f\7$\2\2\u019fV\3\2\2\2\u01a0"+
		"\u01a6\7$\2\2\u01a1\u01a5\n\13\2\2\u01a2\u01a5\5]/\2\u01a3\u01a5\5[.\2"+
		"\u01a4\u01a1\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a3\3\2\2\2\u01a5\u01a8"+
		"\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a9\3\2\2\2\u01a8"+
		"\u01a6\3\2\2\2\u01a9\u01aa\7$\2\2\u01aaX\3\2\2\2\u01ab\u01b1\7)\2\2\u01ac"+
		"\u01b0\n\f\2\2\u01ad\u01b0\5]/\2\u01ae\u01b0\5[.\2\u01af\u01ac\3\2\2\2"+
		"\u01af\u01ad\3\2\2\2\u01af\u01ae\3\2\2\2\u01b0\u01b3\3\2\2\2\u01b1\u01af"+
		"\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b4\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b4"+
		"\u01b5\7)\2\2\u01b5Z\3\2\2\2\u01b6\u01b7\7^\2\2\u01b7\u01b8\7w\2\2\u01b8"+
		"\u01b9\3\2\2\2\u01b9\u01ba\5w<\2\u01ba\u01bb\5w<\2\u01bb\u01bc\5w<\2\u01bc"+
		"\u01bd\5w<\2\u01bd\u01cb\3\2\2\2\u01be\u01bf\7^\2\2\u01bf\u01c0\7W\2\2"+
		"\u01c0\u01c1\3\2\2\2\u01c1\u01c2\5w<\2\u01c2\u01c3\5w<\2\u01c3\u01c4\5"+
		"w<\2\u01c4\u01c5\5w<\2\u01c5\u01c6\5w<\2\u01c6\u01c7\5w<\2\u01c7\u01c8"+
		"\5w<\2\u01c8\u01c9\5w<\2\u01c9\u01cb\3\2\2\2\u01ca\u01b6\3\2\2\2\u01ca"+
		"\u01be\3\2\2\2\u01cb\\\3\2\2\2\u01cc\u01cd\7^\2\2\u01cd\u01ce\t\r\2\2"+
		"\u01ce^\3\2\2\2\u01cf\u01d0\t\16\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d2\b"+
		"\60\2\2\u01d2`\3\2\2\2\u01d3\u01d7\7]\2\2\u01d4\u01d6\5_\60\2\u01d5\u01d4"+
		"\3\2\2\2\u01d6\u01d9\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8"+
		"\u01da\3\2\2\2\u01d9\u01d7\3\2\2\2\u01da\u01db\7_\2\2\u01dbb\3\2\2\2\u01dc"+
		"\u01dd\7A\2\2\u01dd\u01e1\5e\63\2\u01de\u01e0\5i\65\2\u01df\u01de\3\2"+
		"\2\2\u01e0\u01e3\3\2\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2"+
		"d\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e4\u01e7\5g\64\2\u01e5\u01e7\7a\2\2\u01e6"+
		"\u01e4\3\2\2\2\u01e6\u01e5\3\2\2\2\u01e7f\3\2\2\2\u01e8\u01ea\t\17\2\2"+
		"\u01e9\u01e8\3\2\2\2\u01eah\3\2\2\2\u01eb\u01ee\5e\63\2\u01ec\u01ee\t"+
		"\20\2\2\u01ed\u01eb\3\2\2\2\u01ed\u01ec\3\2\2\2\u01eej\3\2\2\2\u01ef\u01f0"+
		"\t\21\2\2\u01f0\u01f1\t\22\2\2\u01f1\u01f2\t\23\2\2\u01f2\u01f3\t\b\2"+
		"\2\u01f3l\3\2\2\2\u01f4\u01f5\t\24\2\2\u01f5\u01f6\t\25\2\2\u01f6\u01f7"+
		"\t\b\2\2\u01f7\u01f8\t\26\2\2\u01f8\u01f9\t\27\2\2\u01f9\u01fa\t\30\2"+
		"\2\u01fan\3\2\2\2\u01fb\u0204\5g\64\2\u01fc\u01ff\5i\65\2\u01fd\u01ff"+
		"\7\60\2\2\u01fe\u01fc\3\2\2\2\u01fe\u01fd\3\2\2\2\u01ff\u0202\3\2\2\2"+
		"\u0200\u01fe\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0203\3\2\2\2\u0202\u0200"+
		"\3\2\2\2\u0203\u0205\5i\65\2\u0204\u0200\3\2\2\2\u0204\u0205\3\2\2\2\u0205"+
		"p\3\2\2\2\u0206\u020a\5e\63\2\u0207\u020a\4\62<\2\u0208\u020a\5s:\2\u0209"+
		"\u0206\3\2\2\2\u0209\u0207\3\2\2\2\u0209\u0208\3\2\2\2\u020a\u0218\3\2"+
		"\2\2\u020b\u020f\5i\65\2\u020c\u020f\t\31\2\2\u020d\u020f\5s:\2\u020e"+
		"\u020b\3\2\2\2\u020e\u020c\3\2\2\2\u020e\u020d\3\2\2\2\u020f\u0212\3\2"+
		"\2\2\u0210\u020e\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0216\3\2\2\2\u0212"+
		"\u0210\3\2\2\2\u0213\u0217\5i\65\2\u0214\u0217\7<\2\2\u0215\u0217\5s:"+
		"\2\u0216\u0213\3\2\2\2\u0216\u0214\3\2\2\2\u0216\u0215\3\2\2\2\u0217\u0219"+
		"\3\2\2\2\u0218\u0210\3\2\2\2\u0218\u0219\3\2\2\2\u0219r\3\2\2\2\u021a"+
		"\u021d\5u;\2\u021b\u021d\5y=\2\u021c\u021a\3\2\2\2\u021c\u021b\3\2\2\2"+
		"\u021dt\3\2\2\2\u021e\u021f\7\'\2\2\u021f\u0220\5w<\2\u0220\u0221\5w<"+
		"\2\u0221v\3\2\2\2\u0222\u0224\t\32\2\2\u0223\u0222\3\2\2\2\u0224x\3\2"+
		"\2\2\u0225\u0226\7^\2\2\u0226\u0227\t\33\2\2\u0227z\3\2\2\2\67\2\u00de"+
		"\u00f7\u00fd\u0102\u0104\u010a\u0116\u011a\u011c\u0120\u0126\u012c\u0130"+
		"\u0134\u0139\u013c\u0141\u0148\u014b\u0150\u0156\u015e\u0164\u0167\u016b"+
		"\u0170\u0179\u017e\u0182\u0190\u0195\u0199\u01a4\u01a6\u01af\u01b1\u01ca"+
		"\u01d7\u01e1\u01e6\u01e9\u01ed\u01fe\u0200\u0204\u0209\u020e\u0210\u0216"+
		"\u0218\u021c\u0223\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
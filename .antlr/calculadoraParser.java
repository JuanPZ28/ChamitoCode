// Generated from c:/Users/juand/OneDrive/Escritorio/ChamitoCode/calculadora.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class calculadoraParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SI=1, O=2, MIENTRAS=3, POR=4, IGUAL=5, IGUAL_QUE=6, MAYOR_QUE=7, MENOR_QUE=8, 
		SUMA=9, RESTA=10, MULT=11, DIV=12, PYC=13, PAREN_IZQ=14, PAREN_DER=15, 
		LLAVE_IZQ=16, LLAVE_DER=17, ID=18, NUMERO=19, WS=20;
	public static final int
		RULE_archivo = 0, RULE_sentencia = 1, RULE_bucle_definido = 2, RULE_condicional = 3, 
		RULE_bucle_condicion = 4, RULE_asignacion = 5, RULE_expresion = 6, RULE_comparacion = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"archivo", "sentencia", "bucle_definido", "condicional", "bucle_condicion", 
			"asignacion", "expresion", "comparacion"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'si'", "'sino'", "'mientras'", "'por'", "'='", "'=='", "'>'", 
			"'<'", "'+'", "'-'", "'*'", "'/'", "';'", "'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SI", "O", "MIENTRAS", "POR", "IGUAL", "IGUAL_QUE", "MAYOR_QUE", 
			"MENOR_QUE", "SUMA", "RESTA", "MULT", "DIV", "PYC", "PAREN_IZQ", "PAREN_DER", 
			"LLAVE_IZQ", "LLAVE_DER", "ID", "NUMERO", "WS"
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
	public String getGrammarFileName() { return "calculadora.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public calculadoraParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArchivoContext extends ParserRuleContext {
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public ArchivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_archivo; }
	}

	public final ArchivoContext archivo() throws RecognitionException {
		ArchivoContext _localctx = new ArchivoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_archivo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(16);
				sentencia();
				}
				}
				setState(19); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 802842L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaContext extends ParserRuleContext {
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
	 
		public SentenciaContext() { }
		public void copyFrom(SentenciaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaCondicionalContext extends SentenciaContext {
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public SentenciaCondicionalContext(SentenciaContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaAsignacionContext extends SentenciaContext {
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public TerminalNode PYC() { return getToken(calculadoraParser.PYC, 0); }
		public SentenciaAsignacionContext(SentenciaContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaExpresionContext extends SentenciaContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PYC() { return getToken(calculadoraParser.PYC, 0); }
		public SentenciaExpresionContext(SentenciaContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaBucleDefinidoContext extends SentenciaContext {
		public Bucle_definidoContext bucle_definido() {
			return getRuleContext(Bucle_definidoContext.class,0);
		}
		public SentenciaBucleDefinidoContext(SentenciaContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaBucleCondicionContext extends SentenciaContext {
		public Bucle_condicionContext bucle_condicion() {
			return getRuleContext(Bucle_condicionContext.class,0);
		}
		public SentenciaBucleCondicionContext(SentenciaContext ctx) { copyFrom(ctx); }
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentencia);
		try {
			setState(30);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new SentenciaExpresionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(21);
				expresion(0);
				setState(22);
				match(PYC);
				}
				break;
			case 2:
				_localctx = new SentenciaCondicionalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(24);
				condicional();
				}
				break;
			case 3:
				_localctx = new SentenciaAsignacionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(25);
				asignacion();
				setState(26);
				match(PYC);
				}
				break;
			case 4:
				_localctx = new SentenciaBucleCondicionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(28);
				bucle_condicion();
				}
				break;
			case 5:
				_localctx = new SentenciaBucleDefinidoContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(29);
				bucle_definido();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Bucle_definidoContext extends ParserRuleContext {
		public TerminalNode POR() { return getToken(calculadoraParser.POR, 0); }
		public TerminalNode PAREN_IZQ() { return getToken(calculadoraParser.PAREN_IZQ, 0); }
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public List<TerminalNode> PYC() { return getTokens(calculadoraParser.PYC); }
		public TerminalNode PYC(int i) {
			return getToken(calculadoraParser.PYC, i);
		}
		public ComparacionContext comparacion() {
			return getRuleContext(ComparacionContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PAREN_DER() { return getToken(calculadoraParser.PAREN_DER, 0); }
		public TerminalNode LLAVE_IZQ() { return getToken(calculadoraParser.LLAVE_IZQ, 0); }
		public TerminalNode LLAVE_DER() { return getToken(calculadoraParser.LLAVE_DER, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public Bucle_definidoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucle_definido; }
	}

	public final Bucle_definidoContext bucle_definido() throws RecognitionException {
		Bucle_definidoContext _localctx = new Bucle_definidoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_bucle_definido);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(POR);
			setState(33);
			match(PAREN_IZQ);
			setState(34);
			asignacion();
			setState(35);
			match(PYC);
			setState(36);
			comparacion();
			setState(37);
			match(PYC);
			setState(38);
			expresion(0);
			setState(39);
			match(PAREN_DER);
			setState(40);
			match(LLAVE_IZQ);
			setState(42); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(41);
				sentencia();
				}
				}
				setState(44); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 802842L) != 0) );
			setState(46);
			match(LLAVE_DER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionalContext extends ParserRuleContext {
		public TerminalNode SI() { return getToken(calculadoraParser.SI, 0); }
		public TerminalNode PAREN_IZQ() { return getToken(calculadoraParser.PAREN_IZQ, 0); }
		public ComparacionContext comparacion() {
			return getRuleContext(ComparacionContext.class,0);
		}
		public TerminalNode PAREN_DER() { return getToken(calculadoraParser.PAREN_DER, 0); }
		public List<TerminalNode> LLAVE_IZQ() { return getTokens(calculadoraParser.LLAVE_IZQ); }
		public TerminalNode LLAVE_IZQ(int i) {
			return getToken(calculadoraParser.LLAVE_IZQ, i);
		}
		public List<TerminalNode> LLAVE_DER() { return getTokens(calculadoraParser.LLAVE_DER); }
		public TerminalNode LLAVE_DER(int i) {
			return getToken(calculadoraParser.LLAVE_DER, i);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public TerminalNode O() { return getToken(calculadoraParser.O, 0); }
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(SI);
			setState(49);
			match(PAREN_IZQ);
			setState(50);
			comparacion();
			setState(51);
			match(PAREN_DER);
			setState(52);
			match(LLAVE_IZQ);
			setState(54); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(53);
				sentencia();
				}
				}
				setState(56); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 802842L) != 0) );
			setState(58);
			match(LLAVE_DER);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==O) {
				{
				setState(59);
				match(O);
				setState(60);
				match(LLAVE_IZQ);
				setState(62); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(61);
					sentencia();
					}
					}
					setState(64); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 802842L) != 0) );
				setState(66);
				match(LLAVE_DER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Bucle_condicionContext extends ParserRuleContext {
		public TerminalNode MIENTRAS() { return getToken(calculadoraParser.MIENTRAS, 0); }
		public TerminalNode PAREN_IZQ() { return getToken(calculadoraParser.PAREN_IZQ, 0); }
		public ComparacionContext comparacion() {
			return getRuleContext(ComparacionContext.class,0);
		}
		public TerminalNode PAREN_DER() { return getToken(calculadoraParser.PAREN_DER, 0); }
		public TerminalNode LLAVE_IZQ() { return getToken(calculadoraParser.LLAVE_IZQ, 0); }
		public TerminalNode LLAVE_DER() { return getToken(calculadoraParser.LLAVE_DER, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public Bucle_condicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucle_condicion; }
	}

	public final Bucle_condicionContext bucle_condicion() throws RecognitionException {
		Bucle_condicionContext _localctx = new Bucle_condicionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_bucle_condicion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(MIENTRAS);
			setState(71);
			match(PAREN_IZQ);
			setState(72);
			comparacion();
			setState(73);
			match(PAREN_DER);
			setState(74);
			match(LLAVE_IZQ);
			setState(76); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(75);
				sentencia();
				}
				}
				setState(78); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 802842L) != 0) );
			setState(80);
			match(LLAVE_DER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(calculadoraParser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(calculadoraParser.IGUAL, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(ID);
			setState(83);
			match(IGUAL);
			setState(84);
			expresion(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionContext extends ParserRuleContext {
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
	 
		public ExpresionContext() { }
		public void copyFrom(ExpresionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumeroContext extends ExpresionContext {
		public TerminalNode NUMERO() { return getToken(calculadoraParser.NUMERO, 0); }
		public NumeroContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SumaContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode SUMA() { return getToken(calculadoraParser.SUMA, 0); }
		public SumaContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ExpresionContext {
		public TerminalNode ID() { return getToken(calculadoraParser.ID, 0); }
		public VariableContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParentesisContext extends ExpresionContext {
		public TerminalNode PAREN_IZQ() { return getToken(calculadoraParser.PAREN_IZQ, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PAREN_DER() { return getToken(calculadoraParser.PAREN_DER, 0); }
		public ParentesisContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivisionContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode DIV() { return getToken(calculadoraParser.DIV, 0); }
		public DivisionContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicacionContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode MULT() { return getToken(calculadoraParser.MULT, 0); }
		public MultiplicacionContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RestaContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode RESTA() { return getToken(calculadoraParser.RESTA, 0); }
		public RestaContext(ExpresionContext ctx) { copyFrom(ctx); }
	}

	public final ExpresionContext expresion() throws RecognitionException {
		return expresion(0);
	}

	private ExpresionContext expresion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpresionContext _localctx = new ExpresionContext(_ctx, _parentState);
		ExpresionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expresion, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
				{
				_localctx = new NumeroContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(87);
				match(NUMERO);
				}
				break;
			case ID:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(88);
				match(ID);
				}
				break;
			case PAREN_IZQ:
				{
				_localctx = new ParentesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(89);
				match(PAREN_IZQ);
				setState(90);
				expresion(0);
				setState(91);
				match(PAREN_DER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(109);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(107);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicacionContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(95);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(96);
						match(MULT);
						setState(97);
						expresion(8);
						}
						break;
					case 2:
						{
						_localctx = new DivisionContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(98);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(99);
						match(DIV);
						setState(100);
						expresion(7);
						}
						break;
					case 3:
						{
						_localctx = new SumaContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(101);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(102);
						match(SUMA);
						setState(103);
						expresion(6);
						}
						break;
					case 4:
						{
						_localctx = new RestaContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(104);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(105);
						match(RESTA);
						setState(106);
						expresion(5);
						}
						break;
					}
					} 
				}
				setState(111);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComparacionContext extends ParserRuleContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode IGUAL_QUE() { return getToken(calculadoraParser.IGUAL_QUE, 0); }
		public TerminalNode MAYOR_QUE() { return getToken(calculadoraParser.MAYOR_QUE, 0); }
		public TerminalNode MENOR_QUE() { return getToken(calculadoraParser.MENOR_QUE, 0); }
		public ComparacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparacion; }
	}

	public final ComparacionContext comparacion() throws RecognitionException {
		ComparacionContext _localctx = new ComparacionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_comparacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			expresion(0);
			setState(113);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 448L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(114);
			expresion(0);
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
		case 6:
			return expresion_sempred((ExpresionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expresion_sempred(ExpresionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0014u\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0004\u0000\u0012\b\u0000\u000b\u0000\f\u0000\u0013\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001\u001f\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0004\u0002+\b\u0002\u000b\u0002\f\u0002,\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0004\u00037\b\u0003\u000b\u0003\f\u00038\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0004\u0003?\b\u0003\u000b\u0003"+
		"\f\u0003@\u0001\u0003\u0001\u0003\u0003\u0003E\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004M\b"+
		"\u0004\u000b\u0004\f\u0004N\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006^\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006l\b\u0006\n\u0006\f\u0006o\t\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0000\u0001\f\b\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0000\u0001\u0001\u0000\u0006\b|\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0002\u001e\u0001\u0000\u0000\u0000\u0004 \u0001\u0000\u0000"+
		"\u0000\u00060\u0001\u0000\u0000\u0000\bF\u0001\u0000\u0000\u0000\nR\u0001"+
		"\u0000\u0000\u0000\f]\u0001\u0000\u0000\u0000\u000ep\u0001\u0000\u0000"+
		"\u0000\u0010\u0012\u0003\u0002\u0001\u0000\u0011\u0010\u0001\u0000\u0000"+
		"\u0000\u0012\u0013\u0001\u0000\u0000\u0000\u0013\u0011\u0001\u0000\u0000"+
		"\u0000\u0013\u0014\u0001\u0000\u0000\u0000\u0014\u0001\u0001\u0000\u0000"+
		"\u0000\u0015\u0016\u0003\f\u0006\u0000\u0016\u0017\u0005\r\u0000\u0000"+
		"\u0017\u001f\u0001\u0000\u0000\u0000\u0018\u001f\u0003\u0006\u0003\u0000"+
		"\u0019\u001a\u0003\n\u0005\u0000\u001a\u001b\u0005\r\u0000\u0000\u001b"+
		"\u001f\u0001\u0000\u0000\u0000\u001c\u001f\u0003\b\u0004\u0000\u001d\u001f"+
		"\u0003\u0004\u0002\u0000\u001e\u0015\u0001\u0000\u0000\u0000\u001e\u0018"+
		"\u0001\u0000\u0000\u0000\u001e\u0019\u0001\u0000\u0000\u0000\u001e\u001c"+
		"\u0001\u0000\u0000\u0000\u001e\u001d\u0001\u0000\u0000\u0000\u001f\u0003"+
		"\u0001\u0000\u0000\u0000 !\u0005\u0004\u0000\u0000!\"\u0005\u000e\u0000"+
		"\u0000\"#\u0003\n\u0005\u0000#$\u0005\r\u0000\u0000$%\u0003\u000e\u0007"+
		"\u0000%&\u0005\r\u0000\u0000&\'\u0003\f\u0006\u0000\'(\u0005\u000f\u0000"+
		"\u0000(*\u0005\u0010\u0000\u0000)+\u0003\u0002\u0001\u0000*)\u0001\u0000"+
		"\u0000\u0000+,\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000,-\u0001"+
		"\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000./\u0005\u0011\u0000\u0000"+
		"/\u0005\u0001\u0000\u0000\u000001\u0005\u0001\u0000\u000012\u0005\u000e"+
		"\u0000\u000023\u0003\u000e\u0007\u000034\u0005\u000f\u0000\u000046\u0005"+
		"\u0010\u0000\u000057\u0003\u0002\u0001\u000065\u0001\u0000\u0000\u0000"+
		"78\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u000089\u0001\u0000\u0000"+
		"\u00009:\u0001\u0000\u0000\u0000:D\u0005\u0011\u0000\u0000;<\u0005\u0002"+
		"\u0000\u0000<>\u0005\u0010\u0000\u0000=?\u0003\u0002\u0001\u0000>=\u0001"+
		"\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000"+
		"@A\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BC\u0005\u0011\u0000"+
		"\u0000CE\u0001\u0000\u0000\u0000D;\u0001\u0000\u0000\u0000DE\u0001\u0000"+
		"\u0000\u0000E\u0007\u0001\u0000\u0000\u0000FG\u0005\u0003\u0000\u0000"+
		"GH\u0005\u000e\u0000\u0000HI\u0003\u000e\u0007\u0000IJ\u0005\u000f\u0000"+
		"\u0000JL\u0005\u0010\u0000\u0000KM\u0003\u0002\u0001\u0000LK\u0001\u0000"+
		"\u0000\u0000MN\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001"+
		"\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PQ\u0005\u0011\u0000\u0000"+
		"Q\t\u0001\u0000\u0000\u0000RS\u0005\u0012\u0000\u0000ST\u0005\u0005\u0000"+
		"\u0000TU\u0003\f\u0006\u0000U\u000b\u0001\u0000\u0000\u0000VW\u0006\u0006"+
		"\uffff\uffff\u0000W^\u0005\u0013\u0000\u0000X^\u0005\u0012\u0000\u0000"+
		"YZ\u0005\u000e\u0000\u0000Z[\u0003\f\u0006\u0000[\\\u0005\u000f\u0000"+
		"\u0000\\^\u0001\u0000\u0000\u0000]V\u0001\u0000\u0000\u0000]X\u0001\u0000"+
		"\u0000\u0000]Y\u0001\u0000\u0000\u0000^m\u0001\u0000\u0000\u0000_`\n\u0007"+
		"\u0000\u0000`a\u0005\u000b\u0000\u0000al\u0003\f\u0006\bbc\n\u0006\u0000"+
		"\u0000cd\u0005\f\u0000\u0000dl\u0003\f\u0006\u0007ef\n\u0005\u0000\u0000"+
		"fg\u0005\t\u0000\u0000gl\u0003\f\u0006\u0006hi\n\u0004\u0000\u0000ij\u0005"+
		"\n\u0000\u0000jl\u0003\f\u0006\u0005k_\u0001\u0000\u0000\u0000kb\u0001"+
		"\u0000\u0000\u0000ke\u0001\u0000\u0000\u0000kh\u0001\u0000\u0000\u0000"+
		"lo\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000"+
		"\u0000n\r\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000pq\u0003\f"+
		"\u0006\u0000qr\u0007\u0000\u0000\u0000rs\u0003\f\u0006\u0000s\u000f\u0001"+
		"\u0000\u0000\u0000\n\u0013\u001e,8@DN]km";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
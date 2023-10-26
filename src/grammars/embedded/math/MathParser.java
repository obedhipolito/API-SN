// Generated from Math.g4 by ANTLR 4.4

	package grammars.embedded.math;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MathParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INTEGER_LITERAL=1, FLOATING_POINT_LITERAL=2, CHARACTER_LITERAL=3, IDENTIFIER=4, 
		LPAREN=5, RPAREN=6, DOT=7, PLUS=8, MINUS=9, DIV=10, MULT=11, MOD=12, LESSER=13, 
		GREATER=14, LESSER_EQ=15, GREATER_EQ=16, EQ=17, EQEQ=18, NOT=19, WS=20, 
		TAB=21, NEWLINE=22;
	public static final String[] tokenNames = {
		"<INVALID>", "INTEGER_LITERAL", "FLOATING_POINT_LITERAL", "CHARACTER_LITERAL", 
		"IDENTIFIER", "'('", "')'", "'.'", "'+'", "'-'", "'/'", "'*'", "'%'", 
		"'<'", "'>'", "'<='", "'>='", "'='", "'=='", "'!'", "' '", "'\t'", "NEWLINE"
	};
	public static final int
		RULE_entry = 0, RULE_expr = 1, RULE_op = 2, RULE_ws = 3, RULE_tab = 4;
	public static final String[] ruleNames = {
		"entry", "expr", "op", "ws", "tab"
	};

	@Override
	public String getGrammarFileName() { return "Math.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		private String code = "";
		public String getCode() {
			return code;
		}

	public MathParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class EntryContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public Token EQ;
		public TabContext tab(int i) {
			return getRuleContext(TabContext.class,i);
		}
		public TerminalNode EQ(int i) {
			return getToken(MathParser.EQ, i);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(MathParser.NEWLINE); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode EOF() { return getToken(MathParser.EOF, 0); }
		public List<TabContext> tab() {
			return getRuleContexts(TabContext.class);
		}
		public TerminalNode NEWLINE(int i) {
			return getToken(MathParser.NEWLINE, i);
		}
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MathParser.IDENTIFIER, i);
		}
		public List<TerminalNode> EQ() { return getTokens(MathParser.EQ); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(MathParser.IDENTIFIER); }
		public EntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).enterEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).exitEntry(this);
		}
	}

	public final EntryContext entry() throws RecognitionException {
		EntryContext _localctx = new EntryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_entry);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(14);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS || _la==TAB) {
						{
						setState(12);
						switch (_input.LA(1)) {
						case WS:
							{
							setState(10); ws();
							}
							break;
						case TAB:
							{
							setState(11); tab();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						setState(16);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(17); ((EntryContext)_localctx).IDENTIFIER = match(IDENTIFIER);

										code += (((EntryContext)_localctx).IDENTIFIER!=null?((EntryContext)_localctx).IDENTIFIER.getText():null);
									
					setState(23);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS || _la==TAB) {
						{
						setState(21);
						switch (_input.LA(1)) {
						case WS:
							{
							setState(19); ws();
							}
							break;
						case TAB:
							{
							setState(20); tab();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						setState(25);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(26); ((EntryContext)_localctx).EQ = match(EQ);

										code += (((EntryContext)_localctx).EQ!=null?((EntryContext)_localctx).EQ.getText():null);
									
					setState(32);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS || _la==TAB) {
						{
						setState(30);
						switch (_input.LA(1)) {
						case WS:
							{
							setState(28); ws();
							}
							break;
						case TAB:
							{
							setState(29); tab();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						setState(34);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(35); expr(0);
					setState(40);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS || _la==TAB) {
						{
						setState(38);
						switch (_input.LA(1)) {
						case WS:
							{
							setState(36); ws();
							}
							break;
						case TAB:
							{
							setState(37); tab();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						setState(42);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(44); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(43); match(NEWLINE);
						}
						}
						setState(46); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEWLINE );

										code += ";\n";
									
					}
					} 
				}
				setState(54);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==TAB) {
				{
				setState(57);
				switch (_input.LA(1)) {
				case WS:
					{
					setState(55); ws();
					}
					break;
				case TAB:
					{
					setState(56); tab();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62); ((EntryContext)_localctx).IDENTIFIER = match(IDENTIFIER);

							code += (((EntryContext)_localctx).IDENTIFIER!=null?((EntryContext)_localctx).IDENTIFIER.getText():null);
						
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==TAB) {
				{
				setState(66);
				switch (_input.LA(1)) {
				case WS:
					{
					setState(64); ws();
					}
					break;
				case TAB:
					{
					setState(65); tab();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71); ((EntryContext)_localctx).EQ = match(EQ);

							code += (((EntryContext)_localctx).EQ!=null?((EntryContext)_localctx).EQ.getText():null);
						
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==TAB) {
				{
				setState(75);
				switch (_input.LA(1)) {
				case WS:
					{
					setState(73); ws();
					}
					break;
				case TAB:
					{
					setState(74); tab();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80); expr(0);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==TAB) {
				{
				setState(83);
				switch (_input.LA(1)) {
				case WS:
					{
					setState(81); ws();
					}
					break;
				case TAB:
					{
					setState(82); tab();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(88); match(NEWLINE);
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

							code += ";";
						
			setState(95); match(EOF);
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
		public Token IDENTIFIER;
		public Token INTEGER_LITERAL;
		public Token FLOATING_POINT_LITERAL;
		public Token LPAREN;
		public Token RPAREN;
		public TerminalNode INTEGER_LITERAL() { return getToken(MathParser.INTEGER_LITERAL, 0); }
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public TabContext tab(int i) {
			return getRuleContext(TabContext.class,i);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public TerminalNode RPAREN() { return getToken(MathParser.RPAREN, 0); }
		public TerminalNode FLOATING_POINT_LITERAL() { return getToken(MathParser.FLOATING_POINT_LITERAL, 0); }
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode LPAREN() { return getToken(MathParser.LPAREN, 0); }
		public List<TabContext> tab() {
			return getRuleContexts(TabContext.class);
		}
		public TerminalNode MINUS() { return getToken(MathParser.MINUS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MathParser.IDENTIFIER, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).exitExpr(this);
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
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
			case FLOATING_POINT_LITERAL:
			case IDENTIFIER:
			case MINUS:
				{
				String minus = "";
				setState(101);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(99); match(MINUS);

										minus += ".negative_of_itself";
									
					}
				}

				setState(109);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(103); ((ExprContext)_localctx).IDENTIFIER = match(IDENTIFIER);
					code += (((ExprContext)_localctx).IDENTIFIER!=null?((ExprContext)_localctx).IDENTIFIER.getText():null) + ".asInstanceOf[naturalistic.lang.Number with naturalistic.lang.NumberProperty]";
					}
					break;
				case INTEGER_LITERAL:
					{
					setState(105); ((ExprContext)_localctx).INTEGER_LITERAL = match(INTEGER_LITERAL);
					code += "naturalistic.lang.Number.instance(" + (((ExprContext)_localctx).INTEGER_LITERAL!=null?((ExprContext)_localctx).INTEGER_LITERAL.getText():null) + ").asInstanceOf[naturalistic.lang.Number with naturalistic.lang.NumberProperty]";
					}
					break;
				case FLOATING_POINT_LITERAL:
					{
					setState(107); ((ExprContext)_localctx).FLOATING_POINT_LITERAL = match(FLOATING_POINT_LITERAL);
					code += "naturalistic.lang.Number.instance(" + (((ExprContext)_localctx).FLOATING_POINT_LITERAL!=null?((ExprContext)_localctx).FLOATING_POINT_LITERAL.getText():null) + ").asInstanceOf[naturalistic.lang.Number with naturalistic.lang.NumberProperty]";
					}
					break;
				default:
					throw new NoViableAltException(this);
				}

								code += minus;
							
				}
				break;
			case LPAREN:
				{
				setState(112); ((ExprContext)_localctx).LPAREN = match(LPAREN);

							code += (((ExprContext)_localctx).LPAREN!=null?((ExprContext)_localctx).LPAREN.getText():null);
							
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS || _la==TAB) {
					{
					setState(116);
					switch (_input.LA(1)) {
					case WS:
						{
						setState(114); ws();
						}
						break;
					case TAB:
						{
						setState(115); tab();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(120);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(121); expr(0);
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS || _la==TAB) {
					{
					setState(124);
					switch (_input.LA(1)) {
					case WS:
						{
						setState(122); ws();
						}
						break;
					case TAB:
						{
						setState(123); tab();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(128);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(129); ((ExprContext)_localctx).RPAREN = match(RPAREN);

								code += (((ExprContext)_localctx).RPAREN!=null?((ExprContext)_localctx).RPAREN.getText():null);
							
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(156);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(134);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(139);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS || _la==TAB) {
						{
						setState(137);
						switch (_input.LA(1)) {
						case WS:
							{
							setState(135); ws();
							}
							break;
						case TAB:
							{
							setState(136); tab();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						setState(141);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(142); op();

					          				code += "(";
					          			
					setState(148);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS || _la==TAB) {
						{
						setState(146);
						switch (_input.LA(1)) {
						case WS:
							{
							setState(144); ws();
							}
							break;
						case TAB:
							{
							setState(145); tab();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						setState(150);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(151); expr(3);

					          				code += ").asInstanceOf[naturalistic.lang.Number with naturalistic.lang.NumberProperty]";
					          			
					}
					} 
				}
				setState(158);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		public TerminalNode MULT() { return getToken(MathParser.MULT, 0); }
		public TerminalNode PLUS() { return getToken(MathParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MathParser.MINUS, 0); }
		public TerminalNode MOD() { return getToken(MathParser.MOD, 0); }
		public TerminalNode DIV() { return getToken(MathParser.DIV, 0); }
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).exitOp(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			switch (_input.LA(1)) {
			case PLUS:
				{
				setState(159); match(PLUS);
				code += ".itself_[plus]_arg";
				}
				break;
			case MINUS:
				{
				setState(161); match(MINUS);
				code +=  ".itself_[minus]_arg";
				}
				break;
			case DIV:
				{
				setState(163); match(DIV);
				code +=  ".itself_[div]_arg";
				}
				break;
			case MULT:
				{
				setState(165); match(MULT);
				code +=  ".itself_[times]_arg";
				}
				break;
			case MOD:
				{
				setState(167); match(MOD);
				code +=  ".itself_[percent]_arg";
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class WsContext extends ParserRuleContext {
		public TerminalNode WS(int i) {
			return getToken(MathParser.WS, i);
		}
		public List<TerminalNode> WS() { return getTokens(MathParser.WS); }
		public WsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ws; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).enterWs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).exitWs(this);
		}
	}

	public final WsContext ws() throws RecognitionException {
		WsContext _localctx = new WsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ws);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(172); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(171); match(WS);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(174); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class TabContext extends ParserRuleContext {
		public List<TerminalNode> TAB() { return getTokens(MathParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(MathParser.TAB, i);
		}
		public TabContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tab; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).enterTab(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MathListener ) ((MathListener)listener).exitTab(this);
		}
	}

	public final TabContext tab() throws RecognitionException {
		TabContext _localctx = new TabContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tab);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(177); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(176); match(TAB);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(179); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		case 1: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\30\u00b8\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\7\2\17\n\2\f\2\16\2\22\13\2\3"+
		"\2\3\2\3\2\3\2\7\2\30\n\2\f\2\16\2\33\13\2\3\2\3\2\3\2\3\2\7\2!\n\2\f"+
		"\2\16\2$\13\2\3\2\3\2\3\2\7\2)\n\2\f\2\16\2,\13\2\3\2\6\2/\n\2\r\2\16"+
		"\2\60\3\2\3\2\7\2\65\n\2\f\2\16\28\13\2\3\2\3\2\7\2<\n\2\f\2\16\2?\13"+
		"\2\3\2\3\2\3\2\3\2\7\2E\n\2\f\2\16\2H\13\2\3\2\3\2\3\2\3\2\7\2N\n\2\f"+
		"\2\16\2Q\13\2\3\2\3\2\3\2\7\2V\n\2\f\2\16\2Y\13\2\3\2\7\2\\\n\2\f\2\16"+
		"\2_\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3h\n\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\5\3p\n\3\3\3\3\3\3\3\3\3\3\3\7\3w\n\3\f\3\16\3z\13\3\3\3\3\3\3\3\7\3"+
		"\177\n\3\f\3\16\3\u0082\13\3\3\3\3\3\3\3\5\3\u0087\n\3\3\3\3\3\3\3\7\3"+
		"\u008c\n\3\f\3\16\3\u008f\13\3\3\3\3\3\3\3\3\3\7\3\u0095\n\3\f\3\16\3"+
		"\u0098\13\3\3\3\3\3\3\3\7\3\u009d\n\3\f\3\16\3\u00a0\13\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00ac\n\4\3\5\6\5\u00af\n\5\r\5\16\5"+
		"\u00b0\3\6\6\6\u00b4\n\6\r\6\16\6\u00b5\3\6\2\3\4\7\2\4\6\b\n\2\2\u00d8"+
		"\2\66\3\2\2\2\4\u0086\3\2\2\2\6\u00ab\3\2\2\2\b\u00ae\3\2\2\2\n\u00b3"+
		"\3\2\2\2\f\17\5\b\5\2\r\17\5\n\6\2\16\f\3\2\2\2\16\r\3\2\2\2\17\22\3\2"+
		"\2\2\20\16\3\2\2\2\20\21\3\2\2\2\21\23\3\2\2\2\22\20\3\2\2\2\23\24\7\6"+
		"\2\2\24\31\b\2\1\2\25\30\5\b\5\2\26\30\5\n\6\2\27\25\3\2\2\2\27\26\3\2"+
		"\2\2\30\33\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\34\3\2\2\2\33\31\3\2"+
		"\2\2\34\35\7\23\2\2\35\"\b\2\1\2\36!\5\b\5\2\37!\5\n\6\2 \36\3\2\2\2 "+
		"\37\3\2\2\2!$\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#%\3\2\2\2$\"\3\2\2\2%*\5\4"+
		"\3\2&)\5\b\5\2\')\5\n\6\2(&\3\2\2\2(\'\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3"+
		"\2\2\2+.\3\2\2\2,*\3\2\2\2-/\7\30\2\2.-\3\2\2\2/\60\3\2\2\2\60.\3\2\2"+
		"\2\60\61\3\2\2\2\61\62\3\2\2\2\62\63\b\2\1\2\63\65\3\2\2\2\64\20\3\2\2"+
		"\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67=\3\2\2\28\66\3\2\2\29<\5"+
		"\b\5\2:<\5\n\6\2;9\3\2\2\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3"+
		"\2\2\2?=\3\2\2\2@A\7\6\2\2AF\b\2\1\2BE\5\b\5\2CE\5\n\6\2DB\3\2\2\2DC\3"+
		"\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GI\3\2\2\2HF\3\2\2\2IJ\7\23\2\2JO"+
		"\b\2\1\2KN\5\b\5\2LN\5\n\6\2MK\3\2\2\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2O"+
		"P\3\2\2\2PR\3\2\2\2QO\3\2\2\2RW\5\4\3\2SV\5\b\5\2TV\5\n\6\2US\3\2\2\2"+
		"UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X]\3\2\2\2YW\3\2\2\2Z\\\7\30\2"+
		"\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^`\3\2\2\2_]\3\2\2\2`a\b\2"+
		"\1\2ab\7\2\2\3b\3\3\2\2\2cd\b\3\1\2dg\b\3\1\2ef\7\13\2\2fh\b\3\1\2ge\3"+
		"\2\2\2gh\3\2\2\2ho\3\2\2\2ij\7\6\2\2jp\b\3\1\2kl\7\3\2\2lp\b\3\1\2mn\7"+
		"\4\2\2np\b\3\1\2oi\3\2\2\2ok\3\2\2\2om\3\2\2\2pq\3\2\2\2q\u0087\b\3\1"+
		"\2rs\7\7\2\2sx\b\3\1\2tw\5\b\5\2uw\5\n\6\2vt\3\2\2\2vu\3\2\2\2wz\3\2\2"+
		"\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2\2{\u0080\5\4\3\2|\177\5\b\5\2"+
		"}\177\5\n\6\2~|\3\2\2\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\7\b"+
		"\2\2\u0084\u0085\b\3\1\2\u0085\u0087\3\2\2\2\u0086c\3\2\2\2\u0086r\3\2"+
		"\2\2\u0087\u009e\3\2\2\2\u0088\u008d\f\4\2\2\u0089\u008c\5\b\5\2\u008a"+
		"\u008c\5\n\6\2\u008b\u0089\3\2\2\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2"+
		"\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u0090\u0091\5\6\4\2\u0091\u0096\b\3\1\2\u0092\u0095\5\b"+
		"\5\2\u0093\u0095\5\n\6\2\u0094\u0092\3\2\2\2\u0094\u0093\3\2\2\2\u0095"+
		"\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3\2"+
		"\2\2\u0098\u0096\3\2\2\2\u0099\u009a\5\4\3\5\u009a\u009b\b\3\1\2\u009b"+
		"\u009d\3\2\2\2\u009c\u0088\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2"+
		"\2\2\u009e\u009f\3\2\2\2\u009f\5\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2"+
		"\7\n\2\2\u00a2\u00ac\b\4\1\2\u00a3\u00a4\7\13\2\2\u00a4\u00ac\b\4\1\2"+
		"\u00a5\u00a6\7\f\2\2\u00a6\u00ac\b\4\1\2\u00a7\u00a8\7\r\2\2\u00a8\u00ac"+
		"\b\4\1\2\u00a9\u00aa\7\16\2\2\u00aa\u00ac\b\4\1\2\u00ab\u00a1\3\2\2\2"+
		"\u00ab\u00a3\3\2\2\2\u00ab\u00a5\3\2\2\2\u00ab\u00a7\3\2\2\2\u00ab\u00a9"+
		"\3\2\2\2\u00ac\7\3\2\2\2\u00ad\u00af\7\26\2\2\u00ae\u00ad\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\t\3\2\2\2"+
		"\u00b2\u00b4\7\27\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b3"+
		"\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\13\3\2\2\2$\16\20\27\31 \"(*\60\66"+
		";=DFMOUW]govx~\u0080\u0086\u008b\u008d\u0094\u0096\u009e\u00ab\u00b0\u00b5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
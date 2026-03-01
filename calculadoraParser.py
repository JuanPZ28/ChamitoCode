# Generated from calculadora.g4 by ANTLR 4.13.1
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,20,117,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,1,0,4,0,18,8,0,11,0,12,0,19,1,1,1,1,1,1,1,1,1,1,1,1,1,
        1,1,1,1,1,3,1,31,8,1,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,4,2,
        43,8,2,11,2,12,2,44,1,2,1,2,1,3,1,3,1,3,1,3,1,3,1,3,4,3,55,8,3,11,
        3,12,3,56,1,3,1,3,1,3,1,3,4,3,63,8,3,11,3,12,3,64,1,3,1,3,3,3,69,
        8,3,1,4,1,4,1,4,1,4,1,4,1,4,4,4,77,8,4,11,4,12,4,78,1,4,1,4,1,5,
        1,5,1,5,1,5,1,6,1,6,1,6,1,6,1,6,1,6,1,6,3,6,94,8,6,1,6,1,6,1,6,1,
        6,1,6,1,6,1,6,1,6,1,6,1,6,1,6,1,6,5,6,108,8,6,10,6,12,6,111,9,6,
        1,7,1,7,1,7,1,7,1,7,0,1,12,8,0,2,4,6,8,10,12,14,0,1,1,0,6,8,124,
        0,17,1,0,0,0,2,30,1,0,0,0,4,32,1,0,0,0,6,48,1,0,0,0,8,70,1,0,0,0,
        10,82,1,0,0,0,12,93,1,0,0,0,14,112,1,0,0,0,16,18,3,2,1,0,17,16,1,
        0,0,0,18,19,1,0,0,0,19,17,1,0,0,0,19,20,1,0,0,0,20,1,1,0,0,0,21,
        22,3,12,6,0,22,23,5,13,0,0,23,31,1,0,0,0,24,31,3,6,3,0,25,26,3,10,
        5,0,26,27,5,13,0,0,27,31,1,0,0,0,28,31,3,8,4,0,29,31,3,4,2,0,30,
        21,1,0,0,0,30,24,1,0,0,0,30,25,1,0,0,0,30,28,1,0,0,0,30,29,1,0,0,
        0,31,3,1,0,0,0,32,33,5,4,0,0,33,34,5,14,0,0,34,35,3,10,5,0,35,36,
        5,13,0,0,36,37,3,14,7,0,37,38,5,13,0,0,38,39,3,12,6,0,39,40,5,15,
        0,0,40,42,5,16,0,0,41,43,3,2,1,0,42,41,1,0,0,0,43,44,1,0,0,0,44,
        42,1,0,0,0,44,45,1,0,0,0,45,46,1,0,0,0,46,47,5,17,0,0,47,5,1,0,0,
        0,48,49,5,1,0,0,49,50,5,14,0,0,50,51,3,14,7,0,51,52,5,15,0,0,52,
        54,5,16,0,0,53,55,3,2,1,0,54,53,1,0,0,0,55,56,1,0,0,0,56,54,1,0,
        0,0,56,57,1,0,0,0,57,58,1,0,0,0,58,68,5,17,0,0,59,60,5,2,0,0,60,
        62,5,16,0,0,61,63,3,2,1,0,62,61,1,0,0,0,63,64,1,0,0,0,64,62,1,0,
        0,0,64,65,1,0,0,0,65,66,1,0,0,0,66,67,5,17,0,0,67,69,1,0,0,0,68,
        59,1,0,0,0,68,69,1,0,0,0,69,7,1,0,0,0,70,71,5,3,0,0,71,72,5,14,0,
        0,72,73,3,14,7,0,73,74,5,15,0,0,74,76,5,16,0,0,75,77,3,2,1,0,76,
        75,1,0,0,0,77,78,1,0,0,0,78,76,1,0,0,0,78,79,1,0,0,0,79,80,1,0,0,
        0,80,81,5,17,0,0,81,9,1,0,0,0,82,83,5,18,0,0,83,84,5,5,0,0,84,85,
        3,12,6,0,85,11,1,0,0,0,86,87,6,6,-1,0,87,94,5,19,0,0,88,94,5,18,
        0,0,89,90,5,14,0,0,90,91,3,12,6,0,91,92,5,15,0,0,92,94,1,0,0,0,93,
        86,1,0,0,0,93,88,1,0,0,0,93,89,1,0,0,0,94,109,1,0,0,0,95,96,10,7,
        0,0,96,97,5,11,0,0,97,108,3,12,6,8,98,99,10,6,0,0,99,100,5,12,0,
        0,100,108,3,12,6,7,101,102,10,5,0,0,102,103,5,9,0,0,103,108,3,12,
        6,6,104,105,10,4,0,0,105,106,5,10,0,0,106,108,3,12,6,5,107,95,1,
        0,0,0,107,98,1,0,0,0,107,101,1,0,0,0,107,104,1,0,0,0,108,111,1,0,
        0,0,109,107,1,0,0,0,109,110,1,0,0,0,110,13,1,0,0,0,111,109,1,0,0,
        0,112,113,3,12,6,0,113,114,7,0,0,0,114,115,3,12,6,0,115,15,1,0,0,
        0,10,19,30,44,56,64,68,78,93,107,109
    ]

class calculadoraParser ( Parser ):

    grammarFileName = "calculadora.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'si'", "'sino'", "'mientras'", "'por'", 
                     "'='", "'=='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", 
                     "';'", "'('", "')'", "'{'", "'}'" ]

    symbolicNames = [ "<INVALID>", "SI", "O", "MIENTRAS", "POR", "IGUAL", 
                      "IGUAL_QUE", "MAYOR_QUE", "MENOR_QUE", "SUMA", "RESTA", 
                      "MULT", "DIV", "PYC", "PAREN_IZQ", "PAREN_DER", "LLAVE_IZQ", 
                      "LLAVE_DER", "ID", "NUMERO", "WS" ]

    RULE_archivo = 0
    RULE_sentencia = 1
    RULE_bucle_definido = 2
    RULE_condicional = 3
    RULE_bucle_condicion = 4
    RULE_asignacion = 5
    RULE_expresion = 6
    RULE_comparacion = 7

    ruleNames =  [ "archivo", "sentencia", "bucle_definido", "condicional", 
                   "bucle_condicion", "asignacion", "expresion", "comparacion" ]

    EOF = Token.EOF
    SI=1
    O=2
    MIENTRAS=3
    POR=4
    IGUAL=5
    IGUAL_QUE=6
    MAYOR_QUE=7
    MENOR_QUE=8
    SUMA=9
    RESTA=10
    MULT=11
    DIV=12
    PYC=13
    PAREN_IZQ=14
    PAREN_DER=15
    LLAVE_IZQ=16
    LLAVE_DER=17
    ID=18
    NUMERO=19
    WS=20

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ArchivoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def sentencia(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(calculadoraParser.SentenciaContext)
            else:
                return self.getTypedRuleContext(calculadoraParser.SentenciaContext,i)


        def getRuleIndex(self):
            return calculadoraParser.RULE_archivo

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterArchivo" ):
                listener.enterArchivo(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitArchivo" ):
                listener.exitArchivo(self)




    def archivo(self):

        localctx = calculadoraParser.ArchivoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_archivo)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 17 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 16
                self.sentencia()
                self.state = 19 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & 802842) != 0)):
                    break

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class SentenciaContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return calculadoraParser.RULE_sentencia

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class SentenciaCondicionalContext(SentenciaContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a calculadoraParser.SentenciaContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def condicional(self):
            return self.getTypedRuleContext(calculadoraParser.CondicionalContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSentenciaCondicional" ):
                listener.enterSentenciaCondicional(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSentenciaCondicional" ):
                listener.exitSentenciaCondicional(self)


    class SentenciaAsignacionContext(SentenciaContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a calculadoraParser.SentenciaContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def asignacion(self):
            return self.getTypedRuleContext(calculadoraParser.AsignacionContext,0)

        def PYC(self):
            return self.getToken(calculadoraParser.PYC, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSentenciaAsignacion" ):
                listener.enterSentenciaAsignacion(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSentenciaAsignacion" ):
                listener.exitSentenciaAsignacion(self)


    class SentenciaExpresionContext(SentenciaContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a calculadoraParser.SentenciaContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expresion(self):
            return self.getTypedRuleContext(calculadoraParser.ExpresionContext,0)

        def PYC(self):
            return self.getToken(calculadoraParser.PYC, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSentenciaExpresion" ):
                listener.enterSentenciaExpresion(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSentenciaExpresion" ):
                listener.exitSentenciaExpresion(self)


    class SentenciaBucleDefinidoContext(SentenciaContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a calculadoraParser.SentenciaContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def bucle_definido(self):
            return self.getTypedRuleContext(calculadoraParser.Bucle_definidoContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSentenciaBucleDefinido" ):
                listener.enterSentenciaBucleDefinido(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSentenciaBucleDefinido" ):
                listener.exitSentenciaBucleDefinido(self)


    class SentenciaBucleCondicionContext(SentenciaContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a calculadoraParser.SentenciaContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def bucle_condicion(self):
            return self.getTypedRuleContext(calculadoraParser.Bucle_condicionContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSentenciaBucleCondicion" ):
                listener.enterSentenciaBucleCondicion(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSentenciaBucleCondicion" ):
                listener.exitSentenciaBucleCondicion(self)



    def sentencia(self):

        localctx = calculadoraParser.SentenciaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_sentencia)
        try:
            self.state = 30
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,1,self._ctx)
            if la_ == 1:
                localctx = calculadoraParser.SentenciaExpresionContext(self, localctx)
                self.enterOuterAlt(localctx, 1)
                self.state = 21
                self.expresion(0)
                self.state = 22
                self.match(calculadoraParser.PYC)
                pass

            elif la_ == 2:
                localctx = calculadoraParser.SentenciaCondicionalContext(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 24
                self.condicional()
                pass

            elif la_ == 3:
                localctx = calculadoraParser.SentenciaAsignacionContext(self, localctx)
                self.enterOuterAlt(localctx, 3)
                self.state = 25
                self.asignacion()
                self.state = 26
                self.match(calculadoraParser.PYC)
                pass

            elif la_ == 4:
                localctx = calculadoraParser.SentenciaBucleCondicionContext(self, localctx)
                self.enterOuterAlt(localctx, 4)
                self.state = 28
                self.bucle_condicion()
                pass

            elif la_ == 5:
                localctx = calculadoraParser.SentenciaBucleDefinidoContext(self, localctx)
                self.enterOuterAlt(localctx, 5)
                self.state = 29
                self.bucle_definido()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Bucle_definidoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def POR(self):
            return self.getToken(calculadoraParser.POR, 0)

        def PAREN_IZQ(self):
            return self.getToken(calculadoraParser.PAREN_IZQ, 0)

        def asignacion(self):
            return self.getTypedRuleContext(calculadoraParser.AsignacionContext,0)


        def PYC(self, i:int=None):
            if i is None:
                return self.getTokens(calculadoraParser.PYC)
            else:
                return self.getToken(calculadoraParser.PYC, i)

        def comparacion(self):
            return self.getTypedRuleContext(calculadoraParser.ComparacionContext,0)


        def expresion(self):
            return self.getTypedRuleContext(calculadoraParser.ExpresionContext,0)


        def PAREN_DER(self):
            return self.getToken(calculadoraParser.PAREN_DER, 0)

        def LLAVE_IZQ(self):
            return self.getToken(calculadoraParser.LLAVE_IZQ, 0)

        def LLAVE_DER(self):
            return self.getToken(calculadoraParser.LLAVE_DER, 0)

        def sentencia(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(calculadoraParser.SentenciaContext)
            else:
                return self.getTypedRuleContext(calculadoraParser.SentenciaContext,i)


        def getRuleIndex(self):
            return calculadoraParser.RULE_bucle_definido

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBucle_definido" ):
                listener.enterBucle_definido(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBucle_definido" ):
                listener.exitBucle_definido(self)




    def bucle_definido(self):

        localctx = calculadoraParser.Bucle_definidoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_bucle_definido)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 32
            self.match(calculadoraParser.POR)
            self.state = 33
            self.match(calculadoraParser.PAREN_IZQ)
            self.state = 34
            self.asignacion()
            self.state = 35
            self.match(calculadoraParser.PYC)
            self.state = 36
            self.comparacion()
            self.state = 37
            self.match(calculadoraParser.PYC)
            self.state = 38
            self.expresion(0)
            self.state = 39
            self.match(calculadoraParser.PAREN_DER)
            self.state = 40
            self.match(calculadoraParser.LLAVE_IZQ)
            self.state = 42 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 41
                self.sentencia()
                self.state = 44 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & 802842) != 0)):
                    break

            self.state = 46
            self.match(calculadoraParser.LLAVE_DER)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CondicionalContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def SI(self):
            return self.getToken(calculadoraParser.SI, 0)

        def PAREN_IZQ(self):
            return self.getToken(calculadoraParser.PAREN_IZQ, 0)

        def comparacion(self):
            return self.getTypedRuleContext(calculadoraParser.ComparacionContext,0)


        def PAREN_DER(self):
            return self.getToken(calculadoraParser.PAREN_DER, 0)

        def LLAVE_IZQ(self, i:int=None):
            if i is None:
                return self.getTokens(calculadoraParser.LLAVE_IZQ)
            else:
                return self.getToken(calculadoraParser.LLAVE_IZQ, i)

        def LLAVE_DER(self, i:int=None):
            if i is None:
                return self.getTokens(calculadoraParser.LLAVE_DER)
            else:
                return self.getToken(calculadoraParser.LLAVE_DER, i)

        def sentencia(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(calculadoraParser.SentenciaContext)
            else:
                return self.getTypedRuleContext(calculadoraParser.SentenciaContext,i)


        def O(self):
            return self.getToken(calculadoraParser.O, 0)

        def getRuleIndex(self):
            return calculadoraParser.RULE_condicional

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCondicional" ):
                listener.enterCondicional(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCondicional" ):
                listener.exitCondicional(self)




    def condicional(self):

        localctx = calculadoraParser.CondicionalContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_condicional)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 48
            self.match(calculadoraParser.SI)
            self.state = 49
            self.match(calculadoraParser.PAREN_IZQ)
            self.state = 50
            self.comparacion()
            self.state = 51
            self.match(calculadoraParser.PAREN_DER)
            self.state = 52
            self.match(calculadoraParser.LLAVE_IZQ)
            self.state = 54 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 53
                self.sentencia()
                self.state = 56 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & 802842) != 0)):
                    break

            self.state = 58
            self.match(calculadoraParser.LLAVE_DER)
            self.state = 68
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==2:
                self.state = 59
                self.match(calculadoraParser.O)
                self.state = 60
                self.match(calculadoraParser.LLAVE_IZQ)
                self.state = 62 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while True:
                    self.state = 61
                    self.sentencia()
                    self.state = 64 
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & 802842) != 0)):
                        break

                self.state = 66
                self.match(calculadoraParser.LLAVE_DER)


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Bucle_condicionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def MIENTRAS(self):
            return self.getToken(calculadoraParser.MIENTRAS, 0)

        def PAREN_IZQ(self):
            return self.getToken(calculadoraParser.PAREN_IZQ, 0)

        def comparacion(self):
            return self.getTypedRuleContext(calculadoraParser.ComparacionContext,0)


        def PAREN_DER(self):
            return self.getToken(calculadoraParser.PAREN_DER, 0)

        def LLAVE_IZQ(self):
            return self.getToken(calculadoraParser.LLAVE_IZQ, 0)

        def LLAVE_DER(self):
            return self.getToken(calculadoraParser.LLAVE_DER, 0)

        def sentencia(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(calculadoraParser.SentenciaContext)
            else:
                return self.getTypedRuleContext(calculadoraParser.SentenciaContext,i)


        def getRuleIndex(self):
            return calculadoraParser.RULE_bucle_condicion

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBucle_condicion" ):
                listener.enterBucle_condicion(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBucle_condicion" ):
                listener.exitBucle_condicion(self)




    def bucle_condicion(self):

        localctx = calculadoraParser.Bucle_condicionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_bucle_condicion)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 70
            self.match(calculadoraParser.MIENTRAS)
            self.state = 71
            self.match(calculadoraParser.PAREN_IZQ)
            self.state = 72
            self.comparacion()
            self.state = 73
            self.match(calculadoraParser.PAREN_DER)
            self.state = 74
            self.match(calculadoraParser.LLAVE_IZQ)
            self.state = 76 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 75
                self.sentencia()
                self.state = 78 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & 802842) != 0)):
                    break

            self.state = 80
            self.match(calculadoraParser.LLAVE_DER)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AsignacionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(calculadoraParser.ID, 0)

        def IGUAL(self):
            return self.getToken(calculadoraParser.IGUAL, 0)

        def expresion(self):
            return self.getTypedRuleContext(calculadoraParser.ExpresionContext,0)


        def getRuleIndex(self):
            return calculadoraParser.RULE_asignacion

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAsignacion" ):
                listener.enterAsignacion(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAsignacion" ):
                listener.exitAsignacion(self)




    def asignacion(self):

        localctx = calculadoraParser.AsignacionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_asignacion)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 82
            self.match(calculadoraParser.ID)
            self.state = 83
            self.match(calculadoraParser.IGUAL)
            self.state = 84
            self.expresion(0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExpresionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return calculadoraParser.RULE_expresion

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)


    class NumeroContext(ExpresionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a calculadoraParser.ExpresionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def NUMERO(self):
            return self.getToken(calculadoraParser.NUMERO, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterNumero" ):
                listener.enterNumero(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitNumero" ):
                listener.exitNumero(self)


    class SumaContext(ExpresionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a calculadoraParser.ExpresionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expresion(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(calculadoraParser.ExpresionContext)
            else:
                return self.getTypedRuleContext(calculadoraParser.ExpresionContext,i)

        def SUMA(self):
            return self.getToken(calculadoraParser.SUMA, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSuma" ):
                listener.enterSuma(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSuma" ):
                listener.exitSuma(self)


    class VariableContext(ExpresionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a calculadoraParser.ExpresionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def ID(self):
            return self.getToken(calculadoraParser.ID, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterVariable" ):
                listener.enterVariable(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitVariable" ):
                listener.exitVariable(self)


    class ParentesisContext(ExpresionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a calculadoraParser.ExpresionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def PAREN_IZQ(self):
            return self.getToken(calculadoraParser.PAREN_IZQ, 0)
        def expresion(self):
            return self.getTypedRuleContext(calculadoraParser.ExpresionContext,0)

        def PAREN_DER(self):
            return self.getToken(calculadoraParser.PAREN_DER, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterParentesis" ):
                listener.enterParentesis(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitParentesis" ):
                listener.exitParentesis(self)


    class DivisionContext(ExpresionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a calculadoraParser.ExpresionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expresion(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(calculadoraParser.ExpresionContext)
            else:
                return self.getTypedRuleContext(calculadoraParser.ExpresionContext,i)

        def DIV(self):
            return self.getToken(calculadoraParser.DIV, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDivision" ):
                listener.enterDivision(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDivision" ):
                listener.exitDivision(self)


    class MultiplicacionContext(ExpresionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a calculadoraParser.ExpresionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expresion(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(calculadoraParser.ExpresionContext)
            else:
                return self.getTypedRuleContext(calculadoraParser.ExpresionContext,i)

        def MULT(self):
            return self.getToken(calculadoraParser.MULT, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMultiplicacion" ):
                listener.enterMultiplicacion(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMultiplicacion" ):
                listener.exitMultiplicacion(self)


    class RestaContext(ExpresionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a calculadoraParser.ExpresionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expresion(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(calculadoraParser.ExpresionContext)
            else:
                return self.getTypedRuleContext(calculadoraParser.ExpresionContext,i)

        def RESTA(self):
            return self.getToken(calculadoraParser.RESTA, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterResta" ):
                listener.enterResta(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitResta" ):
                listener.exitResta(self)



    def expresion(self, _p:int=0):
        _parentctx = self._ctx
        _parentState = self.state
        localctx = calculadoraParser.ExpresionContext(self, self._ctx, _parentState)
        _prevctx = localctx
        _startState = 12
        self.enterRecursionRule(localctx, 12, self.RULE_expresion, _p)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 93
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [19]:
                localctx = calculadoraParser.NumeroContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx

                self.state = 87
                self.match(calculadoraParser.NUMERO)
                pass
            elif token in [18]:
                localctx = calculadoraParser.VariableContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 88
                self.match(calculadoraParser.ID)
                pass
            elif token in [14]:
                localctx = calculadoraParser.ParentesisContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 89
                self.match(calculadoraParser.PAREN_IZQ)
                self.state = 90
                self.expresion(0)
                self.state = 91
                self.match(calculadoraParser.PAREN_DER)
                pass
            else:
                raise NoViableAltException(self)

            self._ctx.stop = self._input.LT(-1)
            self.state = 109
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,9,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    self.state = 107
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,8,self._ctx)
                    if la_ == 1:
                        localctx = calculadoraParser.MultiplicacionContext(self, calculadoraParser.ExpresionContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expresion)
                        self.state = 95
                        if not self.precpred(self._ctx, 7):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 7)")
                        self.state = 96
                        self.match(calculadoraParser.MULT)
                        self.state = 97
                        self.expresion(8)
                        pass

                    elif la_ == 2:
                        localctx = calculadoraParser.DivisionContext(self, calculadoraParser.ExpresionContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expresion)
                        self.state = 98
                        if not self.precpred(self._ctx, 6):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 6)")
                        self.state = 99
                        self.match(calculadoraParser.DIV)
                        self.state = 100
                        self.expresion(7)
                        pass

                    elif la_ == 3:
                        localctx = calculadoraParser.SumaContext(self, calculadoraParser.ExpresionContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expresion)
                        self.state = 101
                        if not self.precpred(self._ctx, 5):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 5)")
                        self.state = 102
                        self.match(calculadoraParser.SUMA)
                        self.state = 103
                        self.expresion(6)
                        pass

                    elif la_ == 4:
                        localctx = calculadoraParser.RestaContext(self, calculadoraParser.ExpresionContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expresion)
                        self.state = 104
                        if not self.precpred(self._ctx, 4):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 4)")
                        self.state = 105
                        self.match(calculadoraParser.RESTA)
                        self.state = 106
                        self.expresion(5)
                        pass

             
                self.state = 111
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,9,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.unrollRecursionContexts(_parentctx)
        return localctx


    class ComparacionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expresion(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(calculadoraParser.ExpresionContext)
            else:
                return self.getTypedRuleContext(calculadoraParser.ExpresionContext,i)


        def IGUAL_QUE(self):
            return self.getToken(calculadoraParser.IGUAL_QUE, 0)

        def MAYOR_QUE(self):
            return self.getToken(calculadoraParser.MAYOR_QUE, 0)

        def MENOR_QUE(self):
            return self.getToken(calculadoraParser.MENOR_QUE, 0)

        def getRuleIndex(self):
            return calculadoraParser.RULE_comparacion

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterComparacion" ):
                listener.enterComparacion(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitComparacion" ):
                listener.exitComparacion(self)




    def comparacion(self):

        localctx = calculadoraParser.ComparacionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_comparacion)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 112
            self.expresion(0)
            self.state = 113
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 448) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
            self.state = 114
            self.expresion(0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx



    def sempred(self, localctx:RuleContext, ruleIndex:int, predIndex:int):
        if self._predicates == None:
            self._predicates = dict()
        self._predicates[6] = self.expresion_sempred
        pred = self._predicates.get(ruleIndex, None)
        if pred is None:
            raise Exception("No predicate with index:" + str(ruleIndex))
        else:
            return pred(localctx, predIndex)

    def expresion_sempred(self, localctx:ExpresionContext, predIndex:int):
            if predIndex == 0:
                return self.precpred(self._ctx, 7)
         

            if predIndex == 1:
                return self.precpred(self._ctx, 6)
         

            if predIndex == 2:
                return self.precpred(self._ctx, 5)
         

            if predIndex == 3:
                return self.precpred(self._ctx, 4)
         





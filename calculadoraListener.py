# Generated from calculadora.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .calculadoraParser import calculadoraParser
else:
    from calculadoraParser import calculadoraParser

# This class defines a complete listener for a parse tree produced by calculadoraParser.
class calculadoraListener(ParseTreeListener):

    # Enter a parse tree produced by calculadoraParser#archivo.
    def enterArchivo(self, ctx:calculadoraParser.ArchivoContext):
        pass

    # Exit a parse tree produced by calculadoraParser#archivo.
    def exitArchivo(self, ctx:calculadoraParser.ArchivoContext):
        pass


    # Enter a parse tree produced by calculadoraParser#SentenciaExpresion.
    def enterSentenciaExpresion(self, ctx:calculadoraParser.SentenciaExpresionContext):
        pass

    # Exit a parse tree produced by calculadoraParser#SentenciaExpresion.
    def exitSentenciaExpresion(self, ctx:calculadoraParser.SentenciaExpresionContext):
        pass


    # Enter a parse tree produced by calculadoraParser#SentenciaCondicional.
    def enterSentenciaCondicional(self, ctx:calculadoraParser.SentenciaCondicionalContext):
        pass

    # Exit a parse tree produced by calculadoraParser#SentenciaCondicional.
    def exitSentenciaCondicional(self, ctx:calculadoraParser.SentenciaCondicionalContext):
        pass


    # Enter a parse tree produced by calculadoraParser#SentenciaAsignacion.
    def enterSentenciaAsignacion(self, ctx:calculadoraParser.SentenciaAsignacionContext):
        pass

    # Exit a parse tree produced by calculadoraParser#SentenciaAsignacion.
    def exitSentenciaAsignacion(self, ctx:calculadoraParser.SentenciaAsignacionContext):
        pass


    # Enter a parse tree produced by calculadoraParser#SentenciaBucleCondicion.
    def enterSentenciaBucleCondicion(self, ctx:calculadoraParser.SentenciaBucleCondicionContext):
        pass

    # Exit a parse tree produced by calculadoraParser#SentenciaBucleCondicion.
    def exitSentenciaBucleCondicion(self, ctx:calculadoraParser.SentenciaBucleCondicionContext):
        pass


    # Enter a parse tree produced by calculadoraParser#SentenciaBucleDefinido.
    def enterSentenciaBucleDefinido(self, ctx:calculadoraParser.SentenciaBucleDefinidoContext):
        pass

    # Exit a parse tree produced by calculadoraParser#SentenciaBucleDefinido.
    def exitSentenciaBucleDefinido(self, ctx:calculadoraParser.SentenciaBucleDefinidoContext):
        pass


    # Enter a parse tree produced by calculadoraParser#bucle_definido.
    def enterBucle_definido(self, ctx:calculadoraParser.Bucle_definidoContext):
        pass

    # Exit a parse tree produced by calculadoraParser#bucle_definido.
    def exitBucle_definido(self, ctx:calculadoraParser.Bucle_definidoContext):
        pass


    # Enter a parse tree produced by calculadoraParser#condicional.
    def enterCondicional(self, ctx:calculadoraParser.CondicionalContext):
        pass

    # Exit a parse tree produced by calculadoraParser#condicional.
    def exitCondicional(self, ctx:calculadoraParser.CondicionalContext):
        pass


    # Enter a parse tree produced by calculadoraParser#bucle_condicion.
    def enterBucle_condicion(self, ctx:calculadoraParser.Bucle_condicionContext):
        pass

    # Exit a parse tree produced by calculadoraParser#bucle_condicion.
    def exitBucle_condicion(self, ctx:calculadoraParser.Bucle_condicionContext):
        pass


    # Enter a parse tree produced by calculadoraParser#asignacion.
    def enterAsignacion(self, ctx:calculadoraParser.AsignacionContext):
        pass

    # Exit a parse tree produced by calculadoraParser#asignacion.
    def exitAsignacion(self, ctx:calculadoraParser.AsignacionContext):
        pass


    # Enter a parse tree produced by calculadoraParser#Numero.
    def enterNumero(self, ctx:calculadoraParser.NumeroContext):
        pass

    # Exit a parse tree produced by calculadoraParser#Numero.
    def exitNumero(self, ctx:calculadoraParser.NumeroContext):
        pass


    # Enter a parse tree produced by calculadoraParser#Suma.
    def enterSuma(self, ctx:calculadoraParser.SumaContext):
        pass

    # Exit a parse tree produced by calculadoraParser#Suma.
    def exitSuma(self, ctx:calculadoraParser.SumaContext):
        pass


    # Enter a parse tree produced by calculadoraParser#Variable.
    def enterVariable(self, ctx:calculadoraParser.VariableContext):
        pass

    # Exit a parse tree produced by calculadoraParser#Variable.
    def exitVariable(self, ctx:calculadoraParser.VariableContext):
        pass


    # Enter a parse tree produced by calculadoraParser#Parentesis.
    def enterParentesis(self, ctx:calculadoraParser.ParentesisContext):
        pass

    # Exit a parse tree produced by calculadoraParser#Parentesis.
    def exitParentesis(self, ctx:calculadoraParser.ParentesisContext):
        pass


    # Enter a parse tree produced by calculadoraParser#Division.
    def enterDivision(self, ctx:calculadoraParser.DivisionContext):
        pass

    # Exit a parse tree produced by calculadoraParser#Division.
    def exitDivision(self, ctx:calculadoraParser.DivisionContext):
        pass


    # Enter a parse tree produced by calculadoraParser#Multiplicacion.
    def enterMultiplicacion(self, ctx:calculadoraParser.MultiplicacionContext):
        pass

    # Exit a parse tree produced by calculadoraParser#Multiplicacion.
    def exitMultiplicacion(self, ctx:calculadoraParser.MultiplicacionContext):
        pass


    # Enter a parse tree produced by calculadoraParser#Resta.
    def enterResta(self, ctx:calculadoraParser.RestaContext):
        pass

    # Exit a parse tree produced by calculadoraParser#Resta.
    def exitResta(self, ctx:calculadoraParser.RestaContext):
        pass


    # Enter a parse tree produced by calculadoraParser#comparacion.
    def enterComparacion(self, ctx:calculadoraParser.ComparacionContext):
        pass

    # Exit a parse tree produced by calculadoraParser#comparacion.
    def exitComparacion(self, ctx:calculadoraParser.ComparacionContext):
        pass



del calculadoraParser
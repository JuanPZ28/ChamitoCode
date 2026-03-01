import sys
from antlr4 import *
from calculadoraLexer import calculadoraLexer
from calculadoraParser import calculadoraParser

def main():
    input_code = "si (x<y){ x=x+1;}"

    # 1. Análisis Léxico (Convertir texto en piezas/tokens)
    lexer =  calculadoraLexer(InputStream(input_code))
    stream = CommonTokenStream(lexer)
    
    # 2. Análisis Sintáctico (Validar la estructura de las piezas)
    parser = calculadoraParser(stream)
    tree = parser.archivo() # Empezamos desde la regla 'archivo'

    # 3. Mostrar el resultado
    print("¡Éxito! El compilador entendió el código.")
    print("Estructura detectada:")
    print(tree.toStringTree(recog=parser))#IMPRIMIR ARBOL BINARIO DE EXPRESIONES

if __name__ == '__main__':#EJECUCION DE CODIGO
    main()

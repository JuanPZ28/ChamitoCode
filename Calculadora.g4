grammar calculadora;

// ==========================================
// --- REGLAS DEL PARSER (Estructura) ---
// ==========================================

archivo     : sentencia+ ;

sentencia   : expresion PYC                 # SentenciaExpresion
            | condicional               # SentenciaCondicional
            | asignacion PYC                # SentenciaAsignacion
            | bucle_condicion            # SentenciaBucleCondicion
            | bucle_definido             # SentenciaBucleDefinido
            ;

bucle_definido: POR PAREN_IZQ asignacion PYC comparacion PYC expresion PAREN_DER
                 LLAVE_IZQ sentencia+ LLAVE_DER;

condicional :   SI PAREN_IZQ comparacion PAREN_DER 
              LLAVE_IZQ sentencia+ LLAVE_DER 
              (O LLAVE_IZQ sentencia+ LLAVE_DER)? ;

bucle_condicion: MIENTRAS PAREN_IZQ comparacion PAREN_DER 
                LLAVE_IZQ sentencia+ LLAVE_DER ;
            
asignacion  : ID IGUAL expresion ;

expresion   : expresion MULT expresion      # Multiplicacion
            | expresion DIV expresion       # Division
            | expresion SUMA expresion      # Suma
            | expresion RESTA expresion     # Resta
            | NUMERO                        # Numero
            | ID                            # Variable
            | PAREN_IZQ expresion PAREN_DER # Parentesis
            ;
comparacion : expresion (IGUAL_QUE | MAYOR_QUE | MENOR_QUE) expresion ;
// ==========================================
// --- REGLAS DEL LEXER (Alfabeto) ---
// ==========================================

// Palabras reservadas
SI        : 'si' ;
O     : 'sino' ;
MIENTRAS : 'mientras';
POR : 'por';
// Operadores y símbolos
IGUAL     : '=' ;
IGUAL_QUE : '==' ;
MAYOR_QUE : '>' ;
MENOR_QUE : '<' ;
SUMA      : '+' ;
RESTA     : '-' ;
MULT      : '*' ;
DIV       : '/' ;
PYC       : ';' ;
PAREN_IZQ : '(' ;
PAREN_DER : ')' ;
LLAVE_IZQ : '{' ;
LLAVE_DER : '}' ;

// Identificadores y números
ID        : [a-zA-Z_][a-zA-Z0-9_]* ;//IDENTIFICADOR
NUMERO    : [0-9]+ ('.' [0-9]+)? ;

// Ignorar espacios
WS        : [ \t\r\n]+ -> skip ;
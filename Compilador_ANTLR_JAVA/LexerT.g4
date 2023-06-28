lexer grammar LexerT;


PLAY: 'play' ;
LISTEN : 'listen' ;
L_PAR : '(';
R_PAR : ')';

VARENT : 'TEMPO' ;
VARACO : 'ACORDE';
VARBOL : 'STATE' ;

SUMA : 'mf';
RESTA : 'mp';
MULTIPLICACION : 'f' ; 
DIVISION : 'p';

COMA : ',' ;
ASIG : '::';

STATE :  'sound' | 'silent' ;

RAIZ_CUAD : 'pp' ;
ELEVADO : 'ff';
SIN : 'Onda Sinusoide';
CIE : 'Onda Cierra' ;

NULO : 'mute' ;
PI : '3.141592';
DO : '261.63' ;
RE : '293.66' ;
MI : '329.63' ;

SI_PRIMERA : 'Si';
SI_SEGUNDA : 'es Consonante';
SINO : 'No ser Disonante' ;

O : 'dd';
Y :'d_d';

RELACION : MAYOR | MAYOR_IGUAL | MENOR | MENOR_IGUAL | IGUAL | DISTINTO;

MAYOR : 'M' ; 
MAYOR_IGUAL : 'Me';
MENOR : 'm' ;
MENOR_IGUAL : 'me' ;
IGUAL : 'e' ;
DISTINTO : 'ne' ;

PARIZQ : '<' ;
PARDER : '>' ;

MIENTRAS : '|:|';

PARA_1 : '*' ;
PARA_2 : '$' ;

COR_1 : '[';
COR_2 : ']';

DOS_P : ':';

TEMPO : [-]?[0-9]+ ;
ACORDE : '"'[a-zA-Z0-9 :?!,;.]+'"' ;
VARIABLE : [a-zA-Z]+[a-zA-Z0-9_]*;
WS : [ \t\r\n]+ -> skip ;

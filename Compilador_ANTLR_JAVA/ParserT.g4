grammar ParserT;
import LexerT;

program   :  statement+ ;
          
statement : play | listen | oper_arit | declaracion | son_dison | mientras | para;

play      : PLAY L_PAR (TEMPO | ACORDE | VARIABLE | oper_arit | STATE)+ R_PAR ;

listen    : LISTEN L_PAR  ((VARENT | VARACO | VARBOL)  VARIABLE) R_PAR ; 

declaracion : VARENT VARIABLE (ASIG (oper_arit))?			# declarEnt
			| VARACO VARIABLE (ASIG (ACORDE | VARIABLE))?	# declarAco
			| VARBOL VARIABLE (ASIG (STATE | VARIABLE))?	# declarBol
			;
			
son_dison	: SI_PRIMERA condicion  SI_SEGUNDA statement+ (SINO statement+)?;	
condicion	: VARBOL VARIABLE 															# VarBolSiNo
			| PARIZQ (ACORDE | VARIABLE) COMA (ACORDE | VARIABLE) PARDER				# CondCadSiNo
			| L_PAR oper_arit RELACION oper_arit R_PAR									# OperAritSINO
			| STATE																		# StateSiNo
			| condicion Y condicion														# condOperY
			| condicion O condicion														# condOperO
			;

mientras	: MIENTRAS condicion MIENTRAS statement+ MIENTRAS;

para : PARA_1 VARIABLE PARA_2 COR_1 oper_arit DOS_P oper_arit DOS_P oper_arit COR_2 PARA_1 statement+ PARA_1;

oper_arit : SUMA L_PAR oper_arit COMA oper_arit R_PAR 				# Sum
		  | RESTA L_PAR oper_arit COMA oper_arit R_PAR 				# Resta
		  | MULTIPLICACION L_PAR oper_arit COMA oper_arit R_PAR 	# Mul
		  | DIVISION L_PAR oper_arit COMA oper_arit R_PAR 			# Div
		  | TEMPO										   			# Num
		  | VARIABLE  									  			# Var
		  | RAIZ_CUAD L_PAR oper_arit R_PAR							# Raiz
		  | SIN  oper_arit											# Sin
		  | CIE  oper_arit 											# Cos
		  | ELEVADO L_PAR oper_arit COMA oper_arit R_PAR 			# Elev
		  ;

			

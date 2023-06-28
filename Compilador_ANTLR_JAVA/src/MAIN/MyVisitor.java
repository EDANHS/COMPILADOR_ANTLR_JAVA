package MAIN;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.SocketPermission;
import java.util.*;

import javax.print.DocFlavor.STRING;

import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

import ANTLR.LexerT;
import ANTLR.ParserTBaseVisitor;
import ANTLR.ParserTParser;
import ANTLR.ParserTParser.StatementContext;


public class MyVisitor extends ParserTBaseVisitor<Integer> {

	public String tokenName(Object nodo) {
		if (nodo instanceof TerminalNodeImpl) {
			TerminalNodeImpl nodoTerminal = ((TerminalNodeImpl) nodo);
			return LexerT.VOCABULARY.getSymbolicName(nodoTerminal.getSymbol().getType());
		}
		RuleContext nodoTerminal = (RuleContext) nodo;
		String nombre = nodoTerminal.getClass().getSimpleName();
		
		return nombre.substring(0, nombre.length() - 7);
	}

	private HashMap<String,Variable> variables = new HashMap<String,Variable>();

	@Override 
	public Integer visitStatement(ParserTParser.StatementContext ctx) { 

		return visitChildren(ctx); 
	}

	@Override 
	public Integer visitPlay(ParserTParser.PlayContext ctx) { 
		for(int i = 2 ; i < ctx.getChildCount() - 1; i++){
			String token = tokenName(ctx.getChild(i));

			if(token.equals("VARIABLE")){
				Variable aux = variables.get(ctx.getChild(i).getText());	
				if(aux.getTipoVariable().equals("ACORDE")){
					System.out.println(aux.convertValString());
				}
				if(aux.getTipoVariable().equals("TEMPO")){
					System.out.println(aux.convertValInt());
				}
				if(aux.getTipoVariable().equals("STATE")){
					System.out.println(aux.getValorVariable());
				}
				continue;
			}
			if(token.equals("TEMPO")){
				System.out.println(Integer.parseInt(ctx.getChild(i).getText()));
				continue;
			}
			if(token.equals("ACORDE")){
				System.out.println(obteneString(ctx.getChild(i).getText()));
				continue;
			}
			if(token.equals("STATE")){
				System.out.println(ctx.getChild(i).getText());
				continue;
			}else{
				int value = visit(ctx.getChild(i));
				System.out.println(value);
			}
		}	
		return visitChildren(ctx); 
	}


	@Override 
	//Codigo para tomar datos por consola
	public Integer visitListen(ParserTParser.ListenContext ctx) throws IOException {
		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		//leo en la consola
		String line = lector.readLine();
		//obtengo el tipo de token
		String typeToken = ctx.getChild(2).getText();
		//obtengo el nombre de la variable
		String variable = ctx.getChild(3).getText();
		//lo meto en el mapa
		variables.put(variable, new Variable(variable,typeToken,line));
		return visitChildren(ctx); 
	}

	@Override 
	//Implementacion de la suma
	public Integer visitSum(ParserTParser.SumContext ctx) { 
		int izq = visit(ctx.oper_arit(0));
		int der = visit(ctx.oper_arit(1));
		return izq+der; 
	}

	@Override 
	//Implementacion de la resta
	public Integer visitResta(ParserTParser.RestaContext ctx) { 
		int izq = (int) visit(ctx.oper_arit(0));
		int der = (int) visit(ctx.oper_arit(1));
		return izq-der;  
	}

	@Override
	//Implementacion de la multiplicacion 
	public Integer visitMul(ParserTParser.MulContext ctx) { 
		int izq = (int) visit(ctx.oper_arit(0));
		int der = (int) visit(ctx.oper_arit(1));
		return izq*der;  
	}

	@Override 
	//Implementacion de la multiplicacion
	public Integer visitDiv(ParserTParser.DivContext ctx) { 
		int izq = (int) visit(ctx.oper_arit(0));
		int der = (int) visit(ctx.oper_arit(1));
		return izq/der;  
	}

	@Override 
	//Convertir un valor del contexto a numero
	public Integer visitNum(ParserTParser.NumContext ctx) { 
		Integer val = Integer.parseInt(ctx.getChild(0).getText());
		return val; 
	}

	@Override 
	//Obtener el valor de una variable numerica
	public Integer visitVar(ParserTParser.VarContext ctx) { 
		Variable aux = variables.get(ctx.getChild(0).getText());
		return aux.convertValInt(); 
	}

	@Override 
	//Declara una variable entera a partir de una variable o una numero
	public Integer visitDeclarEnt(ParserTParser.DeclarEntContext ctx) { 
		//Obtengo la variable del texto
		String variable = ctx.getChild(1).getText();
		//obtengo el tipo de token que es del texto
		String typeToken = ctx.getChild(0).getText();
		//Declarar una Variable a guardar en el mapa
		Variable aux = null;
		//Si el contexto es un tipo variable significa que si valor esta mapeado
		//por ende deberia buscarlo

		if(tokenName(ctx.getChild(3)).equals("VARIABLE")){
			//mapeo el valor 
			Variable variableMapeada= variables.get(ctx.getChild(3).getText());
			aux = new Variable(variable,typeToken,variableMapeada.getValorVariable());

		}else{
			//Obtengo el valor del texto que deberia ser una representacion numerica
			String valor = visit(ctx.getChild(3)).toString();
			aux = new Variable(variable,typeToken, valor);
		}
		//Lo meto al mapa
		variables.put(variable, aux);		
		return visitChildren(ctx); 
	}

	@Override 
	public Integer visitDeclarAco(ParserTParser.DeclarAcoContext ctx) { 
		//Obtengo la variable del texto
		String variable = ctx.getChild(1).getText();
		//obtengo el tipo de token que es del texto
		String typeToken = ctx.getChild(0).getText();
		//Declarar una Variable a guardar en el mapa
		Variable aux = null;
		String valor = null;
		//Si el contexto es un tipo variable significa que si valor esta mapeado
		//por ende deberia buscarlo

		if(tokenName(ctx.getChild(3)).equals("VARACO")){
			//mapeo el valor 
			Variable variableMapeada= variables.get(ctx.getChild(3).getText());
			valor = variableMapeada.getValorVariable();

		}else{
			//Obtengo el valor del texto que deberia ser una representacion numerica
			valor = ctx.getChild(3).getText();

		}
		//Lo meto al mapa
		aux = new Variable(variable,typeToken, valor);
		variables.put(variable, aux);
		return visitChildren(ctx); 
	}
	
	@Override 
	public Integer visitDeclarBol(ParserTParser.DeclarBolContext ctx) { 
		//Obtengo la variable del texto
		String variable = ctx.getChild(1).getText();
		//obtengo el tipo de token que es del texto
		String typeToken = ctx.getChild(0).getText();
		//Declarar una Variable a guardar en el mapa
		Variable aux = null;
		//Si el contexto es un tipo variable significa que si valor esta mapeado
		//por ende deberia buscarlo
		if(tokenName(ctx.getChild(3)).equals("VARIABLE")){
			//mapeo el valor 
			Variable variableMapeada= variables.get(ctx.getChild(3).getText());
			aux = new Variable(variable,typeToken,variableMapeada.getValorVariable());

		}else{
			//Obtengo el valor del texto que deberia ser una representacion numerica
			String valor = ctx.getChild(3).getText();
			aux = new Variable(variable,typeToken, valor);
		}
		//Lo meto al mapa
		variables.put(variable, aux);
		return visitChildren(ctx); 
	}

	@Override public Integer visitSon_dison(ParserTParser.Son_disonContext ctx) { 
		// Se obtiene una lista de todos los statements en la frase.
		int value = visit(ctx.condicion());
		int tieneElse = EncontrarElse(ctx);

		//Ejecuto el 'If' del programa en caso de que se cumpla la condicion
		if( value == 1 ){
			List<Object> lista1 = new ArrayList<>();
			int limit;
			if(tieneElse == -1) limit = ctx.getChildCount();
			else limit = tieneElse;
			for (int i = 3; i < limit; i++) {
				if (tokenName(ctx.getChild(i)).equals("Statement")){
					lista1.add(ctx.getChild(i));
				}
			}
			for (Object statement : lista1){
				visitStatement((StatementContext) statement);
			}
		}
		//Aqui veo si existe el 'Else' de nuestro programa y obtengo la posicion
		//Luego se ejecutan los statements
		if(value == 0  &&  tieneElse != -1){
			List<Object> lista2 = new ArrayList<>();
			for (int j = tieneElse ; j < ctx.getChildCount() ; j++){
				if (tokenName(ctx.getChild(j)).equals("Statement")){
					lista2.add(ctx.getChild(j));
				}
			}
			for (Object statement : lista2){
				visitStatement((StatementContext) statement);
			}
		}
		
		return 0; 
	}
	private Integer EncontrarElse(ParserTParser.Son_disonContext ctx){
		for(int i = 0 ; i < ctx.getChildCount() ; i++){
			if(ctx.getChild(i).getText().equals("No ser Disonante"))
				return i;
		}
		return -1;
	}


	@Override 
	public Integer visitStateSiNo(ParserTParser.StateSiNoContext ctx) { 
		if(ctx.getChild(0).getText().equals("sound"))
			return 1;
		return 0; 
	}

	@Override 
	public Integer visitVarBolSiNo(ParserTParser.VarBolSiNoContext ctx) { 
		Variable value = variables.get(ctx.getChild(1).getText());
		if(value.getValorVariable().equals("sound"))
			return 1;
		return 0; 
	}

	@Override public Integer visitCondCadSiNo(ParserTParser.CondCadSiNoContext ctx) { 
		String izq = null;
		String der = null;

		//Veo si el token izq es una variable y si lo es lo mapeo
		if(tokenName(ctx.getChild(1)).equals("VARIABLE")){
			Variable aux = variables.get(ctx.getChild(1).getText());
			izq = aux.convertValString();
		}else{
			izq = obteneString(ctx.getChild(1).getText());
		}
		//veo si el token der es una variable y si lo es lo mapeo
		if(tokenName(ctx.getChild(3)).equals("VARIABLE")){
			Variable aux = variables.get(ctx.getChild(3).getText());
			der = aux.convertValString();
		}else{
			der = obteneString(ctx.getChild(3).getText());
		}
		if(izq.equals(der)){
			return 1;
		}
		return 0; 
	}

	@Override public Integer visitOperAritSINO(ParserTParser.OperAritSINOContext ctx) {

		int izq = visit(ctx.oper_arit(0));
		int der = visit(ctx.oper_arit(1));

		if(ctx.getChild(2).getText().equals("M")){
			if(izq > der)
				return 1;
			return 0;
		}
		if(ctx.getChild(2).getText().equals("Me")){
			if(izq >= der)
				return 1;
			return 0;
		}
		if(ctx.getChild(2).getText().equals("m")){
			if(izq < der)
				return 1;
			return 0;
		}
		if(ctx.getChild(2).getText().equals("me")){
			if(izq <= der)
				return 1;
			return 0;
		}
		if(ctx.getChild(2).getText().equals("e")){
			if(izq == der)
				return 1;
			return 0;
		}
		if(ctx.getChild(2).getText().equals("ne")){
			if(izq != der)
				return 1;
			return 0;
		}

		return 0; 
	}
	@Override 
	public Integer visitCondOperY(ParserTParser.CondOperYContext ctx) { 
		int izq = visit(ctx.condicion(0));
		int der = visit(ctx.condicion(1));

		if(izq == der){
			return 1;
		}
		return 0;
	}

	@Override 
	public Integer visitMientras(ParserTParser.MientrasContext ctx) { 
		List<Object> lista = new ArrayList<>();
		for (int i = 3; i < ctx.getChildCount()-1; i++) {
			if (tokenName(ctx.getChild(i)).equals("Statement")){
				lista.add(ctx.getChild(i));
			}
		}
		int value = visit(ctx.condicion());
		if(value == 0) return 0;
		while(value == 1){
			for (Object statement : lista){
				visitStatement((StatementContext) statement);
			}
			value = visit(ctx.condicion());
		}
		return 0; 
	}

	@Override 
	public Integer visitPara(ParserTParser.ParaContext ctx) { 
		//Lo mapeo
		String iterator = ctx.getChild(1).getText();
		variables.put(iterator, new Variable(iterator, "TEMPO",ctx.getChild(6).getText()));
		int paso = Integer.parseInt(ctx.getChild(4).getText());
		int limit_izq = Integer.parseInt(ctx.getChild(6).getText());
		int limit_der = Integer.parseInt(ctx.getChild(8).getText());

		Variable aux = variables.get(iterator);
		
		if (aux.convertValInt() < limit_izq || aux.convertValInt() > limit_der)
			return 0;
		
		List<Object> lista = new ArrayList<>();
		for (int i = 11; i < ctx.getChildCount()-1; i++) {
			if (tokenName(ctx.getChild(i)).equals("Statement")){
				lista.add(ctx.getChild(i));
			}
		}
		while(aux.convertValInt() >= limit_izq && aux.convertValInt() <=limit_der){
			//Ejecuto los statementss
			for (Object statement : lista){
				visitStatement((StatementContext) statement);
			}
			//Obtengo el valor de la variable, lo actualizo y meto de nuevo en el mapa
			Integer valor = aux.convertValInt();
			valor+=paso;
			aux.setValorVariable(valor.toString());
			variables.put(iterator, aux);
		}

		return 0; 
	}

	@Override 
	public Integer visitCondOperO(ParserTParser.CondOperOContext ctx) { 
		int izq = visit(ctx.condicion(0));
		int der = visit(ctx.condicion(1));

		if(izq == 1 || der == 1){
			return 1;
		}
		return 0;
	}

	@Override 
	public Integer visitRaiz(ParserTParser.RaizContext ctx) { 
		int val = (int) visit(ctx.oper_arit());

		return (int) Math.sqrt(val); 
	}

	@Override 
	public Integer visitSin(ParserTParser.SinContext ctx) { 
		int value = (int) visit(ctx.oper_arit());
		return (int) Math.sin(value); 
	}

	@Override 
	public Integer visitElev(ParserTParser.ElevContext ctx) { 
		int Izq = (int) visit(ctx.oper_arit(0));
		int Der = (int) visit(ctx.oper_arit(1));

		return (int) Math.pow(Izq, Der); 
	}
	@Override 
	public Integer visitCos(ParserTParser.CosContext ctx) { 
		//funcion triangular
		int n = (int) visit(ctx.oper_arit());
		int value = 0;
		for(int i = 0 ; i < 100 ; i++){
			value += Math.pow(-1, i)*Math.pow(2*i + 1, -2)*Math.sin((2*i + 1) * n);
		}
		return (int) value; 
	}
	public String obteneString(String valorVariable) {
		int n = valorVariable.length();
		return valorVariable.subSequence(1, n-1).toString();
	}
}

class Variable{
	private String nombreVariable;
	private String tipoVariable;
	private String valorVariable;

	public Variable (String nombreVariable, String tipoVariable, String valorVariable){
		this.nombreVariable = nombreVariable;
		this.tipoVariable = tipoVariable;
		this.valorVariable = valorVariable;
	}
	public String getNombreVariable() {
		return nombreVariable;
	}

	public void setNombreVariable(String nombreVariable) {
		this.nombreVariable = nombreVariable;
	}

	public String getTipoVariable() {
		return tipoVariable;
	}

	public void setTipoVariable(String tipoVariable) {
		this.tipoVariable = tipoVariable;
	}

	public String getValorVariable() {
		return valorVariable;
	}

	public void setValorVariable(String valorVariable) {
		this.valorVariable = valorVariable;
	}
	
	public int convertValInt() {
		return (int) Integer.parseInt(valorVariable);
	}
	public String convertValString() {
		int n = valorVariable.length();
		return valorVariable.subSequence(1, n-1).toString();
	}
}
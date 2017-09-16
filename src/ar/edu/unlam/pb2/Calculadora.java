package ar.edu.unlam.pb2;

public class Calculadora {

	private Double operando1;
	private Double operando2;
	private Double ultimoResultado;
	
	public Double Sumar(Double operando1,Double operando2){
	
	ultimoResultado = operando1+operando2;
	return this.ultimoResultado;
	
	}
	
	public Double restar(Double operando1,Double operando2){
	
		ultimoResultado = operando1-operando2;
		return this.ultimoResultado;
	}
	public Double multiplicar(Double operando1,Double operando2){
		
		ultimoResultado = operando1*operando2;
		return this.ultimoResultado;
	}
}

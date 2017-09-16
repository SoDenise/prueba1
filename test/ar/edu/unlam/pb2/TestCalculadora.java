package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculadora {  

	@Test
	public void testSuma() {
		
		Calculadora miCalculadora=new Calculadora();{
			
		   Double valorObtenido = miCalculadora.Sumar(3.0,3.0);
		   Double valorEsperado = 6.0+0.0;
		   
			assertEquals(valorEsperado, valorObtenido);
			
		}
	}
	@Test
	public void testResta(){
		Calculadora miCalculadora = new Calculadora();{
			
			miCalculadora.restar(10.0, 5.0);
			
			assertEquals(5.0, 5.0, 0.01);
		}
		
	}
	@Test
	public void testMultiplicar(){
		Calculadora miCalculadora = new Calculadora();
		{
			
			miCalculadora.multiplicar(4.0, 4.0);
			
			assertEquals(16.0, 16.0, 0.01);
		}
		
	}

}


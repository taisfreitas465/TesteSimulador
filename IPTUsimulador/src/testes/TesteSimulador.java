package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import calculo.Simulador;

public class TesteSimulador extends Simulador {
	
	private Simulador simulador;
	

	@Before
	public void setUp() throws Exception {
	
		this.simulador= new Simulador();
		
	}
	
	@Test
	public void test() {
		double faixa1 = this.simulador.calcularIPTU ("1", 500, 0);
				
		double valorEsperado1=3;
		
		assertEquals(valorEsperado1,faixa1,1.5);
		
	}
	@Test
	public void test2() {
		double faixa2 = this.simulador.calcularIPTU ("2", 250, 1);
				
		double valorEsperado2=5;
		
		assertEquals(valorEsperado2,faixa2,2.0);
	}
	
	@Test
	public void test3() {
		double faixa3 = this.simulador.calcularIPTU ("1", 850, 3);
				
		double valorEsperado3=4;
		
		assertEquals(valorEsperado3,faixa3,1.5);
	}
	
	@Test
	public void test4() {
		double faixa4 = this.simulador.calcularIPTU ("3", 1000, 0);
				
		double valorEsperado4=10;
		
		assertEquals(valorEsperado4,faixa4,0.0);
	}
	
	@Test
	public void test5() {
		double faixa5 = this.simulador.calcularIPTU ("3", 1880, 0);
				
		double valorEsperado5=18;
		
		assertEquals(valorEsperado5,faixa5,2.0);
	}

		
		
		
		
	}



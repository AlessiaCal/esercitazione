package it.alessiacal.calculator;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import it.alessiacal.calculator.Calculator;
import it.alessiacal.calculator.Operazioni;

public class OperazioniTest {

	int n1 = 10;
	int n2 = 2;
	Operazioni operazioni = new Operazioni();
	
	@Test
	void checkSomma() {
		
		int somma = n1 + n2;
		assertEquals(somma, operazioni.somma(n1, n2));
	}
	
	@Test
	void checkSottrazione() {
		
		int sot = n1 - n2;
		assertEquals(sot, operazioni.sottrazione(n1, n2));
	}
	
	@Test
	void checkDivisione() {
		
		float div = n1/n2;
		assertEquals(div, operazioni.divisione(n1, n2));
	}
	
	@Test
	void checkPotenza() {
		
		int pot = (int) Math.pow(n1,n2);
		assertEquals(pot, operazioni.potenza(n1, n2));
	}
	
	@Test
	void checkMedia() {
		
		float m= (n1+n2)/2;
		assertEquals(m, operazioni.media(n1, n2));
	}
	
}

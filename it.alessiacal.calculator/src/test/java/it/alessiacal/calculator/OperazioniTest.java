package it.alessiacal.calculator;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import it.alessiacal.calculator.Calculator;
import it.alessiacal.calculator.Operazioni;

public class OperazioniTest {

	@Test
	void checkSomma() {
		int n1 = 10;
		int n2 = 2;
		Operazioni operazioni = new Operazioni();
		int somma = n1 + n2;
		assertEquals(somma, operazioni.somma(n1, n2));
	}
	
	@Test
	void checkSottrazione() {
		int n1 = 10;
		int n2 = 2;
		Operazioni operazioni = new Operazioni();
		int sot = n1 - n2;
		assertEquals(sot, operazioni.sottrazione(n1, n2));
	}
	
	@Test
	void checkDivisione() {
		int n1 = 10;
		int n2 = 2;
		Operazioni operazioni = new Operazioni();
		float div = n1/n2;
		assertEquals(div, operazioni.divisione(n1, n2));
	}
	
	@Test
	void checkPotenza() {
		int n1 = 10;
		int n2 = 2;
		Operazioni operazioni = new Operazioni();
		int pot = (int) Math.pow(n1,n2);
		assertEquals(pot, operazioni.potenza(n1, n2));
	}
	
	@Test
	void checkMedia() {
		int n1 = 10;
		int n2 = 2;
		Operazioni operazioni = new Operazioni();
		float m= (n1+n2)/2;
		assertEquals(m, operazioni.media(n1, n2));
	}
	
}

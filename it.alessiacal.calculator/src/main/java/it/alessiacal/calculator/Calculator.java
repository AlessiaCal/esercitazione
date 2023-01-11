package it.alessiacal.calculator;

import java.util.Scanner;

public class Calculator {

	int n1;
	int n2;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci il primo valore");
        int n1 = scanner.nextInt();
		System.out.println("Inserisci il secondo valore");
		int n2 = scanner.nextInt();
		
		
		
		Operazioni operazioni = new Operazioni();
		
		operazioni.somma(n1,n2);
		operazioni.sottrazione(n1,n2);
		operazioni.divisione(n1,n2);
		operazioni.potenza(n1,n2);
		operazioni.media(n1,n2);
	}


	
}

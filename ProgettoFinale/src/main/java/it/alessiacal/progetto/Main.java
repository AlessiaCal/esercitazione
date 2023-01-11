package it.alessiacal.progetto;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Quanti eventi vuoi inserire?");
		int n = scanner.nextInt();
		
		int i = 0;
		
		do {
		System.out.println("Inserisci il nome");
        String nome = (String) scanner.next();
		System.out.println("Inserisci la descrizione");
		String descrizione = (String) scanner.next();
		System.out.println("Inserisci il giorno");
        int giorno = scanner.nextInt();
        System.out.println("Inserisci il mese");
        int mese = scanner.nextInt();
        System.out.println("Inserisci l'anno");
        int anno = scanner.nextInt();
		
        System.out.println("L'evento creato è: "+nome+" "+descrizione+" in data "+giorno+"/"+mese+"/"+anno);
		
        i++;
		} while (i<n);
        
		System.out.println("Inserisci il nome del calendario");
        String nomeC = (String) scanner.next();
		System.out.println("Inserisci la descrizione del calendario");
		String descrizioneC = (String) scanner.next();
		
		Calendario calendario = new Calendario();
		
		System.out.println("La lista di eventi in calendario");
		
		Evento evento1 = new Evento("Mario","partita",01,02,2023);
		Evento evento2 = new Evento("Alessia","compleanno",01,11,2023);
		
		calendario.addEvent(evento1);
		calendario.addEvent(evento2);
		
		System.out.println("Il calendario "+nomeC+" è dato dagli eventi: "+ evento1+evento2);
		
	}

}

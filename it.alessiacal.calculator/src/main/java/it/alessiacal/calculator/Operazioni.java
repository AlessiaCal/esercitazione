package it.alessiacal.calculator;

public class Operazioni {

	public int somma(int n1, int n2) {
		int sum = n1 + n2;
		System.out.println("La somma tra "+ n1 + " e "+ n2 +" è: "+sum);
		return sum;
	}
	
	public int sottrazione(int n1, int n2) {
		int sot = n1 - n2;
		System.out.println("La differenza tra "+ n1 + " e "+ n2 +" è: "+sot);
		return sot;
	}
	
	public float divisione(int n1, int n2) {
		float div = n1 / n2;
		System.out.println("La divisione tra "+ n1 + " e "+ n2 +" è: "+div);
		return div;
	}
	
	public int potenza(int n1, int n2) {
		int pot = (int) Math.pow(n1,n2);
		System.out.println(n1 + " elvato "+ n2 +" da: "+pot);
		return pot;
	}
	
	public float media(int n1, int n2) {
		float m = (n1+n2)/2;
		System.out.println("La media tra "+ n1 + " e "+ n2 +" è: "+m);
		return m;
	}
}

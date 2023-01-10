/* in setChannel se il canale è corretto (un numero digitato da tastiera) allora sul file stampa il canale;

 * se invece si inserisce una stringa come canale si entra nel catch e sul file stampa il tipo di errore

 *provando ad usare il metodo logChannel solo per "3.Stampa canale su file" non funziona*/

package it.alessiacal.tv;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class tv {

	final static Logger logger = Logger.getLogger(tv.class);
	int channel;
	
	public static void main(String[] args) {
		tv tv = new tv();
		//tv.logChannel();
		tv.setChannel();

	}

	/*public void logChannel() {
		
		Scanner scanner = new Scanner(System.in);
		
       	System.out.println("Inserisci un canale");
       	int channel = scanner.nextInt();
       	scanner.close(); 
		
       	logger.info("Canale inserito: " + channel);        	    	
         
	}*/

	public void setChannel() {

		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Inserisci un canale");
			int channel = scanner.nextInt();

			logger.info("Canale inserito: " + channel);

		} catch (InputMismatchException inputMismatchException) {

			logger.error("Input Mismatch error");

		} catch (Exception exception) {

			logger.fatal("This is fatal error");
		}

	}

}

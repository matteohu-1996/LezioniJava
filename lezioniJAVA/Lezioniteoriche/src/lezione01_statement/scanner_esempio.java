package lezione01_statement;

import java.util.Scanner;

public class scanner_esempio {
	public static void main(String[] args) {
		
		
		// lo scanner serve ad acquisire input utente. che sianno numeri, stringhe, booleani E sempre lo stesso
		
		Scanner mioScann = new Scanner(System.in);
		
		 System.out.println("inserisci il tuo nome per farti salutare:");
		 String mioNome = mioScann.nextLine();
		 if(mioNome.equals("") || mioNome.equals("".trim())){
			 System.out.println("mi spiace, non puoi accedere, prova a inserire un nome");
		 }else {
		 System.out.println("Benvenuto " + mioNome);
		 }
		 
		 
		System.out.println("inserisci la tua eta");
		int anni = mioScann.nextInt();
		
		System.out.println("Hai " + " anni");
		
		System.out.println("inserisci la tua altezza in metri");
		double altezza = mioScann.nextDouble();
		 System.out.println("sei alto " + altezza + "metri");
		 
		 mioScann.close();
		
		 
		 
	}

}

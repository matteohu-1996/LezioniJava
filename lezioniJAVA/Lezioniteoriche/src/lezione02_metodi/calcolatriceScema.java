package lezione02_metodi;

import java.util.Scanner;

public class calcolatriceScema {
	// Per ogni operazione (+-*/) crea un metodo che accetta 2 parametri e ne restituisce solo 1
	// Nel metodo main testa i singoli metodi 
	// DOPO: nel main utilizza uno scanner per permettere all'utente di inserire prima i 2 numeri e poi l'operazione da eseguire

	public static double addizione (double n, double m) {
	
		double risultato = n + m;
		return risultato;
	}
	
	public static double sottrazione (double n, double m) {
	
		double risultato = n - m;
		return risultato;
	}
	
	public static double moltiplicazione (double n, double m) {
		double risultato = n*m;
		return risultato;
	}
	
	public static double divisione(double n, double m) {
		double risultato = n / m;
		return risultato;
	}
	
	public static void main(String[] args) {
				
		System.out.println("Addizione: " + addizione(2354, 2346));
		System.out.println("Sottrazione: " + sottrazione(34546, 2357));
		System.out.println("Moltiplicazione: " + moltiplicazione(235, 78));
		System.out.println("Divisione: " + divisione(1900, 2));
		
		
		
		Scanner scan = new Scanner(System.in);

		boolean uscita = false;
		while(!uscita) {
			System.out.println("Inserisci due numeri. Premi invio per ogni numero");
			
			double n1 = scan.nextDouble();
			double n2 = scan.nextDouble();
			
			String lineaPulizia = scan.nextLine();
			
			String operazione = scan.nextLine();
			System.out.println("Inserisci l'operazione:+-*/");
			
			switch(operazione) {
			case "+": 
				double risultatoAdd = addizione(n1, n2);
				System.out.println("Risultato " + risultatoAdd);
				break;
			case "-":
				double risultatoSott = sottrazione(n1, n2);
				System.out.println("Risultato " + risultatoSott);
				break;
			case "*":
				double risultatoMolt = moltiplicazione(n1, n2);
				System.out.println("Risultato " + risultatoMolt);
				break;
			case "/":
				if (n2 != 0) {
					double risultatoDiv = divisione (n1,n2);
					System.out.println("Risultato " + risultatoDiv);
					}else {
						System.out.println("Attenzione, stai dividendo per 0 non è possibile");
				}
				break;
			}
			System.out.println("Vuoi fare altri calcoli? Si/No");
			String sino = scan.nextLine();
			
			uscita = (sino.equals("Si")) ? false: true;
	/**
	 * 	if(sino.equalsIgnoreCase("Si")) {
			uscita = false;
			}else if (sino.equalsIgnoreCase("No")){
				uscita = true;
				System.out.println(uscita);
			}
	 */
		}
		
	}
	

}

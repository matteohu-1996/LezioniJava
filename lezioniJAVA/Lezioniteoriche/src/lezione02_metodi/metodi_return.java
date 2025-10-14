package lezione02_metodi;

import jdk.vm.ci.riscv64.RISCV64;

public class metodi_return {
		// TIPO DEL VALORE DI RITORNO
		// Quando ho un valore da restituire devo obbligatoriamente utilizzare la parola chiave return
	
	public static double calcolaQualcosa () {
		double numero = 8 * 2.3;
		return numero;
	}

	public static double calcolaAltro (double num) {
		double risultato = num / 9;
		return risultato;
	}
	
	public static String[] stampaAula() {
		String[] nomiStudenti = {
				"franck",
				"francesco",
				"ajaml",
				"andrea",
				"matteo",
				"pablo",
				"mahdi",
				"hossein"};
				return nomiStudenti;
		};
	
	
	public static void main(String[] args) {
		// devo in qualche modo raccogliere il valore che mi viene restituito dal metodo
		double numero = calcolaQualcosa();
		
		System.out.println(numero * 4);
		
		// Posso anche raccoglierlo nel Syso
		System.out.println(calcolaQualcosa());
		
		// Chiamo calcolaAltro passando un numero in ingresso
		double risultato = calcolaAltro(81.3);
		System.out.println("Il risultato del calcolo è: " + risultato);
		
		//chiamo stampaAula()
		String[] studenti = stampaAula();
		for (int i = 0; i < studenti.length; i++) 		{System.out.println(studenti[i]);
		
		}
	}
}

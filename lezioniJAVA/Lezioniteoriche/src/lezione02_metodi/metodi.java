package lezione02_metodi;

import java.util.Iterator;
import java.util.Scanner;

import lezione01_statement.for_statement;



public class metodi {

		/**
		 * I metodi servono a wrappare codice sotto un unico nome e riutilizzarlo a comando.
		 * Posso scomporre um problema in sotto problemi più piccoli
		 * SINTASSI:
		 * 
		 * public -> modificatore di accesso
		 * static -> IL METODO DICHIARATO STATIC APPARTIENE SOLO ED ESCLUSIVAMENTE ALLA CLASSE NON ALLL'ISTANZA
		 * void, int, String, blooean, int [] -> tipo di ritorno
		 * main -> nomeMetodo
		 * (int n) -> Argomenti
		 * {... body del metodo}
		 */
	
	// Creo un metodo 
	public static void salutaUtente() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Inserisci il tuo nome completo: ");
		String nomeUser = scan.nextLine();
		System.out.println("Ciao " + nomeUser);
	}
	public static void salutaDocente() {
		//Queste due variabili sono delle variabili Locali (esistono solo all'interno di questo metodo).
		// All'esterno non sono raggiungibili
		
		String nomeDoc = "Dario Mennillo";
		String materia = "Java";
		System.out.println("Docente: " + nomeDoc + " - materia: " + materia); 
	}
	
	public static void salutaTutti () {
		// posso chiamare un metodo da un altro metodo ancora
		salutaDocente();
		salutaUtente();
	}
	
	// Parametro di ingresso
	public static void salutaPerNome(String nome) {
		if (nome.equals("Dario")) {
			System.out.println("Ciao " + nome + ", noi forse ci conosciamo");}
			else {
				System.out.println("Ciao " + nome + ", come stai?");
		}
	}
		
		
		public static void salutaRespoCorso(String nomeRespo, String cognomeRespo) {
			System.out.println ("Ciao " + nomeRespo + "  " + cognomeRespo);
		}
	
	public static void main(String[] args) {
	
		// Richiamo il metodo
//		salutaUtente();
		
//		System.out.println(nomeDoc); // io non conosco la var del nomeDoc all'esterno del metodo
		
//		salutaDocente();		
		
		salutaTutti();
		
		salutaPerNome(null);
		
		String[] studenti = {
				"franck",
				"francesco",
				"ajaml",
				"andrea",
				"matteo",
				"pablo",
				"mahdi",
				"hossein"
		};
		for (int i = 0; i < studenti.length; i++) {
			salutaPerNome(studenti[i]);
		}
		salutaRespoCorso("Egle", "Risola");
	}
		
		

}

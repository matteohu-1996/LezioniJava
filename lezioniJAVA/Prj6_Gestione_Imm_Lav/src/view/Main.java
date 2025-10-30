package view;

import java.util.Scanner;

import controller.CorsoController;
import controller.StudentiController;

public class Main {
	private static Scanner scan;
	private static CorsoController corsoCtrl = new CorsoController(scan);
	private static StudentiController studenteCtrl = new StudenteController(scan);
	
	public static void main(String[] args) {
		System.out.println("--- Gestione  Menu---");
		
		scan = new Scanner(System.in);
		boolean flag = true;
		
		do {
			mostraMenu();
			int scelta = scan.nextInt();
			
			switch (scelta) {
			case 1:
				corsoCtrl.inserisciNuovoCorso();
				break;
			case 2: 
				studenteCtrl.inserisciNuovoStudente(corsoCtrl.getTuttiCorsi());
				break;
			case 3:
				corsoCtrl.mostraTuttiCorsi();
				break;
			case 4:
				studenteCtrl.mostraTuttiGliStudenti();
				break;
			case 5:
				scan.nextLine();
				System.out.println("Inserisci nuovo corso: ");
				String titolo = scan.nextLine();
				System.out.println("Inserisci codice del corso: ");
				String codice = scan.nextLine();
				corsoCtrl.inserisciNuovoCorso(titolo, codice);
				
			case 6: 
				scan.nextLine();
				System.out.println("Inserisci nome dello studente: ");
				String nome = scan.nextLine();
				System.out.println("Inserisci cognome dello studente: ");
				String cognome = scan.nextLine();
				studenteCtrl.inserisciNuovoStudente(nome, cognome);
			case 7:
				System.out.println("Arrivederci");
				flag = false;
			default:
				System.out.println("Non capisco il comando");
				break;
			}
		} while (flag);
	}
		
		
		public static void mostraMenu() {
			System.out.println("----- MENU -----");
			System.out.println("1. Inserisci un nuovo corso");
			System.out.println("2. Inserisci un nuovo studente");
			System.out.println("3. Mostra tutti i corsi disponibili");
			System.out.println("4. Mostra tutti gli studenti presenti");
			System.out.println("5. Inserisci un corso nuovo nel DB");
			System.out.println("6. Inserisci un nuovo studente nel DB");
			System.out.println("7. Esci");
			
		}
}

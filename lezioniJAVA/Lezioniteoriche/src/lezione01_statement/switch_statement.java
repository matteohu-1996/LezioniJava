package lezione01_statement;

import java.util.Scanner;

public class switch_statement {
	public static void main(String[] args) {
	 
		//lo switch mi permette di valutare il valore di una variabile dividendola in base a dei casi , a una casistica
		
		int giornoSettimana = 2;
		switch(giornoSettimana) {
		case 1:
			System.out.println("lunedi");
			break;
		case 2:
			System.out.println("martedi");
			break;
		case 3:
			System.out.println("mercoledi");
			break;
		case 4:
			System.out.println("giovedi");
			break;
		case 5:
			System.out.println("venerdi");
			break;
		case 6:
			System.out.println("sabato");
			break;
		case 7:
			System.out.println("domenica");
			break;
		default: // nel default ci sono tutti i casi non valutati, contemplati
			System.out.println("numero di giorno errato");
			break;
		}
		
		// con le stringhe posso fare lo stesso
		System.out.println("in base al giorno della settimana riceverai un commento");
		Scanner scann = new Scanner(System.in);
		System.out.println("Caro utente, inserisci il nome di  un giorno della settimana");
		
		
		String giorno = scann.nextLine();
		
		switch(giorno) {
		case "lunedi":
			System.out.println("la settimana e appena cominciata");
			break;
		case "martedi":
			System.out.println("siamo solo al secondo giorno");
			break;
		// posso anche raggruppare i casi che hanno la stessa risposta
		case "mercoledi":
		case "giovedi":
			System.out.println("siamo nel mezzo della settimana");
			break;
		case "venerdi":
			System.out.println("ultimo giorno di lavoro");
			break;
		case "sabato":
		case "domenica":
			System.out.println("weekend");
			break;
		default:
			System.out.println("hai inserito qualcosa di errato");
		}
		
	
		
		
	}

}

package GiocoDadi;

import java.util.Scanner;

public class Maingioco {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Dado dado1 = new Dado(6, "rosso");
		Dado dado2 = new Dado(6, "blu");
		
		boolean inGioco = false;
		int round = 1;
		
		System.out.println("Premi Invio per iniziare il gioco");
		scanner.nextLine();
		
		inGioco = true;
		while (inGioco) {
			System.out.println("Round: " + round);
		int risultatoDado1 = dado1.lancia();
		int risultatoDado2 = dado2.lancia();
		System.out.println("Risultato Dado Rosso: " + risultatoDado1);
		System.out.println("Risultato Dado Blu:  " + risultatoDado2);
		String statoGioco = (risultatoDado1 == risultatoDado2) ? "Vittoria" : "Sconfitta";
		
		switch (statoGioco) {
		case "Vittoria": 
			System.out.println("Hai vinto " + risultatoDado1);
			inGioco = false;
			break;
		case "Sconfitta":
			System.out.println("Non è doppio perdi il round");
			round++;
			
	System.out.println("Premi invio per lanciasre i dadi nel round" + round + "o digita Esci per uscire");
	String input = scanner.nextLine().trim().toLowerCase();
	if (input.equals("esci")) {
		inGioco = false;
		} break;
		
		}
		System.out.println("Gioco terminato con: " + (round -1) + " round");
		
		}
		
		
		scanner.close();
	}
}

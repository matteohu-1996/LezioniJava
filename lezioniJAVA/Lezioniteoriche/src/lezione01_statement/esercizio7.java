package lezione01_statement;

import java.util.Date;
import java.util.Scanner;

public class esercizio7 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Caro utente, seleziona una voce del menu");

		String scelta = "";

		while (!scelta.equalsIgnoreCase("Esci")) {

			System.out.println("Seleziona una voce del menu");
			System.out.println("---MENU---");
			System.out.println("1- Data di oggi");
			System.out.println("2. Saluta");
			System.out.println("3. Esci");
			System.out.println("----------");

			scelta = scan.nextLine();

			System.out.println("Hai scelto la voce di menù scelta " + scelta);

			switch (scelta) {
			case "data":
			case "1":
				Date dataOggi = new Date();
				System.out.println("La data di oggi è " + dataOggi);
				break;
			case "saluta":
			case "2":
				System.out.println("Chi vuoi salutare? Inserisci il suo nome");
				String nomeUser = scan.nextLine();
				System.out.println("Ciao " + nomeUser + " sai chi ti saluta ?!");
				break;
			case "3":
			case "Esci":
				System.out.println("Hai chiuso il programma");
				break;
			default:
				System.out.println("Scelta non valida");
				break;
			}
		}

		/**
		 * Esercizio8 Scrivi un programma che chieda all'utente il voto di tre esami (da
		 * 0 a 30). Calcola la media e stampa: "Promosso con lode" se la media è
		 * maggiore o uguale a 28 "Promosso" se la media è maggiore o uguale a 18
		 * "Bocciato" se la media è minore di 18 Inoltre, se almeno un voto è inferiore
		 * a 18, stampa anche "Attenzione: hai almeno un esame insufficiente".
		 */

		Scanner input = new Scanner(System.in);

		int[] voti = new int[3];

		double media = 0;

		for (int i = 0; i < voti.length; i++) {

			boolean votoValido = false;

			do {

				System.out.println("Inserisci il voto dell'esame" + (i + 1) + ", il voto va da 0 a 30");
				voti[i] = scan.nextInt();

				if (voti[i] >= 0 && voti[i] <= 30) {
					votoValido = true;
					media += voti[i];

				} else {
					System.out.println("Attenzione, hai inserito voto non valido");
				}
				
				
			} while (!votoValido);

			// calcolo la media
			media = Math.round(media / voti.length);
			// arrontadamento

			System.out.println("La media dei voti è: " + media);

			if (media < 18 && media > 0) {
				System.out.println("Bocciato");

			} else if (media <= 28 && media >= 18) {
				System.out.println("Promosso");
			} else {
				System.out.println("Promosso con Lode");

			}

		}
	}
}

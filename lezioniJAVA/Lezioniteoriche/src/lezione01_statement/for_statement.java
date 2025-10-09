package lezione01_statement;

public class for_statement {
	public static void main(String[] args) {
		
		//for: cicli definiti, il numero di giri è finito
		
		for (int i = 0; i < 3; i++) {
			System.out.println(i);
		}
		
		/**
		 * for( int i = 0; i < 3; i++) {
		 * 
		 * 1 giro => i = 0; 0 < 3 [true]; 1
		 * 2 giro => i = 1; 0 < 3 [true]; 2
		 * 3 giro => i = 2; 0 < 3 [true]; 3
		 * 4 giro => i = 3; 0 < 3 [true]; QUI SI interrompe il ciclo
		 */
		System.out.println("for inverso");
		for (int i = 2; i >= 0; i--) {
			System.out.println(i);
		}
		
		//for con doppia variabile
		for(int a = 0, b = 9; b >= 0; b--, a++) {
			System.out.println("a: " + a + " - b: " + b);	
		}
		
		// for con il break: quando uso il break all'interno di un ciclo for sto interrompendo il ciclo
		//cioe esco proprio fuori dal ciclo
		
		System.out.println("for con il break");
		
		for (int i = 0; i < 10; i++) {
			//voglio interrompere il ciclo quando la i vale 5
			System.out.println(i);
			if (i == 5) {
				break;
			}
		}
		
		// for con il continue: l'uso del continue mi permette di saltare  un giro
		for ( int i = 0; i < 10; i++) {
			if (i ==5) {
				System.out.println("sto saltando questo numero: " + i);
				continue; // in questo punto smette di eseguire  il ciclo e torna su
			}
			System.out.println(i);
		}
	}

}

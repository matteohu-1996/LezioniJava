package lezione03_classi;

public class TesterPersone {
	
	public static void main(String[] args) {
	Persona pers1 = new Persona("Anna", "Rossi", 30, "fqoi209hfafhoi2", 1.70);
	System.out.println(pers1.saluta());
	
	System.out.println(pers1); // Posso stampare direttamente l'oggetto persona e in automatico verrà richiamato il toString(), se non ho il toString viene stampato il puntatore
	
	System.out.println(pers1.saluta("Dario"));
	
	System.out.println(pers1.salta(0.9));
	}
	
	/**
	 * Crea una classe studente con le seguenti proprieteà:
	 * - nome
	 * - cognome
	 * - data di nascita (string)
	 * - email
	 * - materia preferita
	 * - corso iscritto
	 * 
	 * Crea il metodo costruttore senza email. Genera l'email in un altro metodo.
	 * Crea un metodo "presentati".
	 * Crea il metodo toString():
	 */
}

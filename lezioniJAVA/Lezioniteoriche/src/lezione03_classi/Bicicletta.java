package lezione03_classi;

public class Bicicletta {
	
	// Dichiarando final questa prop stabilisco che tutte le bici avranno sempre 2 ruote
	// Queste prop non possono essere cambiate
	final int numRuote = 2;
	final String marca= "Cannondale";
	
	// anche se con valori li posso cambiare
	String modello = "B-bike";
	String tipologia = "Pista";
	
	int marcia = 1;
	int velocita = 0;
	int frequenza = 0; // frequenza pedalata
	
	
	
	public Bicicletta() {
	}
	
	
	public Bicicletta(String modello, String tipologia) {
		this.modello = modello;
		this.tipologia = tipologia;
	}
	
	public void accelera (int incFrenqueza) {
		this.frequenza += incFrenqueza;
		System.out.println("La frequenza attuale è " + this.frequenza + " Hz");
	}
	
	public void decelera (int incFrequenza) {
	this.frequenza -= incFrequenza;
	System.out.println("La frequenza attuale è " + this.frequenza + " Hz");
	}
	
	public void calcolaVel(int marcia) {
		this.velocita = marcia * this.frequenza;
		System.out.println("La velcità attuale è " + this.frequenza + " m/h");
	
	}

	@Override
	public String toString() {
		return "Bicicletta [numRuote=" + numRuote + ", marca=" + marca + ", modello=" + modello + ", tipologia="
+ tipologia + "]";
	}


}

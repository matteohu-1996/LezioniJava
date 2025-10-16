package GiocoDadi;

import java.util.Random;

public class Dado {
	// se non definisco nessun modificatore allora viene usando quello di default
	int numFacce;
	String colore;
	
	Random rand;
	
	public Dado(int numFacce, String colore) {
		
		this.numFacce = numFacce;
		this.colore = colore;
		this.rand = new Random();
		
		System.out.println("Creato un dado " + colore + " con " + numFacce + " facce.");
	}
	
	public int lancia() {
		int faccia = rand.nextInt(this.numFacce) + 1;
		return faccia;
	}
	

}

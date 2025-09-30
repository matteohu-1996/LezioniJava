package lezione00_intro;

public class EsercizioSpesa {
//Crea un sofware per calcolare il totale delle spese che avvengono in famiglia. istanzia 4 variabili : speseGenerali, speseAuto, speseVanze, speseCasa. calcola il totale delle spese, la media delle spese, la media sul trimestre
	public static void main(String[] args) {
		
	short speseGenerali = 600;
	short speseAuto = 300;
	short speseVacanze = 500;
	short speseCasa = 400;
	short spesaTotale = (short) (speseGenerali + speseAuto + speseVacanze + 						speseCasa);
	System.out.println(spesaTotale);
	
	double spesaMedia = (double) (spesaTotale) / (double) (4);
	System.out.println(spesaMedia);
	
	double spesaTrimestre = (double) (spesaTotale) * (double) (3);
	System.out.println(spesaTrimestre);
	
	
	}
}

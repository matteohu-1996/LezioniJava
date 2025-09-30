package lezione00_intro;
	
public class Geometria {
	public static void main(String[] args) {
		
		//Con i seguenti dati calcola area e perimetro 
		
		/**
		 * Rettangolo: base = 18, altezza = 9.4
		 * Triangolo: base = 5.8, altezza = 4.6, lato1 = 6.5, lato2 = 3.2
		 */
		
		double rettangoloBase = 18, rettangoloAltezza = 9.4;
		double rettangoloBase1 = (double) (rettangoloBase) * (double) (2);
		double rettangoloAltezza1 = (double) (rettangoloAltezza) * (double) (2);
		double rettangoloPerimetro = (double) (rettangoloBase1) + (double) (rettangoloAltezza1);
		System.out.println("Perimetro rettangolo: " + rettangoloPerimetro);
		
		double triangoloBase = 5.8, triangoloAltezza = 4.6, lato1 = 6.5, lato2 = 3.2;
		double triangoloperimetro = (double) (triangoloBase) * (double) (triangoloAltezza);
		
		
	}
}

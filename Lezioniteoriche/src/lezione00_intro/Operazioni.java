package lezione00_intro;

public class Operazioni {
	
	public static void main(String[] args) {
		//faccio qualche operazione matematica
		byte num1 = 10;
		byte num2 = 20;
		
		byte somma = (byte) (num1 + num2);
		System.out.println(somma);
		
		short num3 = 50;
		short num4 = 60;
		short somma2 = (short) (num3 + num4);
		System.out.println(somma2);
		
		int num5 = 520;
		int num6 = 74;
		int somma3 = num5 + num6;
		System.out.println(somma3);
		
		//i simboli delle 4 operazioni +-*/
		//svolgi le 4 operazonione con num5 e num6
		int somma4 = num5 + num6;
		System.out.println(somma3);
		int differenza = num5-num6;
		int prodotto = num5 * num6;
		
		
		//nel caso della divisione io sto castando il dato, cioè sto forzando il dato ad essere di un determinato
		double divisione = (double) (num5) / (double) (num6);
		System.out.println(divisione);
	}
}

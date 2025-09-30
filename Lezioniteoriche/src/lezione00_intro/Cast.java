package lezione00_intro;

public class Cast {
	public static void main(String[] args) {
		
		//casting dal più piccolo al più grande
		byte anni = 29;
		short anniSh = (short) anni;
		System.out.println(anniSh);
		int anniInt = (int) anniSh;
		System.out.println(anniInt);
		
		//casting dal più grande al più piccolo
		short numero = 300;
		byte numeroBy = (byte) numero;
		System.out.println(numeroBy);
		
		
		
		}
}

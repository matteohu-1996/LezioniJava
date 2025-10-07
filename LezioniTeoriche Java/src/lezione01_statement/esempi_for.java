package lezione01_statement;

public class esempi_for {
	public static void main(String[] args) {
		
		
	 String[] nomeStudenti = {
			 "Andrea",
			 "Francesco",
			 "Giacomo",
			 "Frank",
			 "Mahdi",
			 "Matteo",
			 "Hossein",
			 "Ajmal",
			 "Pablo"
			 
	 };
	 System.out.println("in classe ci sono presenti " + nomeStudenti.length + " studenti");
	 
	 // voglio leggere il nome di tutti gli studenti
	 for (int i = 0; i < nomeStudenti.length; i++) {
		 System.out.println("ciao " + nomeStudenti[i]);
	 }
	 
	 //leggo elenco al contrario
	 System.out.println("leggo l'elenco al contrario");
	 for (int i = nomeStudenti.length - 1; i >= 0; i--) {
		 System.out.println("ciao " + nomeStudenti[i]);
	 }
	 
	 //posso leggere gli array usando il foreach. questo e un for ottimizzato per gli array
	 System.out.println("leggo con il foreach");
	 for (String nome : nomeStudenti) {
		 System.out.println(nome);
	 }
	 
	 // calcola la somma di tutti i primi 100 numeri
	 
	 /*int somma = 0;
	 
	 for (int i = 0; i <=100; i++) {
		 somma += i;
		 System.out.println("la somma dei primi 100: " + somma);	 
	 }*/
	 
	 
	 
	}

}

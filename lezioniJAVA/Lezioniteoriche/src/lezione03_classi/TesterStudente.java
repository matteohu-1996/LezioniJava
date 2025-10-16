package lezione03_classi;


public class TesterStudente {
	public static void main(String[] args) {
		
		Studente stud1 = new Studente("Aldo", "Baglio", "13-04-1979", "Scienze", "Studio dei minerali");
		 
		System.out.println(stud1.email);
		System.out.println(stud1);
		System.out.println(stud1.presentazione());
		
	
	Studente[] classe = new Studente[10];
	
	classe[0] = new Studente("Giacomo", "Poretti", "1960", "Scienze" , "Studio");
	classe[1] = new Studente("Giovanni", "Storti", "1960", "Scienze" , "Studio");
	classe[2] = stud1;
	for (Studente studente : classe) {
		System.out.println(studente.presentazione());
	}
	}


}

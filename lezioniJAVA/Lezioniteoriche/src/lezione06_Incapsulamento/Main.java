package lezione06_Incapsulamento;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		//Costruttore
	Persona pers1 = new Persona("Aldo", "Baglio");
//	System.out.println(pers1.nome);
//	pers1.nome = "Giovanni"; // essendo il nome public sto direttamente accedendo alla possibilità di cambiare il nome
//	System.out.println(pers1.nome);
	
	// Dal momento in cui rendo private le mie proprietà non ci posso più accedere nè in lettura nè scrittura

	System.out.println(pers1.getNome() + " " + pers1.getCognome());
	
	pers1.setNome("Giovanni", "abc123");
	
	System.out.println(pers1);
	
	Corso corso1 = new Corso("ep_2025", 200);
	
	List<Studente> studentiIscritti = new ArrayList<>();
	studentiIscritti.add(new Studente("Mario", "Rossi", 2025));
	studentiIscritti.add(new Studente("Paolo", "Bianchi", 2024));
	studentiIscritti.add(new Studente("Gianna", "Bianchi", 2025));
	studentiIscritti.add(new Studente("Giovanni", "Marro", 2025));
	
	corso1.setStudenti(studentiIscritti);
	
	
	
	
	RespoCorso resp1 = new RespoCorso("Egle", "Risola", 10);
	
	resp1.setCorso(corso1);
	corso1.setRespo(resp1);
	System.out.println(corso1);
	
	
	System.out.println(resp1.getNome() + " " + resp1.getCognome());
	System.out.println(resp1);
	}
}

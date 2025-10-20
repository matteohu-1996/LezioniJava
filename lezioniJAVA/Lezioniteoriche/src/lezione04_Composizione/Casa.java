package lezione04_Composizione;

import java.util.ArrayList;
import java.util.List;

public class Casa {
	
	String indirizzo;
	int numCivico;
	double area;
	boolean abitata;
	
	List<Stanza> stanze = new ArrayList<Stanza>();

	public Casa(String indirizzio, int numCivico) {
		this.indirizzo = indirizzo;
		this.numCivico = numCivico;
	}
	
	public void aggiungiStanza(Stanza stanza) {
		this.stanze.add(stanza);
		calcolaSuperfTotale();
	}
	
	public void eliminaStanza(int indiceStanza) {
		this.stanze.remove(indiceStanza);
		calcolaSuperfTotale();
	}
	
	public void aggiungiVanoAccessorio(Stanza stanza) {
		if (stanza.nome.equals("cantina") || stanza.nome.equals("garage") || stanza.nome.equals("soffitta")) {
			this.aggiungiStanza(stanza);
		}else {
			System.out.println("Vano accessorrio non corrispondete");
		}
			
		}
	public double calcolaSuperfTotale() {
		double areaTotale = 0;
	
		for (Stanza stanza : stanze) {
			areaTotale += stanza.superficie;
		}
		return areaTotale;
	}
	public void visualizzaCasa() {
		System.out.println("La casa si trova in " + this.indirizzo + this.numCivico);
	
		System.out.println("composizione della casa: ");
		for (Stanza stanza : stanze) {
			System.out.println("Stanza: "+ stanza.id + " - "  + stanza.nome + " - " + stanza.superficie + " mq");
		}
		
		System.out.println("Area Totale: " + calcolaSuperfTotale());
		System.out.println("Valore stimato: " + calcolaPrezzoCasa() + " €");
	}
	
	public double calcolaPrezzoCasa() {
		double Prezzo_Medio_Mq = 1500.00;
		double areaTotaleCasa = calcolaSuperfTotale();
		return Prezzo_Medio_Mq * areaTotaleCasa;
	
	}
	
	public void rimuoviStanza(Stanza stanza) {
		stanze.remove(stanza);
		calcolaSuperfTotale();
	}
	
	
	
	
	// Crea un metodo per calcolare il prezzo della casa al mq sapendo  che un appartamento può costare in media 1500€ al mq.
	// crea un metodo per eliminare una stanza passando la stanza da eliminare
	// crea un metodo per aggiungere un vano accessorio tipo "garage", "cantina", "soffitta".
		
		
	

}

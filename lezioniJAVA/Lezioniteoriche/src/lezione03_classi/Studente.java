package lezione03_classi;

public class Studente {

	/**
	 * Crea una classe studente con le seguenti proprieteà:
	 * - nome
	 * - cognome
	 * - data di nascita (string)
	 * - email
	 * - materia preferita
	 * - corso iscritto
	 * 
	 * Crea il metodo costruttore senza email. Genera l'email in un altro metodo.
	 * Crea un metodo "presentati".
	 * Crea il metodo toString():
	 */

	public String nome;
	public String cognome;
	public String dataNascita;
	public String email;
	public String materia;
	public String corso;
	
	public Studente(String nome, String cognome, String dataNascita, String materia, String corso) {
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.materia = materia;
		this.corso = corso;
		this.generaEmail();
	}
		
	// genero Email
	
	public void generaEmail() {
		String nomePulito = this.nome.toLowerCase();
		String cognomePulito = this.cognome.toLowerCase();
		this.email = nomePulito + "." + cognomePulito + "@immaginazionelavoro.it";
		}
	
	public String presentazione() {
		String presenta = "Ciao mi chiamo " + this.nome + " " + this.cognome + " , sono nato il " + this.dataNascita + ", mi piace la materia di " + this.materia + " e sono iscritto al corso di " + this.corso;
		return presenta;
	}

	@Override
	public String toString() {
		return "Studente [nome=" + nome + ", cognome=" + cognome + ", dataNascita=" + dataNascita + ", email=" + email + ", materia=" + materia + ", corso=" + corso + "]";
	}
	 
	
	
}

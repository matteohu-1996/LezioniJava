package model;

public class Studente {
	
	private String nome;
	private String cognome;
	private String codFiscale;
	private String corsoIscritto;
	
	public Studente(String nome, String cognome, String codFiscale, String corsoIscritto) {

		this.nome = nome;
		this.cognome = cognome;
		this.codFiscale = codFiscale;
		this.corsoIscritto = corsoIscritto;
	}
	public String getNome() {
		return nome;
	}
	public String getCognome() {
		return cognome;
	}
	public String getCodFiscale() {
		return codFiscale;
	}
	public String getCorsoIscritto() {
		return corsoIscritto;
	}
	
	public String toCSVString() {
        return nome + "," + cognome + "," + codFiscale + "," + corsoIscritto;
    }
	@Override
	public String toString() {
		return "Studente [nome=" + nome + ", cognome=" + cognome + ", codFiscale=" + codFiscale + ", corsoIscritto="
				+ corsoIscritto + "]";
	}
	
	

}

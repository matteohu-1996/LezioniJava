package model;

import java.util.ArrayList;
import java.util.List;

public class Corso {
	
	private String titolo;
	private String codice;
	private int numPartecipanti;
	private List<Corso> listaCorsi;
	
	
	
	public Corso(String titolo, String codice, int numPartecipanti, List<Corso> listaCorsi) {
		this.titolo = titolo;
		this.codice = codice;
		this.numPartecipanti = numPartecipanti;
		this.listaCorsi = new ArrayList<>();
	}
	public boolean addCorso(Corso corso) {
		if(listaCorsi.size() <= 2) {
			this.listaCorsi.add(corso);
			return true;
		} return false;
	}
	
	public String getTitolo() {
		return titolo;
	}
	public String getCodice() {
		return codice;
	}
	public int getNumPartecipanti() {
		return numPartecipanti;
	}
	public List<Corso> getListaCorsi() {
		return listaCorsi;
	}
	public String toCSVString() {
        return titolo + "," + codice + "," + numPartecipanti;
    }
	
	
	public String infoCorsi() {
		StringBuffer info = new StringBuffer();
		info.append("Info Corso");
		info.append("Nome Corso: " + this.titolo);
		
		if(listaCorsi.size() !=0 ) {
			String corsiIn = "";
		
		for (Corso corso : listaCorsi) {
			corsiIn += "\n" + corso;
			}
		info.append(corsiIn);
		}
		return info.toString();
	}
	
	public int getSize() {
		return this.listaCorsi.size();
	}
	
	@Override
	public String toString() {
		return "Corso [titolo=" + titolo + ", codice=" + codice + ", numPartecipanti=" + numPartecipanti + "]";
	}

}

package controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Corso;
import model.Studente;

public class StudentiController {
	private static final String DB_PATH = "StudentiDB.csv";
	
	private Scanner scanner;
	
	public StudentiController() {
		this.scanner = new Scanner(System.in);
	}
	
	// Inserisce un nuovo Studente nel DB
	public void inserisciNuovoStudente(List<Corso> corsiDisponibili) {
		System.out.println("---Inserisci nuovo studente: ");
		
		System.out.println("Nome: " );
		String nome = scanner.nextLine();
		
		System.out.println("Cognome: ");
		String cognome = scanner.nextLine();
		
		System.out.println("Codice Fiscale: ");
		String codFiscale = scanner.nextLine();
		
		String codiceCorso = "Null";
		
		if (corsiDisponibili.isEmpty()) {
			System.out.println("Nessun corso disponibile");
		} else {
			System.out.println("Corsi disponibili (Codice):");
			for (Corso corso : corsiDisponibili) {
				System.out.println(" - " + corso.getCodice() + ": " + corso.getTitolo());
			}
			System.out.println("Inserisci il codice del corso a cui iscriverti: ");
			codiceCorso = scanner.nextLine().toUpperCase();
		}
		
		Studente nuovoStudente = new Studente (nome, cognome, codFiscale, codiceCorso);
		scriviCorsoSuDB(nuovoStudente.toCSVString(), DB_PATH);
		
		System.out.println("Studente inserito con successo");
	}

	// Scrivo sul DB in modalità append
	private void scriviCorsoSuDB(String csvString, String dbPath) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(DB_PATH, true))) {
			bw.write(csvString);
			bw.newLine();
		} catch (IOException e) {
			System.out.println("Errore durante la scrittura del DB Corsi: " + e.getMessage());
		}
	}
	
	// Legge tutti gli studenti dal file DB
	public List<Studente> getTuttiGliStudenti(){
		List<Studente> studenti = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(DB_PATH))) {
            String linea;
            while ((linea = br.readLine()) != null) {
				if (linea.trim().isEmpty()) continue;
				String[] dati = linea.split(",");
				if (dati.length == 4) {
                    // Ricrea l'oggetto Studente dalla riga CSV
                    studenti.add(new Studente(dati[0], dati[1], dati[2], dati[3]));
                }
			}
		} catch (FileNotFoundException e) {
			System.out.println("CorsiDB.csv non trovato. Verrà creato al primo inserimento");
		} catch(IOException e) {
			System.out.println("Errore durante la lettura del DB corsi: " + e.getMessage());
		}
		return studenti;
	} 
	
	// Mostra tutti gli studenti a console
		public void mostraTuttiGliStudenti() {
			System.out.println("---Elenco Studenti---");
			List<Studente> studenti = getTuttiGliStudenti();
			if (studenti.isEmpty()) {
				System.out.println("Nessun studente presente nel DB");
			} else {
				for (Studente studente : studenti) {
					System.out.println(studente);
				}
			}
		}

}

package controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import model.Corso;

public class CorsoController {
	private static final String DB_PATH = "CorsiDB.csv";
	
	private Corso corso;
	private Scanner scanner;
	
	public CorsoController(Scanner scanner) {
		this.scanner = (scanner);
		
	}
	
	// Inserisce un nuovo corso nel file CSV
	public void inserisciNuovoCorso() {
		System.out.println("Inserisci nuovo corso:");
		try {
			System.out.println("Titolo del corso: ");
			String titolo = scanner.nextLine();
			
			System.out.println("Codice del corso (es. J-01): ");
			String codice = scanner.nextLine();
			
			System.out.println("Numero massimo partecipanti: ");
			int numMax = scanner.nextInt();
			scanner.nextLine();
			
			Corso nuovoCorso = new Corso(titolo, codice, numMax, null);
			scriviCorsoSuDB(nuovoCorso.toCSVString(), DB_PATH);
			// chiama il metodo di scrittura private
			
			System.out.println("Corso inserito con successo");
		
		} catch (InputMismatchException e) {
			
			System.out.println("Errore il numero partecipanti deve essere un intero");
			scanner.nextLine();
		} 
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
	
	// Legge tutti i corsi dal DB
	public List<Corso> getTuttiCorsi(){
		List<Corso> corsi = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(DB_PATH))){
			String linea;
			while ((linea = br.readLine()) != null) {
				String[] dati = linea.split(",");
			}
		} catch (FileNotFoundException e) {
			System.out.println("CorsiDB.csv non trovato. Verrà creato al primo inserimento");
		} catch(IOException e) {
			System.out.println("Errore durante la lettura del DB corsi: " + e.getMessage());
		}
		return corsi;
	} 

	// Mostra i corsi a console
	public void mostraTuttiCorsi() {
		System.out.println("---Elenco Corsi---");
		List<Corso> corsi = getTuttiCorsi();
		if (corsi.isEmpty()) {
			System.out.println("Nessun corso presente nel DB");
		} else {
			for (Corso corso : corsi) {
				System.out.println(corso);
				
			}
		}
	}
}

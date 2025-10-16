package lezione03_classi;

public class Punto {
	 // Descrivo lo stato della mia classe. Scrivo le prop del Punto
	double x;
	double y;
	
	// Dichiaro il costruttore di default. Questo costruttore non è obblligatorio tranne nel caso in cui, in presenza di un costruttore a firma piena voglio utilizzare il costruttore di default
	
	 public Punto () {}
	
	// Quando chiamerò questo costruttore a firma piana gli dovrò passare 	la x e la y
	public Punto(double x, double y) {
		//istanza = parametro
		this.x =x;
		this.y =y;
		
	}
	
	// Attenzione sto facendo overload del metodo costruttore
	
	// Alt shift S generate toString
	// Questo metodo mi fornisce una rappresentazione formato stringa dell'oggetto
	
	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}
	
}

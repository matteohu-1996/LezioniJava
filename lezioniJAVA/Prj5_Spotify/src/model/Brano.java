package model;

public class Brano {

	private String title;
	private String artist;
	private int annoUscita;
	
	public Brano(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	@Override
	public String toString() {
		return "Brano [title=" + title + ", artist=" + artist + ", annoUscita=" + annoUscita + "]";
	}

	
}

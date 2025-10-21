package model;

public class Playlist {
	private String name;
	private String creator;
	private int numBraniTotali;
	private int numOreTotali;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public int getNumBraniTotali() {
		return numBraniTotali;
	}
	public void setNumBraniTotali(int numBraniTotali) {
		this.numBraniTotali = numBraniTotali;
	}
	public int getNumOreTotali() {
		return numOreTotali;
	}
	public void setNumOreTotali(int numOreTotali) {
		this.numOreTotali = numOreTotali;
	}
	@Override
	public String toString() {
		return "Playlist [name=" + name + ", creator=" + creator + ", numBraniTotali=" + numBraniTotali
				+ ", numOreTotali=" + numOreTotali + "]";
	}
	
	

}

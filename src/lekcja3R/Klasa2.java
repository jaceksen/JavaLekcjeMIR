package lekcja3R;

public class Klasa2 {
	
	private int lata;
	private String imie;
	
	public Klasa2(int lata, String imie) {
		this.lata=lata;
		this.imie=imie;
	}
	
	public void wynik() {
		System.out.println("Parametry: " + this.lata + " " + this.imie);
	}
	
}

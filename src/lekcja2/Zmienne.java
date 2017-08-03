package lekcja2;

public class Zmienne {
	
	
	private int lata;
	private String nazwisko;
	
	
	public int getLata() {
		return lata;
	}
	
	public void setLata(int lata) {
		lata = lata + 20;
		this.lata = lata;
	}
	
	public String getNazwisko() {
		return nazwisko;
	}
	
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	
	

}

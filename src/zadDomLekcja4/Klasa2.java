package zadDomLekcja4;

public class Klasa2 {
	private int lata;
	private String imie;

	public Klasa2(int lata, String imie) {
		this.lata = lata;
		this.imie = imie;
	}

	public String wynikZ() {
		//System.out.println(this.imie + " " + "jest mistrzem");
		
		return new StringBuilder().append(this.imie).append(" jest mistrzem").toString();
	}

	public void metoda() {
		System.out.println("Wynik tego działania = " + this.imie + " " + this.lata);
	}

	public int lata7() {

		return this.lata * 7;

	}
}

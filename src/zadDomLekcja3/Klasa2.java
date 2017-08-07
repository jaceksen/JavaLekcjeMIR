package zadDomLekcja3;

public class Klasa2 {
	
	private int zmienna1;
	private String string1;
	
	
	public Klasa2(int zmienna1, String string1) {
		this.zmienna1 = zmienna1;
		this.string1 = string1;
		
	}

	public Klasa2() {
		System.out.println("Konstruktor 1");
	}

	public Klasa2(String con, int y) {
		System.out.println("Konstruktor string i int");
	}

	public int getZmienna1() {
		return zmienna1;
	}

	public void setZmienna1(int zmienna1) {
		this.zmienna1 = zmienna1;
	}

	public String getString1() {
		return string1;
	}

	public void setString1(String string1) {
		this.string1 = string1;
	}
	
	

}

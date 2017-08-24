package lekcja11_static;

public class Student2 {
	
	int numer;
	String imie;
	static String uczelnia="MIR-PIB";

	static void zmienUczelnie() {
		uczelnia="Uniwerek";
	}
	
	public Student2(int n, String i) {
		this.numer = n;
		this.imie = i;
	}
	
	public void wypisz() {
		System.out.println(numer + " " + imie + " " + uczelnia);
	}
	
}

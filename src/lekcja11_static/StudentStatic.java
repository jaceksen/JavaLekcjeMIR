package lekcja11_static;

public class StudentStatic {
	
	int numer;
	String nazwisko;
	static String uczelnia="MIR-PIB";
	
	public StudentStatic(int numer, String nazwisko) {
		this.numer = numer;
		this.nazwisko = nazwisko;
	}
	
	void wypisz() {
		System.out.println(numer + " " + nazwisko + " " + uczelnia);
	}
		
}

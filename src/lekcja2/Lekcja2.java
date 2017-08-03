package lekcja2;

public class Lekcja2 {
	
	
	
	public void mojaMetoda() {
		System.out.println("Wiersz 1");
		System.out.println("Wiersz 2");
	}
	
	public int dodawanie(int x, int y) {
		int wynik = x + y;
		return wynik;
	}
	
	public String mojNapis() {
		return "Wiersz 3";
	}

	public static void main(String[] args) {
		
		Lekcja2 l2 = new Lekcja2();
		
		l2.mojaMetoda();
		
		//int mojWynikzMetody = l2.dodawanie(5, 7);
		//System.out.println("Wynik (wersja 2): " + mojWynikzMetody);
		
		System.out.println("Wynik = " + l2.dodawanie(5, 7));
		
		System.out.println(l2.mojNapis());
		
		Zmienne zmienne = new Zmienne();
		//zmienne.nazwisko = "Seń";
		//System.out.println("Nazwisko: " + zmienne.nazwisko);
		
		zmienne.setLata(50);
		
		System.out.println("Lata:" + zmienne.getLata());		
	
	}

}

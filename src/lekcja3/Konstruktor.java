package lekcja3;

public class Konstruktor {
	
	Konstruktor(){
		System.out.println("Tu konstruktor ...");
	}
	
	Konstruktor(String nazwisko, int numer){
		System.out.println("Konstruktor ze Stringiem i intem");
	}
	
	Konstruktor(String imie){
		this.imie = imie;
		System.out.println("Tu konstruktor 2 ...");
	}
	
	Konstruktor(String sfdsadfsad, String sdfsda){
		
	}
	
	Konstruktor(int x){
		this.imie = "Zenon";
		this.lata = 87;
		System.out.println("Tu konstruktor 3 ...");
	}
	
	private String imie;
	private int lata;
	
	

	public static void main(String[] args) {
		
		System.out.println("Działam ...");
		
		Konstruktor ks = new Konstruktor();
		Konstruktor ks2 = new Konstruktor("Jacek");
		Konstruktor ks3 = new Konstruktor(1);
		Konstruktor ks4 = new Konstruktor("aaa", 1);
		
		//ks.imie = "Jacek";
		//ks.lata = 10;
		
		System.out.println("Imie: " + ks.imie);
		System.out.println("Imie: " + ks2.imie);
		System.out.println("Imie: " + ks3.imie);
		System.out.println("Lata: " + ks3.lata);
	} //koniec main

}

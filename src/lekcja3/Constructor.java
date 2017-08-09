package lekcja3;

public class Constructor {

	Constructor() {
		System.out.println("Tu konstruktor ...");
	}

Constructor(String imie) {
	this.imie = imie;
		System.out.println("Tu konstruktor 2 ...");
	}

Constructor(int x){
	this.imie = "Zenon";
	this.lata = 89;
	System.out.println("Tu konstruktor 3 ...");
}
	private String imie;
	private int lata;

	public static void main(String[] args) {
		System.out.println("Działam");
		Constructor cs = new Constructor();
		Constructor cs2 = new Constructor("Rima");
		Constructor cs3 = new Constructor(1);
		
		// cs.imie = "Rima";
		// cs.lata = 32;
		System.out.println("Imię: " + cs.imie);
		System.out.println("Imię: " + cs2.imie);
		System.out.println("Lata: " + cs3.lata + " " + cs3.imie);
	}// koniec main
}

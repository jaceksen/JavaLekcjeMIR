package lekcja16_object;

public class Klasa1{

	public static void main(String[] args) {
		
		Klasa1 klasa1 = new Klasa1();
		Klasa1 klasa1b = new Klasa1();
		System.out.println(klasa1.hashCode());
		
		if(klasa1.equals(klasa1b)) {
			System.out.println("Klasy takie same.");
		} else {
			System.out.println("Klasy inne");
		}
		
		
		if(klasa1.equals(klasa1)) {
			System.out.println("Klasy takie same.");
		} else {
			System.out.println("Klasy inne");
		}
		
		System.out.println(klasa1.toString());
		System.out.println(klasa1b.toString());

	}

}

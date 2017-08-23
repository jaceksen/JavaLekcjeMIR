package lekcja10_super;

public class Metoda2 extends Metoda1{
	
	void metoda1() {
		System.out.println("Jestem metoda 2");
	}
	
	void zawolajGore() {
		super.metoda1();
	}

}

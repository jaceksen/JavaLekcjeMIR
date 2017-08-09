package lekcja5_this;

public class B {
	
	void metoda1(B obiektB) {
		System.out.println("Uruchomiona metoda1.");
		System.out.println(obiektB);
	}
	
	void metoda2() {
		metoda1(this);
	}

}

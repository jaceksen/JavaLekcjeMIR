package lekcja10_super;

public class Pies extends Zwierzak{
	
	String kolor = "czarny";
	
	void wypiszKolor() {
		System.out.println(kolor);
		System.out.println(super.kolor);
	}
	
	void wypiszKolor(int x) {
		System.out.println(super.kolor);
	}

}

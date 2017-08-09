package lekcja5_this;

public class TestB {

	public static void main(String[] args) {
		B b = new B();
		b.metoda2();
		
		B c = new B();
		c.metoda2();
		
		b.metoda1(b);
		b.metoda1(c);
	}

}

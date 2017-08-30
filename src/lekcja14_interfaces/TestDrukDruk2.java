package lekcja14_interfaces;

public class TestDrukDruk2 implements Druk, Druk2{

	public static void main(String[] args) {
		
		TestDrukDruk2  tdd2 = new TestDrukDruk2();
		
		tdd2.drukuj();

	}

	@Override
	public void drukuj() {
		System.out.println("Drukuję w TestDrukDruk2");
	}

}

package lekcja14_interfaces;

public class TestDrukPokaz implements Druk, Pokaz {

	public static void main(String[] args) {
		
		TestDrukPokaz tdp = new TestDrukPokaz();
		tdp.drukuj();
		tdp.pokazuj();

	}

	@Override
	public void pokazuj() {
		System.out.println("Pokazuję");
	}

	@Override
	public void drukuj() {
		System.out.println("Drukuję");
	}

}

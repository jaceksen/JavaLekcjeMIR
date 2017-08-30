package lekcja14_interfaces;

public class TestBank {

	public static void main(String[] args) {
		
		Bank mbank = new MBank();
		Bank pko = new PKO();
		
		//przykład na polimorfizm w javie
		//obiekt jednego typu (Bank) przyjmuje wiele form
		System.out.println("MBank oproc: " + mbank.oprocentowanie());
		System.out.println("PKO oproc: " + pko.oprocentowanie());

	}

}

package lekcja7;

public class Programista extends Pracownik{
	
	int bonus = 3000;

	public static void main(String[] args) {
		
		Programista programista = new Programista();
		
		System.out.println("Zarobki: " + programista.zarobki);
		System.out.println("Bonus: " + programista.bonus);
	}

}

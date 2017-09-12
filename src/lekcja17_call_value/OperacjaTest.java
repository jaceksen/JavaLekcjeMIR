package lekcja17_call_value;

public class OperacjaTest {

	public static void main(String[] args) {
		
		Operacja op = new Operacja();
		System.out.println("Przed zmianą: " + op.liczba);
		op.zmienLiczbe(500);
		System.out.println("Po zmianie: " + op.liczba);

	}

}

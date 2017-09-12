package lekcja17_call_value;

public class OperacjaTest2 {

	public static void main(String[] args) {
		
		Operacja2 op2 = new Operacja2();
		
		System.out.println("Przed zmianą: " + op2.liczba);
		op2.zmienLiczbe(op2);
		System.out.println("Po zmianie:" + op2.liczba);

	}

}

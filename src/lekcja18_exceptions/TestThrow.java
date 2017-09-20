package lekcja18_exceptions;

public class TestThrow {
	
	static void sprawdz(int wiek) {
		if(wiek<18)
			throw new ArithmeticException("gówniarz");
		else
			System.out.println("Jest OK");
	}

	public static void main(String[] args) {

		try {
		sprawdz(12);
		} catch (ArithmeticException e) {
			System.out.println("Wyjebunda Arithmetic");
		} catch (NullPointerException w) {
			System.out.println("Wyjebunda Null Pointer");
		}
		
		System.out.println("coś tam dalej ...");
	}

}

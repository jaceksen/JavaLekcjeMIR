package lekcja18_exceptions;

public class Arithmetic1 {

	public static void main(String[] args) {

		System.out.println("Napis");

		try {
			int data = 50 / 0;
			System.out.println("Napis2: " + data);
		} catch (ArithmeticException e) {
			System.out.println("Wyjebunda bo dzielenie przez 0.");
		}
		
		System.out.println("Napis 3");
		

	}

}

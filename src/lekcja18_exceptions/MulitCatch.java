package lekcja18_exceptions;

public class MulitCatch {

	public static void main(String[] args) {

		try {
			int a[] = new int[5];
			a[5] = 30 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("out of bounds");
		} catch (Exception e) {
			System.out.println("exceptioin reszta");
		}

		System.out.println("rest of the code...");

	}

}

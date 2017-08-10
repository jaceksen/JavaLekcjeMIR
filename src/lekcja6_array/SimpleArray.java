package lekcja6_array;

public class SimpleArray {

	public static void main(String[] args) {

		int a[] = new int[5];

		a[0] = 10;
		a[1] = 20;
		a[2] = 70;
		a[3] = 40;
		a[4] = 50;
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("Element: " + i + " o wartości: " + a[i]);
		}
		
		
		System.out.println("");
		
		int b[] = {11,12,13,14};
		
		for (int i=0; i<b.length; i++) {
			System.out.println("Element: " + i + " o wartości: " + b[i]);
		}
		
		System.out.println("Element 3: " + b[2]);
		
		b[2] = 222;
		
		for (int i=0; i<b.length; i++) {
			System.out.println("Element: " + i + " o wartości: " + b[i]);
		}
		
		System.out.println("Element 3: " + b[2]);
		

	}
}
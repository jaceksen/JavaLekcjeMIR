package lekcja9_method_overloading;

public class TestOverloading {
	
	
	int dodawanie(int a, int b) {
		return a+b;
	}
	
	double dodawanie(int a, int b, int c) {
		return a+b+c;
	}

	public static void main(String[] args) {

		TestOverloading to = new TestOverloading();
		
		System.out.println(to.dodawanie(4, 3));
		
		System.out.println(to.dodawanie(3, 3, 3));
		
		
	}

}

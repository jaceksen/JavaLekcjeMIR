package lekcja9_method_overloading;

public class Klasa2 {
	
	
	public int dodawanie(int x, int y) {
		return x+y;
	}
	
	public int dodawanie(int x) {
		return x;
	}
	
	public String dodawanie(String napis) {
		return "Napis to: " + napis;
	}
	

	public static void main(String[] args) {

		Klasa2 k2 = new Klasa2();
		
		System.out.println(k2.dodawanie(5, 6));
		
		System.out.println(k2.dodawanie("Jacek Placek"));
		
		System.out.println(k2.dodawanie(10));
		
	}

}

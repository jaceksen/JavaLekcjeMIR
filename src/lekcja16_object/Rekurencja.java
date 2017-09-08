package lekcja16_object;

public class Rekurencja {
	
	static int i=0;
	
	static void p() {
		System.out.println("Hello");
		while(i<20) {
			System.out.println("i:" + i);
			i++;
		p();
		}
	}

	public static void main(String[] args) {

		p();
		
	}

}

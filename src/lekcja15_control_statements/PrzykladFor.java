package lekcja15_control_statements;

public class PrzykladFor {

	public static void main(String[] args) {
		
		for(int i=0; i<20; i++) {
			System.out.println("wartość i to: " + i);
		}
		
		String[] napisy = new String[5];
		
		napisy[0] = "napis 0";
		napisy[1] = "napis 1";
		napisy[2] = "napis 2";
		napisy[3] = "napis 3";
		napisy[4] = "napis 4";

		System.out.println("Wielkość tablicy napisy: " + napisy.length);
		
		//tradycyjne podejście do odczytania tablicy
		for(int i=0; i<napisy.length; i++) {
			System.out.println("Napis: " + napisy[i]);
		}
		
		System.out.println("");
		
		//ulepszone for - do czytania tablicy
		for(String j : napisy) {
			System.out.println("Ulepszony napis: " + j);
		}
		
		
	}

}

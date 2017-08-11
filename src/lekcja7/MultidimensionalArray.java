package lekcja7;

public class MultidimensionalArray {

	public static void main(String[] args) {
		
		int tablica[][] = {{1,2,3,10},{4,5,6,11},{7,8,9,12}};
		
		for(int i=0; i<3;i++) {
			for(int j=0; j<4; j++) {
				System.out.print(tablica[i][j]+" ");
			}
			System.out.println("");
		}
		
		System.out.println("Element 2,2: " + tablica[2][2]);
		
		tablica[2][2] = 1000;
		
		System.out.println("Element 2,2: " + tablica[2][2]);

	}

}

package lekcja15_control_statements;

public class PrzykladForLaballed {

	public static void main(String[] args) {
		
		aa:
			for(int i=1;i<=3;i++) {
				System.out.println("I: " + i);
				
				bb:
					for(int j=1; j<=3; j++) {
						
//						if(j==2) {
//							break;
//						}
						
						System.out.print(" J: " + j);
//						break;
						
						break aa;
						
					}
				
				System.out.println("");
				
				
			}

	}

}

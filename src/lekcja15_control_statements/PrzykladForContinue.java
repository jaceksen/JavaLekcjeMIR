package lekcja15_control_statements;

public class PrzykladForContinue {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			
			if(i==6) {
				continue;
			}
			
			System.out.println("I: " + i);
		}
		
	}

}

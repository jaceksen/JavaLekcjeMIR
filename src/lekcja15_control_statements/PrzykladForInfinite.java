package lekcja15_control_statements;

public class PrzykladForInfinite {

	public static void main(String[] args) {
		
		int i=0;
		
		for(;;) {
			i++;
			System.out.println("I:" + i);
			
			if(i==10000) {
				break;
			}
			
		}

	}

}

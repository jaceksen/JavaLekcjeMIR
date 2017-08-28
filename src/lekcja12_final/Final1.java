package lekcja12_final;

public class Final1 {
	
	private final double pi=3.14;
	final int wiek;
	
	public Final1() {
		this.wiek = 77;
	}
	
	public Final1(int x) {
		this.wiek = x;
	}
	
	public double getPi() {
		return pi;
	}



	public static void main(String[] args) {
		
		Final1 final1 = new Final1();
		Final1 final2 = new Final1(122);
		
		System.out.println("Działam ... " + final1.getPi() + " " + final1.wiek);
		
		System.out.println("Wartości2: " + final2.wiek);
		
		
	}

}

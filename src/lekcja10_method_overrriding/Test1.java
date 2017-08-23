package lekcja10_method_overrriding;

public class Test1 {
	
	static int liczba;

	public static void main(String[] args) {
		
		Motocykl motocykl1 = new Motocykl();
		
		motocykl1.odpal();
		
		Test1 t1 = new Test1();
		Test1 t2 = new Test1();
		
		t1.liczba = 10;
		
		System.out.println(t1.liczba);
		System.out.println(t2.liczba);
		
		
		

	}

}

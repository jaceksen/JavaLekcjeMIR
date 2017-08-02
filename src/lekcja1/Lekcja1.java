package lekcja1;

public class Lekcja1 {
	
	
	
	public static void main(String[] args) {
		
		
		System.out.println("Działam ...");
		
		
		Student st1 = new Student();
		Student st2 = new Student();
		
		st1.wiek = 70;
		st1.imie = "Heniu";
		st1.nazwisko = "Moczymorda";
		
		st2.wiek = 10;
		st2.imie = "Jasiu";
		st2.nazwisko = "Dupa";
		
		
		System.out.println("Student 1 Imie: " + st1.imie + "\n ,nazwisko: " + st1.nazwisko
				+ " ,wiek:" + st1.wiek);
		
		
	}
	
}

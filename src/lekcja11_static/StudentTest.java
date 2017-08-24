package lekcja11_static;

public class StudentTest {

	public static void main(String[] args) {
		
		StudentStatic s1 = new StudentStatic(1,"Jacek");
		StudentStatic s2 = new StudentStatic(2,"Rima");
		StudentStatic s3 = new StudentStatic(3,"Tomek");
		
		s1.wypisz();
		s2.wypisz();
		s3.wypisz();
		System.out.println("");
		
		StudentStatic.uczelnia = "Uniwerek";
		
		s1.wypisz();
		s2.wypisz();
		s3.wypisz();
		System.out.println("");
		
		s2.uczelnia = "Polibuda";
		
		s1.wypisz();
		s2.wypisz();
		s3.wypisz();
		

	}

}

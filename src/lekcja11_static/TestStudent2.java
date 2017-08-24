package lekcja11_static;

public class TestStudent2 {

	public static void main(String[] args) {

		Student2.zmienUczelnie();
		
		Student2 s1 = new Student2(1, "Jacek");
		Student2 s2 = new Student2(2, "Rima");
		//s1.uczelnia="MIR-PIB";
		
		s1.wypisz();
		s2.wypisz();
		
	}

}

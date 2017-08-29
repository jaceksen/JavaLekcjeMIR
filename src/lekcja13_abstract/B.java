package lekcja13_abstract;

public class B extends A{

	public static void main(String[] args) {
		
		A a = new B();
		a.wypisz();
		a.wypisz3();
		
		System.out.println("");
		
		B b = new B();
		b.wypisz();
		b.wypisz3();
	}
	
	void wypisz() {
		System.out.println("Wypisz z klasy B");
	}

	@Override
	void wypisz2() {
		// TODO Auto-generated method stub
		
	}

}

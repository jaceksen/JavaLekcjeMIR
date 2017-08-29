package lekcja13_abstract;

// z klasy typu abstract nie można utworzyć  obiektu
// można ją tylko rozszerzyć
public abstract class A {
	
	//metody abstract nie mają ciała
	//to jest tylko definicja tej metody
	//inne klasy muszą same napisać ciało tej metody
	abstract void wypisz();
	
	abstract void wypisz2();
	
	void wypisz3() {
		System.out.println("To jest wypisz3 z klasy A");
	}

}

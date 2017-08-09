package lekcja5_this;

public class A {
	
	//pierwszy konstruktor
	A(){
		System.out.println("Metoda konstruktora");
		}

	//drugi konstruktor
	A(int x){
		//wywołanie domyślnego konstruktora
		this();
		System.out.println(x);
	}
}

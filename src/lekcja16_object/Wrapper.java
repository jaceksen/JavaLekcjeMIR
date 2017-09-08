package lekcja16_object;

public class Wrapper {

	//autoboxing i unboxing
	//konwersja typów prymitywnych do obiektów i odwrtniei
	public static void main(String[] args) {

		//primitive types/ objects
		//boolean  Boolean
		//char Character
		//byte Byte
		//int Integer
		//long Long 
		//short Short
		//float Float
		//double Double
		
		int a=20;
		
		Integer b = Integer.valueOf(a);
		
		System.out.println("Wartość b: " + b);
		
		Integer c = new Integer(10); //obiekt
		int d = c.intValue(); //to jest zwykły int
		
		int e = c; //unboxing (z obiektu Integer tworzymi int)
		
		System.out.println(c.toString());
		
		
		
	}

}

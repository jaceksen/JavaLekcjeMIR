package lekcja18_exceptions;

public class Ex1 {

	//Checked exceptions
//	The classes that extend Throwable class except RuntimeException 
//	and Error are known as checked exceptions e.g.IOException, SQLException
	
	//Unchecked exceptions
//	The classes that extend RuntimeException are known as unchecked exceptions 
//	e.g. ArithmeticException, NullPointerException, 
//	ArrayIndexOutOfBoundsException etc. 
//	Unchecked exceptions are not checked at compile-time 
//	rather they are checked at runtime.
	
	//Error
	//Error is irrecoverable e.g. OutOfMemoryError, 
	//VirtualMachineError, AssertionError etc.
	
	
	public static void main(String[] args) {
		
		int liczba=10;
		int wynik;
		
		// poniżej unchecke exceptions:
		
		System.out.println("Jakiś napis");
		wynik = liczba/0;
		System.out.println("Jakiś napis 2");
		
		//null pointer exception
		String s=null;  
		System.out.println(s.length());//NullPointerException  
		
		
		//NumberFormatException
		String s1="abc";  
		int i=Integer.parseInt(s1);//NumberFormatException  
		
		int a[]=new int[5];  
		a[10]=50; //ArrayIndexOutOfBoundsException  
		

	}

}

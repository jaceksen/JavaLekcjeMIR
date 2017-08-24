package lekcja11_static;

public class StaticBlock {
	
	static int numerek;
	
	static {
		System.out.println("Jestem w bloku statycznym.");
		numerek = 5;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Jestem w metodzie main.");
		System.out.println(numerek);
		
	}

}

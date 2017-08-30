package lekcja14_interfaces;

public interface Java8Default {
	
	void rysuj();
	
	default void napisz() {
		System.out.println("Piszę coś");
	}
	
	default void napisz2() {
		System.out.println("Piszę 2");
	}

}

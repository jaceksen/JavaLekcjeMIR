package lekcja16_object;

public class Student1 implements Cloneable{
	
	int numer;
	String name;
	
	public Student1() {
	}

	public Student1(int numer, String name) {
		this.numer = numer;
		this.name = name;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}

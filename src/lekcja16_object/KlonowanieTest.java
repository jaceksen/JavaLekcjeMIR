package lekcja16_object;

public class KlonowanieTest {

	public static void main(String[] args){
		
		
		try {
		Student1 s1 = new Student1(1, "student1");
		Student1 s2 = new Student1();
		Student1 s3 = (Student1)s1.clone();
		
		System.out.println(s1.name);
		System.out.println(s2.name);
		System.out.println(s3.name);
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		
		} catch(CloneNotSupportedException c) {
			System.out.println("dupa ...");
		}
		
		
		

	}

}

package lekcja8_dziedziczenie_has;

public class Test1 {

	public static void main(String[] args) {
		
		Student st1 = new Student();
		
		st1.setNazwisko("Zenek");
		st1.setWiek(122);
		
		System.out.println(st1.getNazwisko() + " " + st1.getWiek());
		

	}

}

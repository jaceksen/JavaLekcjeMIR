package lekcja3.zadDom;

public class Klasa1 {
	
	public static void main(String[] args) {
		
		Klasa2 kk2 = new Klasa2();
		
		Klasa2 kk22 = new Klasa2(7);
		
		kk2.setString1("aaaa");
		kk2.setZmienna1(22);
		
		Klasa2 kk3 = new Klasa2(100, "bbbb");
		System.out.println(kk3.getZmienna1());
		System.out.println(kk3.getString1());

	}

}

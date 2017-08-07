package zadDomLekcja3;

import lekcja3.Constructor;;

public class Klasa1 {

	public static void main(String[] args) {
		
		Klasa2 kk2 = new Klasa2();
		Klasa2 kk22 = new Klasa2("Napis", 7);
		kk2.setString1("KKKKKKKK");
	kk2.setZmienna1(89);
	
	
	Klasa2 kk3 = new Klasa2(100, "wwwwww");
	System.out.println(kk3.getString1());
	System.out.println(kk3.getZmienna1());
	}
	
}

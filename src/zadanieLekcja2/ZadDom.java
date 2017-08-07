package zadanieLekcja2;

public class ZadDom {

	public static void main(String[] args) {
		Zmienne2 zmienne = new Zmienne2();
		zmienne.setMiasto("Gdynia");
		zmienne.setNazwisko("Avetyan");
		zmienne.setImie("Rima");
		zmienne.setSuma(3);
		
		
		
System.out.println("Miasto: " + zmienne.getMiasto());
System.out.println("Mieszka tutaj: " + zmienne.getImie() + " " + zmienne.getNazwisko());
System.out.println("Ilość dzieci: " + zmienne.getSuma());
	}

}

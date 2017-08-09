package zadanieLekcja2;

public class Zmienne2 {
	private String miasto;

	public String getMiasto() {
		return miasto;
	}

	public void setMiasto(String miasto) {
		this.miasto = miasto;
	}
	

	
	private String nazwisko;

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	
	private String imie;
	
	
	
	
	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}



	private int suma;

	public int getSuma() {
		
		
		if(suma > 3) {
			System.out.println("False");
		}
		else {
			System.out.println("True");
		}
		
		return suma;
	
	}

	public void setSuma(int suma) {
		this.suma = suma;
	}
	
}

	
	

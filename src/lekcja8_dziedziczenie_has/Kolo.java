package lekcja8_dziedziczenie_has;

public class Kolo {
	
	Kwadrat kwadrat;
	double pi=3.14;
	
	double powierzchnia(int promien) {
		kwadrat = new Kwadrat();
		int liczba1 = kwadrat.kwadratLiczb(promien);
		return liczba1*pi;
	}
	

}

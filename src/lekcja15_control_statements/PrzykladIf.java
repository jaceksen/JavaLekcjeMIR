package lekcja15_control_statements;

import java.util.Scanner;

public class PrzykladIf {
	
	public static Scanner czytacz = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		System.out.print("Wpisz liczbę: ");
		Integer liczba = czytacz.nextInt();
		
		if(liczba>20) {
			System.out.println("Liczba była większa od 20.");
		} else if (liczba >= 10 && liczba <=20) {
			System.out.println("Liczba była pomiędzy 10 a 20.");
		} else {
			System.out.println("Liczba była mniejsza od 10.");
		}

	}

}

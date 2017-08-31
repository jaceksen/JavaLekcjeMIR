package lekcja15_control_statements;

import java.util.Scanner;

public class PrzykladSwitch {

	public static Scanner czytacz = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Wpisz liczbę z zakersu 1 - 4: ");
		Integer liczba = czytacz.nextInt();
		
		switch(liczba) {
		case 1: System.out.println("Liczba " + liczba); break;
		case 2: System.out.println("Liczba " + liczba); break;
		case 3: 
			System.out.println("Liczba " + liczba); 
			break;
		case 4: System.out.println("Liczba " + liczba); break;
		default: System.out.println("Wpisano coś innego.");
		}

	}

}

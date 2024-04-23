package org.lessons.java.geometria;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("inserisci la base del rettangolo:");
		int base = scanner.nextInt();
		System.out.println("inserisci l'altezza del rettangolo");
		int altezza = scanner.nextInt();

		Rettangolo rettangolo = new Rettangolo(base, altezza);

		System.out.println("Perimetro = " + rettangolo.calcolaPerimetro());

	    System.out.println("Area = " + rettangolo.calcolaArea());

	    rettangolo.disegna();
	}
}
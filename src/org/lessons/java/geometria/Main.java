package org.lessons.java.geometria;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Rettangolo rettangolo = new Rettangolo(0, 0); // Dati dell'istanza vuoti per lasciar richiamare con get

		System.out.println("Inserisci la base del rettangolo:");
		rettangolo.setBase(scanner.nextInt());
		System.out.println("Inserisci l'altezza del rettangolo:");
		rettangolo.setAltezza(scanner.nextInt());

		System.out.println("Perimetro: " + rettangolo.calcolaPerimetro());
		System.out.println("Area: " + rettangolo.calcolaArea());
		rettangolo.disegna();

}}
package org.lessons.java.geometria;

import java.util.Scanner;



public class Rettangolo {
     int base;
     int altezza;
    Scanner scanner = new Scanner(System.in);

    Rettangolo() {
        System.out.println("Inserisci la base del rettangolo:");
        base = scanner.nextInt();
        System.out.println("Inserisci l'altezza del rettangolo:");
        altezza = scanner.nextInt();
    }

    int calcolaPerimetro() {
        int Perimetro = (altezza + base) * 2;
        return Perimetro;
    }

    int calcolaArea() {
        int Area = base * altezza;
        return Area;
    }

    public void disegnaRettangolo() {
        for (int i = 0; i < altezza; i++) {
            for (int n = 0; n < base; n++) {
                if (i == 0 || i == altezza - 1 || n == 0 || n == base - 1) {
                    System.out.print("0 ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

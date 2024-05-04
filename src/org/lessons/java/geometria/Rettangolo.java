package org.lessons.java.geometria;

public class Rettangolo {
    private int base;
    private int altezza;

    public Rettangolo(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }
    // codice aggiornato con crrezioni di alessio e get e setter!!!!
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltezza() {
        return altezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    public int calcolaArea() {
        return base * altezza;
    }

    public int calcolaPerimetro() {
        return 2 * (base + altezza);
    }
    public void disegna() {
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
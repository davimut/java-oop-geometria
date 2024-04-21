package org.lessons.java.geometria;

public class Rettangolo {
    
	int base;
	int altezza;
	
    Rettangolo(int base, int altezza){
	this.base = base ;
	this.altezza = altezza;
    };
   
    int calcolaPerimetro() {
    int Perimetro = (altezza + base) * 2 ;
	return Perimetro;
    };

    int calcolaArea() {
    int Area =  base * altezza ;
	return Area;
    };

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


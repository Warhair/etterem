package main;

import modell.Etterem;
import modell.becsi_szelet;
import modell.etel;
import modell.makaroni;

public class etterem_program {

    private Etterem etterem;

    public static void main(String[] args) {
        new etterem_program();
    }

    public etterem_program() {
        etterem = new Etterem(4);
        etterem.rendel(new becsi_szelet(1));
        etterem.rendel(new makaroni(2));
        etterem.leeg();
        etterem.rendel(new makaroni(3));
        etterem.etelKiad(2);
        
        
        etterem = new Etterem(4);
        etterem.rendel(new becsi_szelet(1));
        etterem.rendel(new makaroni(2));
        etterem.rendel(new makaroni(3));
        
        
        System.out.println("étterem ételek 1 kiadása után:");
        etterem.premiumrend();
        etterem.rendel();
        etterem.etelKiad(1);

        System.out.println("étterem ételek 2 kiadása után:");
        etterem.rendel();
        etterem.leeg();

        System.out.println("étterem ételek 3 kiadása után:");
        etterem.etelKiad(3);

    }

}

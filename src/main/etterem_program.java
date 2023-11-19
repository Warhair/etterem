package main;

import modell.Etterem;
import modell.etel;

public class etterem_program {
    
    private Etterem etterem;
    
    public static void main(String[] args) {
        new etterem_program().feladatok();
    }
    
        private void feladatok() {
            etterem = new Etterem(4);
            etterem.rendel();
            etterem.leeg();
            etterem.rendel();
        }
    
}

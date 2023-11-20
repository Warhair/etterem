
package main;

import modell.Etterem;
import modell.etel;
import modell.becsi_szelet;
import modell.makaroni;

public class etterem_program {

    private Etterem etterem;
    public static void main(String[] args) {
       new etterem_program();
    }

    public etterem_program(){
        Etterem etterem=new Etterem();
        etterem = new Etterem(4);
        etterem.Fogad(new makaroni(1));
        etterem.Fogad(new makaroni(2));
        etterem.Fogad(new becsi_szelet(3));
        etterem.Fogad(new becsi_szelet(4));
        
        
        System.out.println("--- mosoda ruhái 2. ÁLTALÁNOS mosás után:");
        etterem.NemPremiumEtkezes();
        etterem.NemPremiumEtkezes();
        EtteremEtel();
        
        System.out.println("--- mosoda ruhái 5. KÍMÉLŐ mosás után:");
        for (int i = 0; i < 5; i++) {
            etterem.PremiumEtkezes();
        }
        EtteremEtel();
    }
        private void EtteremEtel() {
        for (etel etelek : etterem.getetelek()) {
            if(etelek != null){
                System.out.println(etelek);
            }
        }
    }
}

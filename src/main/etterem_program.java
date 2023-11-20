
package main;

import modell.Etterem;
import modell.becsi_szelet;
import modell.makaroni;
import modell.etel;


public class etterem_program {
    private Etterem Eterem;
   
    public static void main(String[] args) {
        new etterem_program();
    }
    public etterem_program(){
        Eterem = new Etterem(4);
        Eterem.bevesz(new becsi_szelet("becsiszelet", true));
        Eterem.bevesz(new becsi_szelet("becsiszelet"));
        Eterem.bevesz(new makaroni("makaroni",true));
        Eterem.bevesz(new makaroni("makaroni"));
        System.out.println("--- Étterem etelei sütés előtt:");
        EtteremEtelei();
        System.out.println("--- Étterem etelei 2. ÁLTALÁNOS sütés után:");
        Eterem.altalanosSutes();
        Eterem.altalanosSutes();
        
        EtteremEtelei();
        
        System.out.println("--- Étterem etelei 5. KÍMÉLŐ sütés után:");
        for (int i = 0; i < 5; i++) {
            Eterem.premiumSutes();
        }
        EtteremEtelei();
        
        System.out.println("--- Étterem etelei 10. ÁLTALÁNOS sütés után:");
        for (int i = 0; i < 10; i++) {
            Eterem.altalanosSutes();
        }
        EtteremEtelei();
       Eterem.leeg();
       Eterem.kiad("becsiszelet");
       Eterem.bevesz(new becsi_szelet("becsiszelet", true));
       Eterem.altalanosSutes();
       Eterem.getEtelek();
    }
    private void EtteremEtelei() {
        for (etel Etermek : Eterem.getEtelek()) {
            if(Etermek != null){
                System.out.println(Etermek);
            }
        }
    }
    
}

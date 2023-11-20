
package modell;

public class Etterem {
    private etel[] etelek;
    private int Asztalokdb;
    
    private enum UzemelesiAllapot {UZEMEL, NEM_UZEMEL, LEEGETT};
    private UzemelesiAllapot allapot;

    public Etterem() {
        this(5);
    }
    public Etterem(int db){
        Asztalokdb=0;
        etelek=new etel[db];
    }
    public void leeg(){
        allapot = UzemelesiAllapot.LEEGETT;
    }
    
    /* a "hagyományos" getUzemel, így enum típust ad vissza 
     * nem szerencsés, mert az enum nem elérhető típus
     * private az osztályban
     * ezt jelzi is az IDE: exporting non-public type through public API
    */
    public UzemelesiAllapot getUzemel(){
        return allapot;
    }
    
    /* a könnyebb használatért: */
    public boolean isUzemel(){
        return allapot == UzemelesiAllapot.UZEMEL;
    }
     public void Fogad(etel etel){
        if (allapot == UzemelesiAllapot.UZEMEL) {
            if (Asztalokdb < etelek.length) {
                etelek[Asztalokdb++] = etel;
            } else {
                System.out.println("Az etterem teljesen megtelt");
            }
        } else {
            nemUzemel();
        }
    }
    
    public void NemPremiumEtkezes(){
        if (allapot == UzemelesiAllapot.UZEMEL) {
            for (etel etelek : etelek) {
                if (etelek != null) {
                    etelek.Premium();
                    etelek.NemPremium();
                }
            }
        } else {
            nemUzemel();
        }
    }
    
    public void PremiumEtkezes(){
        if (allapot == UzemelesiAllapot.UZEMEL) {
            for (etel etelek : etelek) {
                if (etelek != null) {
                    etelek.Premium();
                    etelek.NemPremium();
                }
            }
        } else {
            nemUzemel();
        }
    }
    
    public etel kiad(int AsztalSzama){
        etel r = new vegzett();
        if (allapot == UzemelesiAllapot.UZEMEL) {
            int i = 0;
            while (etelek[i] == null || i < Asztalokdb && !(etelek[i].getAsztalSzama()==AsztalSzama)) {
                i++;
            }
            if (i < Asztalokdb) {
                String tipus = etelek[i] instanceof etel ? "becsi_szelet" : "makaroni";
                System.out.println("Kiadva %s %s!".formatted(AsztalSzama, tipus));
                r = etelek[i];
                etelek[i] = null;//ez is lehetne NemletezoRuha
            } else {
                System.out.println("Nincs ilyen asztal az etteremben!");
            }
            
        } else {
            nemUzemel();
        }
        
        return r;
    }

    public etel[] getetelek() {
        if (allapot == UzemelesiAllapot.UZEMEL) {
            etel[] kiadottetel = new etel[this.etelek.length];
            for (int i = 0; i < Asztalokdb; i++) {
                etel aktualisetel = this.etelek[i];
                if (aktualisetel != null) {
                    kiadottetel[i] = aktualisetel;
                }
            }
            return kiadottetel;
        } else {
            nemUzemel();
            return new etel[0];
        }
    }

    private void nemUzemel() {
        if (allapot == UzemelesiAllapot.NEM_UZEMEL) {
            System.out.println("A Etterem nem üzemel!");
        } else if(allapot == UzemelesiAllapot.LEEGETT){
            System.out.println("A Etterem leégett!");
        }
    }
    
    
    
}

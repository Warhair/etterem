
package modell;


public class Becsi_szelet extends Etel{
        private int mennyiseg=4;

    public Becsi_szelet(int asztalSzama, boolean kifizetett) {
        super(asztalSzama, kifizetett);
    }
    
    public int getMennyiseg(){
        return mennyiseg;
    }
    public void setMennyiseg(int mennyiseg){
        this.mennyiseg=mennyiseg;
    }
        
}

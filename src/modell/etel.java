
package modell;


public abstract class Etel {
    private int asztalSzama;
    private boolean kifizetett;
    
    public Etel(int asztalSzama, boolean kifizetett) {
    this.asztalSzama = asztalSzama;
        this.kifizetett = kifizetett;
    }
    public int getAsztalSzama(){
        return asztalSzama;
    }
    public void setAsztalSzama(){
        this.asztalSzama=asztalSzama;
    }
    public boolean getKifizetett(){
        return this.kifizetett;
    }
    public boolean setKifizetett(){
       return this.kifizetett=kifizetett;
        
    }
}

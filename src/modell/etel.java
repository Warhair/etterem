
package modell;


public abstract class etel {
    private int asztalSzama;
    private boolean kifizetett;
    
    
    
    public etel(int asztalSzama) {
    this.asztalSzama = asztalSzama;
    this.kifizetett = false;
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
    public boolean setKifizetett(boolean kifizetett){
       return this.kifizetett=kifizetett;
    }
    @Override
    public String toString() {
        return "etel{" + "asztalszama=" + asztalSzama + ", kifizetett=" + kifizetett + '}';
    }
    public abstract void NemPremium();
    public abstract void Premium();
}

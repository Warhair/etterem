
package modell;


public class becsi_szelet extends etel{
    private int mennyiseg=4;

    public becsi_szelet(int asztalSzama) {
        super(asztalSzama);
    }
    
    public int getMennyiseg(){
        return mennyiseg;
    }
    public void setMennyiseg(int mennyiseg){
        this.mennyiseg=mennyiseg;
    }
    public  void NemPremium(){
        this.mennyiseg=this.mennyiseg-1;
    }
    public  void Premium(){
    }
}

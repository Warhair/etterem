/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modell;

/**
 *
 * @author dobrocsi.kornel
 */
public class becsi_szelet  extends Etel{
    private enum Meretek {URES, NEGYED_TAL, FEL_TAL, HAROMNEGYED_TAL, EGESZ_TAL}
    private Meretek meret;
    
    public becsi_szelet(String etel_nev, Meretek meret){
        super(etel_nev);
       this.meret = Meretek.EGESZ_TAL;
    }   
    public becsi_szelet(String etel_nev, boolean megrendelve) {
        super(etel_nev, megrendelve);
        this.meret = meret;
    }
    public void osszemegy(){
        /* IDE ajánlása: */
        meret = switch (meret) {
            case EGESZ_TAL -> Meretek.HAROMNEGYED_TAL;
            case HAROMNEGYED_TAL -> Meretek.FEL_TAL;
            case FEL_TAL -> Meretek.NEGYED_TAL;
           case NEGYED_TAL -> Meretek.URES;
           default -> Meretek.URES;
        };
    }
    @Override
    public String toString() {
        String os = super.toString();
        return os + System.lineSeparator() + "\t"
                + "Becsi szelet{" + "meret=" + meret + '}';
    }
    
    @Override
    public void altalanosSutesHatasa() {
        if(meret.ordinal() > 0){
            meret = Meretek.values()[meret.ordinal() - 1];
        }
    }
    

    @Override
    public void kimeloSutesHatasa() {
    }
    
}

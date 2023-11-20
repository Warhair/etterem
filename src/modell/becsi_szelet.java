package modell;

public class becsi_szelet extends etel {

    private enum mennyiseg {
        URES, NEGYED_TAL, FEL_TAL, HAROMNEGYED_TAL, TELE_TAL
    };
    private mennyiseg meny;

    public becsi_szelet(int asztSzama) {
        super(asztSzama);
    }

    public mennyiseg getMeny() {
        return meny;
    }

    public void setMeny(mennyiseg meny, boolean premium) {
        if (premium == false) {
            switch (this.meny) {
                case TELE_TAL:
                    this.meny = meny.HAROMNEGYED_TAL;
                    break;
                case HAROMNEGYED_TAL:
                    this.meny = meny.FEL_TAL;
                    break;
                case FEL_TAL:
                    this.meny = meny.NEGYED_TAL;
                    break;
                case NEGYED_TAL:
                    this.meny = meny.URES;
                    break;
                default:
                    this.meny = meny.TELE_TAL;
            }
        } else {
            this.meny = meny;
        }
    }

    
    
}

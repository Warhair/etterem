package modell;

public abstract class etel {
    
    private int asztSzama;
    private boolean kif;

    public etel(int asztSzama, boolean kif) {
        this.asztSzama = asztSzama;
        this.kif = kif;
    }

    public int getAsztSzama() {
        return asztSzama;
    }

    public boolean isKif() {
        return kif;
    }

    public void setAsztSzama(int asztSzama) {
        this.asztSzama = asztSzama;
    }

    public void setKif(boolean kif) {
        this.kif = kif;
    }
    
    
    
    
}

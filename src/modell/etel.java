package modell;

public abstract class etel {
    
    private int asztSzama;
    private boolean kif;

    public etel(int asztSzama) {
        this.asztSzama = asztSzama;
        this.kif = false;
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

    @Override
    public String toString() {
        return "etel{" + "Asztal Száma=" + asztSzama + ", kifizetett=" + kif + '}';
    }
    
    
    
    
}

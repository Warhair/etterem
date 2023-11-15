package modell;

public abstract class etel {
    
    private String asztSzama;
    private boolean elfogy;

    public etel(String asztSzama, boolean elfogy) {
        this.asztSzama = asztSzama;
        this.elfogy = elfogy;
    }

    public String getAsztSzama() {
        return asztSzama;
    }

    public boolean isElfogy() {
        return elfogy;
    }

    public void setAsztSzama(String asztSzama) {
        this.asztSzama = asztSzama;
    }

    public void setElfogy(boolean elfogy) {
        this.elfogy = elfogy;
    }
    
    
    
    
}


package modell;


public abstract class etel {
    private String etel_nev;
    private boolean megrendelve;
    
    public etel(String etel_nev){
        this.etel_nev = etel_nev;
        this.megrendelve = true;
    }
    
    public etel(String etel_nev, boolean megrendelve) {
        this.etel_nev = etel_nev;
        this.megrendelve = megrendelve;
    }

    public String getEtel_nev() {
        return etel_nev;
    }

    public void setEtel_nev(String etel_nev) {
        this.etel_nev = etel_nev;
    }

    public boolean isMegrendelve() {
        return megrendelve;
    }

    public void setMegrendelve(boolean megrendelve) {
        this.megrendelve = megrendelve;
    }
         

    @Override
    public String toString() {
        return "etel{" + "etel_nev=" + etel_nev + ", megrendelve=" + megrendelve + '}';
    }
    
    
    public abstract void altalanosSutesHatasa();
    public abstract void premiumSutesHatasa();
    
}

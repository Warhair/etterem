package modell;

public class makaroni extends etel{

    private double maka;

    public makaroni(int asztSzama, boolean kif) {
        super(asztSzama, kif);
        maka = 100;
    }

    public double getMaka() {
        return maka;
    }

    public void setMaka(double maka) {
        this.maka = maka;
    }

    @Override
    public String toString() {
        return "makaroni{" + "maradék=" + maka + '}';
    }
    
    
    
}

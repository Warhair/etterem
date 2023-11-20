
package modell;


public class makaroni extends etel {
    private double keszlet;

    public makaroni(int asztalszam) {
        super (asztalszam);
        this.keszlet = 100;
    }
    public double getMakaroni(){
        return keszlet;
    }
    
    public void setMakroni(){
        this.keszlet=keszlet;
    }
    @Override
    public String toString() {
        String to = super.toString();
        return to + System.lineSeparator() + "\t"
                + "Makaroni{" + "keszlet=" + keszlet + '}';
    }
    @Override
    public void NemPremium() {
        keszlet *= .97;
    }

    @Override
    public void Premium() {
        keszlet *= .985;
    }
}

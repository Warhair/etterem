
package modell;


public class makaroni  extends  etel{
    private double menyiseg;
    public makaroni(String etel_nev){
     super(etel_nev);
     menyiseg = 100;
    }
    public makaroni(String etel_nev, boolean megrendelve) {
        super(etel_nev, megrendelve);
        menyiseg = 100;
    }

    public double getMenyiseg() {
        return menyiseg;
    }

    public void setMenyiseg(double menyiseg) {
        this.menyiseg = menyiseg;
    }
    @Override
    public String toString() {
        String os = super.toString();
        return os + System.lineSeparator() + "\t"
                + "Makaroni{" + "menyiseg=" + menyiseg + '}';
    }

   
    @Override
    public void altalanosSutesHatasa()
    {
         menyiseg *= .97;
    }

    @Override
    public void premiumSutesHatasa() {
         menyiseg *= .985;
       
    }
    
}

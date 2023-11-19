package modell;

public class Etterem {

    private etel[] rendelesek;
    private int rendelesekDB;
    private boolean premium;
    private boolean uzemel;

    public Etterem(int rendelesek) {
        this.rendelesek =(etel) rendelesek;
        rendelesekDB = 0;
        uzemel = true;
        premium = false;
    }

    public void rendel(etel etel) {
        //if (uzemel) {
        if (uzemel == true) {
            if (rendelesekDB < rendelesek.length) {
                rendelesek[rendelesekDB++] = etel;
            } else {

                System.out.println("megtelt az étterem!");
            }
        } else {
            System.out.println("nem tud rendelést kapni. Az étterem leégett!");
            uzemel = false;
        }
    }

    public void leeg(){
        uzemel = false;
    }
    
    public void rendel(){
        if(uzemel==true){
            for (etel etel : rendelesek) {
                if(rendelesek != null){
                    if (etel instanceof makaroni){
                        if(premium==false){
                        makaroni mak = (makaroni) etel;
                        mak.setMaka(mak.getMaka() * 0.97);
                        }else{
                            makaroni mak = (makaroni) etel;
                        mak.setMaka(mak.getMaka() * 0.985);
                        }
                        
                    }   
                    }
                    etel.setKif(true);
                }
                
            }
        }
    }
    
    

}

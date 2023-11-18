/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modell;

/**
 *
 * @author dobrocsi.kornel
 */
public class Etterem {
    private etel[] etel;
    private int etelDb;
    private enum UzemelesiAllapot {UZEMEL, NEM_UZEMEL, LEEGETT};
    private UzemelesiAllapot allapot;
    
    public Etterem() {
        etelDb = 10;
    }
    public Etterem(int db){
        etelDb = 0;
        etel = new etel[db];
        allapot = UzemelesiAllapot.UZEMEL;
    }
    public void leeg(){
        allapot = UzemelesiAllapot.LEEGETT;
    }
    public UzemelesiAllapot getUzemel(){
        return allapot;
    }
    public boolean isUzemel(){
        return allapot == UzemelesiAllapot.UZEMEL;
    }
   

}

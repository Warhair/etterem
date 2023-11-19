/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modell;

public class Etterem {
    private etel[] Etel;
    private int etelDb;
    private enum UzemelesiAllapot {UZEMEL, NEM_UZEMEL, LEEGETT};
    private UzemelesiAllapot allapot;
    
    public Etterem() {
        etelDb = 10;
    }
    public Etterem(int db){
        etelDb = 0;
        Etel = new etel[db];
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
    public void bevesz(etel etel){
        if (allapot == UzemelesiAllapot.UZEMEL) {
            if (etelDb < Etel.length) {
                Etel[etelDb++] = etel;
            } else {
                System.out.println("Étterem megtelt!");
            }
        } else {
            nemUzemel();
        }
    }
    private void nemUzemel() {
        if (allapot == UzemelesiAllapot.NEM_UZEMEL) {
            System.out.println("A étterem nem üzemel!");
        } else if(allapot == UzemelesiAllapot.LEEGETT){
            System.out.println("A étterem leégett!");
        }
    }
    public void altalanosSutes(){
        if (allapot == UzemelesiAllapot.UZEMEL) {
            for (etel etelek : Etel) {
                if (etelek != null) {
                    etelek.setMegrendelve(true);
                    etelek.altalanosSutesHatasa();
                }
            }
        } else {
            nemUzemel();
        }
    }
    
    public void kimeloSutes(){
        if (allapot == UzemelesiAllapot.UZEMEL) {
            for (etel etelek : Etel) {
                if (etelek != null) {
                    etelek.setMegrendelve(true);
                    etelek.kimeloSutesHatasa();
                }
            }
        } else {
            nemUzemel();
        }
    }
     public etel kiad(String tulNeve){
        etel e = new NemletezoEtel();
        if (allapot == UzemelesiAllapot.UZEMEL) {
            int i = 0;
            while (Etel[i] == null || i < etelDb && !(Etel[i].getEtel_nev().equals(tulNeve))) {
                i++;
            }
            if (i < etelDb) {
                String tipus = Etel[i] instanceof etel ? "etel" : "becsiszelet";
                System.out.println("Kiadva %s %s!".formatted(tulNeve, tipus));
                e = Etel[i];
                Etel[i] = null;//ez is lehetne NemletezoRuha
            } else {
                System.out.println("Nincs ilyen étel a étterem!");
            }
            
        } else {
            nemUzemel();
        }
        
        return e;
    }

    public etel[] getEtelek() {
        if (allapot == UzemelesiAllapot.UZEMEL) {
            etel[] kiadottRuhak = new etel[this.Etel.length];
            for (int i = 0; i < etelDb; i++) {
                etel aktualisRuha = this.Etel[i];
                if (aktualisRuha != null) {
                    kiadottRuhak[i] = aktualisRuha;
                }
            }
            return kiadottRuhak;
        } else {
            nemUzemel();
            return new etel[0];
        }
    }
}

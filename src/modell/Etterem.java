package modell;

public class Etterem {

    private etel[] rendelesek;
    private int rendelesekDB;
    private boolean premium = false;
    private boolean uzemel = true;

    public Etterem(int rendelesekDB) {
        this.rendelesek = rendelesek;
        this.rendelesekDB = rendelesekDB;
        this.uzemel = true;
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
        }
    }

    public void leeg() {
        uzemel = false;
    }

    public void rendel() {
        if (uzemel == true) {
            for (etel etel : rendelesek) {
                if (rendelesek != null) {
                    if (etel instanceof makaroni) {
                        if (premium == false) {
                            makaroni mak = (makaroni) etel;
                            mak.setMaka(mak.getMaka() * 0.97);
                        } else {
                            makaroni mak = (makaroni) etel;
                            mak.setMaka(mak.getMaka() * 0.985);
                            premium = false;
                        }

                    }

                    if (etel instanceof becsi_szelet) {
                        becsi_szelet becs = (becsi_szelet) etel;
                        becs.setMeny(becs.getMeny(), premium);
                        premium = false;
                    }

                }
                etel.setKif(true);
            }

        }
    }

    public void premiumrend() {
        premium = true;
    }

    public void etelKiad(int asztSzama) {
        etel kivittetel = null;
        if (uzemel = true) {
            int i = 0;
            while (rendelesek[i] == null || i < rendelesekDB && !(rendelesek[i].getAsztSzama() == asztSzama)) {
                i++;
            }

            if (i < rendelesekDB) {
                String tipus = rendelesek[i] instanceof etel ? "étele" : "makaronija";
                System.out.println("Kiadva %s %s!".formatted(asztSzama, tipus));
                kivittetel = rendelesek[i];
                rendelesek[i] = null;
            } else {
                System.out.println("Nincs ilyen rendelés az étteremben!");
            }
        }
    }

}

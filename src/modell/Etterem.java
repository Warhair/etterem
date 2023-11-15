
package modell;

public class Etterem {
    private Etel[] etelek;
    private int Asztalokdb;

    public Etterem() {
        this(5);
    }
    public Etterem(int db){
        Asztalokdb=0;
        etelek=new Etel[db];
    }
    
    
}

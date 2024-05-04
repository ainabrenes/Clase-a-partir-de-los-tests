package clase.a.partir.de.los.tests;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.List;

public class Comanda {
   
    private int numComanda;
    private String nombrePlato;
    private List<Plat> platosComanda=new ArrayList<>();;
    
    public Comanda() {
        this.platosComanda = new ArrayList<>();
    }
    public String getnombrePlato(){
        return this.nombrePlato;

    }
    public void setnombrePlato(String nombrePlato){
        this.nombrePlato=nombrePlato;
    }
    public int getnumComanda(){
        return this.numComanda;

    }
    public void setnumComanda(int numComanda){
        this.numComanda=numComanda;
    }
    public Comanda ( String nombrePlato,int numComanda){
        this.nombrePlato=nombrePlato;
        this.numComanda=numComanda;
    }
    public void afegirPlatComanda(Plat plat) {
        platosComanda.add(plat);
    }
     
    
    
  
/* 
    public void afegirPlatComanda(Plat plat) {
        platosComanda.add(plat);
    }

    public void eliminarPlato(Plat plat) {
        platosComanda.remove(plat);
    }

    public List<Plat> getPlatos() {
        return platosComanda;
    }*/
}

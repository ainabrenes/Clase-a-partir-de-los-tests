package clase.a.partir.de.los.tests;

public class Plat {
    private String nombre;
    private double precio;
    private int numComanda;
    
    public int getnumComanda(){
        return this.numComanda;

    }
    public void setnumComanda(int numComanda){
        this.numComanda=numComanda;
    }
    public String getNombre(){
        return this.nombre;

    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public double getPrecio(){
        return this.precio;

    }
    public void setPrecio(double precio){
        this.precio=precio;
    }
     
    public Plat(int numComanda, String nombre, double precio) {
        this.numComanda = numComanda;
        this.nombre = nombre;
        this.precio = precio;
    }
}

package clase.a.partir.de.los.tests;

import java.util.ArrayList;
import java.util.List;

public class Comanda {
    private List<String> platos;

    public Comanda() {
        this.platos = new ArrayList<>();
    }

    public void añadirPlato(String nombrePlato) {
        platos.add(nombrePlato);
    }

    public void eliminarPlato(String nombrePlato) {
        platos.remove(nombrePlato);
    }

    public List<String> getPlatos() {
        return platos;
    }
}

package clase.a.partir.de.los.tests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Menu {
    HashMap<String, Double> menu = new HashMap<>();
    HashMap<Integer, List<String>> comanda = new HashMap<>();
    Integer ID = 0;
    public List<String> platosComanda;

    public void afegir_plat(String plato, double precio) {

        menu.put(plato, precio);
    }

    public void eliminar_plat(String plato) {

        menu.remove(plato);
    }

    public HashMap<String, Double> llistar_menu() {

        for (Map.Entry<String, Double> entry : menu.entrySet()) {
            System.out.println("Plato: " + entry.getKey() + " Precio: "
                    + entry.getValue());

        }
        return menu;
    }

    public void crearComanda() {

        comanda.put(ID, platosComanda = new ArrayList<>());
        ID++;

    }

    public void afegirPlatComanda(Integer id, String plat) {

        comanda.get(id).add(plat);

    }

    public Double CalcularTotal(Integer id) {

        double total = 0;
        List<String> lista = comanda.get(id);
        for (int i = 0; i < lista.size(); i++) {

            total = total + menu.get(lista.get(i));
        } 
        return total;
    }

    public List<String> MostrarComanda(Integer id) {

        List<String> lista = comanda.get(id);
        for (int i = 0; i < lista.size(); i++) {

            System.out.println("Plat: " + lista.get(i) + " Preu: " + menu.get(lista.get(i)));
        }
        return comanda.get(id);
    }
}

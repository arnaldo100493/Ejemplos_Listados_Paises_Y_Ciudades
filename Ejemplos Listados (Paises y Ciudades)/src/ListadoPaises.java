
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author FABAME
 */
public class ListadoPaises {

    private List<Pais> listadoPaises;

    public ListadoPaises() {
        this.listadoPaises = new LinkedList<>();
    }

    public String agregarPais(Pais pais) {
        this.listadoPaises.add(pais);
        return "País Ingresado.";
    }

    public String imprimirPaises() {
        String s = "";

        Iterator<Pais> iterator = this.listadoPaises.iterator();
        while (iterator.hasNext()) {
            Pais pais = (Pais) iterator.next();
            s += "\n" + pais.getNombre();
        }
        return s;
    }

    public Pais buscarPais(String nombrePais) {
        Iterator<Pais> iterator = this.listadoPaises.iterator();
        while (iterator.hasNext()) {
            Pais pais = (Pais) iterator.next();
            if (pais.getNombre().equals(nombrePais)) {
                return pais;
            }
        }
        return null;
    }

    public Pais buscarPaisConMasHabitantes() {
        int mayor = 0;
        Pais paisMayor = null;

        Iterator<Pais> iterator = this.listadoPaises.iterator();
        while (iterator.hasNext()) {
            Pais pais = (Pais) iterator.next();
            if (pais.getCantidadHabitantes() > mayor) {
                mayor = pais.getCantidadHabitantes();
                paisMayor = pais;
            }
        }
        return paisMayor;
    }

    public String buscarPaisesDeEuropa() {
        String s = "";
        boolean encontrado = false;

        Iterator<Pais> iterator = this.listadoPaises.iterator();
        while (iterator.hasNext()) {
            Pais pais = (Pais) iterator.next();
            if (pais.getContinente().equals("Europa")) {
                s += "\n" + pais.getNombre();
                encontrado = true;
            }
        }

        if (!encontrado) {
            return "No hay países europeos.";
        }

        return s;
    }
}

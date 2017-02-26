/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FABAME
 */
public class Mundo {

    private ListadoCiudades listadoCiudades;
    private ListadoPaises listadoPaises;

    public Mundo() {
        this.listadoCiudades = new ListadoCiudades();
        this.listadoPaises = new ListadoPaises();
    }

    public String agregarCiudad(String nombreCiudad, int cantidadHabitantes, String nombrePais) {
        Pais pais = this.listadoPaises.buscarPais(nombrePais);
        if (pais != null) {
            Ciudad ciudad = new Ciudad(nombreCiudad, cantidadHabitantes);
            ciudad.setPais(pais);
            this.listadoCiudades.agregarCiudad(ciudad);
            return pais.agregarCiudad(ciudad);
        }
        return "País no encontrado.";
    }

    public String agregarPais(String nombrePais, int cantidadHabitantes, String continente) {
        Pais pais = new Pais(nombrePais, cantidadHabitantes, continente);
        return this.listadoPaises.agregarPais(pais);
    }

    public String imprimirCiudadesPorPais(String nombrePais) {
        Pais pais = this.listadoPaises.buscarPais(nombrePais);
        if (pais != null) {
            String s = "";
            s += "\nPAÍS:" + pais.getNombre();
            s += "\nCIUDADES:" + pais.getListadoCiudades();
            return s;
        }
        return "País no encontrado.";
    }

    public String buscarPaisConMasHabitantes() {
        Pais pais = this.listadoPaises.buscarPaisConMasHabitantes();
        if (pais != null) {
            return "El país con más habitantes es: " + pais.getNombre() + ".";
        }
        return "No hay países ingresados.";
    }

    public String buscarPaisesDeEuropa() {
        return this.listadoPaises.buscarPaisesDeEuropa();
    }

    public String buscarPaisPorCiudad(String nombreCiudad) {
        Ciudad ciudad = this.listadoCiudades.buscarCiudad(nombreCiudad);
        if (ciudad != null) {
            Pais pais = ciudad.getPais();
            if (pais != null) {
                return pais.getNombre();
            }
            return "Ciudad sin país asignado.";
        }
        return "Ciudad no encontrada.";
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FABAME
 */
public class Pais {

    private String nombre;
    private int cantidadHabitantes;
    private String continente;
    private ListadoCiudades listadoCiudades;

    public Pais() {
        this.nombre = "";
        this.cantidadHabitantes = 0;
        this.continente = "";
        this.listadoCiudades = new ListadoCiudades();
    }

    public Pais(String nombre, int cantidadHabitantes, String continente) {
        this.nombre = nombre;
        this.cantidadHabitantes = cantidadHabitantes;
        this.continente = continente;
        this.listadoCiudades = new ListadoCiudades();
    }

    public Pais(Pais pais) {
        this.nombre = pais.getNombre();
        this.cantidadHabitantes = pais.getCantidadHabitantes();
        this.continente = pais.getContinente();
        this.listadoCiudades = new ListadoCiudades();
    }

    public String agregarCiudad(String nombre, int cantidadHabitantes) {
        Ciudad ciudad = new Ciudad(nombre, cantidadHabitantes);
        return this.listadoCiudades.agregarCiudad(ciudad);
    }

    public String agregarCiudad(Ciudad ciudad) {
        return this.listadoCiudades.agregarCiudad(ciudad);
    }

    public String getListadoCiudades() {
        return this.listadoCiudades.imprimirCiudades();
    }

    @Override
    public String toString() {
        return "Pais{" + "nombre=" + nombre + ", cantidadHabitantes=" + cantidadHabitantes + ", continente=" + continente + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadHabitantes() {
        return cantidadHabitantes;
    }

    public void setCantidadHabitantes(int cantidadHabitantes) {
        this.cantidadHabitantes = cantidadHabitantes;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }
}

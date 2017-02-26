/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FABAME
 */
public class Ciudad {

    private String nombre;
    private int cantidadHabitantes;
    private Pais pais;

    public Ciudad() {
        this.nombre = "";
        this.cantidadHabitantes = 0;
        this.pais = null;
    }

    public Ciudad(String nombre, int cantidadHabitantes) {
        this.nombre = nombre;
        this.cantidadHabitantes = cantidadHabitantes;
        this.pais = null;
    }

    public Ciudad(Ciudad ciudad) {
        this.nombre = ciudad.getNombre();
        this.cantidadHabitantes = ciudad.getCantidadHabitantes();
        this.pais = null;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "nombre=" + nombre + ", cantidadHabitantes=" + cantidadHabitantes + '}';
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

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FABAME
 */
public class Main {

    public static Console c = new Console("LISTADOS");

    public Main() {

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mundo mundo = new Mundo();

        c.println("Ingrese la cantidad de países:");
        int cantidadPaises = c.readInt();
        for (int i = 0; i < cantidadPaises; i++) {
            c.println("Ingrese el nombre del país:");
            String nombrePais = c.readString();
            c.println("Ingrese la cantidad de habitantes:");
            int cantidadHabitantesPais = c.readInt();
            c.println("Ingrese el continente:");
            String continente = c.readString();

            c.println(mundo.agregarPais(nombrePais, cantidadHabitantesPais, continente));

            c.println("Ingrese la cantidad de ciudades del país:");
            int cantidadCiudades = c.readInt();
            for (int j = 0; j < cantidadCiudades; j++) {
                c.println("Ingrese el nombre de la ciudad:");
                String nombreCiudad = c.readString();
                c.println("Ingrese la cantidad de habitantes:");
                int cantidadHabitantesCiudad = c.readInt();

                c.println(mundo.agregarCiudad(nombreCiudad, cantidadHabitantesCiudad, nombrePais));

            }
        }

        c.println("");
        menu();
        c.println("Ingrese una opción:");
        int opcion = c.readInt();
        while (opcion != 0) {
            if (opcion == 1) {
                c.println("Ingrese el nombre del país a buscar:");
                String nombrePais = c.readString();

                c.println(mundo.imprimirCiudadesPorPais(nombrePais));
            }

            if (opcion == 2) {
                c.println(mundo.buscarPaisConMasHabitantes());
            }

            if (opcion == 3) {
                c.println(mundo.buscarPaisesDeEuropa());
            }

            if (opcion == 4) {
                c.println("Ingrese el nombre de una ciudad:");
                String nombreCiudad = c.readString();
                c.println(mundo.buscarPaisPorCiudad(nombreCiudad));
            }

            menu();
            c.println("Ingrese una opción:");
            opcion = c.readInt();
        }
    }

    public static void menu() {
        c.println("[1] Buscar ciudades por país.");
        c.println("[2] Buscar país con mayor cantidad de habitantes.");
        c.println("[3] Buscar paises de Europa.");
        c.println("[4] Buscar el país dada una ciudad.");
        c.println("[0] Salir.");

    }
}

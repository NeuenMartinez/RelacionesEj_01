package Servicios01;

import Entidades01.Perro;
import Entidades01.Persona;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author NeuenMartinez
 */
public class ServicioAdopcion {

    Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    List<Perro> ListaPerros = new ArrayList<>();

    public void creaPersona(Persona P1) {
        System.out.println("INGRESAR LOS DATOS DE LA PERSONA: ");
        System.out.println("NOMBRE: ");
        P1.setNombre2(leer.next());
        System.out.println("APELLIDO: ");
        P1.setApellido(leer.next());
        System.out.println("EDAD: ");
        P1.setEdad2(leer.nextInt());
        System.out.println("DOCUMENTO: ");
        P1.setDocumento(leer.next());
    }

    public void crearPerro() {

        Perro Rosca = new Perro("Rosca", "PUG", 1, "Pequeño");
        Perro Pituca = new Perro("Pituca", "Caniche", 9, "Pequeño");

        ListaPerros.add(Rosca);
        ListaPerros.add(Pituca);
    }

    public void mostrarPerros() {
        System.out.println("Lista de perros para adoptar: ");
        int cont = 1;
        for (Perro aux : ListaPerros) {
            System.out.println(cont + ". " + aux);
            cont++;
        }
    }

    public void eleccionPerro(Persona P1) {

        System.out.println("Seleccionar el numero de la mascota elegida: ");
        int elec = leer.nextInt();
        boolean exit = false;
        do {
            switch (elec) {
                case 1:
                    P1.setMascota(ListaPerros.get(0));
                    exit = true;
                    break;
                case 2:
                    P1.setMascota(ListaPerros.get(1));
                    exit = true;
                    break;
                default:
                    System.out.println("La opcion ingresada es incorrecta");
                    break;
            }
        } while (exit == false);
        ListaPerros.remove(elec - 1);
    }

}

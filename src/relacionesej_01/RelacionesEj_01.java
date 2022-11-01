/*
 * @author NeuenMartinez
 */
package RelacionesEj_01;

import Entidades01.Persona;
import Servicios01.ServicioAdopcion;


public class RelacionesEj_01 {

    public static void main(String[] args) {


        ServicioAdopcion sa = new ServicioAdopcion();
        Persona P1 = new Persona();
        sa.creaPersona(P1);
        Persona P2 = new Persona();
        sa.creaPersona(P2);
        sa.crearPerro();
        sa.mostrarPerros();
        sa.eleccionPerro(P1);
        sa.mostrarPerros();
        sa.eleccionPerro(P2);
        System.out.println(P1);
        System.out.println("---------------------------");
        System.out.println(P2);
        
    }

}
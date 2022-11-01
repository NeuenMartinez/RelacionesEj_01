package Entidades01;

/**
 *
 * @author NeuenMartinez
 */
public class Persona {

    private String nombre2;
    private String apellido;
    private Integer edad2;
    private String documento;
    private Perro mascota;

    public Persona() {
    }

    public Persona(String nombre2, String apellido, Integer edad2, String documento, Perro mascota) {
        this.nombre2 = nombre2;
        this.apellido = apellido;
        this.edad2 = edad2;
        this.documento = documento;
        this.mascota = mascota;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
   

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad2() {
        return edad2;
    }

    public void setEdad2(Integer edad2) {
        this.edad2 = edad2;
    }

    public Perro getMascota() {
        return mascota;
    }

    public void setMascota(Perro mascota) {
        this.mascota = mascota;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre2=" + nombre2 + ", apellido=" + apellido + ", edad2=" + edad2 + ", documento=" + documento + ", mascota=" + mascota + '}';
    }

    
    
    

}


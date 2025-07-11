
package modelo;

public class Paciente extends Persona {
private int id;     
 private int edad;

    public Paciente(String nombre, String apellido, String dni, char sexo) {
        super(nombre, apellido, dni, sexo);
    }
    public Paciente (){}
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
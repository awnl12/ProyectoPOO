
package modelo;


public class Medico extends Persona {
    private String especialidad;
    private String codigoMedico;

    public Medico(String nombre, String apellido, String dni, char sexo) {
        super(nombre, apellido, dni, sexo);
    }
}

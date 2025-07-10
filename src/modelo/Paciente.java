
package modelo;

public class Paciente extends Persona {
    private int edad;
    private String historialMedico;
    
    public Paciente(String nombre, String apellido, String dni, char sexo) {
        super(nombre, apellido, dni, sexo);
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getHistorialMedico() {
        return historialMedico;
    }

    public void setHistorialMedico(String historialMedico) {
        this.historialMedico = historialMedico;
    }
    
   
    
    
}

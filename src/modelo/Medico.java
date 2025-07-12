
package modelo;


public class Medico extends Persona {
    private String especialidad;
    private String codigoMedico;
    private int Id;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }
    
    public Medico() {
    super("", "", "", 'M');
}
    
    
    public Medico(String nombre, String apellido, String dni, char sexo) {
        super(nombre, apellido, dni, sexo);
}
   
   
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getCodigoMedico() {
        return codigoMedico;
    }

    public void setCodigoMedico(String codigoMedico) {
        this.codigoMedico = codigoMedico;
    }
    
}



package modelo;



public class Cita {
    private int id;
    private String fecha;
    private String hora;
    private String motivo;
    private String dniPaciente;
    private String dniMedico;
    
    public Cita(){};
    public Cita(int id, String dniPaciente, String dniMedico, String fecha, String hora, String motivo) {
        this.id = id;
        this.dniPaciente = dniPaciente;
        this.dniMedico = dniMedico;
        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDniPaciente() {
        return dniPaciente;
    }

    public void setDniPaciente(String dniPaciente) {
        this.dniPaciente = dniPaciente;
    }

    public String getDniMedico() {
        return dniMedico;
    }

    public void setDniMedico(String dniMedico) {
        this.dniMedico = dniMedico;
    }



    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    
}

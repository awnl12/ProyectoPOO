package archivo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import modelo.Cita;

public class HistorialPacienteWriter {

     public static void guardarCitasEnArchivo(List<Cita> citas, String rutaArchivo) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivo))) {
            for (Cita c : citas) {
                bw.write("ID: " + c.getId() + ", Paciente: " + c.getDniPaciente()
                        + ", Médico: " + c.getDniMedico() + ", Fecha: " + c.getFecha()
                        + ", Hora: " + c.getHora() + ", Motivo: " + c.getMotivo());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error al guardar citas en archivo: " + e.getMessage());
        }
    }
}
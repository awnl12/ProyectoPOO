
package dao;

import modelo.Cita;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ArchivoCitaDAO {

    private static final String ARCHIVO = "citas.txt";

    public static boolean guardarCita(Cita cita) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARCHIVO, true))) {
            bw.write("ID Paciente: " + cita.getIdPaciente());
            bw.write(" | ID Médico: " + cita.getIdMedico());
            bw.write(" | Fecha: " + cita.getFecha());
            bw.write(" | Hora: " + cita.getHora());
            bw.write(" | Motivo: " + cita.getMotivo());
            bw.newLine();
            return true;
        } catch (IOException e) {
            System.out.println("Error al guardar la cita en archivo: " + e.getMessage());
            return false;
        }
    }
}
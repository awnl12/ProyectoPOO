
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import modelo.Paciente;


public class PacienteDAO {

  public boolean insertar(Paciente paciente) {
    Connection conn = null;
    PreparedStatement ps = null;

    try {
        conn = ConexionDB.getConexion();
        String sql = "INSERT INTO paciente (nombre, apellido, dni, sexo, edad, historial_medico) VALUES (?, ?, ?, ?, ?, ?)";
        ps = conn.prepareStatement(sql);

        ps.setString(1, paciente.getNombre());
        ps.setString(2, paciente.getApellido());
        ps.setString(3, paciente.getDni());
        ps.setString(4, String.valueOf(paciente.getSexo()));
        ps.setInt(5, paciente.getEdad());
        ps.setString(6, paciente.getHistorialMedico());

        int filas = ps.executeUpdate();
        return filas > 0;

    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    } finally {
        try {
            if (ps != null) ps.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

}

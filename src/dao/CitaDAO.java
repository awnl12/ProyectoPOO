/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;


import Interface.ICrud;
import basedatos.ConexionDB;
import modelo.Cita;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class CitaDAO implements ICrud<Cita> {

  @Override
    public List<Cita> listar() {
       List<Cita> lista = new ArrayList<>();
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM cita";

        try {
            conn = ConexionDB.getConexion();
            st = conn.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                Cita cita = new Cita();
                cita.setId(rs.getInt("id"));
                cita.setDniPaciente(rs.getString("dni_paciente"));
                cita.setDniMedico(rs.getString("dni_medico"));
                cita.setFecha(rs.getString("fecha"));
                cita.setHora(rs.getString("hora"));
                cita.setMotivo(rs.getString("motivo"));
                lista.add(cita);
            }

        } catch (SQLException e) {
            System.out.println("Error al listar citas: " + e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (st != null) st.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar conexión: " + e.getMessage());
            }
        }

        return lista;
    }

    @Override
    public Cita buscar(int id) {
       Cita cita = null;
    String sql = "SELECT * FROM cita WHERE dni_paciente = ? OR dni_medico = ?";

    try (Connection conn = ConexionDB.getConexion();
         PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            cita = new Cita();
            cita.setId(rs.getInt("id"));
            cita.setFecha(rs.getString("fecha"));
            cita.setHora(rs.getString("hora"));
            cita.setMotivo(rs.getString("motivo"));
            cita.setDniPaciente(rs.getString("dni_paciente"));
            cita.setDniMedico(rs.getString("dni_medico"));
        }
    } catch (SQLException e) {
        System.out.println("Error al buscar cita por DNI: " + e.getMessage());
    }

    return cita;
    }

    @Override
    public boolean actualizar(Cita cita) {
      String sql = "UPDATE cita SET fecha = ?, hora = ?, motivo = ?, dni_paciente = ?, dni_medico = ? WHERE id = ?";

    try (Connection conn = ConexionDB.getConexion();
         PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setString(1, cita.getFecha());
        ps.setString(2, cita.getHora());
        ps.setString(3, cita.getMotivo());
        ps.setString(4, cita.getDniPaciente());
        ps.setString(5, cita.getDniMedico());
        ps.setInt(6, cita.getId());

        return ps.executeUpdate() > 0;
    } catch (SQLException e) {
        System.out.println("Error al actualizar cita: " + e.getMessage());
        return false;
    }
    }

    @Override
    public boolean eliminar(int id) {
      String sql = "DELETE FROM cita WHERE dni_paciente = ? OR dni_medico = ?";

    try (Connection conn = ConexionDB.getConexion();
         PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setInt(1, id);
        return ps.executeUpdate() > 0;
    } catch (SQLException e) {
        System.out.println("Error al eliminar cita: " + e.getMessage());
        return false;
    }
    }

    @Override
    public boolean insertar(Cita cita) {
       Connection conn = null;
        PreparedStatement ps = null;
        String sql = "INSERT INTO cita (dni_paciente, dni_medico, fecha, hora, motivo) VALUES (?, ?, ?, ?, ?)";
       
        try {
            conn = ConexionDB.getConexion();
            ps = conn.prepareStatement(sql);
            ps.setString(1, cita.getDniPaciente());
            ps.setString(2, cita.getDniMedico());
            ps.setString(3, cita.getFecha());
            ps.setString(4, cita.getHora());
            ps.setString(5, cita.getMotivo());

            int filas = ps.executeUpdate();
            return filas > 0;

        } catch (SQLException e) {
            System.out.println("Error al insertar cita: " + e.getMessage());
            return false;
        } finally {
            try {
                if (ps != null) ps.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar conexión: " + e.getMessage());
            }
        } 
    }


public List<Cita> buscarPorDniPacienteOMedico(String dni) {
  


  List<Cita> lista = new ArrayList<>();
    String sql = "SELECT * FROM cita WHERE dni_paciente = ? OR dni_medico = ?";
    
    if (dni == null || dni.trim().isEmpty()) {
    System.out.println("DNI vacío o nulo");
    return lista;
}
    try (Connection con = ConexionDB.getConexion();
         PreparedStatement ps = con.prepareStatement(sql)) {
         
        ps.setString(1, dni);
        ps.setString(2, dni);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Cita cita = new Cita();
            cita.setId(rs.getInt("id"));
            cita.setDniPaciente(rs.getString("dni_paciente"));
            cita.setDniMedico(rs.getString("dni_medico"));
            cita.setFecha(rs.getString("fecha"));
            cita.setHora(rs.getString("hora"));
            cita.setMotivo(rs.getString("motivo"));
            lista.add(cita);
        }

    } catch (SQLException e) {
        System.out.println("Error al buscar cita por DNI: " + e.getMessage());
    }

    return lista;
}




}







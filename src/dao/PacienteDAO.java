package dao;

import dao.ConexionDB;
import dao.ICrud;
import modelo.Paciente;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PacienteDAO implements ICrud<Paciente> {

    public Paciente buscarPorDni(String dni) {
    Paciente paciente = null;
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    try {
        conn = ConexionDB.getConexion();
        String sql = "SELECT * FROM paciente WHERE dni = ?";
        ps = conn.prepareStatement(sql);
        ps.setString(1, dni);
        rs = ps.executeQuery();

        if (rs.next()) {
            paciente = new Paciente(
                rs.getString("nombre"),
                rs.getString("apellido"),
                rs.getString("dni"),
                rs.getString("sexo").charAt(0)
            );
            paciente.setId(rs.getInt("id"));
            paciente.setEdad(rs.getInt("edad"));
        }

    } catch (SQLException ex) {
        System.out.println("Error al buscar paciente por DNI: " + ex.getMessage());
    } finally {
        try { if (rs != null) rs.close(); } catch (Exception e) {}
        try { if (ps != null) ps.close(); } catch (Exception e) {}
        try { if (conn != null) conn.close(); } catch (Exception e) {}
    }

    return paciente;
}
    @Override
    public boolean insertar(Paciente paciente) {
        String sql = "INSERT INTO paciente (nombre, apellido, dni, sexo, edad) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = ConexionDB.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, paciente.getNombre());
            ps.setString(2, paciente.getApellido());
            ps.setString(3, paciente.getDni());
            ps.setString(4, String.valueOf(paciente.getSexo()));
            ps.setInt(5, paciente.getEdad());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error al insertar paciente: " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean actualizar(Paciente paciente) {
        String sql = "UPDATE paciente SET nombre=?, apellido=?, dni=?, sexo=?, edad=? WHERE id=?";
        try (Connection conn = ConexionDB.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, paciente.getNombre());
            ps.setString(2, paciente.getApellido());
            ps.setString(3, paciente.getDni());
            ps.setString(4, String.valueOf(paciente.getSexo()));
            ps.setInt(5, paciente.getEdad());
            ps.setInt(6, paciente.getId());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error al actualizar paciente: " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean eliminar(int id) {
        String sql = "DELETE FROM paciente WHERE id=?";
        try (Connection conn = ConexionDB.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error al eliminar paciente: " + e.getMessage());
            return false;
        }
    }

    @Override
    public List<Paciente> listar() {
        List<Paciente> lista = new ArrayList<>();
        String sql = "SELECT * FROM paciente";

        try (Connection conn = ConexionDB.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Paciente paciente = new Paciente();
                paciente.setId(rs.getInt("id"));
                paciente.setNombre(rs.getString("nombre"));
                paciente.setApellido(rs.getString("apellido"));
                paciente.setDni(rs.getString("dni"));
                paciente.setSexo(rs.getString("sexo").charAt(0));
                paciente.setEdad(rs.getInt("edad"));

                lista.add(paciente);
            }

        } catch (SQLException e) {
            System.out.println("Error al listar pacientes: " + e.getMessage());
        }

        return lista;
    }

    @Override
    public Paciente buscar(int id) {
        String sql = "SELECT * FROM paciente WHERE id=?";
        try (Connection conn = ConexionDB.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Paciente paciente = new Paciente();
                paciente.setId(rs.getInt("id"));
                paciente.setNombre(rs.getString("nombre"));
                paciente.setApellido(rs.getString("apellido"));
                paciente.setDni(rs.getString("dni"));
                paciente.setSexo(rs.getString("sexo").charAt(0));
                paciente.setEdad(rs.getInt("edad"));
                return paciente;
            }

        } catch (SQLException e) {
            System.out.println("Error al buscar paciente: " + e.getMessage());
        }
        return null;
 
    }
    
}


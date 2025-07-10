package dao;


import modelo.Medico;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MedicoDAO implements ICrud<Medico> {

    @Override
    public boolean insertar(Medico medico) {
        Connection conn = null;
        PreparedStatement ps = null;
        String sql = "INSERT INTO medico (nombre, apellido, dni, sexo, especialidad, codigoMedico) VALUES (?, ?, ?, ?, ?, ?)";

        try {
            conn = ConexionDB.getConexion();
            ps = conn.prepareStatement(sql);
            ps.setString(1, medico.getNombre());             
            ps.setString(2, medico.getApellido());           
            ps.setString(3, medico.getDni());               
            ps.setString(4, String.valueOf(medico.getSexo())); 
            ps.setString(5, medico.getEspecialidad());       
            ps.setString(6, medico.getCodigoMedico());       

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error al insertar médico: " + e.getMessage());
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

    @Override
    public List<Medico> listar() {
        List<Medico> lista = new ArrayList<>();
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM medico";

        try {
            conn = ConexionDB.getConexion();
            st = conn.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                // Constructor vacío necesario
                Medico m = new Medico();
                m.setNombre(rs.getString("nombre"));
                m.setApellido(rs.getString("apellido"));
                m.setDni(rs.getString("dni"));
                m.setSexo(rs.getString("sexo").charAt(0));
                m.setEspecialidad(rs.getString("especialidad"));
                m.setCodigoMedico(rs.getString("codigoMedico"));

                lista.add(m);
            }

        } catch (SQLException e) {
            System.out.println("Error al listar médicos: " + e.getMessage());

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
    public Medico buscar(int id) {
        return null; 
    }

    @Override
    public boolean actualizar(Medico m) {
        return false; 
    }

    @Override
    public boolean eliminar(int id) {
        return false; 
    }
}
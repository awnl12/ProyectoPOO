

package dao;



import modelo.Usuario;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO implements ICrud<Usuario> {

    @Override
    public boolean insertar(Usuario usuario) {
        Connection conn = null;
        PreparedStatement ps = null;
        String sql = "INSERT INTO usuario (nombre, username, password) VALUES (?, ?, ?)";

        try {
            conn = ConexionDB.getConexion();
            ps = conn.prepareStatement(sql);
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getUsername());
            ps.setString(3, usuario.getPassword());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error al insertar usuario: " + e.getMessage());
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
    public List<Usuario> listar() {
        List<Usuario> lista = new ArrayList<>();
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM usuario";

        try {
            conn = ConexionDB.getConexion();
            st = conn.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                Usuario u = new Usuario();
                u.setNombre(rs.getString("nombre"));
                u.setUsername(rs.getString("username"));
                u.setPassword(rs.getString("password"));
                lista.add(u);
            }

        } catch (SQLException e) {
            System.out.println("Error al listar usuarios: " + e.getMessage());

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
    public Usuario buscar(int id) {
        return null; 
    }

    @Override
    public boolean actualizar(Usuario usuario) {
        return false; 
    }

    @Override
    public boolean eliminar(int id) {
        return false; 
    }
}
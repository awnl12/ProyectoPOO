package basedatos;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class DBInitializer {

    public static void crearTablas(Connection conn) {
        try (Statement stmt = conn.createStatement()) {

            String tablaUsuario = """
    CREATE TABLE IF NOT EXISTS usuario (
        id INT AUTO_INCREMENT PRIMARY KEY,
        username VARCHAR(50) NOT NULL,
        name VARCHAR(100) NOT NULL,
        password VARCHAR(100) NOT NULL
    );
""";
            String tablaPaciente = """
            CREATE TABLE IF NOT EXISTS paciente (
                id INT AUTO_INCREMENT PRIMARY KEY,
                nombre VARCHAR(50),
                apellido VARCHAR(50),
                dni VARCHAR(15),
                sexo CHAR(1),
                edad char(2)
            );
            """;

            String tablaMedico = """
            CREATE TABLE IF NOT EXISTS medico (
                id INT AUTO_INCREMENT PRIMARY KEY,
                nombre VARCHAR(50),
                apellido VARCHAR(50),
                dni VARCHAR(15),
                sexo CHAR(1),
                especialidad VARCHAR(50),
                codigo_medico VARCHAR(20)
            );
            """;

            String tablaCita = """
            CREATE TABLE IF NOT EXISTS cita (
                id INT AUTO_INCREMENT PRIMARY KEY,
                dni_paciente VARCHAR(8),
                dni_medico VARCHAR(8),
                fecha DATE,
                hora TIME,
                motivo VARCHAR(200)
            );
            """;

          
            stmt.executeUpdate(tablaUsuario);
            stmt.executeUpdate(tablaPaciente);
            stmt.executeUpdate(tablaMedico);
            stmt.executeUpdate(tablaCita);

            System.out.println(" --> Tablas creadas o ya existentes");

        } catch (SQLException e) {
            System.out.println(" XXX Error al crear tablas: " + e.getMessage());
        }
    }
}

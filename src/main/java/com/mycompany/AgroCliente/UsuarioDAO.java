package com.mycompany.AgroCliente;



import java.sql.*;
public class UsuarioDAO {
    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=TestDB";
    private static final String USER = "tu_usuario";
    private static final String PASSWORD = "tu_contraseña";
    // Guardar usuario
    public static void guardarUsuario(Usuario usuario) {
        String sql = "INSERT INTO Usuarios (nombre, edad) VALUES (?, ?)";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, usuario.getNombre());
            stmt.setInt(2, usuario.getEdad());
            stmt.executeUpdate();
            System.out.println(" Usuario guardado");
        } catch (SQLException e) {
            System.err.println(" Error al guardar: " + e.getMessage());
        }
    }
    // Obtener usuario por ID
    public static Usuario obtenerUsuarioPorId(int id) {
        String sql = "SELECT nombre, edad FROM Usuarios WHERE id = ?";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                String nombre = rs.getString("nombre");
                int edad = rs.getInt("edad");
                return new Usuario(nombre, edad);
            } else {
                System.out.println(" Usuario no encontrado con ID: " + id);
                return null;
            }
        } catch (SQLException e) {
            System.err.println(" Error al obtener: " + e.getMessage());
            return null;
        }
    }
    // Eliminar usuario por ID
    public static void eliminarUsuarioPorId(int id) {
        String sql = "DELETE FROM Usuarios WHERE id = ?";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            int filas = stmt.executeUpdate();
            if (filas > 0) {
                System.out.println(" Usuario eliminado con ID: " + id);
            } else {
                System.out.println(" No se encontró usuario para eliminar con ID: " + id);
            }
        } catch (SQLException e) {
            System.err.println(" Error al eliminar: " + e.getMessage());
        }
    }
}


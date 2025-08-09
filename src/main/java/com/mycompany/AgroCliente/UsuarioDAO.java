package com.mycompany.AgroCliente;



import java.sql.*;
public class UsuarioDAO {
    private static final String URL = "jdbc:sqlserver:129.151.109.58:1433;databaseName=g8";
    private static final String USER = "user_g8";
    private static final String PASSWORD = "Pass_g8!";
    // Guardar usuario
    public static void guardarUsuario(Usuario usuario) {
        String sql = "INSERT INTO Usuarios (nombre, edad) VALUES (?, ?)";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, usuario.getNombre_usuario());
            stmt.setString(2, usuario.getContraseña());
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
                int ids = rs.getInt("id_usuario");
                String nombre = rs.getString("nombre_usuario");
                String contraseña = rs.getString("contraseña");
                return new Usuario(ids, nombre, contraseña);
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


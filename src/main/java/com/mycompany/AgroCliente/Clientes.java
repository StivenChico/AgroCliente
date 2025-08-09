/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.AgroCliente;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author estudiante
 */
public class Clientes {
    private String Nombre;
    private String Apellido;
    private String Documento;
    private int id_tipo_documento;

    
    
    public void GuardarCliente(){
        String sql = "INSERT INTO Usuarios (nombre, edad) VALUES (?, ?)";
        try (Connection conn = DriverManager.getConnection("129.151.109.58", "user_g8", "Pass_g8!");
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, Nombre);
            stmt.setString(2, Apellido);
            stmt.setInt(3, id_tipo_documento);
            stmt.setString(4, Documento);
            stmt.executeUpdate();
            System.out.println(" Cliente guardado");
        } catch (SQLException e) {
            System.err.println(" Error al guardar: " + e.getMessage());
        }
    }

    public int getId_tipo_documento() {
        return id_tipo_documento;
    }

    public void setId_tipo_documento(int id_tipo_documento) {
        this.id_tipo_documento = id_tipo_documento;
    }
    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Apellido
     */
    public String getApellido() {
        return Apellido;
    }

    /**
     * @param Apellido the Apellido to set
     */
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    /**
     * @return the Documento
     */
    public String getDocumento() {
        return Documento;
    }

    /**
     * @param Documento the Documento to set
     */
    public void setDocumento(String Documento) {
        this.Documento = Documento;
    }
    
}

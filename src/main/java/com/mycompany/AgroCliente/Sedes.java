/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.AgroCliente;

/**
 *
 * @author estudiante
 */
public class Sedes {
    private int id_sede;
    private String nombre_sede;
    private String direccion_sede;

    /**
     * @return the id_sede
     */
    public int getId_sede() {
        return id_sede;
    }

    /**
     * @param id_sede the id_sede to set
     */
    public void setId_sede(int id_sede) {
        this.id_sede = id_sede;
    }

    /**
     * @return the nombre_sede
     */
    public String getNombre_sede() {
        return nombre_sede;
    }

    public Sedes(int id_sede, String nombre_sede, String direccion_sede) {
        this.id_sede = id_sede;
        this.nombre_sede = nombre_sede;
        this.direccion_sede = direccion_sede;
    }

    /**
     * @param nombre_sede the nombre_sede to set
     */
    public void setNombre_sede(String nombre_sede) {
        this.nombre_sede = nombre_sede;
    }

    /**
     * @return the direccion_sede
     */
    public String getDireccion_sede() {
        return direccion_sede;
    }

    /**
     * @param direccion_sede the direccion_sede to set
     */
    public void setDireccion_sede(String direccion_sede) {
        this.direccion_sede = direccion_sede;
    }
}

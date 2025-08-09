package com.agrocomercial.agrocliente.dominio.Entidades;

public class Persona extends EntidadBase {

    private final String nombre;
    private final String apellido;
    private String telefono;
    private String identificacion;
    private int IdTipoDocumento;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona(String nombre, String apellido, String identificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
    }

    public Persona(String nombre, String apellido, String telefono, String identificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
        this.telefono = telefono;
    }

    public String getNombreCompleto() {
        return this.nombre + " " + this.apellido + " ";
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTipoDocumento(TipoDocumento tipo) {
        this.IdTipoDocumento = tipo.getId();
    }
}

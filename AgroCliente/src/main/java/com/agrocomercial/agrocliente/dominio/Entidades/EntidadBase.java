package com.agrocomercial.agrocliente.dominio.Entidades;

import java.util.Date;

public class EntidadBase {

    private int Id;
    private final Date fechaCreacion;

    public EntidadBase() {
        this.fechaCreacion = new Date();
    }

    public Date getFechaCreacion() {
        return this.fechaCreacion;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

}

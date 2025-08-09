package com.agrocomercial.agrocliente.dominio.Entidades;

public class TipoDocumento extends EntidadBase{
  private final String nombre;
    
    public TipoDocumento(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
}

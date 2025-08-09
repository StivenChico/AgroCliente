package com.agrocomercial.agrocliente;

import com.agrocomercial.agrocliente.dominio.Entidades.Persona;
import com.agrocomercial.agrocliente.dominio.Entidades.TipoDocumento;

public class Main {

    public static void main(String[] args) {

        TipoDocumento cc = new TipoDocumento("CC");

        Persona persona = new Persona("Diego", "Vasquez");

        persona.setIdentificacion("113942");
        persona.setTipoDocumento(cc);

        System.out.println("Hello World!" + persona.getNombreCompleto() + " creado "+ persona.getFechaCreacion());
    }
}

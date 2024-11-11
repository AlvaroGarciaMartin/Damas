package org.iesalandalus.programacion.damas.modelo;

public enum Color {
    BLANCO("Blanco"),NEGRO("Negro");
    private String cadenaAMostrar;
    private Color(String mensajeAMostrar)
    {
        this.cadenaAMostrar=mensajeAMostrar;
    }
    //Crear cadenaAMostrar//
    @Override
    public String toString() {
        return ordinal()+".-"+cadenaAMostrar;
    }
}

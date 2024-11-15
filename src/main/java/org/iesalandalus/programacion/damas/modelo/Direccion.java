package org.iesalandalus.programacion.damas.modelo;

public enum Direccion {
    //Crear las direcciones de la dama//
    NORESTE("Noreste"), SURESTE("Sureste"), SUROESTE("Suroeste"), NOROESTE("Noroeste");
    private String cadenaAMostrar;
    private Direccion(String cadenaAMostrar)
    {
        this.cadenaAMostrar=cadenaAMostrar;
    }
    //Crear tostring cadenaAMostrar//
    @Override
    public String toString() {
        return ordinal()+".-"+cadenaAMostrar;
    }
}

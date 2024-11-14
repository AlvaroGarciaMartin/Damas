package org.iesalandalus.programacion.damas.modelo;

import java.util.Objects;

public class Posicion {
   private int fila;
   private char columna;

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        if (fila<1 | fila>8){
            throw new IllegalArgumentException("la fila debe tener valores entre 1 y 8 incluidos");

        }
        this.fila = fila;
    }

    public char getColumna() {
        return columna;
    }


    public void setColumna(char columna) {
        if (columna<'a' | columna>'h'){
            throw new IllegalArgumentException("la columna debe tener valores entre a y h incluidos");

        }
        this.columna = columna;
    }
    public Posicion(){
        setFila(fila);
        setColumna(columna);
    }
    //constructor copia de Posicion
    public Posicion (Posicion objtPoscicion){
        this.fila= objtPoscicion.fila;
        this.columna= objtPoscicion.columna;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Posicion posicion)) return false;
        return fila == posicion.fila && columna == posicion.columna;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fila, columna);
    }
}


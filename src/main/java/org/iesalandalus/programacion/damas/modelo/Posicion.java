package org.iesalandalus.programacion.damas.modelo;

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
}


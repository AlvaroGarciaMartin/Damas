package org.iesalandalus.programacion.damas.modelo;

public class Dama {
    private Color color;
    private Posicion posicion;
    private boolean esDamaEspecial;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        if( color==null){
            throw new NullPointerException("color no puede ser nulo.");
        }
        this.color = color;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        if( posicion==null){
            throw new NullPointerException("posición no puede ser nulo.");
        }
        this.posicion = posicion;
    }

    public boolean isEsDamaEspecial() {
        return esDamaEspecial;
    }

    public void setEsDamaEspecial(boolean esDamaEspecial) {
        this.esDamaEspecial = esDamaEspecial;
    }
}



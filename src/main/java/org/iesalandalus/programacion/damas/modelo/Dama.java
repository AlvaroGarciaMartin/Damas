package org.iesalandalus.programacion.damas.modelo;

public class Dama {
    private Color color;
    private Posicion posicion;
    private boolean esDamaEspecial;

    //crear constructor para ficha inicial
    public Dama(){
       this.posicion=crearPosicionInicial();
       setColor(Color.BLANCO);
       this.esDamaEspecial=false;
    }
    //crear metodo crearPosicionInicial random para colocar primera ficha
    private Posicion crearPosicionInicial(){
        int columna;
        int fila;
        if (color == Color.BLANCO) {
            fila=(int) (Math.random()*3)+1; //para la fila del 1 al 3 corresponde a blanca
        }else{
            fila=(int) (Math.random()*3)+6; //para la fila del 6 al 8 corresponde a negra
        }

        if (fila % 2 == 0) {
            do {
                columna = (int) (Math.random()*8)+1;
            } while (columna % 2 != 0);
        }else{
            do {
                columna = (int) (Math.random()*8)+1;
            } while (columna % 2 == 0);
        }
        char letraColumna = switch (columna) {
            case 1 -> 'a';
            case 2 -> 'b';
            case 3 -> 'c';
            case 4 -> 'd';
            case 5 -> 'e';
            case 6 -> 'f';
            case 7 -> 'g';
            case 8 -> 'h';
            default -> ' ';
        };
        return new Posicion(fila,letraColumna);

    }
    public void mover ( Direccion direccion, int npasos){
        if (direccion == null) {
            throw new NullPointerException(" La dirección no puede ser NULL");
        }


    }



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



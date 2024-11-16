package org.iesalandalus.programacion.damas.modelo;

import javax.naming.OperationNotSupportedException;

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
    public void mover ( Direccion direccion, int npasos) throws OperationNotSupportedException {
        if (direccion == null) {
            throw new NullPointerException(" La dirección no puede ser NULL");
        }
        if (npasos<1) {
            throw new OperationNotSupportedException("Los pasos deben ser minimo 1");
        }

        if (!esDamaEspecial) {

        if (color == Color.BLANCO) {
            if(direccion==Direccion.SURESTE||direccion==Direccion.SUROESTE){
                throw new OperationNotSupportedException("La dama normal no puede avanzar hacia atrás");
            }else if (npasos!=1){
                throw new OperationNotSupportedException("La dama normal solo puede avanzar una casilla");
            }
            switch (direccion){
                case NORESTE -> this.setPosicion( new Posicion(getPosicion().getFila()+1, (char)(getPosicion().getColumna() -1)));
                case NOROESTE -> this.setPosicion( new Posicion(getPosicion().getFila()+1, (char)(getPosicion().getColumna() +1)));
            }
            //Si la dama blanca llega al final del tablero se convierte en dama especial
            if(this.posicion.getFila() ==8){
                this.esDamaEspecial=true;

            }

        }
        else if (color == Color.NEGRO) {
            if(direccion==Direccion.NORESTE||direccion==Direccion.NOROESTE){
                throw new OperationNotSupportedException("La dama normal no puede avanzar hacia atrás");
            }else if (npasos!=1){
                throw new OperationNotSupportedException("La dama normal solo puede avanzar una casilla");
            }
            switch (direccion){
                case SURESTE -> this.setPosicion( new Posicion(getPosicion().getFila()-1, (char)(getPosicion().getColumna() -1)));
                case SUROESTE -> this.setPosicion( new Posicion(getPosicion().getFila()-1, (char)(getPosicion().getColumna() +1)));
            }
            //Si la dama negra llega al final del tablero se convierte en dama especial
            if(this.posicion.getFila() ==1){
                this.esDamaEspecial=true;

            }

        }

        }else {
            switch (direccion){
                case NOROESTE -> this.setPosicion(new Posicion(getPosicion().getFila() + npasos, (char) (getPosicion().getColumna() - npasos)));
                case NORESTE -> this.setPosicion(new Posicion(getPosicion().getFila() + npasos, (char) (getPosicion().getColumna() + npasos)));

                case SURESTE -> this.setPosicion(new Posicion(getPosicion().getFila() - npasos, (char) (getPosicion().getColumna() + npasos)));
                case SUROESTE -> this.setPosicion(new Posicion(getPosicion().getFila() - npasos, (char) (getPosicion().getColumna() - npasos)));
            }
        }


    }

    @Override
    public String toString() {
        return "El color de la dama es: " +color+ " se situa en la posición con la fila: "+ posicion.getFila() + " y la columna: "+ posicion.getColumna();
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



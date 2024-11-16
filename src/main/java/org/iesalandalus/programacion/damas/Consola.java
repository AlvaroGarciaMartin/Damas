package org.iesalandalus.programacion.damas;

import  org.iesalandalus.programacion.damas.modelo.Direccion;
import  org.iesalandalus.programacion.damas.modelo.Dama;
import  org.iesalandalus.programacion.damas.modelo.Color;
import  org.iesalandalus.programacion.damas.modelo.Posicion;


public class Consola {
    private Consola(){

    }

    public static void mostrarMenu(){
       System.out.println(" 1. crear dama por defecto");
       System.out.println(" 2. crear dama eligiendo el color");
       System.out.println(" 3. mover");
       System.out.println(" 4. salir");
    }
}

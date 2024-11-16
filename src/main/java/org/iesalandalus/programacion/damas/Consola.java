package org.iesalandalus.programacion.damas;

import  org.iesalandalus.programacion.damas.modelo.Direccion;
import  org.iesalandalus.programacion.damas.modelo.Dama;
import  org.iesalandalus.programacion.damas.modelo.Color;
import  org.iesalandalus.programacion.damas.modelo.Posicion;
import org.iesalandalus.programacion.utilidades.Entrada;


public class Consola {
    private Consola(){

    }

    public static void mostrarMenu(){
       System.out.println(" 1. crear dama por defecto");
       System.out.println(" 2. crear dama eligiendo el color");
       System.out.println(" 3. mover");
       System.out.println(" 4. salir");
    }

    public static int elegirOpcionMenu() {
        int opcion;
        do {
            System.out.println("Indica El numero del menú que deseas usar");
            opcion= Entrada.entero();
        }while (opcion<1 || opcion>4);

        return opcion;
    }

    public static Color elegirOpcion() {
        int colorElegido;
        do {
            System.out.println("Escriba 1 para Blanco o 2 para Negro");
            colorElegido=Entrada.entero();
        }while (colorElegido<1 || colorElegido>2);

        if (colorElegido == 1) {
           return Color.BLANCO;

        }else return Color.NEGRO;
    }

}

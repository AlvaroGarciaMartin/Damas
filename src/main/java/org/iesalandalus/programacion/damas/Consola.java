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
    public static void mostrarMenuDirecciones(){

        System.out.println(" Elija una de las siguientes opciones de dirección");
        System.out.println(" 1. Noreste");
        System.out.println(" 2. Noroeste");
        System.out.println(" 3. Sureste");
        System.out.println(" 4. Suroeste");
    }

    public static Direccion elegirDirecion(){
        int direcion;
        do {
            System.out.println("Escribe un numero del 1 al 4");
            direcion=Entrada.entero();
        }while (direcion<1 || direcion>4);

        switch (direcion){
            case 1: return Direccion.NORESTE;
            case 2: return Direccion.NOROESTE;
            case 3: return Direccion.SURESTE;
            case 4: return Direccion.SUROESTE;
        }
        return null;
    }

    public static void elegirPasos(){
        int casillas;
        do {
            System.out.println("Inserte el numero de casillas a mover:");
            casillas=Entrada.entero();
        }while(casillas<1 || casillas>8);

    }
    public static void  despedirse(){
        System.out.println("hasta pronto");
    }

}

package org.iesalandalus.programacion.damas;
import  org.iesalandalus.programacion.damas.modelo.Direccion;
import  org.iesalandalus.programacion.damas.modelo.Dama;
import  org.iesalandalus.programacion.damas.modelo.Posicion;
import org.iesalandalus.programacion.utilidades.Entrada;

import java.awt.*;

public class MainApp {
 private static Dama dama;

 public static void main(String[] args) {
  int opcionElegida;
  do{
   Consola.mostrarMenu();
   opcionElegida=Consola.elegirOpcionMenu();
  }while(opcionElegida!=4);


 }
 private static void ejecutarOpcion( int opcion){

  switch (opcion){
   case 1:
    crearDamaPorDefecto();
    break;
   case 2:
    crearDamaColor();
    break;
   case 3:
    mover();
    break;
   case 4:
    Consola.despedirse();
  }
 }
 //asigna al atributo de clase dama una nueva instancia de una dama creada con el constructor por defecto
 public static void crearDamaPorDefecto(){
  dama=new Dama();
 }
 //asigna al atributo de clase dama una nueva instancia de una dama creado con el constructor al que le pasamos el color
 public static void crearDamaColor(){
 dama= new Dama(Consola.elegirOpcion());
 }
}

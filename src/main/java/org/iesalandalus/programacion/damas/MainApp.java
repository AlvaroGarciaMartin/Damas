package org.iesalandalus.programacion.damas;
import  org.iesalandalus.programacion.damas.modelo.Direccion;
import  org.iesalandalus.programacion.damas.modelo.Dama;
import  org.iesalandalus.programacion.damas.modelo.Posicion;
import org.iesalandalus.programacion.utilidades.Entrada;

import javax.naming.OperationNotSupportedException;
import java.awt.*;

public class MainApp {
 private static Dama dama;


//crear metodo main
 public static void main(String[] args) {
  int opcionElegida;
  do{
  mostrarDama();
   Consola.mostrarMenu();
   opcionElegida=Consola.elegirOpcionMenu();
      try {
          ejecutarOpcion(opcionElegida);
      } catch (OperationNotSupportedException e) {
          throw new RuntimeException(e);
      }
  }while(opcionElegida!=4);


 }
 private static void ejecutarOpcion( int opcion) throws OperationNotSupportedException {

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
 public static void mover() throws OperationNotSupportedException {
  Consola.mostrarMenuDirecciones();

   int casillas;
   if (dama.EsDamaEspecial()) {
    System.out.println("es una dama especial indica el numero de casillas: ");
    casillas=Entrada.entero();
    dama.mover(Consola.elegirDirecion(),casillas);

   }else dama.mover(Consola.elegirDirecion(),1);

  }
  //Mostrar dama
  private static void mostrarDama(){
   System.out.println(dama);

  }

}

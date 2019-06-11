/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucionmenu;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class EntradaSalida {
  static int mostrarMenu()
  {
      Scanner sc=new Scanner(System.in);
      String[] opciones={"1-Insertar", "2-Listar", "3-Salir"};
      for(int i=0; i<opciones.length; i++)
      {
          System.out.println(opciones[i]);
      }
      int opcion=sc.nextInt();
      
      return opcion;
      //NombreClase.metodo();->Método estático
       //nombre_objeto.metodo();->Metodo no estático
  }
}

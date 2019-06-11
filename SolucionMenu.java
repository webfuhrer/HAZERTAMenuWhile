/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucionmenu;

/**
 *
 * @author Admin
 */
public class SolucionMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //El método mostrarMenu mostrará las opciones: 
       //1-Insertar alumno
       //2-Listar alumnos
       //3-Salir
       int opcion_seleccionada=EntradaSalida.mostrarMenu();
       //NombreClase.metodo();->Método estático
       //nombre_objeto.metodo();->Metodo no estático
       while(opcion_seleccionada!=3)
       {
           System.out.println("Has seleccionado la opción "+opcion_seleccionada);
           System.out.println("Aún estás dentro del while");
           opcion_seleccionada=EntradaSalida.mostrarMenu();
       }
        System.out.println("Ya has salido del while");
        
    }
    
}

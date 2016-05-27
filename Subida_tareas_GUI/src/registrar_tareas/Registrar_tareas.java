/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrar_tareas;

/**
 *
 * @author Keltu
 */
public class Registrar_tareas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ventana.main(args);
    }
    
    
    public static void subir_Tareas(String descripcion, String importancia, String dificultad){
        
        //aqui va el codigo para subir los datos a la BD
        
        System.out.println(descripcion+importancia+dificultad);

    }
    
}


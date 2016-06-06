/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrar_tareas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Keltu
 */
public class Registrar_tareas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Registrar_tareas.main(args);
    }
    
    
    public static boolean subir_Tareas(String descripcion){
        
        //aqui va el codigo para subir los datos a la BD
        //datos de DB a determinar
        boolean answer=false;
        String url = "jdbc:mysql://????:???/???";
        String username = "????";
        String pass = "?????";
        
        //QUERY PENDIENTE
        try        
            (Connection con = DriverManager.getConnection(url, username, pass)){
            
            
            /*String query;
            query = "INSERT INTO ESTADO_DE_TAREA (IDESTADO, DESCRIPCION) VALUES (?, ?);";
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setInt (1, id_estado);
            preparedStmt.setString (2, descripcion);
            
            preparedStmt.execute();
            */
            con.close();
            answer=true;
        }
        catch (SQLException e) {
            answer=false;
            throw new IllegalStateException("Cannot connect the database!", e);
            
            
        }
        
        return answer;

    }
    
}


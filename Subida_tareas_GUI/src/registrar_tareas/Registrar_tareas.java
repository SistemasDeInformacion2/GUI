/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrar_tareas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
        //datos de DB a determinar
        String url = "jdbc:mysql://????:???/???";
        String username = "????";
        String pass = "?????";
        
        try        
            (Connection con = DriverManager.getConnection(url, username, pass)){
            
            
            String query;
            query = "INSERT INTO tareas?, (descripcion?, importancia?, dificultad?) VALUES (?, ?, ?);";
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString (1, descripcion);
            preparedStmt.setInt (2, Integer.parseInt(importancia));
            preparedStmt.setInt (3, Integer.parseInt(dificultad));
            preparedStmt.execute();
       
            con.close();
        }
        catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
            
        }

    }
    
}


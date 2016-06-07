/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevo_sprint;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class Nuevo_Sprint {
    
    public static boolean nuevo_Sprint(String dia1,String mes1, String anho1,String dia2,String mes2, String anho2, String po, String team, String planning){
        
        boolean res=false;
        
        java.sql.Date date1 = new java.sql.Date(Integer.parseInt(anho1),Integer.parseInt(mesConversion(mes1)),Integer.parseInt(dia1));
        java.sql.Date date2 = new java.sql.Date(Integer.parseInt(anho2),Integer.parseInt(mesConversion(mes2)),Integer.parseInt(dia2));
        
        try{
            Class.forName("org.postgresql.Driver");

            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
            "postgres", "password");
            
            
            String query;
            query = "INSERT INTO SPRINT (PLANNING_MIEMBRO EQUIPO_ID_EQ, PLANNING_PRODUCT OWNER_ID_PO, PLANNING_ID_P, FECHAINI, FECHAFIN) VALUES (?,?,?,?,?);";
            PreparedStatement preparedStmt = con.prepareStatement(query);
            /*if(team.equals(null)||po.equals(null)||planning.equals(null)){
                Nuevo_Sprint_GUI.nuevoSprintRes.setText("Error en la base de datos");
                Nuevo_Sprint_GUI.nuevoSprintDialog.setVisible(true);
            }
            else{ */
            preparedStmt.setInt (2,Integer.parseInt(team));
            preparedStmt.setInt (3,Integer.parseInt(po));
            preparedStmt.setInt (4, Integer.parseInt(planning));
            preparedStmt.setDate (5, date1);
            preparedStmt.setDate (6,date2);
            preparedStmt.execute();
            
            con.close();
            
            res=true;
            
        }
        catch (SQLException e) {
            Nuevo_Sprint_GUI.nuevoSprintRes.setText("Error en la base de datos");
            Nuevo_Sprint_GUI.nuevoSprintDialog.setVisible(true);
            throw new IllegalStateException("Cannot connect the database!", e);
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Nuevo_Sprint.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(Exception e){
            res=false;
        }
        return res;
        
    }
    
    public static String mesConversion(String m){
        String res1="1";
        
        if (m.equals("Enero")) res1="1";
        if (m.equals("Febrero")) res1="2";
        if (m.equals("Marzo")) res1="3";
        if (m.equals("Abril")) res1="4";
        if (m.equals("Mayo")) res1="5";
        if (m.equals("Junio")) res1="6";
        if (m.equals("Julio")) res1="7";
        if (m.equals("Agosto")) res1="8";
        if (m.equals("Septiembre")) res1="9";
        if (m.equals("Octubre")) res1="10";
        if (m.equals("Noviembre")) res1="11";
        if (m.equals("Diciembre")) res1="12";
        
        return res1;
    }
    
    
}

package control;

import java.sql.*;

public class Gestionar_Historias
{
    private Connection connection;
    
    public Gestionar_Historias()
    {
        connection=new ConexionDB().conexion();
    }

    public boolean addHistoria( String titulo, String descripcion, String condiciones_satisfaccion, int complejidad, int importancia, int id_product_owner )
    {
        boolean success=false;
        
        try
        {           
            String query;
            
            query = "INSERT INTO \"HISTORIA_DE_USUARIO\" (\"PRODUCT OWNER_ID_PO\",\"COMPLEJIDAD\",\"IMPORTANCIA\",\"TITULO\",\"DESCRIPCION\",\"CONDICIONES_DE_SATISFACCION\") VALUES(?, ?, ?, ?, ?, ?);";
        
            PreparedStatement sentencia = connection.prepareStatement(query);
            sentencia.setInt    (1, id_product_owner);
            sentencia.setInt    (2, complejidad);
            sentencia.setInt    (3, importancia);
            sentencia.setString (4, titulo);
            sentencia.setString (5, descripcion);
            sentencia.setString (6, condiciones_satisfaccion);
        
            sentencia.execute();
            
            success=true;
            connection.close();
        }
        catch( Exception sqle )
        {
            System.out.println(sqle);
        }
        
        return success;
    }
    
    public boolean editHistoria( int id_historia_usuario, String titulo, String descripcion, String condiciones_satisfaccion, int complejidad, int importancia, int id_product_owner )
    {
        boolean success=false;
        
        try
        {            
            String query;
            
            query = "UPDATE \"HISTORIA_DE_USUARIO\" SET \"PRODUCT OWNER_ID_PO\"=?,\"COMPLEJIDAD\"=?,\"IMPORTANCIA\"=?,\"TITULO\"=?,\"DESCRIPCION\"=?,\"CONDICIONES_DE_SATISFACCION\"=? WHERE \"ID_HIUS\"=? ;";
        
            PreparedStatement sentencia = connection.prepareStatement(query);
            sentencia.setInt    (1, id_product_owner);
            sentencia.setInt    (2, complejidad);
            sentencia.setInt    (3, importancia);
            sentencia.setString (4, titulo);
            sentencia.setString (5, descripcion);
            sentencia.setString (6, condiciones_satisfaccion);
            sentencia.setInt    (7, id_historia_usuario);
            
            sentencia.execute();
            
            success=true;
            connection.close();
        }
        catch( Exception sqle )
        {
            System.out.println(sqle);
        }
        
        return success;
    }
    
    public boolean delHistoria( int id_historia_usuario )
    {
        boolean success=false;
        
        try
        {
            String query;
            
            query = "DELETE FROM \"HISTORIA_DE_USUARIO\" WHERE \"ID_HIUS\"=? ;";
        
            PreparedStatement sentencia = connection.prepareStatement(query);
            sentencia.setInt    (1, id_historia_usuario);
            
            sentencia.execute();
            
            success=true;
            connection.close();
        }
        catch( Exception sqle )
        {
            System.out.println(sqle);
        }
        
        return success;
    }
}

<<<<<<< HEAD
package control;
=======
package Control;
>>>>>>> 5b5bbf794638db6650770358749622243a3ddf2d

import java.sql.*;

public class ConexionDB
{
    private String driver = "org.postgresql.Driver";
    private String url = "jdbc:postgresql://10.0.0.201/DBsis";
    private String username = "postgres";
    private String pass = "admin";
    private Connection connection;
    
    public ConexionDB()
    {
        try
        {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, username, pass);
        }
        catch( Exception sqle )
        {
            System.out.println(sqle);
        }
    }
    
    public Connection conexion()
    {
        return connection;
    }
}

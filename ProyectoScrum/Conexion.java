
package ProyectoScrum;
import java.sql.*;


public class Conexion {
    Connection c = null;
    public void conectar() {
          
      try {
         Class.forName("org.postgresql.Driver");
         c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
            "postgres", "password");
      } catch (Exception e) {
         e.printStackTrace();
         System.err.println(e.getClass().getName()+": "+e.getMessage());
         System.exit(0);
      }
    }    
public Connection getConnection(){
      return c;
   }
}
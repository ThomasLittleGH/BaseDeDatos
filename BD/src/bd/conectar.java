package bd;
// clase que permite realizar la coneccin a la base de datos

// se importan biblioteccas necesarias para la conexion
import java.sql.Connection;
import java.sql.DriverManager;

public class conectar {
    Connection conectar = null;
    public Connection conexion(){
      try{
          Class.forName("com.mysql.jdbc.Driver");
          // El orden de objeto es: drive + servidor + puerto + Bd + user + clave
          conectar = DriverManager.getConnection("jdbc:mysql://localhost:8889/colegio","admin","12345");
          System.out.println("se puede conectar a la BD");
      } catch (Exception e){
          System.out.println(e.getMessage());
          System.out.println("No se puede conectar a la BD");
      }
        return conectar;
    }
    
}

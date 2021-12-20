package src;
//esta clase, conexion, es para las instruciones que conecten con la base de datos
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    public static Connection conectar(){
        //Definir una variable tipo Connection
        Connection con = null;
        try {
        //Se crea la conexion
        con = DriverManager.getConnection("jdbc:sqlite:./concurso.db"); 
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return con; 
    }
}

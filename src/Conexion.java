package src;
//esta clase, conexion, es para las instruciones que conecten con la base de datos
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    //metodo publico, estatico para no instanaciar objeto, que devuleve un tipo de dato Connection
    //que se llama conectar que no recive parametros
    public static Connection conectar(){
        //Definir una variable tipo Connection
        Connection con = null;//se inicializa con null, para luego preguntar si no es igual a esto es porque se conecto
        //lo que sigue esta en un try_catch, porque el DriveManager puede generar exepciones
        try {
        //DriverManager es la clase que funciona pra la conexion a las bases de datos 
        //la cual se le asigna a la variable con
        con = DriverManager.getConnection("jdbc:sqlite:./concurso.db"); //para que diferencie cual base de datos es se coloca la ruta en la parte en rojo
        //DriverManager("jdbc:sqlite:rutadondeestaelarchivodebasededatos")
        //si el archivo de base de datos esta en la misma carpeta del proyecto solo colocar el nombre de bd en la ruta
        } catch (Exception e) {
            System.out.println(e.getMessage());//la e recolecta las excepciones y el getMessage los muestra
        }
        return con; //se retorna con lo que tiene bd
    }
}

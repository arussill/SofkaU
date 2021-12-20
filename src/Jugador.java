package src;
import java.sql.Connection;
import java.sql.PreparedStatement;
// import java.sql.ResultSet;
// import java.sql.Statement;

// Aqui se realiza el guardado de la puntuación de los jugadores a base de datos

public class Jugador {
    // Atributos
    int puntaje;
    Connection con = Conexion.conectar();
    
    public Jugador(int puntaje) {
        this.puntaje = puntaje;
        Insertar();
    }   

    public void Insertar() {
        // se prepara la sentencia sql
        String sql = "INSERT INTO jugadores (puntaje) VALUES (?)";
        if (con != null){
            try {
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, puntaje);
                ps.execute(); //se realiza la ejecución de la sentencia en la bd
                //Cerrar la conexion
                con.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
}

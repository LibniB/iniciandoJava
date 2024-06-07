package ejemplo;
import ejemplo.conexion.conexion;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try (Connection conn = conexion.getConnection()) {
            if (conn != null) {
                System.out.println("Conexión exitosa a la base de datos!");
            } else {
                System.out.println("Fallo en la conexión a la base de datos!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

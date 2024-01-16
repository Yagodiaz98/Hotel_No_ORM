import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {
    private static String url = null;
    private static String user = null;
    private static String password = null;
    public static Connection connect() throws SQLException {
        url = "jdbc:mysql://localhost:3306/hoteldb";
        String usuario = "root";
        String contraseña = "admin";

        return DriverManager.getConnection(url, user, password);
    }
    //Getters
    public Connection getConnection() {
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
            return null; // Maneja adecuadamente las excepciones en tu aplicación
        }
    }
    public static void main(String[] args) {
        try {
            Connection connection = connect();
            System.out.println("Conexión exitosa a la base de datos");
            // Realiza operaciones con la conexión según tus necesidades
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

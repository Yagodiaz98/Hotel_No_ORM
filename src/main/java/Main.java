import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public void main(String[] args){
        int n;
        String cliente;
        int habitacion;
        String fecha;

        //Crear conector
        DatabaseConnector dbConnector = new DatabaseConnector();
        try {
            //Establecer la conexión
            Connection connection = dbConnector.getConnection();

            //Crear una declaracion SQL
            Statement statement = connection.createStatement();

            /*Ejecutamos la Query
            String query = "SELECT * FROM HABITACIONES";
            ResultSet resultSet = statement.executeQuery(query);*/

        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}

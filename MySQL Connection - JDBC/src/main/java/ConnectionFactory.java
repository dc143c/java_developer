import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private ConnectionFactory() {
        throw new UnsupportedOperationException();
    }
    public static Connection getConnection() {

        Connection connection = null;

        String urlConnection = "jdbc:mysql://localhost/digital_innovation_one";
        try {
            connection = DriverManager.getConnection(urlConnection, "root", "#C4tf1sh!");
            System.out.println("Connected at: " + urlConnection);
        } catch (SQLException e) {
            System.out.println("Error on connect");
            e.printStackTrace();
        }
        return connection;
    }
}


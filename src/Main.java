import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:{sql server}://{host}:{port}/{databasename}";
        String username = "root";
        String password = "12345";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
        }
    }
}
import java.sql.Connection;
import java.sql.DriverManager;

//public class DB {

   /* public static Connection connect() {
        try {
            Connection con = DriverManager.getConnection(
              "jdbc:mysql://localhost:3306/farmerdb",
              "username",
              "password"
            );
            System.out.println("Database Connected");
            return con;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}*/import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/farmers_db";
    private static final String USER = "root"; // default WAMP user
    private static final String PASSWORD = ""; // default is empty

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}

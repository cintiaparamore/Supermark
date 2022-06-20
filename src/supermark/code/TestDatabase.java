package supermark.code;

import org.mariadb.jdbc.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class TestDatabase {
    public static Connection ConnectDB() {

        final String DB_URL = "jdbc:mariadb://localhost:3306/Supermark";
        final String USSER = "root";
        final String PASS = "41340689";

        try {
            Connection connection = (Connection) DriverManager.getConnection(DB_URL, USSER, PASS);
            return connection;

        } catch (SQLException e) {
            return null;
        }

    }
}


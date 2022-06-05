package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
    private static String url = "jdbc:mysql://localhost:3306/account_user";
    private static String username = "root";
    private static String pwd = "@Thanhhung21021991";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, username, pwd);
    }
}
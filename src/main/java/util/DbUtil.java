package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/BBS", "Yang", "12345678");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

}
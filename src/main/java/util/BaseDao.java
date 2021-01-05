package util;

import java.sql.*;

public class BaseDao {
    private Connection connection;
    private PreparedStatement preparedStatement;

    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/BBS", "Yang", "12345678");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection(){
        if(connection == null) {
            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/BBS", "Yang", "12345678");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return connection;
    }

    public ResultSet executeQuery(String sql, Object... params) {
        connection = getConnection();
        try {
            preparedStatement = connection.prepareStatement(sql);
            for(int i = 0; i < params.length; i++)
                preparedStatement.setObject(i + 1,  params[i]);
            return preparedStatement.executeQuery();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public int executeUpdate(String sql, Object... params) {
        connection = getConnection();
        try {
            preparedStatement = connection.prepareStatement(sql);
            for(int i = 0; i < params.length; i++)
                preparedStatement.setObject(i + 1,  params[i]);
            return preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return -1;
    }
}

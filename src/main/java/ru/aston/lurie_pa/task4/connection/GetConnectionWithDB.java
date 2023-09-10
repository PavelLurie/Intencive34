package ru.aston.lurie_pa.task4.connection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class GetConnectionWithDB{
    private String url;
    private String userName;
    private String password;

    public Connection getConnection() {

        ResourceBundle rb = ResourceBundle.getBundle("application");
        url = rb.getString("db.url");
        userName = rb.getString("db.username");
        password = rb.getString("db.password");

        Connection connection;
        try {
            connection = DriverManager.getConnection(url, userName, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
}

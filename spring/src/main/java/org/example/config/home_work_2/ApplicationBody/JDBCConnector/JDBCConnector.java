package org.example.config.home_work_2.ApplicationBody.JDBCConnector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class JDBCConnector {
    private static String URL = "jdbc:postgresql://localhost:5432/";
    private static String USERNAME = "postgres";
    private static String PASSWORD = "root";

    public ResultSet connect(String dbName, String query){
        URL = URL.concat(dbName);
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement find = connection.createStatement();
            ResultSet resultSet = find.executeQuery(query);
            connection.close();
            return resultSet;
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

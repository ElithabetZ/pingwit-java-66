package org.example.config.home_work_1.application_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import org.springframework.stereotype.Component;
@Component
public class JdbcConnector {
    private static final String URL = "jdbc:postgresql://localhost:5432/stocks";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "root";

    public static void main(String[] args) {
        JdbcConnector jdbcConnector = new JdbcConnector();
        jdbcConnector.runQuery();
    }

    public void runQuery() {
        try {
            Class.forName("org.postgresql.Driver");

            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            Statement statement = connection.createStatement();

            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Connection!");
    }
}

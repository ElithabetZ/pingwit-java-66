package org.example.config.home_work_3.body.repository;

import org.example.config.home_work_3.body.model.Apple;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class JdbcAppleConnector implements JdbcConnector<Apple>{

    private static final String URL = "jdbc:postgresql://localhost:5432/apples";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "root";
    private static final String QUERY = "select * from apple_warehouse";//лучше без звездочки, а прописать поля

    //логика с коннекшеном везде будет дублироваться, поэтому ее лучше вынести в JdbcConnetror, а здесь просто переиспользовать (default метод, например)
    @Override
    public List<Apple> getAll() {
        try {
            //в отдельный метод: Connection prepareConnection() in JdbcConnector
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement find = connection.createStatement();
            ResultSet result = find.executeQuery(QUERY);
            List<Apple> apples = new ArrayList<>();
            //вынеси в отдельный метод - Apple mapApple(ResultSet rawData);
            while(result.next()){
                Long id = result.getLong(1);
                String name = result.getString(2);
                String color = result.getString(3);
                Integer quantity = result.getInt(4);
                Float location = result.getFloat(5);
                Apple apple = new Apple(id, name, color, quantity, location);
                apples.add(apple);
            }

            connection.close();
            return apples;
        } catch (ClassNotFoundException | SQLException e) {
            //Лиза! Надо что-то внятное прокидывать. Создай свой эксепшен. Например AppleJdbcEception
            throw new RuntimeException(e);
        }
    }
}

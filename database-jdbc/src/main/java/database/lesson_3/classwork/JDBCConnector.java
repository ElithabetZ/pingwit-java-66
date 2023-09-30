package database.lesson_3.classwork;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCConnector {


    private static final String URL = "jdbc:postgresql://localhost:5432/mashinki";
    private static String USERNAME = "postgres";
    private static String PASSWORD = "root";
    public void runQuery(){
        try {
            Class.forName("org.postgresql.Driver");

           Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery("Select * from auto_house");

            //statement.getMaxRows(); max

            List<Car> cars = new ArrayList<>();

            while(rs.next()){
                Long carId = rs.getLong(1);
                String producer = rs.getString(2);
                String vin = rs.getString(3);
                Long fuel = rs.getLong(4);
                Long wheel = rs.getLong(5);
                Car car = new Car(carId, producer, vin, fuel, wheel);
                cars.add(car);
            }

            cars.forEach(System.out::println);

            Statement update = connection.createStatement();
            int counter = update.executeUpdate("Delete from auto_house where id = 9");
            System.out.println(counter);

            //PreparedStatement preparedStatement = connection.prepareStatement("insert into fuel(name) values (?)");

            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        JDBCConnector jdbcConnector = new JDBCConnector();
        jdbcConnector.runQuery();
    }
}

package database.lesson_4;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Connector {
    private static final String URL = "jdbc:postgresql://localhost:5432/stocks";
    private static String USERNAME = "postgres";
    private static String PASSWORD = "root";

    public void insert(String query) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement createTable = connection.createStatement();
            int count = createTable.executeUpdate(query);
            System.out.println("Changed " + count + " times");
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //StockRepository<Stock> у которого есть метод List<Stock> getAll() { Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD); .....}
    public List<Stock> getStocks(String query){
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement find = connection.createStatement();
            ResultSet result = find.executeQuery(query);
            List<Stock> stocks = new ArrayList<>();
            while(result.next()){
                Integer id = result.getInt(1);
                String ticker = result.getString(2);
                String company_name = result.getString(3);
                Integer profit_year = result.getInt(4);
                String location = result.getString(5);
                LocalDate update_date_time = result.getDate(6).toLocalDate();
                Stock stock = new Stock(id, ticker, company_name, profit_year, location, update_date_time);
                stocks.add(stock);
            }
            connection.close();

            return stocks;
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

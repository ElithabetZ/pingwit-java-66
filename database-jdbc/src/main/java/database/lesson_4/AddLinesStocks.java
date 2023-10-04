package database.lesson_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class AddLinesStocks {
    private String INSERT =
            "INSERT INTO stocks(ticker, company_name, profit_year, location, update_date_time) " +
                    "VALUES (%1$s, '2012', 'USA', '1980-01-01');";
    private List<String> tickers = new ArrayList<>(Arrays.asList("'AAPL', 'Apple'", "'GOOGL', 'Google'", "'Micr', 'Microsoft'", "'COLA', 'CocaCola'", "'MCD', 'McDonalds'"));

    public void add(int number) {
        String query = "";
        for (int i = 0; i < number; i++) {
            String INSERTTEMP = INSERT;
            INSERTTEMP = String.format(INSERT, tickers.get(new Random().nextInt(tickers.size())));
            query += INSERTTEMP;
        }
        Connector connector = new Connector();
        connector.insert(query);
    }
}

package database.lesson_4;

import java.util.List;

public class GetDataStocks {

    private String GET = "select * from stocks ";
    public List<Stock> get(String condition){
        GET = GET + condition;
        Connector connector = new Connector();
        List<Stock> stocks = connector.getStocks(GET);
        return stocks;
    }
}

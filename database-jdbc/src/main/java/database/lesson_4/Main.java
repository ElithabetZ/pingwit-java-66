package database.lesson_4;

import java.util.List;

/*
- При помощи Java JDBC (см пред лекцию) постепенно получить все компании (используя лимит операцию с офсетом) из таблицы и обновить
update_date на текущую дату
- Порционно получить данные из таблицы, ticker которых содержит букву "A" и вывести на экран
 */
public class Main {
    public static void main(String[] args) {
        AddLinesStocks addLinesStocks = new AddLinesStocks();
        addLinesStocks.add(100);

        UpdateDateStocks updateDateStocks = new UpdateDateStocks();
        updateDateStocks.update();

        GetDataStocks getDataStocks = new GetDataStocks();
        List<Stock> stocks = getDataStocks.get("where ticker like '%A%';");
        stocks.forEach(System.out::println);
    }
}

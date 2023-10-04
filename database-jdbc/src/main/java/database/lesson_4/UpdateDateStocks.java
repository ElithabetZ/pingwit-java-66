package database.lesson_4;

public class UpdateDateStocks {
    private String UPDATE = "update stocks\n" +
            "set update_date_time = now();";
    public void update(){
        Connector connector = new Connector();
        connector.insert(UPDATE);
    }
}

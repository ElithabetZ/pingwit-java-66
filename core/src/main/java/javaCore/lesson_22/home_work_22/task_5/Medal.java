package javaCore.lesson_22.home_work_22.task_5;

public class Medal {

    private String rase;
    private int place;

    public Medal(String rase, int place) {
        this.rase = rase;
        this.place = place;
    }

    @Override
    public String toString() {
        return "Medal{" +
                "rase='" + rase + '\'' +
                ", place=" + place +
                '}';
    }
}

package javaCore.lesson_10.home_work_10.task_1;

//у тебя все овощи дублируют одни и те же поля. Логичнее их перенести в Vegetable
public class Cucumber extends Vegetable{
    private double kalories;
    private double weight;

    public Cucumber(String name, double kalories, double weight)
    {
        this.kalories = kalories;
        this.weight = weight;
    }
    @Override
    public double getKalories() {
        return kalories;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}

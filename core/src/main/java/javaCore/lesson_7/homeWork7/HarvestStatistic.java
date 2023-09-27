package javaCore.lesson_7.homeWork7;

public class HarvestStatistic {
    private String plant;
    private Double totalWeight;

    public HarvestStatistic(String plant, Double totalWeight){
        this.plant = plant;
        this.totalWeight = totalWeight;
    }

    @Override
    public String toString() {
        return "HarvestStatistic{" +
                "plant='" + plant + '\'' +
                ", totalWeight=" + totalWeight +
                '}';
    }

    public String getPlant() {
        return plant;
    }
}

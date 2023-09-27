package javaCore.lesson_7.homeWork7;

public class HarvestStatisticService {
    private Harvest harvest0;//naming with number??

    public HarvestStatistic[] calculateStatistic(Harvest[] harvest) {
        Harvest[] exampleHarvest =  harvest;
        HarvestStatistic[] endHarvest = new HarvestStatistic[exampleHarvest.length];

        for (int i = 0; i < exampleHarvest.length; i++) {
            String field = exampleHarvest[i].getPlant();
            if (field != null) {
                Double weight = exampleHarvest[i].getWeight();
                //g -> j
                for (int g = i + 1; g < exampleHarvest.length; g++) {
                    String fieldG = exampleHarvest[g].getPlant();
                    Double weightG = exampleHarvest[g].getWeight();
                    if (fieldG == field) {//need to use equals. May leed to improper result
                        weight += weightG;
                        exampleHarvest[g].setPlant("Null");//null
                    }
                }
                HarvestStatistic statElement = new HarvestStatistic(field, weight);
                endHarvest[i] = statElement;
            }
        }
        return endHarvest;
    }
}

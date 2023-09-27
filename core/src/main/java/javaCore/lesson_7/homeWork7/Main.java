package javaCore.lesson_7.homeWork7;

public class Main {
    public static void main(String[] args) {
        int lenghtOfArray = 5;
        Harvest one = new Harvest(00014L, "Ali", "Wheat", 2580.23);
        Harvest two = new Harvest(00014L, "Ali", "Rye", 20.23);
        Harvest three = new Harvest(00014L, "Ali", "Wheat", 25800.3);
        Harvest four = new Harvest(00014L, "Ali", "Rice", 200.23);
        Harvest five = new Harvest(00014L, "Ali", "Rye", 25800.3);
       /* Harvest[] harvest = {
        new Harvest(00014L, "Ali", "Wheat", 2580.23),
        new Harvest(00014L, "Ali", "Rye", 20.23),
        new Harvest(00014L, "Ali", "Wheat", 25800.3),
        new Harvest(00014L, "Ali", "Rice", 200.23),
        new Harvest(00014L, "Ali", "Rye", 25800.3)
       }
       */
        Harvest[] giveme = new Harvest[lenghtOfArray];
        giveme[0] = one;
        giveme[1] = two;
        giveme[2] = three;
        giveme[3] = four;
        giveme[4] = five;

        HarvestStatisticService harvServ = new HarvestStatisticService();
        HarvestStatistic[] stat = harvServ.calculateStatistic(giveme);

        for (int i = 0; i < stat.length; i++) {
            //!=null without ""
            if(stat[i].getPlant() != "Null") {
                System.out.println(stat[i]);
            }
        }

        for (int i = 0; i < giveme.length; i++) {

                System.out.println(giveme[i]);

        }
    }
}

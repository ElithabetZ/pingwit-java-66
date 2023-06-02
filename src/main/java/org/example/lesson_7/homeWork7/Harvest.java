package org.example.lesson_7.homeWork7;

public class Harvest {
    private Long id;
    private String field;
    private String plant;
    private Double weight;

    public Harvest(Long id, String field, String plant, Double weight){
        this.id = id;
        this.field = field;
        this.plant = plant;
        this.weight = weight;
    }

    public String getPlant() {return plant;}
    public Double getWeight() {return weight;}

    public void setPlant(String plant) {
        this.plant = plant;
    }

    @Override
    public String toString() {
        return "Harvest{" +
                "id=" + id +
                ", field='" + field + '\'' +
                ", plant='" + plant + '\'' +
                ", weight=" + weight +
                '}';
    }
}

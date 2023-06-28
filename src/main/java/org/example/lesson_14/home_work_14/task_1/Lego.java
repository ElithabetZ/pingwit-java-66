package org.example.lesson_14.home_work_14.task_1;

public class Lego {

    @NotEmptyTwo
    private String type;
    @Size(min = 1, max = 11)
    private Integer elementQuantity;
    @ValidColor(colors = {LegoColor.BLUE, LegoColor.GREEN})
    private LegoColor color;

    public Lego(String type, Integer elementQuantity, LegoColor color) {
        this.type = type;
        this.elementQuantity = elementQuantity;
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public Integer getElementQuantity() {
        return elementQuantity;
    }

    public LegoColor getColor() {
        return color;
    }
}

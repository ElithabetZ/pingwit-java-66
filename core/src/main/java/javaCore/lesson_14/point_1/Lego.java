package javaCore.lesson_14.point_1;

public class Lego {

    @NotEmpty
    private String type;
    private int elementsQuantity;

    public Lego(String type, int elementsQuantity) {
        this.type = type;
        this.elementsQuantity = elementsQuantity;
    }

    public String getType() {
        return type;
    }

    public int getElementsQuantity() {
        return elementsQuantity;
    }
}

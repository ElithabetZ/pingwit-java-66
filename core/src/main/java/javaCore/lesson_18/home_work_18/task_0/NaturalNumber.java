package javaCore.lesson_18.home_work_18.task_0;

public class NaturalNumber<T extends Integer> {

    private T number;

    public boolean isNatrual() {
        boolean isNatural = false;
        if (this.number.intValue() > 0) {
            isNatural = true;
        }
        return isNatural;
    }

    public NaturalNumber(T number) {
        this.number = number;
    }
}

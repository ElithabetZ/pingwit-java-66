package javaCore.lesson_22.point_4;

public class MethodRefenExample {
    public static void main(String[] args) {

        Filter filter = new Filter();
        FilterExample filtrExample =  filter::filtrSome;
    }
}

@FunctionalInterface
interface FilterExample{
    boolean filter(Integer x);
}
class Filter {

    public static final int MAX_VALUE = 20;

    boolean filtrSome(Integer x) {
        return x > MAX_VALUE;
    }
}
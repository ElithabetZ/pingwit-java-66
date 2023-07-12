package org.example.lesson_18.point_3;

public class GenericMethodExample {
    Integer doubleInt = MathConverter.convert(33.0);
}

class MathConverter{

    public static <T extends Number> Integer convert(T fromValue){
        return fromValue.intValue();
    }
}

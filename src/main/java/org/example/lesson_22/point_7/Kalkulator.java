package org.example.lesson_22.point_7;

import java.util.function.Function;

public class Kalkulator implements Function<Long, Long> {

    public Long apply(Long along){
        return along +3;
    }
}

class FunctionExample2{
    public static void main(String[] args) {
        Function<Long, String> adder = (val) -> val.toString();
    }
}
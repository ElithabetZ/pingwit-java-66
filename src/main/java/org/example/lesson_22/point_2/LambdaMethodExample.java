package org.example.lesson_22.point_2;

@FunctionalInterface
interface LambdaMethod {
    Integer increment(Integer integer);
}

public class LambdaMethodExample {

    public static void main(String[] args) {
        LambdaMethod incrementByOne = x -> ++x;
        LambdaMethod incrementMultTwo = x -> x *= 2;

        System.out.println(incrementByOne.increment(1));
        System.out.println(incrementMultTwo.increment(2));

        Integer process1 = process(incrementByOne, 1);
        System.out.println(process1);

    }

    public static Integer process(LambdaMethod lambdaMethod, Integer input){
        return lambdaMethod.increment(input);
    }
}

package javaCore.lesson_5;

public class ForEachExample {
    public static void main(String[] args) {
        int[] initArr = {5, 2, 3, 4};

        for(int i = 0; i < initArr.length; i++){
            System.out.println(i);
        };

        for (int index : initArr){
            System.out.println(index);
        }

        String[] cars = {"M", "S", "K"};
        for(String car : cars) {
            System.out.println(car);
        };
    }
}

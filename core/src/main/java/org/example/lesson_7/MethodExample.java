package org.example.lesson_7;

public class MethodExample {
    public static void main(String[] args) {
        int sum = sum(1,2);
        System.out.println(sum);
        MethodExample me = new MethodExample();
        int sum2 = me.sum2(2,3);
        System.out.println(sum2);
        System.out.println(me.sum3(1,2,5,4,5,4,5));
    }

    static int sum(int a, int b)
    {
        return a+b;
    }
     int sum2(int a, int b)
    {
        return a+b;
    }

    int sum2(int[] nums){
        int sum = 0;
        for(int index : nums){
            sum+=index;
        }
        return sum;
    }

    int sum3(int... nums){
        int sum = 0;
        for(int index : nums){
            sum+=index;
        }
        return sum;
    }
}

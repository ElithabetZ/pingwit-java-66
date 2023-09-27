package javaCore.lesson_15.point_4;

public class Main {

    public static void main(String[] args) {
        //ex1();
        ex2();
    }

    static void ex1(){
        throw  new MyCustomUncheckedException("My unchecked");
    }

    static void ex2(){
        try {
            throw new MyCustomerCheckedException("My checked");
        } catch (MyCustomerCheckedException e)
        {
            System.out.println("blalalalla");
        }
    }
}

package org.example.lesson_15.point_3;

public class ThrowsExample {

    public static void main(String[] args) {
        ex3();
    }

    static void ex1() throws Exception{
        throw new Exception();
    }

    static void ex2() throws Exception{
        ex1();
    }

    static void ex3(){
        try{
            ex2();
        } catch (Exception e){
            System.out.println("Exception accured");
        }
    }
}

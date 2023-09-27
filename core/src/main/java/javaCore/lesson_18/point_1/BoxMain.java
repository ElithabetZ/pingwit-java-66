package javaCore.lesson_18.point_1;

public class BoxMain {

    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.setObject("String");
        Box<Integer> boxInt = new Box<>();
        boxInt.setObject(33);
        String str = box.getObject();
    }
}

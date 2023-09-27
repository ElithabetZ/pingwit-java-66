package javaCore.lesson_12.point_2;

public class STringBuilderExample {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Hello, builder");
        StringBuffer stringBuffer = new StringBuffer("Hello, buffer");

        stringBuilder.append(222);
        System.out.println(stringBuilder);
        stringBuilder.append(false);
        System.out.println(stringBuilder);
        stringBuilder.append(", heeeelooo");
        System.out.println(stringBuilder);


        String str = stringBuilder.substring(2);
        System.out.println(str);

        char c = stringBuilder.charAt(1);
        System.out.println(c);
        System.out.println(stringBuilder.indexOf("e"));
        System.out.println(stringBuilder.length());

        int element = stringBuilder.indexOf("el");
        System.out.println(stringBuilder.insert(element, "!"));
    }
}

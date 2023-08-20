package org.example.lesson_12.point_1;

import java.util.Arrays;

public class StringExample {
    public static void main(String[] args) {
        String str1 = "Java";  //прямая инициализация
        String str2 = new String("Java"); //обьектный метод
        String str3 = new String(new char[] {'J', 'a', 'v', 'a'}); //через чар
        String str4 = new String(new char[] {'J', 'a', 'v', 'a'}, 2, 2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

        System.out.println(str1.length());
        char[] chars = str1.toCharArray();
        System.out.println(Arrays.toString(chars));
        boolean empty = str1.isEmpty();
        System.out.println(empty);
        String str5 = "";
        System.out.println(str5.isEmpty());
        String str6 = " ";
        System.out.println(str6.isEmpty());
        /*
        String str7 = null;
        str7.isEmpty();
        */
        String str8 = "Java";
        String str9 = str8.concat(", hello");
        System.out.println(str9);

        String str11 = str9.replace(',', ';');
        System.out.println(str11);

        String str12 = str11.replace("hel", " ");
        System.out.println(str12);

        str8 = str8.substring(1,3);
        System.out.println(str8);

        String str13 = "fneofner";
        System.out.println(str13);
        str13 = str13.toUpperCase();
        System.out.println(str13);
        str13 = str13.toLowerCase();
        System.out.println(str13);

        String str14 = "This is \"an\" example";
        System.out.println(str14);



        ///////////////////////////////////////////
        System.out.println("----------------------------------");
        String obj1 = new String("Java");
        String obj2 = new String("Java");
        System.out.println(obj1 == obj2);
        System.out.println(obj1.equals(obj2));

        String lit1 = "Java";
        String lit2 = "Java";
        System.out.println(lit1 == lit2);
        System.out.println(lit1.equals(lit2));
        System.out.println(lit1.equals(obj2));

        String lit3 = obj1.intern();
        System.out.println(lit1 == lit3);
    }
}

package org.example.lesson_25.point_1;

import org.apache.commons.lang3.StringUtils;

public class AppacheStringUtilsExample {

    public static void main(String[] args) {
        System.out.println(StringUtils.isEmpty(null));
        System.out.println(StringUtils.isEmpty(""));
        System.out.println(StringUtils.isEmpty("A"));

        System.out.println("----------------------");
        System.out.println(StringUtils.isBlank(null));
        System.out.println(StringUtils.isBlank(""));
        System.out.println(StringUtils.isBlank("   "));
        System.out.println(StringUtils.isBlank("A"));



        System.out.println("----------------------");
        String str = StringUtils.capitalize("cat");
    }
}

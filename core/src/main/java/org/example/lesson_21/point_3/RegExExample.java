package org.example.lesson_21.point_3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExExample {

    public static void main(String[] args) {
        String regex = "java"; //шаблон строки Джава
        String regex2 = "\\d{3}"; //шаблон строки из 3 цифровых символов
        String regex3 = "\\d{1,3}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher("java");
        System.out.println(matcher.find());

        Matcher matcher2 = pattern.matcher("javajava");
        int counter = 0;
        while (matcher2.find()){
            counter++;
        }
        System.out.println(counter);

        String str = "nclkewnelw<b>fenw</b>";
        String regexStr = "<b>\\S+</b>";
        Pattern patternStr = Pattern.compile(regexStr);
        Matcher matcherStr = patternStr.matcher(str);
        while(matcherStr.find()){
            System.out.println(matcherStr.group());
        }
    }
}

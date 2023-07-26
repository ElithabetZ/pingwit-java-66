package org.example.lesson_21.home_work_21.task_4;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Есть TreeSet имен, необходимо выбрать все от "H" до "W" (regex (регэксп))
 */
public class RegexHtoW {
    public static void main(String[] args) {
        Set<String> names = new TreeSet<>();
        getNames(names);
        String regex = "[H-W]";
        Pattern pattern = Pattern.compile(regex);
        for (String name: names) {
            Matcher match = pattern.matcher(name);
            if(match.find()){
                System.out.println(name);
            }
        }
    }

    public static void getNames(Set<String> set) {
        Scanner scan = new Scanner(System.in);
        boolean addMore = true;
        while (addMore) {
            System.out.println("Type name");
            set.add(scan.next());
            System.out.println("Do you want add more? YES = 1, NO = 0");
            if (scan.nextInt() == 0) {
                addMore = false;
            }
        }
    }
}

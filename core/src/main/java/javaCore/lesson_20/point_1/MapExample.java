package javaCore.lesson_20.point_1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "lesson_1");
        map.put(2, "lesson_2");
        map.put(3, "lesson_3");
        map.put(4, "lesson_4");
        String les = map.get(2);

        Collection<String> values = map.values();
        Set<Integer> integer = map.keySet();
    }
}

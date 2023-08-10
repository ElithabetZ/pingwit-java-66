package org.example.lesson_24.point_5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatsStreamExample {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3,4);
        List<Integer> list2 = Arrays.asList(5,6,7,8);

        Stream<Integer> stream1 = list1.stream();
        Stream<Integer> stream2 = list2.stream();
        //Stream<Integer> result = Stream.concat(stream2,stream1);
        //System.out.println(result.collect(Collectors.toList()));

        Stream<Integer> stream3 = list2.stream();
        Stream<Integer> resultNew = Stream.concat(Stream.concat(stream3,stream1),stream2);
        System.out.println(resultNew.collect(Collectors.toList()));
    }
}

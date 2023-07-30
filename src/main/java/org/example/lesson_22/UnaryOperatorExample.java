package org.example.lesson_22;

import org.example.lesson_9.point_3.Person;

import java.util.List;
import java.util.Random;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    public static void main(String[] args) {
        UnaryOperator<Mike> unaryOperator = (mike) -> {
          mike.setName("Mike");
          return mike;
        };
        Mike original = new Mike("1");
        Mike apply = unaryOperator.apply(original);
        System.out.println(apply);

        BinaryOperator<Integer> binaryOperator = (val, val2) -> val+val2;
        binaryOperator.apply(4,5);

        Supplier<Integer> supplier = () -> new Random().nextInt();
        Consumer<Integer> consumer = (val) -> System.out.println(val);

        List<String> names = List.of("Misha", "Masha");
        names.forEach((name)-> System.out.println(name));
        names.forEach(System.out::println);

    }
}


class Mike{

    private String name;

    public Mike(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Mike{" +
                "name='" + name + '\'' +
                '}';
    }
}

package javaCore.lesson_23.point_3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        OrderService orderService = new OrderServiceImpl();
        List<Order> orders = Arrays.asList(new Order(1), new Order(2));

    }


    private static Integer sum(Integer first, Integer second) {
        return Optional.ofNullable(first)
                .map(x -> x + second)
                .orElseThrow(() -> new RuntimeException("First is null"));
    }
}

package org.example.lesson_23.point_3;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OrderServiceImpl {

    public Optional findById(List<Order> orders, int id){
        List<Order> list = orders.stream()
                .filter(o->o.id() == id)
                .collect(Collectors.toList());
        return Optional.of(list.get(0));
    }

}

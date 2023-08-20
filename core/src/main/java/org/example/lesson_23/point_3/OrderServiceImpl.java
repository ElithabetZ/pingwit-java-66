package org.example.lesson_23.point_3;

import java.util.List;
import java.util.Optional;

public class OrderServiceImpl implements OrderService{

    public Optional<Order> findById(List<Order> orders, int id){
        Optional<Order> order = orders.stream()
                .filter(o->o.id() == id)
                .findAny();
        return order;
        }
    }

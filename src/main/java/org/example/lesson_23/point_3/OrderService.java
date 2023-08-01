package org.example.lesson_23.point_3;

import java.util.List;

public interface OrderService {

    Order findById(List<Order> orders, int id);
}

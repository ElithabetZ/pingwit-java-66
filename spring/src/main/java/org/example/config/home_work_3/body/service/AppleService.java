package org.example.config.home_work_3.body.service;

import org.example.config.home_work_3.body.model.Apple;

import java.util.List;
import java.util.Map;

public interface AppleService {

    List<Apple> getAll();

    Map<String, Integer> getByName(String name);
}

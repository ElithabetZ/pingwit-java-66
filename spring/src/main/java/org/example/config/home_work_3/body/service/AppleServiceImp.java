package org.example.config.home_work_3.body.service;

import org.example.config.home_work_3.body.model.Apple;
import org.example.config.home_work_3.body.repository.AppleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class AppleServiceImp implements AppleService{

    private final AppleRepository appleRepository;

    public AppleServiceImp(AppleRepository appleRepository){
        this.appleRepository = appleRepository;
    }
    @Override
    public List<Apple> getAll() {
        return appleRepository.getAll();
    }

    @Override
    public Map<String, Integer> getByName(String name) {
        List<Apple> apples = appleRepository.getAll();
        Map<String, Integer> response = apples.stream()
                .filter(apple -> apple.name().equals(name))
                .collect(Collectors.groupingBy(Apple::name, Collectors.summingInt(apple -> apple.quantity())));
        return response;
    }
}

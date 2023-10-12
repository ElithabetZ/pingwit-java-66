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

    //см комментарии в интерфейсе
    @Override
    public Map<String, Integer> getByName(String name) {
        // ты уже этот выхов релизовала с 19-21 строки. Так переиспользуй.
        List<Apple> apples = appleRepository.getAll();
        Map<String, Integer> response = apples.stream()
                .filter(apple -> apple.name().equals(name))//А почему бы не запросить из базы такие яблоки сразу?
                .collect(Collectors.groupingBy(Apple::name, Collectors.summingInt(apple -> apple.quantity())));
        return response;//сразу return в 29 строке
    }
}

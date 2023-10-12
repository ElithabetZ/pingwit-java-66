package org.example.config.home_work_3.body.service;

import org.example.config.home_work_3.body.model.Apple;

import java.util.List;
import java.util.Map;

public interface AppleService {

    List<Apple> getAll();

    /*
        List<Apple> getByCriteria(Criteria criteria);
        Apple get(Long (или Integer - что там у тебя) id);
    */
    //Возвращаемый тип абсолютно ни о чем не говорит. По названию метода я предполагаю возвращение яблок.  
    //Если ты хочешь калькулировать еще что-то, то создай для этого отдельный метод - calculateStatistics(List<Apple> apples);
    //Не смешивай логику
    Map<String, Integer> getByName(String name);
}

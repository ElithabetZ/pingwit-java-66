package org.example.config.home_work_3.body;

import org.example.config.home_work_3.body.model.Apple;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.example.config.home_work_3.body.service.AppleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/apples")
public class AppleControler {

    @Autowired
    private AppleService appleService;

    //можешь сразу на котроллер навесить, чтобы все методы были такими
    @GetMapping(consumes = "application/json")
    public List<Apple> getAll() {
        List<Apple> apples = appleService.getAll();
        return apples;//сразу return в 24 строке
    }

    //name - не ресурс. Обычно так делают с id, а не с параметрами. Используй @RequestParam
    //@GetMappint("/statistics"), @RequestParam String name
    //А можно вообще расширить приложение и передавать Criteria criteria! Таким образом даешь пользователю возможность выбора, по чему базировать статистику
    @GetMapping("/{name}")
    //название метода не отвечает тому, что он делает!
    //calculateStatistics
    public Map<String, Integer> getByName(@PathVariable String name) {
        return appleService.getByName(name);
    }
}

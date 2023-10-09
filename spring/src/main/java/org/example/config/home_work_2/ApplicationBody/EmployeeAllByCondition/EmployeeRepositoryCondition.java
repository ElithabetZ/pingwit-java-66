package org.example.config.home_work_2.ApplicationBody.EmployeeAllByCondition;

import org.example.config.home_work_2.ApplicationBody.Employee;

import java.util.List;
//нет, это один интерфейс EmployeeRepository
public interface EmployeeRepositoryCondition {
    //Employee - не condition. Создай для этого отдельный класс - Condition/Criteria
    List<Employee> getAllByCondition(Employee employee);
}

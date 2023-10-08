package org.example.config.home_work_2.ApplicationBody.EmployeeAllByCondition;

import org.example.config.home_work_2.ApplicationBody.Employee;

import java.util.List;

public interface EmployeeRepositoryCondition {
    List<Employee> getAllByCondition(Employee employee);
}

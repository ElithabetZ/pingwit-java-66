package org.example.config.home_work_2.ApplicationBody.EmployeeAllRepository;

import org.example.config.home_work_2.ApplicationBody.Employee;

import java.util.List;
//в папку repository
public interface EmployeeRepository {
    List<Employee> getAll();
}

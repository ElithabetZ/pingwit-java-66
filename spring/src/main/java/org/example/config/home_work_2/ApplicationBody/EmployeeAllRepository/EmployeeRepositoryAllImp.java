package org.example.config.home_work_2.ApplicationBody.EmployeeAllRepository;

import org.example.config.home_work_2.ApplicationBody.Employee;
import org.example.config.home_work_2.ApplicationBody.JDBCConnector.JDBCConnectorEmployeeService;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("getAll")
public class EmployeeRepositoryAllImp implements EmployeeRepository{

    @Override
    public List<Employee> getAll() {
        List<Employee> employees = new JDBCConnectorEmployeeService().getAll();
        return employees;
    }
}

package org.example.config.home_work_2.ApplicationBody.EmployeeAllByCondition;

import org.example.config.home_work_2.ApplicationBody.Employee;
import org.example.config.home_work_2.ApplicationBody.JDBCConnector.JDBCConnectorEmployeeService;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("getAllByName")
public class EmployeeRepositoryAllByNameImp implements EmployeeRepositoryCondition{
    @Override
    public List<Employee> getAllByCondition(Employee employee) {
        List<Employee> employees = new JDBCConnectorEmployeeService().getAllByName(employee.getName());
        return employees;
    }
}

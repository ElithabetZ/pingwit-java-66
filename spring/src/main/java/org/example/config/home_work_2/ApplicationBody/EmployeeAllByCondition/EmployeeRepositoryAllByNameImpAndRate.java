package org.example.config.home_work_2.ApplicationBody.EmployeeAllByCondition;

import org.example.config.home_work_2.ApplicationBody.Employee;
import org.example.config.home_work_2.ApplicationBody.JDBCConnector.JDBCConnectorEmployeeService;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("getAllByNameAndRate")
public class EmployeeRepositoryAllByNameImpAndRate implements EmployeeRepositoryCondition{
    @Override
    public List<Employee> getAllByCondition(Employee employee) {
        List<Employee> employees = new JDBCConnectorEmployeeService().getAllByNameAndRate(employee.getName(), employee.getRatePerHour());
        return employees;
    }
}

package org.example.config.home_work_2.ApplicationBody.EmployeeAllByCondition;

import org.example.config.home_work_2.ApplicationBody.Employee;
import org.example.config.home_work_2.ApplicationBody.JDBCConnector.JDBCConnectorEmployeeService;
import org.springframework.stereotype.Repository;

import java.util.List;
//а потом надо будет не только по name, rate, а еще по многим полям со всевозможными комбинациями? Сколько же это классов будет??
@Repository("getAllByNameAndRate")
public class EmployeeRepositoryAllByNameImpAndRate implements EmployeeRepositoryCondition{
    @Override
    public List<Employee> getAllByCondition(Employee employee) {//Condition, Criteria
        List<Employee> employees = new JDBCConnectorEmployeeService().getAllByNameAndRate(employee.getName(), employee.getRatePerHour());
        return employees;
    }
}

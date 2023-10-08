package org.example.config.home_work_2.ApplicationBody;

import org.example.config.home_work_2.ApplicationBody.EmployeeAllByCondition.EmployeeRepositoryCondition;
import org.example.config.home_work_2.ApplicationBody.EmployeeAllRepository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    @Qualifier("getAll")
    private EmployeeRepository employeeRepositoryAllImp;

    @Autowired
    @Qualifier("getAllByName")
    private EmployeeRepositoryCondition employeeRepositoryConditionByName;

    @Autowired
    @Qualifier("getAllByNameAndRate")
    private EmployeeRepositoryCondition employeeRepositoryAllByNameImpAndRate;

    public List<Employee> getAll() {
        List<Employee> employees = employeeRepositoryAllImp.getAll();
        System.out.println("Get");
        return employees;
    }

    public List<Employee> getAllByCondition(Employee employee) {
        List<Employee> employees;
        if(employee.getRatePerHour()==0){
             employees = employeeRepositoryConditionByName.getAllByCondition(employee);
        } else {
             employees = employeeRepositoryAllByNameImpAndRate.getAllByCondition(employee);
        }
        return employees;
    }
}

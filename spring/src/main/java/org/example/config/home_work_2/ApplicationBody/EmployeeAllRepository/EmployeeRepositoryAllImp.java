package org.example.config.home_work_2.ApplicationBody.EmployeeAllRepository;

import org.example.config.home_work_2.ApplicationBody.Employee;
import org.example.config.home_work_2.ApplicationBody.JDBCConnector.JDBCConnectorEmployeeService;
import org.springframework.stereotype.Repository;

import java.util.List;
//Репозиторий ассоциирован с методом... А если их будет 20?? 20 репозиториев? И как их менеджить...
@Repository("getAll")
public class EmployeeRepositoryAllImp implements EmployeeRepository{

    @Override
    public List<Employee> getAll() {
        //new JDBCConnectorEmployeeService(). А бин создать? Передать его тут в конструкторе/@Autowired
        List<Employee> employees = new JDBCConnectorEmployeeService().getAll();
        return employees;
    }
}

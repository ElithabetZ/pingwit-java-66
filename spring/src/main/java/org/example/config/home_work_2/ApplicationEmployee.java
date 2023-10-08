package org.example.config.home_work_2;

import org.example.config.home_work_2.ApplicationBody.Employee;
import org.example.config.home_work_2.ApplicationBody.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class ApplicationEmployee implements CommandLineRunner {

    @Autowired
    private EmployeeService employeeService;

    public static void main(String[] args) {
        SpringApplication.run(ApplicationEmployee.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        List<Employee> employeeList = employeeService.getAll();
        employeeList.forEach(System.out::println);

        List<Employee> employeeList2 = employeeService.getAllByCondition(new Employee("Mike"));
        employeeList2.forEach(System.out::println);

        List<Employee> employeeList3 = employeeService.getAllByCondition(new Employee("Mike", 12));
        employeeList3.forEach(System.out::println);
    }
}

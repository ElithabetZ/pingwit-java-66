package org.example.config.home_work_2.ApplicationBody.JDBCConnector;

import org.example.config.home_work_2.ApplicationBody.Employee;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JDBCConnectorEmployeeService {

    EmployeeQueryManager queryManager = new EmployeeQueryManager();
    private final String dbName = "employees";

    public List<Employee> getAll() {
        List<Employee> employees = getEmployees(queryManager.getQUERYGETALLEMPLOYESS());
        return employees;
    }

    public List<Employee> getAllByName(String name) {
        String query = queryManager.getQUERYGETALLEMPLOYESSBYNAME();
        query = String.format(query, name);
        List<Employee> employees = getEmployees(query);
        return employees;
    }

    public List<Employee> getAllByNameAndRate(String name, Integer rate) {
        String query = queryManager.getQUERYGETALLEMPLOYESSBYNAMEANDRATE();
        query = String.format(query, name, rate);
        List<Employee> employees = getEmployees(query);
        return employees;
    }

    private List<Employee> getEmployees(String query){
        JDBCConnector connector = new JDBCConnector();
        ResultSet result = connector.connect(dbName, query);
        List<Employee> employeeList = new ArrayList<>();
        try {
            while (result.next()) {
                Long id = result.getLong(1);
                String name = result.getString(2);
                Integer ratePerHour = result.getInt(3);
                Employee employee = new Employee(id, name, ratePerHour);
                employeeList.add(employee);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return employeeList;
    }
}

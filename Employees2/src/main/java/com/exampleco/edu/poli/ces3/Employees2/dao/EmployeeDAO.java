package com.exampleco.edu.poli.ces3.Employees2.dao;

import com.exampleco.edu.poli.ces3.Employees2.models.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> getEmployees();

    Employee getEmployee(int id);

    Employee createEmployee(Employee employee);

    Employee updatedEmployee(int id, Employee employee);

    Employee deleteEmployee(int id);


}

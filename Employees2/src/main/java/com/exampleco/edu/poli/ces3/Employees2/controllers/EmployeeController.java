package com.exampleco.edu.poli.ces3.Employees2.controllers;

import com.exampleco.edu.poli.ces3.Employees2.dao.EmployeeDAO;
import com.exampleco.edu.poli.ces3.Employees2.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeDAO employeeDAO;

    @RequestMapping(value = "test")
    public String test(){
        return "Hola Spring Boot";
    }

    @RequestMapping(value = "api/employees", method = RequestMethod.GET)
    public List<Employee> getEmployees(){
        return employeeDAO.getEmployees();
    }

    @RequestMapping(value = "api/employee/{id}", method = RequestMethod.GET)
    public Employee getEmployee(@PathVariable int id){
        return employeeDAO.getEmployee(id);
    }

    @RequestMapping(value = "api/employee", method = RequestMethod.POST)
    public Employee createEmployee(@RequestBody Employee e){
        return employeeDAO.createEmployee(e);
    }

    @RequestMapping(value = "api/employee/{id}", method = RequestMethod.PUT)
    public Employee updatedEmployee(@PathVariable int id, @RequestBody Employee e){
        return employeeDAO.updatedEmployee(id, e);
    }

    @RequestMapping(value = "api/employee/{id}", method = RequestMethod.DELETE)
    public Employee deleteEmployee(@PathVariable int id){
        return employeeDAO.deleteEmployee(id);
    }


}

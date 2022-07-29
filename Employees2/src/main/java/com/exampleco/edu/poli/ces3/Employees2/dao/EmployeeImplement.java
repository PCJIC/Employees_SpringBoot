package com.exampleco.edu.poli.ces3.Employees2.dao;

import com.exampleco.edu.poli.ces3.Employees2.models.Employee;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class EmployeeImplement implements EmployeeDAO{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Employee> getEmployees() {
        String query = "FROM Employee";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public Employee getEmployee(int id) {
        return entityManager.find(Employee.class, id);
    }

    @Override
    public Employee createEmployee(Employee employee) {
        return entityManager.merge(employee);
    }

    @Override
    public Employee updatedEmployee(int id, Employee employee) {
        employee.setId(id);
        return entityManager.merge(employee);
    }

    @Override
    public Employee deleteEmployee(int id) {
        Employee e = entityManager.find(Employee.class, id);
        entityManager.remove(e);
        return e;
    }

}

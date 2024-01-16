package com.empapp.service;

import com.empapp.exceptions.EmployeeNotFoundException;
import com.empapp.repository.Employee;
import com.empapp.repository.EmployeeRepo;
import com.empapp.repository.EmployeeRepoJdbcImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeRepo employeeRepo;
    private Logger logger= LoggerFactory.getLogger(EmployeeServiceImpl.class);

    //there is a copuling bw the two layer and spring can help us
    public EmployeeServiceImpl(){
        employeeRepo=new EmployeeRepoJdbcImpl();
    }
    @Override
    public List<Employee> getAll() {
        long start=System.currentTimeMillis();
        List<Employee> employees= employeeRepo.getAll();
        long end=System.currentTimeMillis();
        logger.info("method getAll() take "+ (end-start)+" ms");
        return employees;
    }

    @Override
    public void addEmployee(Employee e) {
        employeeRepo.addEmployee(e);
    }

    @Override
    public void updateEmployee(int id, Employee employee) {
        employeeRepo.updateEmployee(id, employee);
    }

    @Override
    public Employee getById(int id) {
        Employee employee= employeeRepo.getById(id);
        if(employee==null)
            throw  new EmployeeNotFoundException("employee with id "+ id +" is not found");
        return employee;
    }

    @Override
    public void deleteEmployee(int id) {
        employeeRepo.deleteEmployee(id);
    }
}

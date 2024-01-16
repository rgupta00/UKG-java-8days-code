package com.empapp.service;

import com.empapp.repository.Employee;

import java.util.List;
//SL=BL+ CCC(Cross cutting concern)
public interface EmployeeService {
    public List<Employee> getAll();
    public void addEmployee(Employee e);
    public void updateEmployee(int id, Employee employee);
    public Employee getById(int id);
    public void deleteEmployee(int id);
}

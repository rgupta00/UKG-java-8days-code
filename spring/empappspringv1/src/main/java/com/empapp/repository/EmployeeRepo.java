package com.empapp.repository;

import java.util.List;

public interface EmployeeRepo {
    public List<Employee> getAll();
    public void addEmployee(Employee e);
    public void updateEmployee(int id, Employee employee);
    public Employee getById(int id);
    public void deleteEmployee(int id);
}

package com.empapp.repository;

import com.empapp.repository.factory.ConnectionFactory;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

//pull vs push
public class EmployeeRepoHibImpl implements EmployeeRepo{

    private Connection connection;

    public EmployeeRepoHibImpl(){
        connection= ConnectionFactory.getConnection();
    }
    @Override
    public List<Employee> getAll() {
        List<Employee> employees=new LinkedList<>();
        Employee employee=null;
        try{
            Statement stmt=connection.createStatement();
            ResultSet rs=stmt.executeQuery("select * from emp");
            while (rs.next()){
                employee=new Employee(rs.getInt(1),rs.getString(2),
                        rs.getDouble(3));
                employees.add(employee);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
        return employees;
    }

    @Override
    public void addEmployee(Employee e) {
        try {
            PreparedStatement pstmt=connection.
                    prepareStatement("insert into emp(name,salary) values (?,?)");
            pstmt.setString(1, e.getName());
            pstmt.setDouble(2, e.getSalary());
            int noOfRowsEffected= pstmt.executeUpdate();
            System.out.println(noOfRowsEffected);
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void updateEmployee(int id, Employee employee) {
        try {
            PreparedStatement pstmt=connection.
                    prepareStatement("update emp set salary=? where id=?");
            pstmt.setDouble(1, employee.getSalary());
            pstmt.setInt(2, id);
            int noOfRowsEffected= pstmt.executeUpdate();
            System.out.println(noOfRowsEffected);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public Employee getById(int id) {
        Employee employee=null;
        try{
            PreparedStatement stmt=connection.prepareStatement("select * from emp where id=?");
           stmt.setInt(1, id);
           ResultSet rs=stmt.getResultSet();
            if (rs.next()){
                employee=new Employee(rs.getInt(1),rs.getString(2),
                        rs.getDouble(3));
            }
        }catch (SQLException e){
            System.out.println(e);
        }
        return employee;
    }

    @Override
    public void deleteEmployee(int id) {
        try {
            PreparedStatement pstmt=connection.
                    prepareStatement("delete from emp where id=?");
            pstmt.setInt(1,id);
            int noOfRowsEffected= pstmt.executeUpdate();
            System.out.println(noOfRowsEffected);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

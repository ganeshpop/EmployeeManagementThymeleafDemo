package com.ganesh.model.service;

import com.ganesh.bean.Employee;
import com.ganesh.bean.EmployeePaySlip;

import java.util.Collection;

public interface EmployeeService {

    Collection<Employee> getAllEmployees();
    boolean insertEmployee(Employee employee);
    EmployeePaySlip getPaySlip(int id);
    Employee searchEmployeeById(int id);
    boolean deleteEmployee(int id);
    boolean UpdateEmployeeSalary(int id,int salary);
}
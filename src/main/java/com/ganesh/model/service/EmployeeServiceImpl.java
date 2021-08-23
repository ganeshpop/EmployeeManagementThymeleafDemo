package com.ganesh.model.service;


import com.ganesh.bean.Employee;
import com.ganesh.bean.EmployeePaySlip;
import com.ganesh.model.persistence.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao empDao;

    @Override
    public Collection<Employee> getAllEmployees() {

        return empDao.findAll();
    }

    @Override
    public boolean insertEmployee(Employee employee) {
        Employee e = empDao.save(employee);
        if (e != null)
            return true;
        return false;
    }

    /*
     * HR :15% of salary PF :12% of Salary DA : 8% of Salary
     */
    @Override
    public EmployeePaySlip getPaySlip(int id) {
        EmployeePaySlip paySlip = null;
        Employee employee = empDao.getById(id);
        if (employee != null) {
            paySlip = new EmployeePaySlip();
            paySlip.setEmployee(employee);
            paySlip.setHr(.15 * employee.getEmpSalary());
            paySlip.setDa(.01 * employee.getEmpSalary());
            paySlip.setPf(.12 * employee.getEmpSalary());
            paySlip.setTotalSalary(employee.getEmpSalary() + .15 * employee.getEmpSalary()
                    + .01 * employee.getEmpSalary() - .12 * employee.getEmpSalary());
        }
        return paySlip;
    }

    @Override
    public Employee searchEmployeeById(int id) {
        return empDao.getById(id);
    }

    @Override
    public boolean deleteEmployee(int id) {
        empDao.deleteById(id);
        return true;
    }

    @Override
    public boolean UpdateEmployeeSalary(int id, int salary) {
        int rows = empDao.updateEmployeeSalaryById(id, salary);
        if (rows > 0)
            return true;
        return false;
    }

}
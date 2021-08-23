package com.ganesh.model.persistence;


import com.ganesh.bean.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {

    @Transactional
    @Modifying
    @Query("Update Employee set empSalary=:sal where empId=:eid")
    int updateEmployeeSalaryById(@Param("eid") int id, @Param("sal") int salary);
}
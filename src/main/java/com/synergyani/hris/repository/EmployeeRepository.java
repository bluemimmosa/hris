/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.synergyani.hris.repository;

import com.synergyani.hris.entity.employee.Employee;
import com.synergyani.hris.entity.employee.Teams;
import java.util.Set;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Dell
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    public Employee findByName(String name);
    public Set<Teams> findAllTeamsByEmpId(long empId);
}

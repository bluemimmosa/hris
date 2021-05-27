/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.synergyani.hris.controller;

import com.synergyani.hris.entity.employee.Address;
import com.synergyani.hris.entity.employee.Employee;
import com.synergyani.hris.entity.employee.OfficeDetails;
import com.synergyani.hris.service.EmployeeService;
import java.sql.Date;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Dell
 */
@Controller
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    
    @GetMapping("/employee/listall")
    public String listAll(Model model){
        model.addAttribute("message", " ");
        model.addAttribute("empList", employeeService.findAll());
        return "allemployee";
    }
    
    @GetMapping("/employee/newemployee")
    public String showCreateNewAccountForm(Model model){
        model.addAttribute("newEmployee", new Employee());
        return "createNewAccountForm";
    }
    
    @PostMapping("/employee/newEmployeeProcess")
    public String processNewAccount(@ModelAttribute ("newEmployee") Employee emp, Model model){
        
        if(employeeService.addEmployee(emp) == null)
            model.addAttribute("message", "Cannot Create New Employee ! ");
        else{
            model.addAttribute("message", "New Employee Creation successful!!");
            model.addAttribute("empList", employeeService.findAll());
        }
        return "allemployee";
    }
}

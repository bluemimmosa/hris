/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.synergyani.hris.entity.employee;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author Dell
 */
@Entity
public class Teams {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int tid;
    String teamName;
    
    @ManyToMany(mappedBy="empteams")
    Set<Employee> empteams;
    public Teams() {
    }

    public Teams(int tid, String teamName, Set<Employee> empteams) {
        this.tid = tid;
        this.teamName = teamName;
        this.empteams = empteams;
    }

    public Set<Employee> getEmpteams() {
        return empteams;
    }

    public void setEmpteams(Set<Employee> empteams) {
        this.empteams = empteams;
    }
    
    
    
    public Teams(int tid, String teamName) {
        this.tid = tid;
        this.teamName = teamName;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
    
    
    
}

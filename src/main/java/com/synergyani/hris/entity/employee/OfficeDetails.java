/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.synergyani.hris.entity.employee;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Dell
 */
@Entity
public class OfficeDetails implements Serializable{
    @Id
    long oid;
    String officeName;
    String level;
    String position;
    String department;
    String branch;
    Date joinDate;
    Date permaDate;

    public OfficeDetails() {
    }

    public OfficeDetails(long oid, String officeName, String level, String position, String department, String branch, Date joinDate, Date permaDate) {
        this.oid = oid;
        this.officeName = officeName;
        this.level = level;
        this.position = position;
        this.department = department;
        this.branch = branch;
        this.joinDate = joinDate;
        this.permaDate = permaDate;
    }

    public long getOid() {
        return oid;
    }

    public void setOid(long oid) {
        this.oid = oid;
    }

    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public Date getPermaDate() {
        return permaDate;
    }

    public void setPermaDate(Date permaDate) {
        this.permaDate = permaDate;
    }
    
    
    
    
}

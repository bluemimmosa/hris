/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.synergyani.hris.entity.employee;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Dell
 */
@Entity
//@Embeddable
public class FamilyDetail {
    @Id
    int fid;
    String fathersName;
    String mothersName;
    String grandFathersName;
    String Spouse;

    public FamilyDetail() {
    }

    public FamilyDetail(int fid, String fathersName, String mothersName, String grandFathersName, String Spouse) {
        this.fid = fid;
        this.fathersName = fathersName;
        this.mothersName = mothersName;
        this.grandFathersName = grandFathersName;
        this.Spouse = Spouse;
    }

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public String getMothersName() {
        return mothersName;
    }

    public void setMothersName(String mothersName) {
        this.mothersName = mothersName;
    }

    public String getGrandFathersName() {
        return grandFathersName;
    }

    public void setGrandFathersName(String grandFathersName) {
        this.grandFathersName = grandFathersName;
    }

    public String getSpouse() {
        return Spouse;
    }

    public void setSpouse(String Spouse) {
        this.Spouse = Spouse;
    }
    
    
    
}

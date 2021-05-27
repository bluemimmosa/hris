/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.synergyani.hris.entity.employee;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Dell
 */
@Entity
@Table(name="address")
public class Address implements Serializable{
    @Id
    @Column(name="aid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long aid;
    String state;
    String district;
    String municipality;
    int wardNo;
    String tole;
    
    @Column(nullable = true)
    int houseNo;

    public Address() {
    }

    public Address(long aid, String state, String district, String municiplaity, int wardNo, String tole, int houseNo) {
        this.aid = aid;
        this.state = state;
        this.district = district;
        this.municipality = municiplaity;
        this.wardNo = wardNo;
        this.tole = tole;
        this.houseNo = houseNo;
    }

    public Address(String state, String district, String municipality, int wardNo, String tole, int houseNo) {
        this.state = state;
        this.district = district;
        this.municipality = municipality;
        this.wardNo = wardNo;
        this.tole = tole;
        this.houseNo = houseNo;
    }
    

    public long getAid() {
        return aid;
    }

    public void setAid(long aid) {
        this.aid = aid;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getMuniciplaity() {
        return municipality;
    }

    public void setMuniciplaity(String municiplaity) {
        this.municipality = municiplaity;
    }

    public int getWardNo() {
        return wardNo;
    }

    public void setWardNo(int wardNo) {
        this.wardNo = wardNo;
    }

    public String getTole() {
        return tole;
    }

    public void setTole(String tole) {
        this.tole = tole;
    }

    public int getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    @Override
    public String toString() {
        return state+" State, "+district+" District, "+municipality+" - "+wardNo+", "+tole;
    }
    
    
    
    
}

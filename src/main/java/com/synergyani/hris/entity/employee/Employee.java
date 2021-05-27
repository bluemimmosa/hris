/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.synergyani.hris.entity.employee;

import com.synergyani.hris.entity.Role;
import com.synergyani.hris.entity.User;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Dell
 */
@Entity
@Table(name="employee")
public class Employee implements Serializable{
    @Id
    long empId;
    String name;
    Date dob;
    char gender;
    String maritial;
    String nationality;
    String photoFile;
    
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
            @JoinTable(
                    name = "empuser",
                    joinColumns = @JoinColumn(name = "empid"),
                    inverseJoinColumns = @JoinColumn(name = "user_id")
                )
    User user;
    
    
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(
            name = "tempaddress",
            joinColumns = @JoinColumn(name = "empid"),
            inverseJoinColumns = @JoinColumn(name = "aid")
            )
    Address tempAddress;
    
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(
            name = "permaaddress",
            joinColumns = @JoinColumn(name = "empid"),
            inverseJoinColumns = @JoinColumn(name = "aid")
            )
    Address permaAddress;
    
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
            @JoinTable(
                    name = "od",
                    joinColumns = @JoinColumn(name = "empid"),
                    inverseJoinColumns = @JoinColumn(name = "opiid")
                )
    OfficeDetails od;
    
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
            @JoinTable(
                    name = "empteams",
                    joinColumns = @JoinColumn(name="empid"),
                    inverseJoinColumns = @JoinColumn(name = "tid")
                )
    Set<Teams> empteams;
    
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
            @JoinTable(
                    name="emprole",
                    joinColumns = @JoinColumn(name="empid"),
                    inverseJoinColumns = @JoinColumn(name="role_id")
                )
    List<Role> emprole;
    
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
            @JoinTable(
                    name = "famdetails",
                    joinColumns = @JoinColumn(name="empid"),
                    inverseJoinColumns = @JoinColumn(name="fid")
                )
    FamilyDetail famdetails;
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
            @JoinTable(
                    name="contactdetails",
                    joinColumns = @JoinColumn(name="empid"),
                    inverseJoinColumns = @JoinColumn(name="cid")
                )
    List<Contact> contactdetails;
    
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
            @JoinTable(
                    name = "healthdetails",
                    joinColumns = @JoinColumn(name="empid"),
                    inverseJoinColumns = @JoinColumn(name="hid")
                )
    Health healthdetails;
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
            @JoinTable(
                    name="idDocs",
                    joinColumns = @JoinColumn(name="empid"),
                    inverseJoinColumns = @JoinColumn(name="iid")
                )
    List<IdentityDocuments> idDocs;
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
            @JoinTable(
                    name="educationdetails",
                    joinColumns = @JoinColumn(name="empid"),
                    inverseJoinColumns = @JoinColumn(name="eduid")
                )
    List<Education> educationdetails;

    public Employee() {
    }

    public Employee(long empId, String name, Date dob, char gender, String maritial, String nationality, String photoFile, User user, Address tempAddress, Address permaAddress, OfficeDetails od, Set<Teams> empteams, List<Role> emprole, FamilyDetail famdetails, List<Contact> contactdetails, Health healthdetails, List<IdentityDocuments> idDocs, List<Education> educationdetails) {
        this.empId = empId;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.maritial = maritial;
        this.nationality = nationality;
        this.photoFile = photoFile;
        this.user = user;
        this.tempAddress = tempAddress;
        this.permaAddress = permaAddress;
        this.od = od;
        this.empteams = empteams;
        this.emprole = emprole;
        this.famdetails = famdetails;
        this.contactdetails = contactdetails;
        this.healthdetails = healthdetails;
        this.idDocs = idDocs;
        this.educationdetails = educationdetails;
    }

    

    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getMaritial() {
        return maritial;
    }

    public void setMaritial(String maritial) {
        this.maritial = maritial;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getPhotoFile() {
        return photoFile;
    }

    public void setPhotoFile(String photoFile) {
        this.photoFile = photoFile;
    }

    public Address getTempAddress() {
        return tempAddress;
    }

    public void setTempAddress(Address tempAddress) {
        this.tempAddress = tempAddress;
    }

    public Address getPermaAddress() {
        return permaAddress;
    }

    public void setPermaAddress(Address permaAddress) {
        this.permaAddress = permaAddress;
    }

    public OfficeDetails getOd() {
        return od;
    }

    public void setOd(OfficeDetails od) {
        this.od = od;
    }

    public Set<Teams> getEmpteams() {
        return empteams;
    }

    public void setEmpteams(Set<Teams> empteams) {
        this.empteams = empteams;
    }

    public List<Role> getEmprole() {
        return emprole;
    }

    public void setEmprole(List<Role> emprole) {
        this.emprole = emprole;
    }

    public FamilyDetail getFamdetails() {
        return famdetails;
    }

    public void setFamdetails(FamilyDetail famdetails) {
        this.famdetails = famdetails;
    }

    public List<Contact> getContactdetails() {
        return contactdetails;
    }

    public void setContactdetails(List<Contact> contactdetails) {
        this.contactdetails = contactdetails;
    }

    public Health getHealthdetails() {
        return healthdetails;
    }

    public void setHealthdetails(Health healthdetails) {
        this.healthdetails = healthdetails;
    }

    public List<IdentityDocuments> getIdDocs() {
        return idDocs;
    }

    public void setIdDocs(List<IdentityDocuments> idDocs) {
        this.idDocs = idDocs;
    }

    public List<Education> getEducationdetails() {
        return educationdetails;
    }

    public void setEducationdetails(List<Education> educationdetails) {
        this.educationdetails = educationdetails;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.synergyani.hris.entity.employee;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Dell
 */
@Entity
public class Education {
    @Id
    long eduid;
    String title;
    String level;
    String institution;
    String docfile;

    public Education() {
    }

    public Education(long eduid, String title, String level, String institution, String docfile) {
        this.eduid = eduid;
        this.title = title;
        this.level = level;
        this.institution = institution;
        this.docfile = docfile;
    }

    public long getEduid() {
        return eduid;
    }

    public void setEduid(long eduid) {
        this.eduid = eduid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getDocfile() {
        return docfile;
    }

    public void setDocfile(String docfile) {
        this.docfile = docfile;
    }
    
    
}

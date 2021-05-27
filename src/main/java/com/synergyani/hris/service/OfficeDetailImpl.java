/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.synergyani.hris.service;

import com.synergyani.hris.entity.employee.OfficeDetails;
import com.synergyani.hris.repository.OfficeDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Dell
 */
@Service
public class OfficeDetailImpl implements OfficeDetail{
    @Autowired
    OfficeDetailsRepository odr;
    
    @Override
    public OfficeDetails findOfficeDetails(long empID) {
        return odr.findById(empID).get();
    }
    
}

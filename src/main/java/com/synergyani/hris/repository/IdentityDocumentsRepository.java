/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.synergyani.hris.repository;

import com.synergyani.hris.entity.employee.IdentityDocuments;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Dell
 */
public interface IdentityDocumentsRepository extends JpaRepository<IdentityDocuments, Long>{
    
}

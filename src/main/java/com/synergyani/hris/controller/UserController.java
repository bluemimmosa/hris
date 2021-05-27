/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.synergyani.hris.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Dell
 */
@Controller
public class UserController {
    
    @GetMapping("/")
    public String serveLoginPage(Model model){
        model.addAttribute("message", "Hello, Welcome to HRIS.");
        return "index";
    }
}

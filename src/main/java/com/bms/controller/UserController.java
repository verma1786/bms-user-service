package com.bms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.GET;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/getUser")
    public String getUser(){
        return "Vinay !!!";
    }
}

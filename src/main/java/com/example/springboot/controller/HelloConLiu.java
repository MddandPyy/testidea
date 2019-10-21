package com.example.springboot.controller;

import io.ebean.EbeanServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@Controller
public class HelloConLiu {

    @ResponseBody
    @RequestMapping("/helloliu")
    public String helloliu(){
        return "liu,hello springboot3";
    }

}

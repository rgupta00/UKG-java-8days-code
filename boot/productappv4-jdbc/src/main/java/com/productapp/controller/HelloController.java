package com.productapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //Pathvaraible and requrestParam
    @GetMapping(path = "hello/{name}/{city}")
    public String hello(@PathVariable(name = "name") String uname,@PathVariable(name = "city") String ucity){
        return "your name is "+ uname+" "+ ucity;
    }
    //requrestParam
    @GetMapping(path = "hello2")
    public String hello2(@RequestParam(name = "name") String uname, @RequestParam(name = "city") String ucity){
        return "your name is Requestparam ex: "+ uname+" "+ ucity;
    }
}

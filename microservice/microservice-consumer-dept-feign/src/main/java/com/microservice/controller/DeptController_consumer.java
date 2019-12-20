package com.microservice.controller;

import com.microservice.bean.Dept;
import com.microservice.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("consumer")
public class DeptController_consumer {
    @Autowired
    private DeptClientService service;

    @RequestMapping(value = "/dept/add")
    public boolean add( Dept dept){
        //三个参数：url,requestMap ResponseBean.class
        return  service.addDept(dept);
    }
    @RequestMapping("dept/get/{id}")
    public Dept findById(@PathVariable("id") Long id){
        //三个参数：url,requestMap ResponseBean.class
        return service.findDeptById(id);
    }
    @RequestMapping("dept/list")
    public List findAll(){
        //三个参数：url,requestMap ResponseBean.class
        return  service.findAll();
    }
}
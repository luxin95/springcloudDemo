package com.microservice.controller;

import com.microservice.bean.Dept;
import com.microservice.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



/**
 * @author luxin
 * @create 2019-12-12 14:36
 */
@RestController
@RequestMapping("dept")
public class DeptController {
    @Autowired
    private DeptService deptService;


    //根据id查询
    @GetMapping("get/{id}")
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public Dept findDeptById(@PathVariable("id") Long id) {
        Dept dept = deptService.findDeptById(id);
        if (null==dept){
            throw new RuntimeException("该ID"+id+"没有对应的信息");
        }
        return dept;

    }
    public Dept processHystrix_Get(@PathVariable("id") Long id) {
        return new Dept().setDeptno(id).setDname("该ID：" + id + "没有没有对应的信息,null--@HystrixCommand").setDb_source("no this database in MySQL");
    }
}

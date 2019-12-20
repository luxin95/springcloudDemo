package com.microservice.controller;

import com.microservice.bean.Dept;
import com.microservice.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author luxin
 * @create 2019-12-12 14:36
 */
@RestController
@RequestMapping("dept")
public class DeptController {
    @Autowired
    private DeptService deptService;
    @Autowired
    private DiscoveryClient client;

//    增加dept
    @PostMapping("add")
    public boolean addDept(@RequestBody Dept dept){
        return deptService.addDept(dept);
    }
//根据id查询
    @GetMapping("get/{id}")
    public Dept findDeptById(@PathVariable("id") Long id){
        return deptService.findDeptById(id);
    }
// 查询所有
    @GetMapping("list")
    public List<Dept> findAll(){
        return deptService.findAll();
    }

//    @Autowired
//    private DiscoveryClient client;
    @RequestMapping("dept/discovery")
    public Object Discovery(){

        List<String> list=client.getServices();
        System.out.println("---->******"+list);
        List<ServiceInstance> srvList=client.getInstances("MICROSERVICE-DEPT");
        for (ServiceInstance serviceInstance : srvList) {
            System.out.println(serviceInstance.getServiceId() + "\t" +serviceInstance.getHost()+ "\t" +serviceInstance.getPort()+ "\t" +serviceInstance.getUri());
        }
        return this.client;

    }

}

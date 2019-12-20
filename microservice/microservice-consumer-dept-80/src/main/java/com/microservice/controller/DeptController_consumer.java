package com.microservice.controller;

import com.microservice.bean.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import java.util.List;

/**
 * @author luxin
 * @create 2019-12-12 15:41
 */
@RestController
@RequestMapping("consumer")
public class DeptController_consumer {

    private static final String REST_URL_PREFIX="http://MICROSERVICE-DEPT";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("dept/add")
    public boolean addDept(Dept dept){
        return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add",dept,Boolean.class);
    }

    @RequestMapping("dept/find/{id}")
    public Dept findDeptById(@PathVariable("id")Long id){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+id,Dept.class);
    }

    @RequestMapping("dept/list")
    public List<Dept> addDept(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list",List.class);
    }

    @RequestMapping("dept/discovery")
    public Object discovery(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/dept/discovery",Object.class);
    }
}

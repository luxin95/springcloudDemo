package com.microservice.service;

import com.microservice.bean.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author luxin
 * @create 2019-12-16 16:17
 */
//@FeignClient(value = "MICROSERVICE-DEPT")
@FeignClient(value ="MICROSERVICE-DEPT",fallbackFactory=DeptClientServiceFallbackFactory.class)
@RequestMapping("dept")
public interface DeptClientService {

    @PostMapping("add")
    public boolean addDept(Dept dept);

    @GetMapping("get/{id}")
    public Dept findDeptById(@PathVariable("id") Long id);

    @GetMapping("list")
    public List<Dept> findAll();

}

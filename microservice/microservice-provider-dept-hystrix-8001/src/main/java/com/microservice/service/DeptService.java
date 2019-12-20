package com.microservice.service;

import com.microservice.bean.Dept;

import java.util.List;

/**
 * @author luxin
 * @create 2019-12-12 14:31
 */
public interface DeptService {

    public boolean addDept(Dept dept);

    public Dept findDeptById(Long id);

    public List<Dept> findAll();
}

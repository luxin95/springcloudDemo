package com.microservice.service.impl;

import com.microservice.bean.Dept;
import com.microservice.dao.DeptDao;
import com.microservice.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author luxin
 * @create 2019-12-12 14:32
 */

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao dao;
    @Override
    public boolean addDept(Dept dept) {
        return dao.addDept(dept);
    }

    @Override
    public Dept findDeptById(Long id) {
        return dao.findDeptById(id);
    }

    @Override
    public List<Dept> findAll() {
        return dao.findAll();
    }
}

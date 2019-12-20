package com.microservice.dao;

import com.microservice.bean.Dept;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

/**
 * @author luxin
 * @create 2019-12-12 14:01
 */
@Mapper
public interface DeptDao {

    public boolean addDept(Dept dept);

    public Dept findDeptById(Long id);

    public List<Dept> findAll();

}

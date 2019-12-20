package com.microservice.service;

import com.microservice.bean.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author luxin
 * @create 2019-12-17 15:38
 */

@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {


    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public boolean addDept(Dept dept) {
                return false;
            }

            @Override
            public Dept findDeptById(Long id) {
                return new Dept().setDeptno(id).setDname("该ID："+id+"没有没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭").setDb_source("no this database in MySQL");
            }

            @Override
            public List<Dept> findAll() {
                return null;
            }
        };
    }
}

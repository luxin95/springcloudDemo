package com.microservice.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author luxin
 * @create 2019-12-11 16:57
 */
@SuppressWarnings("serial")
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@Data
public class Dept implements Serializable {
    private Long deptno;
    private String dname;
    private String db_source;//代表来自哪个数据库,因为微服务可以一个服务对应一个数据库,同一个信息可以存到不同的库


}

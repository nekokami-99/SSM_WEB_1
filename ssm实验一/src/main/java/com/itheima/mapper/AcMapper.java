package com.itheima.mapper;

import com.itheima.pojo.Ac;

import java.util.List;
import java.util.Map;

public interface AcMapper {

     List<Ac> selectAll1();
     List<Ac> selectAllSid();

    Ac selectById1(int id);

//* 条件查询
// 1.散装参数。如果有多个参数，需要使用@Param(“sql参数占位符名称”)
    //List<Brand> selectByCondition(@Param("status") int status, @Param("companyName") String
    //companyName,@Param("brandName") String brandName);
 //2.对象参数
    //List<Brand> selectByCondition(Brand brand);
 //3.map集合参数
    List<Ac> selectByCondition1(Map map);
    List<Ac> selectByCS1(Map map);
    void add1(Map map);
    int update1(Map map);
    void deleteById1(int id);
    void deleteByIds1(int []ids);
}

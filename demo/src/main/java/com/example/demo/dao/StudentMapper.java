package com.example.demo.dao;

import java.util.List;

import com.example.demo.dao.entity.Student;

/**
 * mybatis 插件生成的mapper接口，对应dao层，不需要有自己的实现类，在启动类中配置了@MapperScan 注解扫描该类所属包，将其加载
 * @author sandy
 *
 */
public interface StudentMapper{
    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
    
    List<Student> selectAll();
}
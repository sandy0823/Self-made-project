package com.example.demo.dao;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dao.entity.Timetable;
/**
 * mybatis 插件生成的mapper接口，对应dao层，不需要有自己的实现类，在启动类中配置了@MapperScan 注解扫描该类所属包，将其加载
 * 
 * 但由于修改了接口名，使其以dao结尾，因此要加上 @Mapper注解，否则 @MapperScan 无法识别；同时该接口对应mapper xml 的 namespace 标签中的值
 * @author sandy
 *
 */
@Mapper
public interface TimetableDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Timetable record);

    int insertSelective(Timetable record);

    Timetable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Timetable record);

    int updateByPrimaryKey(Timetable record);
}
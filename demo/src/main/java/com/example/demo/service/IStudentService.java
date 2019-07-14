package com.example.demo.service;

import java.util.List;

import com.example.demo.dao.entity.Student;

public interface IStudentService {
	/**
	 * 根据主键 id 查询学生信息
	 * @param id
	 * @return
	 */
	Student selectByPrimaryKey(int id);
	
	/**
	 * 
	 * @param name
	 * @param timeable
	 * @return
	 */
	List<Student> insert4ThrowsRunTimeException(String name,int timeable);
	
	List<Student> insert4DatabaseException(String name);
}

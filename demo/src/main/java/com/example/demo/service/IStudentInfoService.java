package com.example.demo.service;

import java.util.List;

import com.example.demo.dao.entity.StudentInfo;

public interface IStudentInfoService {
	/**
	 * 
	 * @param sex
	 * @param age
	 * @param name
	 * @return
	 */
   int insert(int sex,int age,String name);
   
   List<StudentInfo> selectAll();
}

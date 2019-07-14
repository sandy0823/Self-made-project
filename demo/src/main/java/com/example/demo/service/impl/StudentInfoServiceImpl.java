package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentInfoDao;
import com.example.demo.dao.entity.StudentInfo;
import com.example.demo.service.IStudentInfoService;

@Service("studentInfoService")
public class StudentInfoServiceImpl implements IStudentInfoService {
	@Autowired
    private StudentInfoDao studentInfoDao;
	
	@Override
	public int insert(int sex, int age, String name) {
		StudentInfo record = new StudentInfo();
		record.setAge(Long.valueOf(String.valueOf(age)));
		record.setName(name);
		record.setSex(Long.valueOf(String.valueOf(sex)));
		record.setSudentId(1L);
		return studentInfoDao.insertSelective(record);
	}

	@Override
	public List<StudentInfo> selectAll() {
		// TODO Auto-generated method stub
		return studentInfoDao.selectAll();
	}
   
}

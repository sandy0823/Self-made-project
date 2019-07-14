package com.example.demo.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.example.demo.dao.StudentMapper;
import com.example.demo.dao.entity.Student;
import com.example.demo.service.IStudentInfoService;
import com.example.demo.service.IStudentService;

@Service("studentService")
public class StudentServiceImpl implements IStudentService {
	private static final Logger log = LoggerFactory.getLogger(StudentServiceImpl.class);
	@Autowired
    private StudentMapper studentDao;
	@Autowired
	private IStudentInfoService studentInfoService;
	
	@Override
	public Student selectByPrimaryKey(int id) {
		return studentDao.selectByPrimaryKey(id);
	}
    
	@Transactional
	public List<Student> insert4ThrowsRunTimeException(String name,int timeable){
		Student student = new Student();
		student.setName(name);
		student.setTimaeable(1);
		studentDao.insertSelective(student);
		System.out.println("all student:"+JSON.toJSONString(studentDao.selectAll()));
		throw new RuntimeException();
	}

	@Transactional
	@Override
	public List<Student> insert4DatabaseException(String name) {
		System.out.println("insert student info result:"+studentInfoService.insert(0, 19, name));
		Student student = new Student();
		student.setName(name);
		student.setTimaeable(100);
		studentDao.insertSelective(student);
		return studentDao.selectAll();
	}
}

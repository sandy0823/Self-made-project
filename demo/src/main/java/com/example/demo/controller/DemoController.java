package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.example.demo.dao.entity.Student;
import com.example.demo.service.IStudentInfoService;
import com.example.demo.service.IStudentService;

@RestController
public class DemoController {
	@Autowired
    private IStudentService  studentService;
	@Autowired
	private IStudentInfoService studentInfoService;
	
	/**
	 * demo测试
	 * @return
	 */
	@RequestMapping("/hello")
	public Student demo(){
		return studentService.selectByPrimaryKey(1);
	}
	
	/**
	 *  test transaction,throw runtimeExcetion
	 * @param name
	 * @param timeable
	 * @return
	 */
	@RequestMapping(value="/insertStudent",method=RequestMethod.POST)
	public Response<Student> insertStudent(@RequestParam(name="name",required=true) String name,
			@RequestParam(name="timeable",required=true) int timeable){
		
		Response<Student> response = new Response<Student>();
		try{
			List<Student> all = studentService.insert4ThrowsRunTimeException(name, timeable); 
			response.setDataList(all);
		}catch(Throwable e){
			response.setCode("-1");
		}
		return response;
	}
	
	/**
	 * test transaction, throw exception for database
	 * @param name
	 * @param timeable
	 * @return
	 */
	@RequestMapping(value="/insertStudent2",method=RequestMethod.POST)
	public Response<Student> insertStudent2(@RequestParam(name="name",required=true) String name){
		
		Response<Student> response = new Response<Student>();
		try{
			List<Student> all = studentService.insert4DatabaseException(name); 
			response.setDataList(all);
		}catch(Throwable e){
			e.printStackTrace();
			response.setCode("-1");
		}
		System.out.println("all studentInfo List:"+JSON.toJSONString(studentInfoService.selectAll()));
		return response;
	}
}

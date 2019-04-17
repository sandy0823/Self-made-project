package com.wf.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 该controller仅负责页面的跳转，数据的组装由rest api 接口提供，前端使用ajax 向后端发送rest请求，接收数据
 * @author sandy
 *
 */
@Controller
@RequestMapping
public class PageSkipping {

	@GetMapping("/")
	 public String index(){
		 return "categoryMain";
	 }
}

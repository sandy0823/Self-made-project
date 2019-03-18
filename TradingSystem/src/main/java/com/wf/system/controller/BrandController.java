package com.wf.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wf.system.brand.service.IBrandService;
import com.wf.system.model.entity.Brand;

@RestController
@RequestMapping("/brand")
public class BrandController {
	@Autowired
    private IBrandService brandServiceImpl;
	
	
	@GetMapping("/list")
	public List<Brand> findAllBrand(){
		return brandServiceImpl.findList();
	}
}

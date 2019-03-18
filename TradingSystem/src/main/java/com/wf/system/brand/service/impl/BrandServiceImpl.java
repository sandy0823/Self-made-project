package com.wf.system.brand.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wf.system.brand.service.IBrandService;
import com.wf.system.mapper.BrandMapper;
import com.wf.system.model.entity.Brand;

@Service
public class BrandServiceImpl implements IBrandService {
	
	@Autowired
    private BrandMapper brandMapper;
	
	
	@Override
	public List<Brand> findList() {
		return brandMapper.listAll();
	}

}

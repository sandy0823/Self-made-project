package com.wf.system;

import java.io.File;
import java.io.FileNotFoundException;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.ResourceUtils;

@SpringBootApplication
@MapperScan({"com.wf.system.brand.dao","com.wf.system.category.dao",
	"com.wf.system.category.product.dao","com.wf.system.mapper"})
public class TradingSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(TradingSystemApplication.class, args);
		
		File path;
		try {
			path = new File(ResourceUtils.getURL("classpath:").getPath());
			if(!path.exists()) path = new File(""); 
			System.out.println("path:"+path.getAbsolutePath()); 
			//如果上传目录为/static/images/upload/，则可以如下获取： 
			File upload = new File(path.getAbsolutePath(),"static/images/upload/"); 
			if(!upload.exists()) upload.mkdirs(); 
			System.out.println("upload url:"+upload.getAbsolutePath()); 
			//在开发测试模式时，得到的地址为：{项目跟目录}/static/images/upload/ 
			//在打包成jar正式发布时，得到的地址为：{发布jar包目录}/static/images/upload/  和jar包同路徑
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
	}

}

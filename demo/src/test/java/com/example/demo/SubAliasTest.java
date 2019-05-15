package com.example.demo;

import org.junit.Test;
import org.springframework.core.annotation.AnnotationUtils;

import com.example.demo.alias.SubMyAnnotation;

@SubMyAnnotation(subLocation = "location", value = "dd")
public class SubAliasTest extends BaseTest {
	
	@Test
	public void test() {
		SubMyAnnotation myAnnotation = AnnotationUtils.getAnnotation(this.getClass(), SubMyAnnotation.class);
		System.out.println("value:" + myAnnotation.value() + ";loation:" + myAnnotation.subLocation());
	}
}

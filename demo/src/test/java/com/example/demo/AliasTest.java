package com.example.demo;


import org.junit.Test;
import org.springframework.core.annotation.AnnotationUtils;

import com.example.demo.alias.MyAnnotation;

@MyAnnotation("location")
public class AliasTest extends BaseTest {
	@Test
	public void test() {
		MyAnnotation myAnnotation = AnnotationUtils.getAnnotation(this.getClass(), MyAnnotation.class);
		System.out.println("value:" + myAnnotation.value() + ";loation:" + myAnnotation.location());
	}
}


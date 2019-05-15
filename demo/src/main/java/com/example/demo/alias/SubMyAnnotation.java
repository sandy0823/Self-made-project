package com.example.demo.alias;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.core.annotation.AliasFor;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Inherited
@MyAnnotation
public @interface SubMyAnnotation {
	
	@AliasFor(value="location",annotation=MyAnnotation.class)
    String subLocation() default "";
	@AliasFor(annotation=MyAnnotation.class)
	String value() default "";
}

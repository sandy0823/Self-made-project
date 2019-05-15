package com.example.demo.alias;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.core.annotation.AliasFor;

/**
 * @AliasFor 用法：<br>
 * <li>用到注解 属性上，表示两个属性互相为别名，互相为别名的属性值必须相同，若设置成不同，则会报错</li>
 * <li>注解是可以继承的，但是注解是不能继承父注解的属性的,也就是说,我在类扫描的时候,拿到的注解的属性值,依然是父注解的属性值,而不是你定义的注解的属性值<br>
 * 所以此时可以在子注解对应的属性上加上@AliasFor<br>
 * <pre><code>
 *  
 * </code></pre>
 * </li>
 * @author sandy
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Inherited
public @interface MyAnnotation {
	@AliasFor(attribute = "location")
    String value() default "";
	
	@AliasFor(attribute = "value")
	String location() default "";
}

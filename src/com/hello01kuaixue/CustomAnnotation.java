package com.hello01kuaixue;

import java.lang.annotation.*;

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented

public @interface CustomAnnotation {
	int num() default 10;
	String name() default "Jack";
	String desc() default "My name is Jack";
}

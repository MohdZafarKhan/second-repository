package com.dependency.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Main {

	public static void main(String []args) {
	
		
		ApplicationContext ac=new AnnotationConfigApplicationContext(Config.class);
		Student s=ac.getBean(Student.class);
		System.out.println(s);
	}
}
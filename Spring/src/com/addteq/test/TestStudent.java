package com.addteq.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.addteq.bean.Student;

public class TestStudent {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		Student student = (Student) context.getBean("anotherStudent");

		System.out.println(student);
		
		
		
		((ClassPathXmlApplicationContext)context).close();
	}
}

package com.addteq.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.addteq.bean.Person;

public class TestPerson {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		Person person = (Person) context.getBean("person");

		System.out.println(person);
		
	//	((ClassPathXmlApplicationContext)context).close();
		
		((AbstractApplicationContext) context).close();
	}

}

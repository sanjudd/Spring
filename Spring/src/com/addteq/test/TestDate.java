package com.addteq.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.addteq.bean.Date;

public class TestDate {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		Date date = (Date) context.getBean("date");

		System.out.println(date);
		
		((ClassPathXmlApplicationContext)context).close();
	}

}

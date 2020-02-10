package com.addteq.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.addteq.bean.Employee;

public class TestEmployee {
	
	public static void main(String[] args) {
		
	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

	Employee employee = (Employee) context.getBean("employee");
	
	System.out.println(employee);
	
	((ClassPathXmlApplicationContext)context).close();
	
	}
	
}

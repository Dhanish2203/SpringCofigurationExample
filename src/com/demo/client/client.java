package com.demo.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.bean.Appconfig;
import com.demo.bean.Employee;

public class client {
public static void main (String args[]) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(Appconfig.class);
		Employee service=(Employee)context.getBean("employee");
		System.out.println("EMP id:"+service.getEmpid());
		service.getMessage().sendMessage();

		
	}

}

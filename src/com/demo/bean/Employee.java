package com.demo.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.demo.service.MessageService;
@Component
public class Employee {
	@Value("100")
	private int empid;
	@Autowired
	@Qualifier("mailservice")
	private MessageService message;
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public MessageService getMessage() {
		return message;
	}
	public void setMessage(MessageService message) {
		this.message = message;
	}
	 
	

}

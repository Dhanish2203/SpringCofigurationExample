package com.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component; 

@Component
public class Mailservice implements MessageService {
	@Value("dhanish")
	private String empName;
	@Value("dhanish123@gamil.com")
	private String mail;
	
	
	
	
	public String getEmpName() {
		return empName;
	}




	public void setEmpName(String empName) {
		this.empName = empName;
	}




	public String getMail() {
		return mail;
	}




	public void setMail(String mail) {
		this.mail = mail;
	}




	@Override
	public void sendMessage() {
		System.out.println("Name is:"+empName+" has been send to"+mail);
		
	}
	

}

package com.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class SmsService implements MessageService{
	@Value("Hai")
	private String Message;
	@Value("8300404326")
	private long mobile;
	
	
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	@Override
	public void sendMessage() {
		System.out.println("Message is:"+Message+" has been send to"+mobile);
		
	}
	
	
	
	

}

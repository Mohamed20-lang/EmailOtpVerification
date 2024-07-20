package com.otpemail.SpringEmailDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SpringEmailDemoApplication {

	@Autowired
	private EmailSenderService senderService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringEmailDemoApplication.class, args);
		}
	
	@EventListener(ApplicationReadyEvent.class)
	public void SendMail() {
		senderService.sendEmail("kanthimathi121@gmail.com","Flipkart","Your OTP "
				+ "Hey mathi,"
				+ "thank you for choosing for our company.use the following otp to complete the producere to change your email address.OTP valid for 5 minutes"
				+ "OTP- 6 2 7 8 1 1" );
		
	}

}

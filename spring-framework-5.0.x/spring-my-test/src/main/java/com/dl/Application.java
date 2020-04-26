package com.dl;

import com.dl.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.dl")
public class Application {
	public static void main(String[] args) {
		ApplicationContext act = new AnnotationConfigApplicationContext(Application.class);
		UserController uc =(UserController)act.getBean("userController");
		uc.print();
	}
}

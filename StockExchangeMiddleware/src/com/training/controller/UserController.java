package com.training.controller;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.training.model.AddressEntity;
import com.training.model.UserEntity;

public class UserController {

	public static void main(String[] args) {
//		BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("beans.xml"));
		
		ApplicationContext context = new ClassPathXmlApplicationContext("namespace.xml");
		
		UserEntity entity = (UserEntity)context.getBean("user");
		System.out.println("Email : "+entity.getEmail());
		AddressEntity address = entity.getAddress();
		System.out.println(entity.toString());
		System.out.println(address.toString());

	}

}

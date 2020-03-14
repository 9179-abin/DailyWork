package com.spring.controller;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.training.model.UserEntity;

public class UserController {

	public static void main(String[] args) {

		BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("beans.xml"));
		
		UserEntity entity = (UserEntity) beanFactory.getBean("user");
		System.out.println(entity);

	}

}

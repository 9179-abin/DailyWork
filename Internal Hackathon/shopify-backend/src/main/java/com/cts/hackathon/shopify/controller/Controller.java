package com.cts.hackathon.shopify.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.hackathon.shopify.dao.UserDAO;
import com.cts.hackathon.shopify.model.UserEntity;

public class Controller {
	
	@Autowired
	private static UserDAO userDAO;

	public static void main(String[] args) {
		userDAO.saveUser(new UserEntity(9, "ABdus", "Saboor", "abdussaboor", "gaffariu98@gmail.com", 98288282L, "saboor", "street", false));
	}
}

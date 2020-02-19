package com.cts.hackathon.shopify.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cts.hackathon.shopify.dao.UserDAO;
import com.cts.hackathon.shopify.model.UserEntity;




@Controller
public class UserController {
	
	@Autowired
	private UserDAO userDAO;

	@RequestMapping("userhome")
	public String userPage(Model model) {
		
		List<UserEntity> users = userDAO.getAllUsers();
		
		model.addAttribute("user", new UserEntity());
		
		model.addAttribute("list", users);
		
		return "user";
	}
	
	@RequestMapping(path="/user/saveuser", method = RequestMethod.POST)
	public String addUser(@ModelAttribute("user") UserEntity user) {
		user.setEnabled(true);
		userDAO.saveOrUpdateUser(user);
		return "redirect:/user-home";
	}
	
	@RequestMapping("/removeuser/{id}")
	public String deleteUser(@PathVariable("id") int id) {
		
		UserEntity user = userDAO.getUserById(id);
		userDAO.deleteUser(user);
		return "redirect:/userhome";
	}
	
	@RequestMapping("/updateuser/{id}")
	public String updateUser(@PathVariable("id") int id,Model model) {
		
		List<UserEntity> users = userDAO.getAllUsers();
		model.addAttribute("list", users);
		UserEntity user = userDAO.getUserById(id);
		model.addAttribute("user", user);
		return "user";			
	}
	
}

package com.cts.training.middle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.stocks.dao.UserDao;
import com.stocks.datamodel.User;



@Controller
public class UserController {
	
	@Autowired
	UserDao userDAO;

	@GetMapping("/user-home")
	public String userPage(Model model) {
		
		List<User> users = userDAO.getAllUsers();
		
		model.addAttribute("user", new User());//user will work as a model attribute in users.jsp
		
		model.addAttribute("list", users);
		
		return "users";
	}
	
	@PostMapping("/users/save")
	public String addUser(@ModelAttribute("user") User user) {
		userDAO.saveOrUpdate(user);
		return "redirect:/user-home";
	}
	
	@GetMapping("/remove/{id}")
	public String deleteUser(@PathVariable("id") int id) {
		
		User user = userDAO.getUserById(id);
		userDAO.deleteUser(user);
		return "redirect:/user-home";
	}
	
	@GetMapping("/update/{id}")
	public String updateUser(@PathVariable("id") int id,Model model) {
		
		List<User> users = userDAO.getAllUsers();
		model.addAttribute("list", users);
		User user = userDAO.getUserById(id);
		model.addAttribute("user", user);
		return "users";	
		
	}
}

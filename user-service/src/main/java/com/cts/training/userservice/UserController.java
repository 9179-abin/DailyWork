package com.cts.training.userservice;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


//import com.cts.training.userservice.feign.UserServiceProxy;


@CrossOrigin(origins = "*")
@RestController
public class UserController {
	
	@Autowired
	private UserServiceProxy proxy;
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	@Autowired
	UserServices userServices;
	
	@Autowired
	JavaMailSender jms;
	
	@GetMapping("/users")
	public List<Users> findAll() {
		return userServices.getAll();
	}
	
	@GetMapping("/users/{id}")
	public Users findOne(@PathVariable int id) {
		Users u = userServices.getOne(id);
		return u;
	}
	
	@PostMapping("/users")
	public  String save(@RequestBody UserDTO userDTO) {
		String b;
		b=userServices.insert(userDTO);
		return b;
	}
	
	@PutMapping("/activate")
	public String activate(@RequestBody String email) {
		String str=userServices.userActivate(email);
		
			return str;

		}
	
	@GetMapping("/company-by-users")
	public List<Company> findAllCompanyForUsers(){
		logger.info("getAll Company invoked....");
		List<Company> companyDTO = proxy.findAll();
		logger.info("Information --> {}",companyDTO);
		return proxy.findAll();
	}
	
	
	@DeleteMapping("/users/{id}")
	public void delete(@PathVariable int id) {
		userServices.remove(id);
	}
	
	@PutMapping("/users")
	public String update(@RequestBody UserDTO userDTO) {
		String us = userServices.alter(userDTO);
		return us;
	}

}

package com.cts.training.userservice;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	
	@GetMapping(value="/login")
	public ResponseEntity<?> login() {
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	@Autowired
	UserServices userServices;
	
	@Autowired
	JavaMailSender jms;
	
	@GetMapping("/users")
//	public List<Users> findAll() {
	public ResponseEntity<?> findAll(){
		List<Users> list = userServices.getAll();
		if (list.size()>0) {
			return new ResponseEntity<List<Users>>(list, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<String>("Not Found", HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/users/{id}")
//	public Users findOne(@PathVariable int id) {
	public ResponseEntity<?> findOne(@PathVariable int id) {
		Users u = userServices.getOne(id);
		return new ResponseEntity<Users>(u,HttpStatus.OK);
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

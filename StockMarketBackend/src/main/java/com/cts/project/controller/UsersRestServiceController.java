package com.cts.project.controller;

import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.project.dto.UserDTO;
import com.cts.project.models.Users;
//import com.cts.project.repo.UsersRepo;
import com.cts.project.services.UserServices;

@CrossOrigin(origins = "*")
@RestController
public class UsersRestServiceController {
	
//	@Autowired
//	UsersRepo ur;
	
	@Autowired
	UserServices usc;
	
	@Autowired
	JavaMailSender jms;
	
	@GetMapping("/users")
	public List<Users> findAll() {
		return usc.getAll();
	}
	
	@GetMapping("/users/{id}")
	public Users findOne(@PathVariable int id) {
		Users u = usc.getOne(id);
		return u;
	}
	
//	@PostMapping("/users")
//	public  String save(@RequestBody UserDTO usr) {
//		UserDTO us;
//		String b;
//		try {
//			SimpleMailMessage sm = new SimpleMailMessage();
//			sm.setFrom("abinjoshy002@gmail.com");
//			sm.setTo(usr.getEmail());
////			sm.setTo("abinjoshy002@gmail.com");
//			b=usr.getEmail();
//			if(ur.findByEmail(b) != null) {
//				return"{\"res\":\"0\"}";
//			}
//			else {
//				us=usc.insert(usr);
//				sm.setSubject("Testing Mail");
////				sm.setText("This is testing mail");
////				jms.send(sm);
//				sm.setText("Account created click on 'http://localhost:5400/activate?" + us.getEmail()+ "'");
//				jms.send(sm);
//				return "{\"res\":\"1\"}";
//			}
//			
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//			return"{\"res\":\"2\"}";
//		}
//		
//	}
	
	
	@PostMapping("/users")
	public  String save(@RequestBody UserDTO usr) {
		String b;
		b=usc.insert(usr);
		return b;
	}
	
	@PutMapping("/activate")
	public String activate(@RequestBody String email) {
		String str=usc.userActivate(email);
		
			return str;

		}
	
	
//	@PutMapping("/activate")
//	public String activate(@RequestBody String email) {
//		String str=email.substring(email.indexOf(":")+2,email.lastIndexOf("\""));
//		System.out.println("emil ::"+str);
//		Users u =ur.findByEmail(str);
//		System.out.println("uname :"+u.getUsername());
//		if(!u.isEnabled()) {
//			u.setEnabled(true);
//			System.out.println(ur.save(u));
//			return "{\"result\":\"1\"}";
//		}
//		else 
//		{
//			return "{\"result\":\"0\"}";
//		}
////		Users us = ur.save(u);
//		
//		}
	
//	@PostMapping("/users")
//	public void activatemessage(@RequestBody Users usr) {
//		SimpleMailMessage sm = new SimpleMailMessage();
//		sm.setFrom("abinjoshy002@gmail.com");
//		sm.setTo(us.getEmail());
//		sm.setSubject("Activation");
//		sm.setText("Account activated succesfully");
//		jms.send(sm);
//	}
	
	@DeleteMapping("/users/{id}")
	public void delete(@PathVariable int id) {
		usc.remove(id);
	}
	
	@PutMapping("/users")
	public String update(@RequestBody UserDTO usr) {
		String us = usc.alter(usr);
		return us;
	}
}

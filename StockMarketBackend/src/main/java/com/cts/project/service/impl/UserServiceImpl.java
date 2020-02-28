package com.cts.project.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.cts.project.dto.UserDTO;
import com.cts.project.models.Users;
import com.cts.project.repo.UsersRepo;
import com.cts.project.services.UserServices;

@Service
public class UserServiceImpl implements UserServices {
	
	@Autowired
	UsersRepo ur;
	
	@Autowired
	JavaMailSender jms;
	
	@Override
	public String insert(UserDTO usr) {
		Users us = new Users();
		String b;
		try {
			SimpleMailMessage sm = new SimpleMailMessage();
			sm.setFrom("abinjoshy002@gmail.com");
			sm.setTo(usr.getEmail());

			b=usr.getEmail();
			if(ur.findByEmail(b) != null) {
				return"{\"res\":\"0\"}";
			}
			else {
				BeanUtils.copyProperties(usr, us);
				ur.save(us);
				sm.setSubject("Testing Mail");
				sm.setText("Account created click on 'http://localhost:5400/activate?" + us.getEmail()+ "'");
				jms.send(sm);
				return "{\"res\":\"1\"}";
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
			return"{\"res\":\"2\"}";
		}

	}
	
	@Override
	public void remove(int id) {
		ur.deleteById(id);
	}

	@Override
	public List<Users> getAll() {
		return ur.findAll();
	}

	@Override
	public Users getOne(int id) {
		Optional<Users> usr = ur.findById(id);
		Users us = usr.get();
		return us;
	}

	@Override
	public String alter(UserDTO user) {
		Users us = new Users();
		BeanUtils.copyProperties(user, us);
		us=ur.save(us);
		if(us!=null) {
		return "{\"res\":\"1\"}";}
		else {
			return "{\"res\":\"0\"}";
		}
	}

	@Override
	public String userActivate(String email) {
		String str=email.substring(email.indexOf(":")+2,email.lastIndexOf("\""));
		System.out.println("emil ::"+str);
		Users u =ur.findByEmail(str);
		System.out.println("uname :"+u.getUsername());
		if(!u.isEnabled()) {
			u.setEnabled(true);
			System.out.println(ur.save(u));
			return "{\"result\":\"1\"}";
		}
		else 
		{
			return "{\"result\":\"0\"}";
		}
	}
}

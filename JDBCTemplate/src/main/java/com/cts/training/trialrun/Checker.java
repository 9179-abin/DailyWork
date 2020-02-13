package com.cts.training.trialrun;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.training.trialdao.TrialUserDao;
import com.cts.training.trialdao.impl.TrialUserDaoImpl;
import com.cts.training.trialmodels.TrialUser;

public class Checker {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("./beans.xml");
		TrialUserDao trialdao = (TrialUserDao) context.getBean("trialDaoImpl");
		
		//   Add User   ///
//		TrialUser user = new TrialUser(103,"kevin","kevin@gmail.com","kevin6789");
//		//TrialUserDaoImpl tr = new TrialUserDaoImpl();
//		trialdao.saveUser(user);
//		
		//  Delete User  //
		
//		TrialUser user = trialdao.getUserById(103);
//		System.out.println(trialdao.deleteUser(user));
		
		// Get User By Id //
		
//		System.out.println(trialdao.getUserById(102));
		
		// Get All Users //
		
//		System.out.println(trialdao.getAllUsers());
		

		//Update User//
		
		TrialUser user = trialdao.getUserById(102);
		user.setEmail("jj@gmail.com");
		System.out.println(trialdao.updateUser(user));
		
	}

}

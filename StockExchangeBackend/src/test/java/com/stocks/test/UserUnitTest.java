package com.stocks.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.stocks.dao.UserDao;
import com.stocks.datamodel.User;

public class UserUnitTest {
	
	private static AnnotationConfigApplicationContext context;
	private static UserDao userDAO;
	private static User user;
	
	@BeforeClass
	public static void init() {
		
		context = new AnnotationConfigApplicationContext();
		context.scan("com.stocks");
		context.refresh();
		user=(User) context.getBean("user");
		userDAO=(UserDao) context.getBean("userDAO");
		
		}

//	@Test
//	public void testGetAllUsers() {
//		List<User> users = userDAO.getAllUsers();
//		assertEquals(2, users.size());
//	}
//	
//	@Test
//	public void testUpdateUsers() {
//		
//		User u = userDAO.getUserById(107);
//		u.setEnabled(false);
//		
//		assertEquals(true, userDAO.updateUser(u));
//	}
	
//	@Test
//	public void testSaveUser() {
//		User u = new User(110, "albin", "yuiop", "yuiop", "albin@gmail.com", 678686134, true);
//		assertEquals(true, userDAO.saveUser(u));
//	}
	
//	@Test
//	public void testDeleteUser() {
//		
//		User u = userDAO.getUserById(107);
//		assertEquals(true, userDAO.deleteUser(u));
//	}
	
//	@Test
//	public void testGetUserById() {
//		
//		User u = userDAO.getUserById(59);
//		assertEquals(59,userDAO.getUserById(59).getId());
//	}
	
//	@Test(expected = NullPointerException.class)
//	public void testGetUserByIdFail() {
//		User u = userDAO.getUserById(50);
//		assertEquals(50, u.getId());
//	}
	
	@Test
	public void testDeleteUserFail() {
		User u = userDAO.getUserById(106);
		assertEquals(false,userDAO.deleteUser(u));
	}
	
//	@Test(expected = NullPointerException.class)
//	public void testIsValidUserFail() {
//		assertEquals(true, userDAO.isValidUser("idgittz", "idgittz"));
//	}
//	@Test(expected = NullPointerException.class)
//	public void testIsValidUser() {
//		assertEquals(true, userDAO.isValidUser("bobby", "idgittz"));
//	}
	

}

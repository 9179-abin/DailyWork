package com.cts.hackathon.shopify.dao;

import java.util.List;

import com.cts.hackathon.shopify.model.UserEntity;

public interface UserDAO {
	
	public boolean saveUser(UserEntity user);
	
	public boolean saveOrUpdateUser(UserEntity user);
	
	public boolean deleteUser(UserEntity user);
	
	public boolean updateUser(UserEntity user);
	
	public UserEntity getUserById(int id);
	
	public List<UserEntity> getAllUsers();
}

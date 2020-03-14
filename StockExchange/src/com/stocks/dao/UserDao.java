package com.stocks.dao;

import java.util.List;

import com.stocks.datamodels.User;

public interface UserDao {
	public boolean saveUser(User user);

	public boolean updateUser(User user);

	public boolean daleteUser(User user);

	public User getUserById(int id);

	public List<User> getAllUsers();

}

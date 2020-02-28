package com.cts.project.services;

import java.util.List;

import com.cts.project.dto.UserDTO;
import com.cts.project.models.Users;


public interface UserServices  {
	public String insert(UserDTO user);
	public void remove(int id);
	public List<Users> getAll();
	public Users getOne(int id);
	public String alter(UserDTO user);
	public String userActivate(String email);
}

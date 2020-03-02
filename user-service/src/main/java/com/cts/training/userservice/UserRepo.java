package com.cts.training.userservice;

import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepo extends JpaRepository<Users, Integer> {
	public Users findByEmail(String email);
}

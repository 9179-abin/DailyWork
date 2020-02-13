package com.cts.training.trialdao;

import java.util.List;

import com.cts.training.trialmodels.TrialUser;


public interface TrialUserDao {
	
	public boolean saveUser(TrialUser user);

	public boolean updateUser(TrialUser user);
	
	public boolean deleteUser(TrialUser user);

	public TrialUser getUserById(int id);

	public List<TrialUser> getAllUsers();

}

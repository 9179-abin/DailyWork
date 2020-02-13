package com.cts.training.trialdao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.cts.training.trialdao.TrialUserDao;
import com.cts.training.trialmodels.TrialUser;

public class TrialUserDaoImpl implements TrialUserDao {
	
	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
	}

	public boolean saveUser(TrialUser user) {
		String query = "insert into TrialUser values('" +
				user.getId() + "','" +
				user.getName() + "','" + user.getEmail() + "','" +
				user.getPassword() + "')";
		try {
			jdbcTemplate.update(query); 
			return true; } 
		catch (DataAccessException e) {
			e.printStackTrace();
			return false;
			}
	}

	public boolean updateUser(TrialUser user) {
		String query = "update TrialUser set name=?,email=?,password=? where id =?";
				try {
				jdbcTemplate.update(query, user.getName(), user.getEmail(),user.getPassword(), user.getId());
				return true;
				}
				catch (DataAccessException e) {
				e.printStackTrace();
				return false;
				}
	}

	public boolean deleteUser(TrialUser user) {
		String query = "delete from employee where id =?";
		try {
		jdbcTemplate.update(query, user.getId());
		return true;
		} catch (DataAccessException e) {
		e.printStackTrace();
		return false;
		}
	}

	public TrialUser getUserById(int id) {
		String query = "select * from TrialUser where id = ?";
		RowMapper<TrialUser> rowMapper = new BeanPropertyRowMapper<TrialUser>(TrialUser.class);
		return jdbcTemplate.queryForObject(query, rowMapper, id);
	}

	public List<TrialUser> getAllUsers() {
		return jdbcTemplate.query("select * from TrialUser", new RowMapper<TrialUser>() {
			public TrialUser mapRow(ResultSet rs, int rownumber) throws SQLException {
			TrialUser  trial = new TrialUser();
			trial.setId(rs.getInt("id"));
			trial.setName(rs.getString("name"));
			trial.setEmail(rs.getString("email"));
			trial.setEmail(rs.getString("password"));
			return trial;
			}
			});
	}

}

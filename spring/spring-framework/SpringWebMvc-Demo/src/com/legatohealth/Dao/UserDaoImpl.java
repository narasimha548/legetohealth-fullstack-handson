package com.legatohealth.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.legatohealth.Sql.constants.SqlConstants;
import com.legatohealth.beans.User;
import com.legatohealth.utl.CustomRowMapper;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void store(User user) {
		jdbcTemplate.update(SqlConstants.insertQuery, user.getName(), user.getPassword(), user.getAge());
	}

	@Override
	public User fetchUser(int userId) {
		
		return jdbcTemplate.queryForObject(SqlConstants.fetchById, new Object[] {userId}, new CustomRowMapper());
	}

	@Override
	public List<User> fetchUsers() {
		
		return jdbcTemplate.query(SqlConstants.fetchAll, new CustomRowMapper());
	}

	@Override
	public void deleteUser(int userId) {
		jdbcTemplate.update(SqlConstants.deleteQuery, userId);
	}

	@Override
	public void updateUser(int userId, User user) {
		jdbcTemplate.update(SqlConstants.updateQuery, user.getName(), user.getPassword(), user.getAge(), userId);

	}

}

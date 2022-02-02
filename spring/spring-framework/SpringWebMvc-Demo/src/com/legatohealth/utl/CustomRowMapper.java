package com.legatohealth.utl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.legatohealth.beans.User;

public class CustomRowMapper  implements RowMapper<User>{

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		 User user=new User();
		 user.setUserId(rs.getInt("userid"));
		 user.setName(rs.getString("name"));
		 user.setPassword(rs.getString("password"));
		 user.setAge(rs.getInt("age"));
		return user;
	}

}

package org.bm.spring.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.bm.spring.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JdbcDaoImpl {

	@Autowired
	private DataSource dataSource;
	private static final String GET_PERSON_BY_ID = "select * from persons where personId =?";

	public Person getPersonById(final String id) throws SQLException {
		final Person person = new Person();
		final Connection conn = dataSource.getConnection();
		final PreparedStatement ps = conn.prepareStatement(GET_PERSON_BY_ID);
		ps.setInt(1, Integer.parseInt(id));
		final ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			person.setLastName(rs.getString("lastName"));
			person.setFirstName(rs.getString("firstName"));
			person.setAddress(rs.getString("address"));
			person.setCity(rs.getString("city"));
		}
		return person;
	}

}

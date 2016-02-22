package org.bm.spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.bm.spring.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class PersonsDao {

	@Autowired
	private SimpleJdbcTemplate simpleJdbcTemplate;
	private static final String GET_PERSON_BY_ID = "select * from persons where personId =?";

	public Person getPersonById(final String id) throws SQLException {
		return simpleJdbcTemplate.queryForObject(GET_PERSON_BY_ID, new PersonsRowMapper(), new Object[] { id });
	}

	public class PersonsRowMapper implements RowMapper<Person> {
		public Person mapRow(final ResultSet rs, final int rowNum) throws SQLException {
			final Person person = new Person();
			person.setLastName(rs.getString("lastName"));
			person.setFirstName(rs.getString("firstName"));
			person.setAddress(rs.getString("address"));
			person.setCity(rs.getString("city"));
			return person;
		}
	}
}

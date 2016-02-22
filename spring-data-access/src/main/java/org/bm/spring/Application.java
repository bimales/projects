package org.bm.spring;

import java.sql.SQLException;

import org.bm.spring.dao.JdbcDaoImpl;
import org.bm.spring.pojo.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(final String args[]) {
		final ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		final JdbcDaoImpl dao = context.getBean("jdbcDaoImpl", JdbcDaoImpl.class);
		try {
			final Person person = dao.getPersonById("1");
			System.out.println("Person Details: \n" + person.toString());
		} catch (final SQLException e) {
			e.printStackTrace();
		}
	}

}

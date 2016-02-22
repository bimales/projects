package org.bm.spring;

import java.sql.SQLException;

import org.bm.spring.dao.PersonsDao;
import org.bm.spring.pojo.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(final String args[]) {
		final ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		final PersonsDao personsDaoImpl = context.getBean("personsDao", PersonsDao.class);
		try {
			final Person person = personsDaoImpl.getPersonById("1");
			System.out.println("Person Details: \n" + person.toString());
		} catch (final SQLException e) {
			e.printStackTrace();
		}
	}

}

package org.bm.hibernate;

import org.bm.hibernate.pojo.Stock;
import org.hibernate.Session;

public class Application {
	public static void main(final String[] args) {

		System.out.println("Maven + Hibernate + MySQL");
		final Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();
		final Stock stock = new Stock();

		stock.setStockCode("4715");
		stock.setStockName("GENM");

		session.save(stock);
		session.getTransaction().commit();

		session.close();
	}

}

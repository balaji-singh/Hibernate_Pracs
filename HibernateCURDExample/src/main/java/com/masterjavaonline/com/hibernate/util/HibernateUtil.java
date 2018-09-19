/**
 * 
 */
package com.masterjavaonline.com.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author Master Java Online
 *
 */
public class HibernateUtil {

	private static SessionFactory sessionFactory = null;

	public static SessionFactory getSessionfactory() {
		if (sessionFactory == null) {
			try {
				sessionFactory = new Configuration().configure().buildSessionFactory();
			} catch (Throwable ex) {
				System.err.println("SessionFactory creation failed." + ex);
				throw new ExceptionInInitializerError(ex);
			}
		}
		return sessionFactory;
	}

	public static void shutdown() {

		getSessionfactory().close();
	}

}

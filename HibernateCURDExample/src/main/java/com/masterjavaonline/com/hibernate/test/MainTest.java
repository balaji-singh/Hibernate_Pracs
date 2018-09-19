/**
 * 
 */
package com.masterjavaonline.com.hibernate.test;

import org.hibernate.Session;

import com.masterjavaonline.com.hibernate.pojo.Customer;
import com.masterjavaonline.com.hibernate.util.HibernateUtil;

/**
 * @author Master Java Online
 *
 */
public class MainTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Session session = HibernateUtil.getSessionfactory().openSession();

		session.beginTransaction();

		Customer customer = new Customer();
		customer.setCustomer_id(1000);
		customer.setCustomer_name("Master");
		customer.setEmail_id("master@gmail.com");
		customer.setPhone_no("99919192");

		session.save(customer);
		session.getTransaction().commit();
		session.close();
	}

}

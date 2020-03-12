package com.demo.dao;

import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.entity.Customer;

@Repository
public class CustomerDaoImpl  implements CustomerDao{

	// inject dependency
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Customer> getCustomers() {
		Session currentsession = sessionFactory.openSession();
		
		Query<Customer> theQuery = currentsession.createQuery("from Customer ORDER by LastName", Customer.class);
		List<Customer> customer = theQuery.getResultList();
		return customer;
	}

	@Override
	public Customer getCustomer(int theId) {
		
		return null;
	}
	
	@Override
	public void deleteCustomer(int theId) {
		
		
	}
	
	@Override
	public void saveCustomer(Customer theCustomer) {
		// TODO Auto-generated method stub
		
	}
}

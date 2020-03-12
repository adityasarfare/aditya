package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.CustomerDao;
import com.demo.entity.Customer;

@Service
public class CustomerServiceImp implements CustomerService {
@Autowired
	CustomerDao customerDao;
	@Override
	public List<Customer> getCustomers() {
		
		
		return customerDao.getCustomers();
	}
	@Override
	public Customer getCustomer(int theId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void saveCustomer(Customer theCustomer) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void deleteCustomer(int theId) {
		// TODO Auto-generated method stub
		
	}
}

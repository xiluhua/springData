package com.springData.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springData.dao.CustomerRepDao;
import com.springData.entity.Customer;
import com.springData.service.CustomerService;

@Transactional
@Service
public class CustomerImpl implements CustomerService{

	@Autowired
	CustomerRepDao customerRepDao;
	
	@Override
	public int update13(String email, int id) {
		return customerRepDao.update13(email, id);
	}
	
	@Override
	public Customer save14(Customer customer) {
		return customerRepDao.save(customer);
	}
	
	@Override
	public List<Customer> save15(List<Customer> customers) {
		return (List<Customer>) customerRepDao.saveAll(customers);
	}

}

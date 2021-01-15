package com.atguigu;


import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.springData.entity.Customer;
import com.springData.service.impl.CustomerImpl;

public class Main5 extends Main1 {
	
	@Test
	public void update13() {
		CustomerImpl customerImpl = ctx.getBean(CustomerImpl.class);
		int result			      = customerImpl.update13("xe1235@163.com", 30);
		System.out.println("result:　"+result);
	}
	
	@Test
	public void save14() {
		CustomerImpl customerImpl = ctx.getBean(CustomerImpl.class);
		Customer customer1        = new Customer("颇多f", 28);
		System.out.println(customer1);
		Customer customer2		  = customerImpl.save14(customer1);
		System.out.println(customer2);
		System.out.println(JSON.toJSONStringWithDateFormat(customer2, "yyyy-MM-dd hh:mm:ss"));
	}
	
	@Test
	public void save15() {
		CustomerImpl customerImpl = ctx.getBean(CustomerImpl.class);
		
		List<Customer> customers  = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			Customer customer1    = new Customer("颇S多", (i+20));
			customers.add(customer1);
		}
		customers       		  = customerImpl.save15(customers);
		
		System.out.println(JSON.toJSONString(customers));
	}
	
}

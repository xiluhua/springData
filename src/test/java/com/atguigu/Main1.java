package com.atguigu;


import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.fastjson.JSON;
import com.springData.dao.CustomerRepDao;
import com.springData.entity.Customer;

public class Main1 {
	
	ApplicationContext ctx = null;
	@Before
	public void before(){
		ctx = new ClassPathXmlApplicationContext("spring.xml");
	}
	
	@Test
	public void test1() {
		DataSource dataSource   = (DataSource)ctx.getBean("dataSource");
		System.out.println(dataSource);
		
		CustomerRepDao customerDao = ctx.getBean(CustomerRepDao.class);
		Customer customer       = customerDao.getByLastName("EEE");
		System.out.println(JSON.toJSONStringWithDateFormat(customer, "yyyy-MM-dd hh:mm:ss"));
	}
	
	@Test
	public void test2() {
		CustomerRepDao custormerDao = ctx.getBean(CustomerRepDao.class);
		List<Customer> customers = custormerDao.getByLastNameStartingWithAndIdLessThan("师傅", 500);
		System.out.println(JSON.toJSONStringWithDateFormat(customers, "yyyy-MM-dd hh:mm:ss"));
	}
	
	@Test
	public void test3() {
		CustomerRepDao custormerDao = ctx.getBean(CustomerRepDao.class);
		List<Customer> customers = custormerDao.getByIdGreaterThan(200);
		System.out.println(JSON.toJSONStringWithDateFormat(customers, "yyyy-MM-dd hh:mm:ss"));
	}
	
	@Test
	public void test4() {
		CustomerRepDao custormerDao = ctx.getBean(CustomerRepDao.class);
		List<String> names       = new ArrayList<>();
		names.add("GG");
		names.add("er弄");
		List<Customer> customers = custormerDao.getByLastNameInOrIdLessThan(names, 10);
		
		System.out.println("size: "+customers.size());
		System.out.println(JSON.toJSONStringWithDateFormat(customers, "yyyy-MM-dd hh:mm:ss"));
	}
	
}

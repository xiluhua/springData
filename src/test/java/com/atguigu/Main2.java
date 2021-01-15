package com.atguigu;


import java.util.List;

import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.springData.dao.CustomerRepDao;
import com.springData.entity.Customer;

public class Main2 extends Main1 {
	
	@Test
	public void test5() {
		CustomerRepDao repDao = ctx.getBean(CustomerRepDao.class);
		Customer customer     = repDao.getMaxIdPerson5();
		System.out.println(JSON.toJSONStringWithDateFormat(customer, "yyyy-MM-dd hh:mm:ss"));
	}
	
	@Test
	public void test6() {
		CustomerRepDao repDao = ctx.getBean(CustomerRepDao.class);
		int count             = repDao.count6();
		System.out.println("count: "+count);
	}
	
	@Test
	public void test7() {
		CustomerRepDao repDao = ctx.getBean(CustomerRepDao.class);
		Customer customer     = repDao.query7("WW", "WW@163.com");
		System.out.println(JSON.toJSONStringWithDateFormat(customer, "yyyy-MM-dd hh:mm:ss"));
	}
	
	@Test
	public void test8() {
		CustomerRepDao repDao = ctx.getBean(CustomerRepDao.class);
		Customer customer     = repDao.query8("WW@163.com", "WW");
		System.out.println(JSON.toJSONStringWithDateFormat(customer, "yyyy-MM-dd hh:mm:ss"));
	}
	
	@Test
	public void test9() {
		CustomerRepDao repDao    = ctx.getBean(CustomerRepDao.class);
		List<Customer> customers = repDao.query9("W%", "WW%");
		System.out.println("size: "+customers.size());
		System.out.println(JSON.toJSONStringWithDateFormat(customers, "yyyy-MM-dd hh:mm:ss"));
	}
	
	@Test
	public void test10() {
		CustomerRepDao repDao    = ctx.getBean(CustomerRepDao.class);
		List<Customer> customers = repDao.query10("W", "WW");
		System.out.println("size: "+customers.size());
		System.out.println(JSON.toJSONStringWithDateFormat(customers, "yyyy-MM-dd hh:mm:ss"));
	}
	
}

package com.springData;

import org.junit.Test;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;

import com.alibaba.fastjson.JSON;
import com.springData.dao.CustomerRepDao;
import com.springData.entity.Customer;

public class Main6 extends Main1 {
	
	@SuppressWarnings("deprecation")
	@Test
	public void paging16() {
		CustomerRepDao repDao = ctx.getBean(CustomerRepDao.class);

		// pageNo 从 0 开始
		int pageNo   = 1 - 1;
		int pageSize = 5;
		
		Order order = new Order(Direction.ASC, "id");
		Sort sort   = new Sort(order);
		PageRequest request = new PageRequest(pageNo, pageSize, sort);
		Page<Customer> page = repDao.findAll(request);
		
		System.out.println(JSON.toJSONString(page));		
		System.out.println("总记录数： "+page.getTotalElements());
		System.out.println("当前第几页： "+(page.getNumber()+1));
		System.out.println("总页数： "+page.getTotalPages());
		System.out.println("当前页面的 List： "+JSON.toJSONString(page.getContent()));
		System.out.println("当前页面记录数： "+page.getNumberOfElements());
	}
	
}

package com.springData;

import org.junit.Test;

import com.springData.dao.CustomerRepDao;

public class Main3 extends Main1 {
	
	@Test
	public void test11() {
		CustomerRepDao repDao = ctx.getBean(CustomerRepDao.class);
		Integer count	      = repDao.count11();
		System.out.println(count);
	}
	
}

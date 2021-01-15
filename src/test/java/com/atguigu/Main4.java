package com.atguigu;


import java.util.List;

import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.springData.dao.CustomerDao;
import com.springData.entity.query.Customer2;

public class Main4 extends Main1 {
	
	@Test
	public void query12() {
		CustomerDao custormerDao = ctx.getBean(CustomerDao.class);
		List<Customer2> list 	 = custormerDao.query12();
		System.out.println("size:　"+list.size());
		System.out.println(JSON.toJSONString(list));
	}
	
}

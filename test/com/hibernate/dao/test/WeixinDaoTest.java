package com.hibernate.dao.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.hibernate.dao.WeixinDao;
import com.hibernate.model.Weixin;

public class WeixinDaoTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSave() {

	}

	@Test
	public void testIsExits() {
		WeixinDao wd = new WeixinDao();
		Weixin weixin = new Weixin();
		weixin.setHttp("http://mp.weixin.qq.com/s?__biz=MjM5ODIyMjY4OQ==&mid=202635679&idx=4&sn=803797764abe4c65cf0b2cb3ca93e380&3rd=MzA3MDU4NTYzMw==&scene=6#rd");
		System.out.println(wd.isExits(weixin));
	}
}

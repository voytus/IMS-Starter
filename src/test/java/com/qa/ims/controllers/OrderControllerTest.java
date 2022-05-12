package com.qa.ims.controllers;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.mysql.cj.x.protobuf.MysqlxCrud.Order;
import com.qa.ims.controller.OrderController;
import com.qa.ims.persistence.dao.OrderDAO;
import com.qa.ims.utils.Utils;

@RunWith(MockitoJUnitRunner.class)

public class OrderControllerTest {

	@Mock
	private Utils utils;
	
	@Mock
	private OrderDAO dao;
	
	@InjectMocks
	private OrderController controller;
	
	@Test
	public void testCreate() {
		final Long customerId = 1L;
		final Order created = new Order(customerId);
		Mockito.when(utils.getLong()).thenReturn(customerId);
		Mockito.when(dao.create(any(Order.class))).thenReturn(any(created));
		assertEquals(created, controller.create());
		Mockito.verify(utils, Mockito.times(1)).getLong();
		Mockito.verify(dao, Mockito.times(1)).create(any(Order.class));
			}
}

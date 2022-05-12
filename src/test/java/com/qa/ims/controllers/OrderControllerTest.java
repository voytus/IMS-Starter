package com.qa.ims.controllers;

import static org.junit.Assert.assertEquals;

import org.mockito.Mockito;

import com.qa.ims.persistence.dao.OrderDAO;

@RuntWith(MockitoJUnitRunner.class)

public class OrderControllerTest {

	@Mock
	private Utils utils;
	
	@Mock
	private OrderDAO dao;
	
	@IncjectMocks
	private OrderController controller;
	
	@Test
	public void testCreate() {
		final Long custId = 1L;
		final Order created = new Order(custId);
		Mockito.when(utils.getLong())thenReturn(custId);
		Mockito.when(dao.create(created)).thenReturn(created);
		assertEquals(created, controller.create());
		Mockito.verify(utils, Mockito.times(1)).getLong();
		Mockito.verify(dao, Mockito.times(1)).create(created);
			}
}

package com.qa.ims.persistence.dao;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.qa.ims.controller.CustomerController;
import com.qa.ims.controller.OrderController;
import com.qa.ims.persistence.domain.Order;
import com.qa.ims.utils.Utils;
public class OrderDAOTest {




@RunWith(MockitoJUnitRunner.class)
public class CustomerControllerTest {

	@Mock
	private Utils utils;

	@Mock
	private OrderDAO dao;

	@InjectMocks
	private OrderController controller;

	@Test
	public void testCreate() {
		final Order created = new Order(2L, 1L);
		assertEquals(created, dao.create(created));

	}

	@Test
	public void testReadAll() {
		List<Order> created = new ArrayList<>();
		created.add(new Order(1L, 1L));
		assertEquals(created, dao.readAll());
	}

	@Test
	public void testUpdateAddItem() {
		final Long OrderId;
		final Order addItem = new Order(2L);
		assertEquals(addItem, dao.addItem(2L, OrderId);
		

	@Test
	public void testDelete() {
		
		assertEquals(0, dao.delete());
	
}

	@Test
	public void testModelFromResultSet() {
		
	}
	@Test
	public void testRead() {
		final Long = 1L;
		final Long cusotmerId = 1L;
		assertEquals(new Order(orderId), DAO.read(orderId);
	}
	}
}

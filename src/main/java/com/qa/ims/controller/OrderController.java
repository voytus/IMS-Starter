package com.qa.ims.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.OrderDAO;
import com.qa.ims.persistence.domain.Item;
import com.qa.ims.persistence.domain.Order;
import com.qa.ims.utils.Utils;

public class OrderController implements CrudController<Order> {

	public static final Logger LOGGER = LogManager.getLogger();

	private OrderDAO orderDAO;
	private Utils utils;

	public OrderController(OrderDAO orderDAO, Utils utils) {
		super();
		this.orderDAO = orderDAO;
		this.utils = utils;
	}

	@Override
	public List<Order> readAll() {
		List<Order> orders = orderDAO.readAll();
		for (Order order : orders) {
			LOGGER.info(order);
		}
		return orders;
	}

	@Override
	public Order create() {

		LOGGER.info("Please enter a customer Id");
		Long customer_Id = utils.getLong();
		Order order = orderDAO.create(new Order(customer_Id));
		LOGGER.info("Please enter an item id");
		LOGGER.info("Order created");
		return order;
	}

	@Override
	public Order update() {
		LOGGER.info("Please enter the id of the order you would like to update");
		Long orderId = utils.getLong();
		LOGGER.info("Please choose one from the following: add to order / delete from the order");
		String addRemove = utils.getString();

		if (addRemove.equals("add")) {
			LOGGER.info("Please enter an item Id to be added");
			Long itemId = utils.getLong();
			Order order = orderDAO.addItem(orderId, itemId);
			LOGGER.info("Order Updated");
			return order;

		} else if (addRemove.equals("remove")) {
			LOGGER.info("Please enter the id of the item you would like to remove");
			Long itemId = utils.getLong();
			Order order = orderDAO.removeItem(orderId, itemId);
			LOGGER.info("Item removed from an order");
			return order;

		} else {

			return null;
		}

	}

	@Override
	public int delete() {
		LOGGER.info("Please enter the id of the order you would like to delete");
		Long order_id = utils.getLong();
		return orderDAO.delete(order_id);
	}

}

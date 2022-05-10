package com.qa.ims.persistence.domain;

import java.util.Objects;

public class Order {

	private Long orderId;
	private Long order_item_id;
	private Long customerId;

	public Order(Long orderId, Long order_item_id, Long customerId) {
		super();
		this.orderId = orderId;
		this.order_item_id = order_item_id;
		this.customerId = customerId;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getOrder_item_id() {
		return order_item_id;
	}

	public void setOrder_item_id(Long order_item_id) {
		this.order_item_id = order_item_id;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", order_item_id=" + order_item_id + ", customerId=" + customerId + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(customerId, orderId, order_item_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(customerId, other.customerId) && Objects.equals(orderId, other.orderId)
				&& Objects.equals(order_item_id, other.order_item_id);
	}

}

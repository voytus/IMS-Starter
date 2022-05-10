package com.qa.ims.persistence.domain;

import java.util.Objects;

public class Order {

	private Long orderId;
	private Long customerId;
	
	
	
	
	public Order(Long orderId, Long customerId) {
		super();
		this.orderId = orderId;
		this.customerId = customerId;
	}
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", customerId=" + customerId + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(customerId, orderId);
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
		return Objects.equals(customerId, other.customerId) && Objects.equals(orderId, other.orderId);
	}

}
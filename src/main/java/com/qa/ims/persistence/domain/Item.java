package com.qa.ims.persistence.domain;

import java.util.Objects;

public class Item {

	private Long item_id;
	private String item_name;
	private Double item_price;

	public Item(String item_name, Double item_price) {
		this.setItem_name(item_name);
		this.setItem_price(item_price);

	}

	public Long getItem_id() {
		return item_id;
	}

	public void setItem_id(Long item_id) {
		this.item_id = item_id;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public Double getItem_price() {
		return item_price;
	}

	public void setItem_price(Double item_price) {
		this.item_price = item_price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(item_id, item_name, item_price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return Objects.equals(item_id, other.item_id) && Objects.equals(item_name, other.item_name)
				&& Objects.equals(item_price, other.item_price);
	}

	@Override
	public String toString() {
		return "Item [item_id=" + item_id + ", item_name=" + item_name + ", item_price=" + item_price + "]";
	}

}

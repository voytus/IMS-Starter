drop schema ims;

CREATE SCHEMA IF NOT EXISTS `ims`;
USE `ims`;

CREATE TABLE IF NOT EXISTS `ims`.`customers` (
    `customer_id` INT(11) NOT NULL AUTO_INCREMENT,
    `first_name` VARCHAR(40) DEFAULT NULL,
    `surname` VARCHAR(40) DEFAULT NULL,
    PRIMARY KEY (`customer_id`)
);
CREATE TABLE IF NOT EXISTS `ims`.`item` (
	item_id int NOT NULL AUTO_INCREMENT,
	item_price DEC(2,10) NOT NULL,
	item_name VARCHAR(32),
	PRIMARY KEY ('item_id),
);

CREATE TABLE IF NOT EXISTS `ims`.`order_items` (
	'order_id_item' int NOT NULL AUTO_INCREMENT,
	'priceEach' DEC(2,10) NOT NULL,
	'quantity' int NOT NULL,
	PRIMARY KEY ('order_id_item')
	FOREIGN KEY ('items') REFERENCES item('item_id')
);

CREATE TABLE IF NOT EXISTS `ims`.`orders` (
	'order_id' int NOT NULL AUTO_INCREMENT,
	'order_id_item' INT,
	'quantity' int NOT NULL);
	PRIMARY KEY ('order_id),
	FOREIGN KEY ('order_id_item') REFERENCES order_items('order_id_item'),
	FOREIGN KEY ('cusotmer_id) REFERENCES customers('customer_id)
);



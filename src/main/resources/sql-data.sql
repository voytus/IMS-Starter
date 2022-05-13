--INSERTING DATA INTO CUSTOMERS
INSERT INTO `customers` (`first_name`, `surname`) VALUES ('jordan', 'harrison');
INSERT INTO `customers` (`first_name`, `surname`) VALUES ('norman', 'goonies');
INSERT INTO `customers` (`first_name`, `surname`) VALUES ('jennifer', 'ford');
INSERT INTO `customers` (`first_name`, `surname`) VALUES ('anna', 'sierra');
INSERT INTO `customers` (`first_name`, `surname`) VALUES ('john', 'bentley');
INSERT INTO `customers` (`first_name`, `surname`) VALUES ('kate', 'dawidson');
INSERT INTO `customers` (`first_name`, `surname`) VALUES ('melisa', 'tripalowski');
INSERT INTO `customers` (`first_name`, `surname`) VALUES ('abraham', 'benzema');
INSERT INTO `customers` (`first_name`, `surname`) VALUES ('ben', 'relie');

--INSERTING DATA INTO ITEMS
INSERT INTO `item` (`item_name`, `item_price`) VALUES ('pencil', 30);
INSERT INTO `item` (`item_name`, `item_price`) VALUES ('rubber', 20);
INSERT INTO `item` (`item_name`, `item_price`) VALUES ('book', 100);

--INSERT DATA INTO ORDER_ITEMS
INSERT INTO `order_items` (`order_id`, `item_id`) VALUES (1, 2);
INSERT INTO `order_items` (`order_id`, `item_id`) VALUES (2, 3);
INSERT INTO `order_items` (`order_id`, `item_id`) VALUES (3, 2);
INSERT INTO `order_items` (`order_id`, `item_id`) VALUES (4, 3);
INSERT INTO `order_items` (`order_id`, `item_id`) VALUES (5, 1);
INSERT INTO `order_items` (`order_id`, `item_id`) VALUES (6, 3);

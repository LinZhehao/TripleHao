CREATE TABLE IF NOT EXISTS `order` (
  `order_id` int(11) NOT NULL auto_increment,
  `customer_id` int(11) NOT NULL,
  `product_id` int(11) NOT NULL,
  `sales_channel` varchar(20) NOT NULL,
  `order_date` date NOT NULL,
  `ship_date` date NOT NULL,
  `quantity` int(11) NOT NULL,
  `salesperson_id` int(11),
  `total_cost` int(11) NOT NULL,
  PRIMARY KEY (`order_id`),
  FOREIGN KEY (`customer_id`) references customer(`customer_id`),
  FOREIGN KEY (`product_id`) references product(`product_id`),
  FOREIGN KEY (`salesperson_id`) references salesperson(`emp_id`)
) ENGINE= InnoDB auto_increment=1;
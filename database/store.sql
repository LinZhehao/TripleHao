CREATE TABLE IF NOT EXISTS `store` (
  `store_id` int(11) NOT NULL auto_increment,
  `address` varchar(60) NOT NULL,
  `store_manager` varchar(60) NOT NULL,
  `region_id` int(11) NOT NULL,
  PRIMARY KEY (`store_id`),
  FOREIGN KEY (`region_id`) references region(`region_id`)
) ENGINE=InnoDB auto_increment=1;
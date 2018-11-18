CREATE TABLE IF NOT EXISTS `customer` (
  `customer_id` int(11) NOT NULL auto_increment,
  `first_name` varchar(60) COLLATE utf8_unicode_ci NOT NULL,
  `last_name` varchar(60) COLLATE utf8_unicode_ci NOT NULL,
  `gender` varchar(20)  COLLATE utf8_unicode_ci,
  `phone_no` int(11),
  `address` varchar(60) COLLATE utf8_unicode_ci,
  `city` varchar(30) COLLATE utf8_unicode_ci,
  `state` varchar(10) COLLATE utf8_unicode_ci,
  `country` varchar(60) COLLATE utf8_unicode_ci,
  `zip` int(11),
  PRIMARY KEY (`customer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci auto_increment=1;
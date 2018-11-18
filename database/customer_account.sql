CREATE TABLE IF NOT EXISTS `customer_account` (
  `customer_id` int(11) NOT NULL auto_increment,
  `username` varchar(60) COLLATE utf8_unicode_ci NOT NULL,
  `password` varchar(60) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`customer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci auto_increment=1;
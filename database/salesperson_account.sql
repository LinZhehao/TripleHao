
CREATE TABLE IF NOT EXISTS `salesperson_account` (
  `emp_id` int(11) NOT NULL auto_increment,
  `username` varchar(60) NOT NULL,
  `password` varchar(60) NOT NULL,
  PRIMARY KEY (`emp_id`)
) engine=InnoDB auto_increment=1 default charset=utf8;
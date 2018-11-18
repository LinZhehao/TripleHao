CREATE TABLE IF NOT EXISTS `salesperson` (
  `emp_id` int(11) NOT NULL auto_increment,
  `first_name` varchar(60) NOT NULL,
  `last_name` varchar(60) NOT NULL,
  `gender` varchar(20) NOT NULL,
  `email` varchar(30) NOT NULL,
  `phone_no` int(11) NOT NULL,
  `job_title` varchar(60) NOT NULL,
  `salary` int(11) NOT NULL,
  `date_of_joining` date NOT NULL,
  `ssn` int(11) NOT NULL,
  `address` varchar(60) NOT NULL,
  `city` varchar(30) NOT NULL,
  `state` varchar(10) NOT NULL,
  `country` varchar(60) NOT NULL,
  `zip` int(11) NOT NULL,
  `store_id` int(11) NOT NULL,
  PRIMARY KEY (`emp_id`),
  FOREIGN KEY (`store_id`) references store(`store_id`)
) ENGINE=InnoDB auto_increment=1;
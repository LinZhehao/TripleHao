CREATE TABLE IF NOT EXISTS `region` (
  `region_id` int(11) NOT NULL auto_increment,
  `region_name` varchar(60) NOT NULL,
  `region_manager` varchar(60) NOT NULL,
  PRIMARY KEY (`region_id`)
) ENGINE=InnoDB auto_increment=1;
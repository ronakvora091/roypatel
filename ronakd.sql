/*
SQLyog - Free MySQL GUI v5.02
Host - 5.0.19-nt : Database - ronak
*********************************************************************
Server version : 5.0.19-nt
*/


create database if not exists `ronak`;

USE `ronak`;

/*Table structure for table `insertdata` */

DROP TABLE IF EXISTS `insertdata`;

CREATE TABLE `insertdata` (
  `reg_firstname` varchar(50) default NULL,
  `reg_lastname` varchar(50) default NULL,
  `reg_password` varchar(50) default NULL,
  `reg_email` varchar(50) default NULL,
  `reg_mobile` varchar(50) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `insertdata` */

insert into `insertdata` values 
('nkb','bjh','bhjbjhb','hvn@fmail.com','0987'),
('nvnv','gcb','gdfc','hbb@gyh.com','8786'),
('kjhbjb','bjbb','bmn nm','sds@gmil.com','0i90998');

/*
SQLyog - Free MySQL GUI v5.02
Host - 5.0.19-nt : Database - roy
*********************************************************************
Server version : 5.0.19-nt
*/


create database if not exists `roy`;

USE `roy`;

/*Table structure for table `patel` */

DROP TABLE IF EXISTS `patel`;

CREATE TABLE `patel` (
  `name` varchar(50) default NULL,
  `password` varchar(50) default NULL,
  `mobile` varchar(50) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `patel` */

insert into `patel` values 
('world','ia','0988');

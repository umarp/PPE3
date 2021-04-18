/*
SQLyog Ultimate - MySQL GUI v8.22 
MySQL - 5.6.11 : Database - mysample
*********************************************************************
*/ 
/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`mysample` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `mysample`;

/*Table structure for table `student` */

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `incid` int(5) NOT NULL AUTO_INCREMENT,
  `id` varchar(25) DEFAULT NULL,
  `name` varchar(25) DEFAULT NULL,
  `address` varchar(25) DEFAULT NULL,
  `gender` varchar(25) DEFAULT NULL,
  `age` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`incid`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

/*Data for the table `student` */

insert  into `student`(`incid`,`id`,`name`,`address`,`gender`,`age`) values (4,'001','bryan','navarro','Male','21'),(5,'002','Kevin','San Antonio','Female','24'),(6,'008','jac','koe','Male','19'),(7,'009','sample','wala','Female','21'),(8,'010','galo','kor','Female','23');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

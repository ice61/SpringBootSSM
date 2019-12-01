/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50536
Source Host           : localhost:3306
Source Database       : springbootssm

Target Server Type    : MYSQL
Target Server Version : 50536
File Encoding         : 65001

Date: 2019-07-10 21:37:45
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(100) DEFAULT NULL COMMENT '用户名',
  `password` varchar(100) DEFAULT NULL COMMENT '密码',
  `name` varchar(100) DEFAULT NULL COMMENT '姓名',
  `age` int(10) DEFAULT NULL COMMENT '年龄',
  `sex` tinyint(1) DEFAULT NULL COMMENT '性别，1男2女',
  `birthday` date DEFAULT NULL COMMENT '出生日期',
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'haha', '123', '张三', '23', '1', '1999-06-01');

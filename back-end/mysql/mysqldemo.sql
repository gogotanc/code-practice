/*
Navicat MySQL Data Transfer

Source Server         : 本地数据库
Source Server Version : 50627
Source Host           : localhost:3306
Source Database       : mysqldemo

Target Server Type    : MYSQL
Target Server Version : 50627
File Encoding         : 65001

Date: 2015-12-08 00:41:26
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `sal` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'a', 'a@qq.com', '5000');
INSERT INTO `user` VALUES ('2', 'b', 'b@qq.com', '3000');
INSERT INTO `user` VALUES ('3', 'c', 'c@qq.com', '2000');
INSERT INTO `user` VALUES ('4', 'd', 'd@qq.com', '5600');
INSERT INTO `user` VALUES ('5', 'e', 'e@qq.com', '2653');
INSERT INTO `user` VALUES ('6', 'f', 'f@qq.com', '6589');
INSERT INTO `user` VALUES ('7', 'g', 'g@qq.com', '3597');
INSERT INTO `user` VALUES ('8', 'h', 'h@qq.com', '1596');
INSERT INTO `user` VALUES ('9', 'i', 'i@qq.com', '7514');
INSERT INTO `user` VALUES ('10', 'j', 'j@qq.com', null);

/*
Navicat MySQL Data Transfer

Source Server         : Hemi
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : xmtfj

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-06-08 18:13:21
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for house_info
-- ----------------------------
DROP TABLE IF EXISTS `house_info`;
CREATE TABLE `house_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `on_sell_num` int(11) DEFAULT NULL,
  `all_num` int(11) DEFAULT NULL,
  `can_sell_num` int(11) DEFAULT NULL,
  `all_area` bigint(20) DEFAULT NULL,
  `can_sell_area` bigint(20) DEFAULT NULL,
  `is_sell_num` int(11) DEFAULT NULL,
  `is_sell_area` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of house_info
-- ----------------------------
INSERT INTO `house_info` VALUES ('1', '2017-06-05 23:30:24', '880', '292255', '9645', '33715606', '1493635', '336', '66334');

-- ----------------------------
-- Table structure for old_house_info
-- ----------------------------
DROP TABLE IF EXISTS `old_house_info`;
CREATE TABLE `old_house_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `house_rate` float(5,2) DEFAULT NULL,
  `sell_num` int(11) DEFAULT NULL,
  `today_sell_num` int(11) DEFAULT NULL,
  `sell_area` float(8,2) DEFAULT NULL,
  `today_sell_area` float(8,2) DEFAULT NULL,
  `date` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of old_house_info
-- ----------------------------
INSERT INTO `old_house_info` VALUES ('2', '61.00', '50', '92', '4658.61', '7688.74', '2017-06-07');

-- ----------------------------
-- Table structure for transaction_info
-- ----------------------------
DROP TABLE IF EXISTS `transaction_info`;
CREATE TABLE `transaction_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `region` varchar(20) NOT NULL,
  `sell_sum` int(11) DEFAULT NULL,
  `sell_area` float(10,2) DEFAULT NULL,
  `total_sum` int(11) DEFAULT NULL,
  `total_area` float(12,2) DEFAULT NULL,
  `date` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of transaction_info
-- ----------------------------
INSERT INTO `transaction_info` VALUES ('8', '思明区', '3', '279.65', '48', '3997.31', '2017-06-07');
INSERT INTO `transaction_info` VALUES ('9', '湖里区', '4', '1427.09', '98', '5818.53', '2017-06-07');
INSERT INTO `transaction_info` VALUES ('10', '集美区', '30', '3868.60', '272', '14483.10', '2017-06-07');
INSERT INTO `transaction_info` VALUES ('11', '海沧区', '16', '2612.14', '259', '11324.66', '2017-06-07');
INSERT INTO `transaction_info` VALUES ('12', '同安区', '59', '7040.59', '184', '11991.27', '2017-06-07');
INSERT INTO `transaction_info` VALUES ('13', '翔安区', '12', '1742.65', '91', '5805.90', '2017-06-07');

/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : xmtfj

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2017-06-11 21:34:57
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
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of house_info
-- ----------------------------
INSERT INTO `house_info` VALUES ('1', '2017-06-05 23:30:24', '880', '292255', '9645', '33715606', '1493635', '336', '66334');
INSERT INTO `house_info` VALUES ('5', '2017-06-08 23:30:02', '880', '292729', '9709', '33776963', '1501418', '488', '84395');
INSERT INTO `house_info` VALUES ('6', '2017-06-08 23:30:02', '880', '292729', '9709', '33776963', '1501418', '488', '84395');
INSERT INTO `house_info` VALUES ('7', '2017-06-08 23:30:02', '880', '292729', '9709', '33776963', '1501418', '488', '84395');

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
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of old_house_info
-- ----------------------------
INSERT INTO `old_house_info` VALUES ('3', '61.00', '63', '115', '5902.31', '9618.07', '2017-06-07');
INSERT INTO `old_house_info` VALUES ('5', '77.00', '82', '148', '9057.25', '11706.00', '2017-06-08');
INSERT INTO `old_house_info` VALUES ('6', null, '0', '0', '0.00', '0.00', '2017-06-09');
INSERT INTO `old_house_info` VALUES ('7', null, '0', '0', '0.00', '0.00', '2017-06-10');

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
) ENGINE=InnoDB AUTO_INCREMENT=44 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of transaction_info
-- ----------------------------
INSERT INTO `transaction_info` VALUES ('20', '思明区', '3', '279.65', '48', '3997.31', '2017-06-07');
INSERT INTO `transaction_info` VALUES ('21', '湖里区', '4', '1427.09', '98', '5818.53', '2017-06-07');
INSERT INTO `transaction_info` VALUES ('22', '集美区', '30', '3868.60', '272', '14483.10', '2017-06-07');
INSERT INTO `transaction_info` VALUES ('23', '海沧区', '16', '2612.14', '259', '11324.66', '2017-06-07');
INSERT INTO `transaction_info` VALUES ('24', '同安区', '59', '7040.59', '184', '11991.27', '2017-06-07');
INSERT INTO `transaction_info` VALUES ('25', '翔安区', '12', '1742.65', '91', '5805.90', '2017-06-07');
INSERT INTO `transaction_info` VALUES ('26', '思明区', '3', '279.65', '48', '3997.31', '2017-06-08');
INSERT INTO `transaction_info` VALUES ('27', '湖里区', '4', '1427.09', '98', '5818.53', '2017-06-08');
INSERT INTO `transaction_info` VALUES ('28', '集美区', '30', '3868.60', '272', '14483.10', '2017-06-08');
INSERT INTO `transaction_info` VALUES ('29', '海沧区', '16', '2612.14', '259', '11324.66', '2017-06-08');
INSERT INTO `transaction_info` VALUES ('30', '同安区', '59', '7040.59', '184', '11991.27', '2017-06-08');
INSERT INTO `transaction_info` VALUES ('31', '翔安区', '12', '1742.65', '91', '5805.90', '2017-06-08');
INSERT INTO `transaction_info` VALUES ('32', '思明区', '3', '279.65', '48', '3997.31', '2017-06-09');
INSERT INTO `transaction_info` VALUES ('33', '湖里区', '4', '1427.09', '98', '5818.53', '2017-06-09');
INSERT INTO `transaction_info` VALUES ('34', '集美区', '30', '3868.60', '272', '14483.10', '2017-06-09');
INSERT INTO `transaction_info` VALUES ('35', '海沧区', '16', '2612.14', '259', '11324.66', '2017-06-09');
INSERT INTO `transaction_info` VALUES ('36', '同安区', '59', '7040.59', '184', '11991.27', '2017-06-09');
INSERT INTO `transaction_info` VALUES ('37', '翔安区', '12', '1742.65', '91', '5805.90', '2017-06-09');
INSERT INTO `transaction_info` VALUES ('38', '思明区', '2', '428.81', '62', '5204.33', '2017-06-10');
INSERT INTO `transaction_info` VALUES ('39', '湖里区', '1', '51.00', '81', '3159.23', '2017-06-10');
INSERT INTO `transaction_info` VALUES ('40', '集美区', '19', '2343.40', '202', '37289.22', '2017-06-10');
INSERT INTO `transaction_info` VALUES ('41', '海沧区', '15', '2089.64', '91', '5337.04', '2017-06-10');
INSERT INTO `transaction_info` VALUES ('42', '同安区', '102', '11393.01', '224', '16174.79', '2017-06-10');
INSERT INTO `transaction_info` VALUES ('43', '翔安区', '58', '5582.50', '202', '12902.03', '2017-06-10');

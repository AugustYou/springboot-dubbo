/*
 Navicat Premium Data Transfer

 Source Server         : gp
 Source Server Type    : MySQL
 Source Server Version : 50720
 Source Host           : localhost
 Source Database       : gp

 Target Server Type    : MySQL
 Target Server Version : 50720
 File Encoding         : utf-8

 Date: 03/28/2020 00:02:41 AM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `order_item`
-- ----------------------------
DROP TABLE IF EXISTS `order_item`;
CREATE TABLE `order_item` (
  `id` varchar(32) NOT NULL,
  `order_id` varchar(32) NOT NULL,
  `shopping_name` varchar(16) DEFAULT NULL,
  `price` decimal(10,0) DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT NULL,
  `update_time` timestamp NULL DEFAULT NULL,
  `create_by` varchar(16) DEFAULT NULL,
  `update_by` varchar(16) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `order_item`
-- ----------------------------
BEGIN;
INSERT INTO `order_item` VALUES ('1', '1', '衣服', '100', '2020-03-27 23:42:33', '2020-03-27 23:42:35', 'admin', 'admin'), ('2', '1', '鞋子', '200', '2020-03-27 23:43:22', '2020-03-27 23:43:24', 'admin', 'admin');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;

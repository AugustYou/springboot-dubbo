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

 Date: 03/28/2020 00:02:48 AM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `orders`
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `id` varchar(64) DEFAULT NULL,
  `amount` varchar(64) DEFAULT NULL,
  `status` int(8) DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT NULL,
  `update_time` timestamp NULL DEFAULT NULL,
  `payment_time` timestamp NULL DEFAULT NULL,
  `create_by` varchar(16) NOT NULL,
  `update_By` int(16) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `orders`
-- ----------------------------
BEGIN;
INSERT INTO `orders` VALUES ('1', '1', '1', '2020-03-27 09:07:30', '2020-03-27 22:07:49', null, 'admin', null);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;

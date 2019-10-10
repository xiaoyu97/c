

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for resale
-- ----------------------------
DROP TABLE IF EXISTS `resale`;
CREATE TABLE `resale` (
  `commodityname` varchar(45) NOT NULL,
  `commodityid` int(10) unsigned NOT NULL,
  `sellTime` datetime NOT NULL,
  `number` varchar(45) NOT NULL,
  `money` double NOT NULL,
  `operator` varchar(45) NOT NULL,
  `saleid` int(11) NOT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=gb2312 PACK_KEYS=1;

-- ----------------------------
-- Records of resale
-- ----------------------------
BEGIN;
INSERT INTO `resale` VALUES ('可乐', 1, '2019-09-23 00:00:00', '1', 2, 'lilei', 1, 4);
INSERT INTO `resale` VALUES ('可乐', 1, '2019-09-23 00:00:00', '1', 2, 'lilei', 1, 5);
INSERT INTO `resale` VALUES ('可乐', 1, '2019-09-23 00:00:00', '1', 2, 'lilei', 1, 6);
INSERT INTO `resale` VALUES ('可乐', 1, '2019-09-23 00:00:00', '1', 2, 'lilei', 1, 7);
INSERT INTO `resale` VALUES ('可乐', 1, '2019-09-23 00:00:00', '1', 2, 'lilei', 1, 8);
INSERT INTO `resale` VALUES ('可乐', 1, '2019-09-23 00:00:00', '1', 2, 'lilei', 1, 9);
INSERT INTO `resale` VALUES ('可乐', 1, '2019-09-23 00:00:00', '1', 2, 'lilei', 1, 10);
INSERT INTO `resale` VALUES ('雪碧', 2, '2019-09-24 00:00:00', '1', 3, 'lili', 2, 11);
INSERT INTO `resale` VALUES ('雪碧', 2, '2019-09-24 00:00:00', '1', 3, 'lili', 2, 12);
INSERT INTO `resale` VALUES ('雪碧', 2, '2019-09-24 00:00:00', '1', 3, 'lili', 2, 13);
INSERT INTO `resale` VALUES ('雪碧', 2, '2019-09-24 00:00:00', '1', 3, 'lili', 2, 14);
INSERT INTO `resale` VALUES ('雪碧', 2, '2019-09-24 00:00:00', '1', 3, 'lili', 2, 15);
INSERT INTO `resale` VALUES ('雪碧', 2, '2019-09-24 00:00:00', '1', 3, 'lili', 2, 16);
INSERT INTO `resale` VALUES ('雪碧', 2, '2019-09-24 00:00:00', '1', 3, 'lili', 2, 17);
INSERT INTO `resale` VALUES ('雪碧', 2, '2019-09-24 00:00:00', '1', 3, 'lili', 2, 18);
INSERT INTO `resale` VALUES ('雪碧', 2, '2019-09-24 00:00:00', '1', 3, 'lili', 2, 19);
INSERT INTO `resale` VALUES ('雪碧', 2, '2019-09-24 00:00:00', '1', 3, 'lili', 2, 20);
INSERT INTO `resale` VALUES ('雪碧', 2, '2019-09-24 00:00:00', '1', 3, 'lili', 2, 21);
INSERT INTO `resale` VALUES ('可乐', 1, '2019-09-23 00:00:00', '1', 2, 'lilei', 1, 22);
INSERT INTO `resale` VALUES ('可乐', 1, '2019-09-23 00:00:00', '1', 2, 'lilei', 1, 23);
INSERT INTO `resale` VALUES ('可乐', 1, '2019-09-23 00:00:00', '1', 2, 'lilei', 1, 24);
INSERT INTO `resale` VALUES ('可乐', 1, '2019-09-23 00:00:00', '1', 2, 'lilei', 1, 25);
INSERT INTO `resale` VALUES ('可乐', 1, '2019-09-23 00:00:00', '1', 2, 'lilei', 1, 26);
INSERT INTO `resale` VALUES ('可乐', 1, '2019-09-23 00:00:00', '1', 2, 'lilei', 1, 27);
INSERT INTO `resale` VALUES ('可乐', 1, '2019-09-23 00:00:00', '1', 2, 'lilei', 1, 28);
INSERT INTO `resale` VALUES ('可乐', 1, '2019-09-23 00:00:00', '1', 2, 'lilei', 1, 29);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;

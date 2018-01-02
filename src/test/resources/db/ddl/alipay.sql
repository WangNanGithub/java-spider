-- ----------------------------
-- 支付宝个人信息记录表
-- ----------------------------
DROP TABLE IF EXISTS `pdl_alipay_info`;
CREATE TABLE `pdl_alipay_info` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) NOT NULL COMMENT '用户 ID',
  `login_name` VARCHAR(50) DEFAULT NULL COMMENT '支付宝账户名',
  `real_name` VARCHAR(20) DEFAULT NULL COMMENT '真实姓名',
  `id_card` VARCHAR(20) DEFAULT NULL COMMENT '身份证',
  `email` VARCHAR(50) DEFAULT NULL COMMENT '绑定的邮箱',
  `phone` VARCHAR(20) DEFAULT NULL COMMENT '绑定的手机号',
  `taobao_name` VARCHAR(50) DEFAULT NULL COMMENT '淘宝账户名',
  `register_date` datetime DEFAULT NULL COMMENT '注册时间',
  `is_real_name` VARCHAR(20) DEFAULT NULL COMMENT '是否实名认证',
  `is_protected` VARCHAR(50) DEFAULT NULL COMMENT '是否会员保障',
  `balance` DECIMAL(30, 6) DEFAULT NULL COMMENT '账户余额',
  `income` DECIMAL(30,6) DEFAULT NULL COMMENT '余额宝总收入',
  `amount` DECIMAL(30,6) DEFAULT NULL COMMENT '余额宝总金额',
  `total_amount` DECIMAL(30,6) DEFAULT NULL COMMENT '花呗总额度',
  `available_amount` DECIMAL(30,6) DEFAULT NULL COMMENT '花呗可用额度',
  `need_to_pay_next_mouth` DECIMAL(30,6) DEFAULT NULL COMMENT '花呗下期需还',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='支付宝个人信息表';

-- ----------------------------
-- 支付宝交易记录表
-- ----------------------------
DROP TABLE IF EXISTS `pdl_alipay_trade_record_info`;
CREATE TABLE `pdl_alipay_trade_record_info` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) NOT NULL COMMENT '用户 ID',
  `pay_time` datetime DEFAULT NULL COMMENT '支付时间',
  `trade_type` VARCHAR(255) DEFAULT NULL COMMENT '交易名称',
  `trade_no` VARCHAR(255) DEFAULT NULL COMMENT '交易号',
  `receiver_name` VARCHAR(50) DEFAULT NULL COMMENT '接收人',
  `amount` DECIMAL(30,6) DEFAULT NULL COMMENT '交易金额',
  `status` VARCHAR(50) DEFAULT NULL COMMENT '交易状态',
  `trade_detail_url` VARCHAR(255) DEFAULT NULL COMMENT '支付宝交易详情URL',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='支付宝交易记录表';

-- ----------------------------
-- 支付宝绑卡记录表
-- ----------------------------
DROP TABLE IF EXISTS `pdl_alipay_bank_card`;
CREATE TABLE `pdl_alipay_bank_card` (
  `id` BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `user_id` BIGINT(20) NOT NULL COMMENT '用户 ID',
  `card_last_num` VARCHAR(4) DEFAULT NULL COMMENT '银行卡后4位',
  `open_status` VARCHAR(50) DEFAULT NULL COMMENT '快捷支付开通状态',
  `bank_name` VARCHAR(10) DEFAULT NULL COMMENT '银行名称',
  `card_type` VARCHAR(10) DEFAULT NULL COMMENT '银行卡类型',
  `mobile` VARCHAR(11) DEFAULT NULL COMMENT '银行预留手机号(中间4位带掩码)',
  `active_date` DATETIME DEFAULT NULL COMMENT '快捷支付开通日期, 例如: 2013-02-02',
  `show_user_name` VARCHAR(50) DEFAULT NULL COMMENT '银行卡持卡人姓名',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='支付宝绑卡记录表';

-- ----------------------------
-- 支付宝缴费提醒记录表
-- ----------------------------
DROP TABLE IF EXISTS `pdl_alipay_charge_account`;
CREATE TABLE `pdl_alipay_charge_account` (
  `id` BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `user_id` BIGINT(20) NOT NULL COMMENT '用户 ID',
  `charge_item` VARCHAR(50) DEFAULT NULL COMMENT '缴费项目',
  `area` VARCHAR(50) DEFAULT NULL COMMENT '地区',
  `charge_unit` VARCHAR(50) DEFAULT NULL COMMENT '收费单位',
  `charge_account` VARCHAR(50) DEFAULT NULL COMMENT '户名',
  `charge_number` VARCHAR(50) DEFAULT NULL COMMENT '缴费号码',
  `charge_reminder` VARCHAR(20) DEFAULT NULL COMMENT '缴费提醒',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='支付宝缴费提醒记录表';

-- ----------------------------
-- 用户账号管理表
-- ----------------------------
DROP TABLE IF EXISTS `pdl_user_account`;
CREATE TABLE `pdl_user_account` (
  `id` BIGINT(20) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` BIGINT(20) NOT NULL COMMENT '用户 ID',
  `type` VARCHAR(50) DEFAULT NULL COMMENT '账号类型',
  `username` VARCHAR(50) DEFAULT NULL COMMENT '账号名',
  `password` VARCHAR(50) DEFAULT NULL COMMENT '密码',
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='用户账号管理表';
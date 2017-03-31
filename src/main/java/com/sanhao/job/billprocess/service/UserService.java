package com.sanhao.job.billprocess.service;

import java.math.BigDecimal;

import org.apache.ibatis.annotations.Param;

/**
 * 用户账号等相关服务
 * @author sanhao
 *
 */
public interface UserService {
	// 根据session_id和类型，获取用户ID
	int getUserId(String session_id,int type);
	
	// 获取用户账户余额
	BigDecimal getBalance( int user_id);
	
	// 更新用户余额
	int updateBalance(int user_id,BigDecimal user_balance);
}

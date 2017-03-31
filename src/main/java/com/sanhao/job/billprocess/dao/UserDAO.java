package com.sanhao.job.billprocess.dao;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.sanhao.job.billprocess.model.User;

/**
 * 用户表相关操作
 * @author sanhao
 *
 */
public interface UserDAO {
	
	@Select("SELECT `user_name` FROM `user` WHERE user_id=#{user_id}")
	String getName(@Param("user_id")int user_id);
}

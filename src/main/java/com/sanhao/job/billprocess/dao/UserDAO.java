package com.sanhao.job.billprocess.dao;

import java.math.BigDecimal;
import java.util.List;

import com.sanhao.job.billprocess.model.User;
import org.apache.ibatis.annotations.*;

/**
 * 用户表相关操作
 * @author sanhao
 *
 */
public interface UserDAO {
	
	@Select("SELECT `user_name` FROM `user` WHERE user_id=#{user_id}")
	String getName(@Param("user_id")int user_id);

	@Insert("insert into user(user_id, user_name) values(#{user_id}, #{user_name})")
	@Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
	int insert(@Param("user_id")int user_id,@Param("user_name")int user_name);

	@Insert("insert into user(user_id, user_name) values(#{user_id}, #{user_name})")
	@Options(useGeneratedKeys = true, keyColumn = "id")
	int insert2(User user);
}

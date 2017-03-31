package com.sanhao.job.lesson.dao;

import com.sanhao.job.lesson.model.Package;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * 课程详情信息访问DAO
 * @author sanhao
 *
 */
public interface PackageDAO {
	@Select("SELECT `course_name` FROM package where course_id=#{course_id}")
	String getCourseName(@Param("course_id") int course_id);
	
}

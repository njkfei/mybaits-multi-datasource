package com.sanhao.job.lesson.model;

import java.math.BigDecimal;

/**
 * 课程数据结构
 * @author sanhao
 *
 */
public class Package {
	private int id;
	private String name;
	private short cat_id;
	private short tag_id;
	private String content;
	private BigDecimal price;
	private BigDecimal teacher_price;
	private short teacher_level;
	private short hour;
	private short status;
	public int getCourse_id() {
		return id;
	}
	public void setCourse_id(int course_id) {
		this.id = course_id;
	}
	public String getCourse_name() {
		return name;
	}
	public void setCourse_name(String course_name) {
		this.name = course_name;
	}
	public short getCat_id() {
		return cat_id;
	}
	public void setCat_id(short cat_id) {
		this.cat_id = cat_id;
	}
	public short getTag_id() {
		return tag_id;
	}
	public void setTag_id(short tag_id) {
		this.tag_id = tag_id;
	}
	public String getCourse_content() {
		return content;
	}
	public void setCourse_content(String course_content) {
		this.content = course_content;
	}
	public BigDecimal getCourse_price() {
		return price;
	}
	public void setCourse_price(BigDecimal course_price) {
		this.price = course_price;
	}
	public BigDecimal getTeacher_price() {
		return teacher_price;
	}
	public void setTeacher_price(BigDecimal teacher_price) {
		this.teacher_price = teacher_price;
	}
	public short getTeacher_level() {
		return teacher_level;
	}
	public void setTeacher_level(short teacher_level) {
		this.teacher_level = teacher_level;
	}
	public short getCourse_hour() {
		return hour;
	}
	public void setCourse_hour(short course_hour) {
		this.hour = course_hour;
	}
	public short getCourse_status() {
		return status;
	}
	public void setCourse_status(short course_status) {
		this.status = course_status;
	}
	
	@Override
	public String toString() {
		return "Package [course_id=" + id + ", course_name=" + name + ", cat_id=" + cat_id + ", tag_id="
				+ tag_id + ", course_content="
				+ content + ", course_price=" + price + ", teacher_price=" + teacher_price + ", teacher_level=" + teacher_level + ", course_hour=" + hour + ", course_status=" + status + "]";
	}
	
	
	

}

package com.sanhao.job.billprocess;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;



//@Import({ AppConfig.class, MybatisConfiguration.class, Mybatis4LessonConfiguration.class, LogBackConfig.class })
@SpringBootApplication
public class AppMain {
	static Logger logger = LoggerFactory.getLogger("bill");

	public static void main(String args[]) {
		SpringApplication.run(AppMain.class, args);
	}
}

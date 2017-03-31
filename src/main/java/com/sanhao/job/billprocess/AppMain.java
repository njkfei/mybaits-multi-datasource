package com.sanhao.job.billprocess;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.AbstractApplicationContext;

import com.sanhao.job.billprocess.config.AppConfig;
import com.sanhao.job.billprocess.config.LogBackConfig;
import com.sanhao.job.billprocess.dao.UserDAO;
import com.sanhao.job.billprocess.job.BillJob;
import com.sanhao.job.billprocess.model.Bill;
import com.sanhao.job.billprocess.model.User;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


//@Import({ AppConfig.class, MybatisConfiguration.class, Mybatis4LessonConfiguration.class, LogBackConfig.class })
@SpringBootApplication
public class AppMain {
	static Logger logger = LoggerFactory.getLogger("bill");

	public static void main(String args[]) {
		SpringApplication.run(AppMain.class, args);
	}
}

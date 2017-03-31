package com.sanhao.job.billprocess.config;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

import com.sanhao.job.billprocess.job.BillJob;

@Configuration
@EnableAsync
@EnableScheduling
@PropertySource(value = { "classpath:conf/app.properties" }, ignoreResourceNotFound = true)
public class AppConfig{
	@Bean
	public static BillJob billJob(){
		return new BillJob();
	}

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
       return new PropertySourcesPlaceholderConfigurer();
    }
/*
	public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
		 taskRegistrar.setScheduler(taskExecutor());
		
	}
	
	@Bean(destroyMethod="shutdown")
    public static  Executor  taskExecutor() {
		return Executors.newScheduledThreadPool(10);
    }
	*/
	
	
}
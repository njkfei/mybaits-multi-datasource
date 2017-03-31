package com.sanhao.job.billprocess.config;

import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.encoder.PatternLayoutEncoder;
import ch.qos.logback.core.ConsoleAppender;
import ch.qos.logback.core.FileAppender;
import ch.qos.logback.core.rolling.RollingFileAppender;
import ch.qos.logback.core.rolling.RollingPolicy;
import ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy;
import ch.qos.logback.ext.spring.ApplicationContextHolder;

/**
 * Hello world!
 *
 */
@Configuration
public class LogBackConfig {
	@Bean
	public static ApplicationContextHolder applicationContextHolder() {
		ApplicationContextHolder holder =  new ApplicationContextHolder();
		return holder;
	}

	@Bean
	public static LoggerContext loggerContext() {
		LoggerContext context =  (LoggerContext) LoggerFactory.getILoggerFactory();
		
		return context;
	}

	@Bean(initMethod = "start", destroyMethod = "stop")
	public static PatternLayoutEncoder encoder(LoggerContext ctx) {
		PatternLayoutEncoder encoder = new PatternLayoutEncoder();
		encoder.setContext(ctx);
		encoder.setPattern("%date %-5level [%thread] %logger{36} %m%n");
		return encoder;
	}

	
	
	@Bean(initMethod = "start", destroyMethod = "stop")
	public static PatternLayoutEncoder encoder1(LoggerContext ctx) {
		PatternLayoutEncoder encoder = new PatternLayoutEncoder();
		encoder.setContext(ctx);
		encoder.setPattern("%-4relative [%thread] %-5level %logger{35} - %msg%n");
		return encoder;
	}
	
	@Bean(initMethod = "start", destroyMethod = "stop")
	public static ConsoleAppender consoleAppender(LoggerContext ctx, PatternLayoutEncoder encoder) {
		ConsoleAppender appender = new ConsoleAppender();
		appender.setContext(ctx);
		appender.setEncoder(encoder);
		return appender;
	}

/*	@Bean(name = "test", initMethod = "start", destroyMethod = "stop")
	public static FileAppender fileAppender(LoggerContext ctx, PatternLayoutEncoder encoder) {
		FileAppender appender = new FileAppender();
		appender.setAppend(true);
		appender.setName("test");
		appender.setFile("test.log");
		appender.setContext(ctx);
		appender.setEncoder(encoder);
		return appender;
	}
	
	@Bean(name = "rolling ", initMethod = "start", destroyMethod = "stop")
	public static RollingFileAppender rollingAppend(LoggerContext ctx, PatternLayoutEncoder encoder) {
		RollingFileAppender appender = new RollingFileAppender();
		appender.setAppend(true);
		appender.setName("rolling");
		appender.setFile("rolling.log");
		appender.setRollingPolicy((RollingPolicy) policy());
		appender.setEncoder(encoder1(ctx));
		return appender;
	}

	@Bean
	public static SizeBasedTriggeringPolicy policy() {
		SizeBasedTriggeringPolicy policy = new SizeBasedTriggeringPolicy();
		policy.setMaxFileSize("1MB");
		return null;
	}*/


}

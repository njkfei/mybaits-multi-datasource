package com.sanhao.job.billprocess.config;
import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
/**
 * Created by njp on 17/3/30.
 */
@Configuration
@MapperScan(basePackages="com.sanhao.job.lesson.dao",sqlSessionFactoryRef="secondSqlSessionFactory")
public class MysqlDataSource2Config {
    @Bean(name = "secondDataSource")
    @ConfigurationProperties(prefix="spring.datasource2")
    public DataSource dataSource(){
        return DataSourceBuilder.create().build();
    }
    @Bean(name = "secondSqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        return sessionFactory.getObject();
    }
}
package com.tfs.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages= "com.*")
public class HibernateConfig {
 
 @Bean
 public LocalSessionFactoryBean sessionFactoryBean(){
  LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
  sessionFactoryBean.setDataSource(dataSource());
  sessionFactoryBean.setPackagesToScan(new String[] { "com.tfs.model", "com.rfs.model" });
  sessionFactoryBean.setHibernateProperties(hibernateProperties());
  return sessionFactoryBean;
 }
 
 @Bean
 public DataSource dataSource(){
  DriverManagerDataSource ds = new DriverManagerDataSource();
  ds.setDriverClassName("com.mysql.jdbc.Driver");
  ds.setUrl("jdbc:mysql://localhost:3306/tfs");
 // ds.setUrl("jdbc:mysql://aa13nzt69eia3fb.ctqgjioctkdb.us-east-2.rds.amazonaws.com:3306/ebdb");
  ds.setUsername("tfs");
//  ds.setPassword("Root1122");
  ds.setPassword("tfs");
  return ds;
 }
 
 private Properties hibernateProperties(){
  Properties properties = new Properties();
  properties.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
  properties.put("hibernate.show_sql", "true");
  properties.put("hibernate.format_sql", "false");
  properties.put("hibernate.hbm2ddl.auto", "update");
  
  return properties;
 }
 
 @Bean
 @Autowired
 public HibernateTransactionManager transactionManager(SessionFactory s){
  HibernateTransactionManager txManager = new HibernateTransactionManager();
  txManager.setSessionFactory(s);
  return txManager;
 }

 
}

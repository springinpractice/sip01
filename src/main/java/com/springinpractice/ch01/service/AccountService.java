/* 
 * Copyright (c) 2013 Manning Publications Co.
 * 
 * Book: http://manning.com/wheeler/
 * Blog: http://springinpractice.com/
 * Code: https://github.com/springinpractice
 */
package com.springinpractice.ch01.service;

import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;

import com.springinpractice.ch01.dao.jdbc.JdbcAccountDao;

public class AccountService {
    private JdbcAccountDao accountDao;

    public AccountService() {    	
    	try {
            Properties props = new Properties();
            InputStream inputStream = this.getClass().getClassLoader()
            	.getResourceAsStream("dataSource.properties");
            props.load(inputStream);
    
            BasicDataSource dataSource = new BasicDataSource();
            dataSource.setDriverClassName(
            		props.getProperty("driverClassName"));
            dataSource.setUrl(props.getProperty("url"));
            dataSource.setUsername(props.getProperty("username"));
            dataSource.setPassword(props.getProperty("password"));

        	accountDao = new JdbcAccountDao();
            accountDao.setDataSource(dataSource);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}


/* 
 * Copyright (c) 2013 Manning Publications Co.
 * 
 * Book: http://manning.com/wheeler/
 * Blog: http://springinpractice.com/
 * Code: https://github.com/springinpractice
 */
package com.springinpractice.ch01.dao.jdbc;

import org.apache.commons.dbcp.BasicDataSource;

import com.springinpractice.ch01.dao.AccountDao;

public class JdbcAccountDao implements AccountDao {
	private BasicDataSource dataSource;
	
	public JdbcAccountDao() {
		dataSource = new BasicDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");		
		dataSource.setUrl("jdbc:mysql://localhost:3306/springbook" + 
				"?autoReconnect=true");
		dataSource.setUsername("root");
		dataSource.setPassword("");
	}	
	
}

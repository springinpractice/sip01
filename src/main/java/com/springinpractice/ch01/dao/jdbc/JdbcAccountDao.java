/* 
 * Copyright (c) 2013 Manning Publications Co.
 * 
 * Book: http://manning.com/wheeler/
 * Blog: http://springinpractice.com/
 * Code: https://github.com/springinpractice
 */
package com.springinpractice.ch01.dao.jdbc;

import javax.sql.DataSource;

import com.springinpractice.ch01.dao.AccountDao;

public class JdbcAccountDao implements AccountDao {
	
	private DataSource dataSource;
	
	public JdbcAccountDao() {}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}	
	
}

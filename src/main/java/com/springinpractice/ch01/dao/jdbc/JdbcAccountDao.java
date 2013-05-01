/* 
 * Copyright (c) 2013 Manning Publications Co.
 * 
 * Book: http://manning.com/wheeler/
 * Blog: http://springinpractice.com/
 * Code: https://github.com/springinpractice
 */
package com.springinpractice.ch01.dao.jdbc;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import com.springinpractice.ch01.dao.AccountDao;
import com.springinpractice.ch01.model.Account;

public class JdbcAccountDao implements AccountDao {
	
	@Autowired
	private DataSource dataSource;
	
	public JdbcAccountDao() {}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public List<Account> findAll() throws Exception {
		throw new UnsupportedOperationException("This method has not been implemented");
	}	
	
}

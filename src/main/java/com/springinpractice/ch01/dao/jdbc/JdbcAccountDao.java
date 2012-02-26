// Source project: sip01, branch: 01 (Maven Project)
package com.springinpractice.ch01.dao.jdbc;

import org.apache.commons.dbcp.BasicDataSource;

import com.springinpractice.ch01.dao.AccountDao;

public class JdbcAccountDao implements AccountDao {
	private BasicDataSource dataSource;
	
	public JdbcAccountDao() {
		dataSource = new BasicDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");		
		dataSource.setUrl("jdbc:mysql://localhost:3306/springbook?autoReconnect=true");
		dataSource.setUsername("root");
		dataSource.setPassword("");
	}	
	
}

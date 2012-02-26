// Source project: sip01, branch: 02 (Maven Project)
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

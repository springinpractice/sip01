// Source project: sip01, branch: 04 (Maven Project)
package com.springinpractice.ch01.dao;

import java.util.List;

import com.springinpractice.ch01.model.Account;

public interface AccountDao {

	List<Account> findAll() throws Exception;
	
}

//Source project: sip01, branch: 03 (Maven Project)
package com.springinpractice.ch01.service;
import com.springinpractice.ch01.dao.AccountDao;       

public class AccountService {
    private AccountDao accountDao;

    public AccountService() {}

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
        
}
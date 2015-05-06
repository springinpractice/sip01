/* 
 * Copyright (c) 2013 Manning Publications Co.
 * 
 * Book: http://manning.com/wheeler/
 * Blog: http://springinpractice.com/
 * Code: https://github.com/springinpractice
 */
package com.springinpractice.ch01.dao.csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.core.io.Resource;
import com.springinpractice.ch01.dao.AccountDao;
import com.springinpractice.ch01.model.Account;

public class CsvAccountDao implements AccountDao {

	private Resource csvResource; 
	
	public void setCsvResource(Resource csvFile) {
		this.csvResource = csvFile;
	}
	
	public List<Account> findAll() throws Exception {
		List<Account> results = new ArrayList<Account>();
		
		DateFormat fmt = new SimpleDateFormat("MMddyyyy");		
		BufferedReader br = new BufferedReader(
				new FileReader(csvResource.getFile()));
		String line;
		while ((line = br.readLine()) != null) {
			String[] fields = line.split(",");
			
			String accountNo = fields[0];
			BigDecimal balance = new BigDecimal(fields[1]);
			Date lastPaidOn = fmt.parse(fields[2]);
			Account account = 
				new Account(accountNo, balance, lastPaidOn);			
			results.add(account);
		}
		br.close();
		return results;
	}
}

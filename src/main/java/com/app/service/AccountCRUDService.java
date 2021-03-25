package com.app.service;

import java.util.List;

import com.app.customer.exception.BusinessException;
import com.app.model.Account;

public interface AccountCRUDService {
	
	public int addAccount(Account account) throws BusinessException;
	public boolean approveAccount();
	public int deleteAccount(int account1);
	public List<Account> getAllAccounts();

}

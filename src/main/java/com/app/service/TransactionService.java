package com.app.service;

import java.util.List;

import com.app.customer.exception.BusinessException;
import com.app.model.Transaction;

public interface TransactionService {
	
	public int addTransaction(Transaction transaction) throws BusinessException;
	public List<Transaction> getAllTransactions();

}

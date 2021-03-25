package com.app.service;

import java.util.List;

import com.app.customer.exception.BusinessException;
import com.app.model.Customer;

public interface CustomerCRUDService {
	
	public int createCustomer(Customer customer)throws BusinessException;
	public int updateCustomer(int customerid,int zip) throws BusinessException;
	public int deleteCustomer(int customerid) throws BusinessException;
	public List<Customer> getAllCustomers() throws BusinessException;
}

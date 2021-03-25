package com.app.service;

import java.util.List;

import com.app.customer.exception.BusinessException;
import com.app.model.Customer;

public interface CustomerSearchService {
	
	public Customer getCustomerByCustomerId(int customerid) throws BusinessException;
	public List<Customer> getCustomerByFirstName(String firstName) throws BusinessException;
	public List<Customer> getCustomerByLastName(String lastname) throws BusinessException;
	public List<Customer> getCustomerByZip(int zip) throws BusinessException;
	

}

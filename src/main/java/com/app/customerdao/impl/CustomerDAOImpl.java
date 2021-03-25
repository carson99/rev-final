package com.app.customerdao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.app.customerdao.CustomerDAO;
import com.app.dbutil.PostgresConnection;
import com.app.main.LogMain;
import com.app.model.Customer;

import org.apache.log4j.Logger;
import com.app.service.LogService;


public class CustomerDAOImpl implements CustomerDAO {
	private static Logger log=Logger.getLogger(CustomerDAOImpl.class);
	@Override
	public int addCustomer(Customer customer) {
		int c=0;
		try(Connection connection=PostgresConnection.getConnection()) {
			String sql="insert into bank_schema.customers(customerid ,\"password\" ,firstname,lastname,phone,email,zip,dob) values (?,?,?,?,?,?,?,?)";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1.customers.getCustomerid());
			preparedStatement.setString(2.customers.getPassword());
			preparedStatement.setString(3.customers.getFirstName());
			preparedStatement.setString(4.customers.getLastName());

		} catch (ClassNotFoundException | SQLException e) {
			log.warn(e);
		}
		return 0;
	}

}

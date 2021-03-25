package com.app.model;

public class Account {
	
	private int customerid;
	private int account1;
	private int balance;
	private String pendingTransac;
	private String typePendingTransac;
	private int employeeid;
	
	public Account(int customerid, int account1, int balance, String pendingTransac, String typePendingTransac,
			int employeeid) {
		super();
		this.customerid = customerid;
		this.account1 = account1;
		this.balance = balance;
		this.pendingTransac = pendingTransac;
		this.typePendingTransac = typePendingTransac;
		this.employeeid = employeeid;
	}

}

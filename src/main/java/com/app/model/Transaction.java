package com.app.model;

public class Transaction {
	
	private int transacDate;
	private int transacTime;
	private int ttype;
	private int amount;
	private int resultingBalance;
	private int account1;
	private int tstatus;
	
	
	public Transaction(int transacDate, int transacTime, int ttype, int amount, int resultingbalance, int account1) {
		super();
		this.transacDate = transacDate;
		this.transacTime = transacTime;
		this.ttype = ttype;
		this.amount = amount;
		this.resultingBalance = resultingBalance;
		this.account1 = account1;
		this.tstatus = tstatus;
	}
	
	public int getTransacDate() {
		return transacDate;
	}
	public void setTransacDate(int tdate) {
		this.transacDate = transacDate;
	}
	public int getTransacTime() {
		return transacTime;
	}
	public void setTransacTime(int ttime) {
		this.transacTime = transacTime;
	}
	public int getTtype() {
		return ttype;
	}
	public void setTtype(int ttype) {
		this.ttype = ttype;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getResultingBalance() {
		return resultingBalance;
	}
	public void setResultingBalance(int resultingBalance) {
		this.resultingBalance = resultingBalance;
	}
	public int getAccount1() {
		return account1;
	}
	public void setAccount1(int account1) {
		this.account1 = account1;
	}
	public int getTstatus() {
		return tstatus;
	}
	public void setTstatus(int tstatus) {
		this.tstatus = tstatus;
	}
}

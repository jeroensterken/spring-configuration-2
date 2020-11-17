package com.example.account;

public class Account  {

	private Long id;
	private String accountNumber;
	private String name;
	private Long balance = 100L;

	public Account() {
	}

	public Account(Long id, String accountNumber, String name, Long balance) {
		this.id = id;
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account{" +
				"id=" + id +
				", number='" + accountNumber + '\'' +
				", name='" + name + '\'' +
				'}';
	}

	public void deposit(Long amount) {
		this.balance += amount;
	}

	public void withdraw(Long amount) {
		this.balance -= amount;
	}

	public Long getBalance() {
		return balance;
	}

	public void setBalance(Long balance) {
		this.balance = balance;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

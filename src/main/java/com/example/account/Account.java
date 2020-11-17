package com.example.account;

public class Account  {

	private Long id;
	private String accountNumber;
	private String name;

	public Account() {
	}

	public Account(Long id, String accountNumber, String name) {
		this.id = id;
		this.accountNumber = accountNumber;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Account{" +
				"id=" + id +
				", number='" + accountNumber + '\'' +
				", name='" + name + '\'' +
				'}';
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

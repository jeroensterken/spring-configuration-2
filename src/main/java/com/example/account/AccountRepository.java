package com.example.account;


public interface AccountRepository {

	public Account findByCreditCard(String creditCardNumber);

	public void updateAccount(Account account);

}

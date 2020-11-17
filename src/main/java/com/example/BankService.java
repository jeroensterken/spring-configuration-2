package com.example;

import com.Confirmation;
import com.example.account.Account;

public interface BankService {

	public Confirmation transferMoney(Account from, Account to, Long amount);

}

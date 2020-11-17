package com.example;

import com.Confirmation;
import com.example.account.Account;

public interface BankService {

	public Confirmation transferMoney(String accountFrom, String accountTo, Long amount);

}

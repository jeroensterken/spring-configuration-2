package com.example;

import com.Confirmation;
import com.example.account.Account;

public interface RewardNetwork {

	public Confirmation transferMoney(Account from, Account to, Long amount);

}

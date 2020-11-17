package com.example;

import com.Confirmation;
import com.example.account.Account;
import com.example.account.AccountRepository;
import com.example.person.PersonRepository;
import com.example.profile.ProfileRepository;

public class BankServiceImpl implements BankService {

	private AccountRepository accountRepository;
	private PersonRepository personRepository;
	private ProfileRepository profileRepository;

	public BankServiceImpl(AccountRepository accountRepository, PersonRepository personRepository, ProfileRepository profileRepository) {
		this.accountRepository = accountRepository;
		this.personRepository = personRepository;
		this.profileRepository = profileRepository;
	}

	public Confirmation transferMoney(String accountFrom, String accountTo, Long amount) {
		// TODO-01: transfer money from account 'accountFrom', to account 'accountTo' per the sequence diagram

		// TODO-02: Return a confirmation
		return null;
	}
}

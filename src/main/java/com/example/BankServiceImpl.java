package com.example;

import com.Confirmation;
import com.example.account.Account;
import com.example.account.AccountRepository;
import com.example.person.Person;
import com.example.person.PersonRepository;
import com.example.profile.Profile;
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

	public Confirmation transferMoney(String accountFromNumber, String accountToNumber, Long amount) {
		// TODO-01: transfer money from account 'accountFrom', to account 'accountTo' per the sequence diagram
		Account accFrom = accountRepository.findByCreditCard(accountFromNumber);
		Account accTo = accountRepository.findByCreditCard(accountToNumber);

		accFrom.withdraw(amount);
		accountRepository.updateAccount(accFrom);

		accTo.deposit(amount);
		accountRepository.updateAccount(accTo);

		Person personTo = personRepository.findByLastName(accTo.getName());
		Profile profileTo = profileRepository.findByPerson(personTo.getId());
		boolean loyal = profileTo.isLoyal();

		// TODO-02: Return a confirmation with confirmationNumber 1234 & message = profileTo.isLoyal
		return new Confirmation("1234", loyal+"");
	}
}

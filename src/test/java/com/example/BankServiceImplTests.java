package com.example;

import com.example.account.Account;
import com.example.person.PersonRepository;
import com.example.profile.ProfileRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import com.Confirmation;
import com.example.account.AccountRepository;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BankServiceImplTests {

	private BankServiceImpl bankService;

	@BeforeEach
	public void setUp() throws Exception {
		AccountRepository accountRepo = new StubAccountRepository();
		PersonRepository personRepo = new StubPersonRepository();
		ProfileRepository profileRepo = new StubProfileRepository();

		bankService = new BankServiceImpl(accountRepo, personRepo, profileRepo);
	}

	@Test
	public void testTransferMoney() {
		String accFrom = "123456789";
		String accTo = "987654321";

		Confirmation confirmation = bankService.transferMoney(accFrom, accTo, 100L);

		assertNotNull(confirmation);
		assertNotNull(confirmation.getConfirmationNumber());
		assertNotNull(confirmation.getMessage());
	}
}

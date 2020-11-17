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

	// TODO-03: Test RewardNetworkImpl class
	// - Remove the @Disabled annotation below.
	// - Run this JUnit test. Verify it passes.
	@Test
	@Disabled
	public void testRewardForDining() { //Long id, String number, String name
		Account from = new Account(1L, "123498764567", "doctor who");
		Account to = new Account(1L, "123498764567", "iron man");

		Confirmation confirmation = bankService.transferMoney(from, to, 100L);

		assertNotNull(confirmation);
		assertNotNull(confirmation.getConfirmationNumber());
	}
}

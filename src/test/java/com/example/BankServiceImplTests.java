package com.example;

import com.example.account.StubAccountRepository;
import com.example.person.PersonRepository;
import com.example.person.StubPersonRepository;
import com.example.profile.ProfileRepository;
import com.example.profile.StubProfileRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.Confirmation;
import com.example.account.AccountRepository;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * TODO-04:
 *  In the setUp() method, create an application context using the 'ApplicationConfig' configuration class
 */

/**
 * TODO-05:
 *   Next get the 'bankService' bean out of the Spring Application Context and assign it to the existing private field 'bankService'
 */

/**
 * TODO-06:
 *  Run the test, it should pass. But now we have Spring instantiate & link the different objects together
 */
public class BankServiceImplTests {

	private BankService bankService;

	@BeforeEach
	public void setUp() throws Exception {

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

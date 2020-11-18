package com.example;

import com.example.config.ApplicationConfig;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.Confirmation;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BankServiceImplTests {

	private BankService bankService;

	@BeforeEach
	public void setUp() throws Exception {
		ConfigurableApplicationContext ctx = SpringApplication.run(ApplicationConfig.class);
		bankService = ctx.getBean(BankService.class);
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

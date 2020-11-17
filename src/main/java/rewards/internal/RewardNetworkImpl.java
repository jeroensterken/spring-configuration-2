package rewards.internal;

import rewards.Confirmation;
import rewards.internal.account.Account;
import rewards.internal.account.AccountRepository;
import rewards.internal.person.PersonRepository;
import rewards.internal.profile.ProfileRepository;

public class RewardNetworkImpl implements RewardNetwork {

	private AccountRepository accountRepository;

	private PersonRepository personRepository;

	private ProfileRepository profileRepository;

	public RewardNetworkImpl(AccountRepository accountRepository, PersonRepository personRepository, ProfileRepository profileRepository) {
		this.accountRepository = accountRepository;
		this.personRepository = personRepository;
		this.profileRepository = profileRepository;
	}

	public Confirmation transferMoney(Account from, Account to, Long amount) {
		// TODO-01: Reward an account per the sequence diagram
		// TODO-02: Return the corresponding reward confirmation
		return null;
	}
}

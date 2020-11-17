package rewards.internal;

import rewards.Confirmation;
import rewards.internal.account.Account;

public interface RewardNetwork {

	public Confirmation transferMoney(Account from, Account to, Long amount);

}

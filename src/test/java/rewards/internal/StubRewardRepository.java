package rewards.internal;

import java.util.Random;

import rewards.Dining;
import rewards.Confirmation;

/**
 * A dummy reward repository implementation.
 */
public class StubRewardRepository implements RewardRepository {

	public Confirmation confirmReward(AccountContribution contribution, Dining dining) {
		return new Confirmation(confirmationNumber(), contribution);
	}

	private String confirmationNumber() {
		return new Random().toString();
	}
}

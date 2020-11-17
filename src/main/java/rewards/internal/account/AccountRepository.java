package rewards.internal.account;


public interface AccountRepository {

	public Account findByCreditCard(String creditCardNumber);

	public void updateAccount(Account account);

}

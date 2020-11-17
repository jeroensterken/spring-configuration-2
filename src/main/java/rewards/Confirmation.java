package rewards;

public class Confirmation {

	private String confirmationNumber;
	private String message;

	public Confirmation(String confirmationNumber, String message) {
		this.confirmationNumber = confirmationNumber;
		this.message = message;
	}

	public String getConfirmationNumber() {
		return confirmationNumber;
	}

	public void setConfirmationNumber(String confirmationNumber) {
		this.confirmationNumber = confirmationNumber;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}

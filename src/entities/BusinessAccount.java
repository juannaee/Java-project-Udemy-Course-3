package entities;

public class BusinessAccount extends Account {

	private Double loanLimit;
	private Double loanRate = 10.00 / 100;

	public BusinessAccount() {
		super();

	}

	public BusinessAccount(Double loanLimit, Integer number, String holder, Double balance) {
		super(number, holder, balance);

		this.loanLimit = loanLimit;

	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	public void loan(Double amount) {
		double aux = 0.0;
		if (amount <= loanLimit) {

			aux = balance * loanRate;

			balance += amount - aux;
		} else {

		}
	}

}

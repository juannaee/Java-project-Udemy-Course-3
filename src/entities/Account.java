package entities;

public class Account {
	private Integer number;
	private String holder;
	protected Double balance;

	public Account() {

	}

	public Account(Integer number, String holder, Double balance) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Boolean testWithdraw(Double amount) {
		if (amount > this.balance) {
			return true;
		} else {
			return false;
			
		}
	}

	public void withdraw(Double amount) {
		if (testWithdraw(amount) == true) {
			System.out.println("You do not have enough credit to withdraw this amount");

		} else {
			this.balance -= amount;
		}

	}

	public void deposit(Double amount) {

		this.balance += amount;

	}
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Balance: " + balance);
		
		return sb.toString();
	}

}

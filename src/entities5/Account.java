package entities5;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	
	
	public Account (Integer number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	public Account (Integer number, String holder, Double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}
	
	public Integer getNumber() {
		return number;
	}
	
	public String getHolder() {
		return holder;
	}
	
	public Double getBalance() {
		return balance;
	}
	
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public void deposit(Double amount) {
		balance += amount;
	}
	
	public void withdraw (Double amount) {
		balance -= amount + 5;
	}
	public String toString() {
		return "Account "
				+ number
				+ ", Holder: "
				+ holder
				+", Balance: $ "
				+ String.format("%.2f%n", balance);
	}
	
}

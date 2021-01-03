package entities;

public class Data {
	private int accountNumber;
	private String name;
	private double bankBalance;
	
	public Data(int accountNumber, String name, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.name = name;
		deposit(initialDeposit);
	}
	
	public Data(int accountNumber, String name) {
		this.accountNumber = accountNumber;
		this.name = name;
	}

	public int getAccountNumber() {
		return accountNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public String setName(String name) {
		return this.name = name;
	}
	
	public void deposit(double valueDeposit) { 
		 bankBalance += valueDeposit;
	}
	
	public void withdraw (double valueWithdraw) {
		bankBalance -= valueWithdraw + 5.0;
	}
	
	public String toString() {
		return "Account " 
				+ accountNumber 
				+ ", Holder: " 
				+ name 
				+ ", Balance: $ "
				+ String.format("%.2f", bankBalance);
	}
}

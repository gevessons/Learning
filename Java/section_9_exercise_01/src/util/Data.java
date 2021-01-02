package util;

public class Data {
	private int accountNumber;
	private String name;
	private double bankBalance;
	
	public Data() {
	}
	
	public Data(int accountNumber, String name, double valueDeposit) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.bankBalance = valueDeposit;
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
		 this.bankBalance += valueDeposit;
	}
	
	public void withdraw (double valueWithdraw) {
		this.bankBalance -= valueWithdraw + 5.0;
	}
	
	public String toString() {
		return "Account " 
				+ accountNumber 
				+ ", Holder: " 
				+ name 
				+ ", Balance "
				+ String.format("%.2f", bankBalance);
	}
}

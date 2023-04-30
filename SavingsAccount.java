
public class SavingsAccount extends BankAccount {

	private double rate = 2.5;
	private static int savingsNumber = 0;
	private String accountNumber;
	
	public SavingsAccount(String name, double amount) {
		super(name, amount);
		this.accountNumber = super.getAccountNumber() + "-" + savingsNumber++;
	}
	
	public SavingsAccount(SavingsAccount s, double amount) {
		super(s, amount);
		this.accountNumber = super.getAccountNumber() + "-" + savingsNumber++;
	}
	
	public void postInterest() {
		double percentRate = rate / 100.0;
		double temp = percentRate / 12.0;
		temp *= super.getBalance();
		
		deposit(temp);
	}
	
	@Override
	public String getAccountNumber() {
		return this.accountNumber;
	}
	
}

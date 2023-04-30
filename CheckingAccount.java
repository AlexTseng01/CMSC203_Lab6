
public class CheckingAccount extends BankAccount {

	final static double FEE = 0.15;
	
	public CheckingAccount(String name, double amount) {
		super(name, amount);
		setAccountNumber(super.getAccountNumber() + "-10");
	}
	
	@Override
	public boolean withdraw(double amount) {
		double temp = amount + FEE;
		return super.withdraw(temp);
	}
	
}

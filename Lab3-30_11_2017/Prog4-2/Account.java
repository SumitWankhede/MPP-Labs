package prog4_2;

class Account {
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private AccountType acctType;
	private Employee employee;
	
	
	Account(Employee emp, AccountType acctType, double balance) {
		employee = emp;
		this.acctType = acctType;
		this.balance = balance;
	}

	Account(Employee emp, AccountType acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}

	public String toString() {
		return "Account type : " + acctType + "\n" + "Current bal: " + balance;
	}

	public void makeDeposit(double deposit) {
		if(deposit > 0)
			balance += deposit;
	}

	public boolean makeWithdrawal(double amount) {
		if(amount > balance)
			return false;
		else if(amount < 1)
			return false;
		balance -= amount;
		return true;
	}

	public double getBalance() {
		return balance;
	}

	public AccountType getAcctType() {
		return acctType;
	}
	
	public double computeInterest() {
		
		switch(acctType) {
			case CHECKING:
				return balance * 0.02;
			case SAVINGS:
				return balance * 0.04;
			case RETIREMENT:
				return balance * 0.05;
		}
		return 0;
	}
}

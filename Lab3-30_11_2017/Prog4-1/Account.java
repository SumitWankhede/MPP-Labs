package Lab3;

class Account {
	public final static String CHECKING = "checking";
	public final static String SAVINGS = "savings";
	public final static String RETIREMENT = "retirement";
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private String acctType;
	private Employee employee;

	Account(Employee emp, String acctType, double balance) {
		employee = emp;
		this.acctType = acctType;
		this.balance = balance;
	}

	Account(Employee emp, String acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}

	public String toString() {
		return "type = " + acctType + ", balance = " + balance;
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

	public String getAcctType() {
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

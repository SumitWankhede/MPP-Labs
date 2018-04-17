package prog4_2;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {

	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	private String name;
	private Date hireDate;

	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
		this.name = name;
		GregorianCalendar cal = new GregorianCalendar(yearOfHire, monthOfHire - 1, dayOfHire);
		hireDate = cal.getTime();
	}

	public String getName() {
		return name;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void createNewChecking(double startAmount) {
		// implement
		checkingAcct = new Account(this, AccountType.CHECKING, startAmount);
	}

	public void createNewSavings(double startAmount) {
		// implement
		savingsAcct = new Account(this, AccountType.SAVINGS, startAmount);
	}

	public void createNewRetirement(double startAmount) {
		// implement
		retirementAcct = new Account(this, AccountType.RETIREMENT, startAmount);
	}

	public void deposit(AccountType acctType, double amt) {
		// implement
		switch (acctType) {
		case CHECKING:
			checkingAcct.makeDeposit(amt);
			break;
		case SAVINGS:
			savingsAcct.makeDeposit(amt);
			break;
		case RETIREMENT:
			retirementAcct.makeDeposit(amt);
			break;
		default:
			break;
		}
	}

	public boolean withdraw(AccountType acctType, double amt) {
		// implement
		switch (acctType) {
			case CHECKING:
				return checkingAcct.makeWithdrawal(amt);
			case SAVINGS:
				return savingsAcct.makeWithdrawal(amt);
			case RETIREMENT:
				return retirementAcct.makeWithdrawal(amt);
			default:
				break;
		}
		return false;
	}

	public String getFormattedAcctInfo() {
		// implement
		String output;
		output = "ACCOUNT INFO FOR " + name + ":" + "\n\n";
		
		if(checkingAcct != null) {
			output += checkingAcct.toString() + "\n";
		}
		if(savingsAcct != null) {
			output += savingsAcct.toString() + "\n";
		}
		
		if(retirementAcct != null) {
			output += retirementAcct.toString() + "\n";
		}
		return output;
	}

}

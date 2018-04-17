package prog4_2;

public class CheckingAccount extends Account {

	public CheckingAccount(Employee emp, String acctType, double balance) {
		super(emp, acctType, balance);
		// TODO Auto-generated constructor stub
	}

	public CheckingAccount(Employee emp, String acctType) {
		super(emp, acctType);
		// TODO Auto-generated constructor stub
	}
	
	public String getAcctType() {
		return "CHECKING";
	}
	
}

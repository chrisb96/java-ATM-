import java.util.Date;
public class Account {
	private int _id;
	private double _balance;
	private double _annualInterestRate;
	private Date _dateCreated; //= new java.util.Date(); 
	//private int numAccounts = 0;
	 
	public Account() {
		
		_id = 0; //or numAccoutns but i took it out
		//numAccounts += 1;
		_balance = 0; 
		_dateCreated = new java.util.Date();
		_annualInterestRate = 0;
	}
	
	public Account(int id, double balance) {
		_id = id;
		_balance = balance;
		_dateCreated = new java.util.Date();
		_annualInterestRate = 0;
	}
	
	public int getID() {
		return _id;
	}
	
	public double getBalance() {
		return _balance;
	}
	
	public double getAnnualRate() {
		return _annualInterestRate;
	}
	
	public void setID(int id){
		_id = id;
	}
	
	public void setBalance(double balance) {
		_balance = balance; 
	}
	
	public void setAnnualRate(double rate) {
        _annualInterestRate = rate;
	}
	
	public String getDateMade() {
		return _dateCreated.toString();
	}
	
	public double getMonthlyInterestRate() {
		return _annualInterestRate/12;
	}
	
	public double getMonthlyInterest() {
		return _balance * _annualInterestRate;
	}
	
	public void withdraw(double amt) {
		 _balance = _balance - amt;
	}
	
	public void deposit(double amt) {
		_balance = _balance + amt;
	}
	
	
}

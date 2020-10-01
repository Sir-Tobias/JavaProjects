////////////////////////////////////////////////////////////           
// Title:       (Algorithms and Data Structures 1)
// Semester      Semester 1 2019
//
// Author:      (Tobias Mbanusi)
// Class:        (DT354 Year 2)
////////////////////////////////////////////////////////////

public class BankAccount {
	private String customerName;
	private double balance;
	private int accountNumber;

	//Constructor
	public BankAccount(){
		this.customerName = "";
		this.balance = 0;
		this.accountNumber = 0;
	
	}
	public BankAccount(String cn, double b, int ac){
		
		this.customerName = cn;
		this.balance = b;
		this.accountNumber = ac;
		
	}
	//Getter methods
	public String getCustomerName(){
		return this.customerName;
	}
	public double getBalance(){
		return this.balance;
	}
	public int getAccountNumber(){
		return this.accountNumber;
	}
	//Setter methods
	public void setCustomerName(String cn){
	    this.customerName = cn;
	}
	public void setBalance(double b){
		this.balance = b;
	}
	public void setAccountNumber(int ac){
		this.accountNumber = ac;
	}
	public void deposit (double money){
		balance = money + balance;
	}
	
	
	public void withdraw (double money){
		balance = balance - money;
	}
	
	public String toString()
	{
		return "Customer name : " + this.customerName + "  Balance : " + this.balance;
	}
}

/*ID: 21CE114
Name: Harsh Rana
Git Repository Link: https://github.com/21ce114/JAVA-Practicals.git
AIM : (Subclasses of Account) In Programming Exercise 2, the Account class was defined 
      to model a bank account. An account has the properties account number, balance, 
      annual interest rate, and date created, and methods to deposit and withdraw funds.
      Create two subclasses for checking and saving accounts. A checking account has an 
      overdraft limit, but a savings account cannot be overdrawn. Draw the UML diagram 
      for the classes and then implement them. Write a test program that creates objects
      of Account, SavingsAccount, and CheckingAccount and invokes their toString() 
      methods. */

class Account{
	private int id;
	private double balance;
	private double annualInterestRate;
	private String datecreated;
	Account(){
		id=0;
		balance=500;
		annualInterestRate=7;
		datecreated = "20/10/2003";
	}
	Account(int a,double b){
		id=a;
		balance=b;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public String getDatecreated() {
		return datecreated;
	}
	
	public void setDatecreated(String datecreated) {
		this.datecreated = datecreated;
	}

	public double getMonthlyInterestRate() {
		return (annualInterestRate/100)/12;
	}
	public double getMonthlyInterest() {
		return balance*getMonthlyInterestRate();
	}
	public void withdraw(double wd){
		balance = balance-wd;
	}
	public void deposit(double de){
		balance = balance+de;
	}
	public String toString() {
		return "Account ID:"+getId()+"  Account balance"+ getBalance();
	}
	
}

class CheckingAccount extends Account {
	
    private double overdraftLimit;

    public CheckingAccount() {
    	super();
    	overdraftLimit = -50;
    }	

    public CheckingAccount(int id, double balance, double overdraftLimit) {
    	super(id, balance);
    	this.overdraftLimit = overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
    	this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
    	return overdraftLimit;
    }

    public void withdraw(double amount) {
    	if (getBalance() - amount > overdraftLimit) {
		setBalance(getBalance() - amount);
    	}
    	else
    		System.out.println("Amount exceeds overdraft limit.!!");
    }

    public String toString() {
    	return "Checking Account ID: "+getId()+" Checking Account Balance: "+getBalance()+"\nOverdraft limit: " +String.format("%.2f", overdraftLimit);
    }
}

class SavingsAccount extends Account {

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(int id, double balance) {
		super(id, balance);
	}

	public void withdraw(double amount) {
		if (amount < getBalance()) {
			setBalance(getBalance() - amount);
		}
		else
			System.out.println("Savings account cannot be overdrawn!!");
	}
	public String toString() {
		return "Savings Account ID: "+getId()+"  Savings Account balance: "+ getBalance();
	}
}


public class Part2_4 {

	public static void main(String[] args) {
		
		Account account = new Account(114, 500);
		SavingsAccount savings = new SavingsAccount(115, 300);
		CheckingAccount checking = new CheckingAccount(116, 100, -50);
		
		
		account.withdraw(100);
		savings.withdraw(500);
		checking.withdraw(160);

		System.out.println(account);
		System.out.println(savings);
		System.out.println(checking);
	}
		
}



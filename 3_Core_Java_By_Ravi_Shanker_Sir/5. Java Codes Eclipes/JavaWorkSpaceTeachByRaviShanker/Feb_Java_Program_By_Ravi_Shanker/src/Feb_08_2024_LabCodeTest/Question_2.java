package Feb_08_2024_LabCodeTest;


class Account{
	String accountNumbe;
	double balance;
	
	public Account(String accountNumbe, double balance) {
		super();
		this.accountNumbe = accountNumbe;
		this.balance = balance;
	}
	
	public String getAccountNumbe() {
		return accountNumbe;
	}	
	
	public Account generateStatement() {
		System.out.println("current balance"+balance);
		return new Account(null, 0);
	}
}

class ShavingAccount extends Account{
	double interestRat;

	public ShavingAccount(String accountNumbe, double balance, double interestRat) {
		super(accountNumbe, balance);
		this.interestRat = interestRat;
	}
	@Override
	public Account generateStatement() {
		System.out.println("current balance"+balance);
		return new ShavingAccount("112", 25, 25);
	}
	@Override
	public String toString() {
		return "ShavingAccount [interestRat=" + interestRat + ", accountNumbe=" + accountNumbe + ", balance=" + balance
				+ ", generateStatement()=" + "]";
	}
	
	
}


public class Question_2 {
	public static void main(String[] args) {
		Account a1 ;
		a1 = new ShavingAccount("12",12 , 10);
		System.out.println(a1);
	}
}
//Scenario: Banking Account Management System Point 15
//
//
//
//Base Class - Account:
//
//
//
//Create a class named Account with the following attributes:
//
//accountNumber (String): Represents the account number.
//
//balance (double): Represents the current balance.
//
//Implement a parameterized constructor to initialize the attributes.
//
//Include getter methods for accountNumber and balance.
//
//
//
//Implement methods:
//
//generateStatement() : The generateStatement() method in the Account class serves as a generic statement generator for all types of accounts. It prints a message with the account number and current balance. The covariant return type is used to return an Account object. 
//
//
//
//Subclass - SavingsAccount:
//
//
//
//Create a subclass named SavingsAccount that extends the Account class.
//
//Add an additional attribute:
//
//interestRate (double): Represents the interest rate for the savings account.
//
//Implement a parameterized constructor to initialize the attributes of both the Account class and the SavingsAccount class.
//
//
//
//Override the generateStatement(): In the SavingsAccount subclass, the generateStatement() method is overridden to prints the account number, current balance, and the interest rate for the savings account. It utilizes the covariant return type to return a SavingsAccount object.
//
//
//
//Subclass - CheckingAccount:
//
//
//
//Create a subclass named CheckingAccount that extends the Account class.
//
//Add an additional attribute:
//
//overdraftLimit (double): Represents the overdraft limit for the checking account.
//
//Implement a parameterized constructor to initialize the attributes of both the Account class and the CheckingAccount class.
//
//
//
//Override the generateStatement(): Similarly, in the CheckingAccount subclass, the generateStatement() method is overridden to prints the account number, current balance, and the overdraft limit for the checking account. It also utilizes the covariant return type to return a CheckingAccount object.
//
//
//
//ELC - BankManagementSystem:
//
//
//
//Create an ELC named BankManagementSystem that:
//
//Instantiates a SavingsAccount object with sample data.
//
//Invokes methods on the SavingsAccount object to demonstrate the generation of a savings account statement.
//
//Instantiates a CheckingAccount object with sample data.
//
//Invokes methods on the CheckingAccount object to demonstrate the generation of a checking account statement.
//
//
//
//

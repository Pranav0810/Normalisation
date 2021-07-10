import java.lang.Math;
import java.util.*;

class Account{
	private 	int bankAccountNumber; //data member
	private String bankAccountHolder; //data member
	private int bankAccountBalance; //data member
	private String password;
	
	Account()
	{}

	Account(int acno,String name, int balance, String pass)
	{
		 bankAccountNumber=acno;
		 bankAccountHolder=name;
		 bankAccountBalance=balance;
		 password=pass;
	}

	public int getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(int bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	public String getBankAccountHolder() {
		return bankAccountHolder;
	}

	public void setBankAccountHolder(String bankAccountHolder) {
		this.bankAccountHolder = bankAccountHolder;
	}

	public double getBankAccountBalance() {
		return bankAccountBalance;
	}

	public void setBankAccountBalance(int bankAccountBalance) {
		this.bankAccountBalance = bankAccountBalance;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	void show()
	{
		System.out.println("Displaying the details ");
		System.out.println("Account number " + bankAccountNumber);
		System.out.println("Accountholder name is "+  bankAccountHolder);
		System.out.println("Account Balance is "+ bankAccountBalance);
		System.out.println("Password :"+ password);
		
	}
	
}

public class Assignment5 {
	public static void main(String args[])
	{
		System.out.println("This is Assignment 5");
	    int acno;
	    String name;
	    int balance;
	    String password;
	    
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the account number");
	    acno=sc.nextInt();
	    System.out.println("Enter your name");
	    name=sc.next();
	    System.out.println("Enter your balance ");
	    balance=sc.nextInt();
	    System.out.println("Enter your Password");
	    password=sc.next();
	    
	    
	    Account a=new Account(acno,name,balance,password);
	    a.show();
	}
				
}






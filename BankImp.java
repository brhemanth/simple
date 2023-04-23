package com;

public class BankImp implements Bank{
	int balance;
	public BankImp(int balance) {
		this.balance=balance;
	}
	@Override
	public void deposit(int amount)
	{
		balance+=amount;    //balance=balance+amount;
		System.out.println("Depositing Rs."+amount);
		System.out.println("Amount Deposited Sucessfully");
	}
	@Override
	public void withdraw(int amount) 
	{
		if(amount<=balance) {
		System.out.println("Withdrawing Rs."+amount);
		balance -= amount;   //balance=balance-amount;
		System.out.println("Amount Withdraw Sucessfully");
		}
		else {
			try {
			throw new InsufficientBalance("Insufficient Balance");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	@Override
	public int checkBalance() {
		return balance;
		
	}

}

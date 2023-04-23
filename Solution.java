package com;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		System.out.println("Welcome");
		Scanner S=new Scanner(System.in);
		
		while(true) 
		{
			System.out.println("1:Deposit Amount\n2:Withdrawing Amount\n3:Check Balance\n4:EXIT\nEnter choice");
			
			int choice=S.nextInt();
			if(choice>=1 && choice<=5) 
			{
			
			}
			else 
			{
				try {
					throw new InvalidChoice("Please enter valid choice");
				}
				catch(Exception e) {
					System.out.println("enter valid choice");
				}
			}
			Bank b=new BankImp(5000);


			switch(choice)
			{
			case 1:
				System.out.println("Enter the amount to be Deposit");
				int Depositamount=S.nextInt();
				b.deposit(Depositamount);// b.deposit(S.nextInt));

				break;
			case 2:
				System.out.println("Enter the amount to be withdrawn");
				int WithDrawingamount=S.nextInt();
				b.withdraw(WithDrawingamount);//b.withdrawing(S.nextInt());
				break;
			case 3:
				System.out.println("Available Balance"+b.checkBalance());
				break;
			case 4:
				System.out.println("Thank you ! Visit again");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid amount");

			}
		}

	}

}

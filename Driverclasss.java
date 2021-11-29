package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.model.Custmore;
import com.greatlearning.service.Banking;

public class Driverclasss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Custmore custmore1 = new Custmore("hdfc123456","motu123456");
		Scanner scan1 = new Scanner(System.in);
		
		Banking banking =new Banking();
		String bankAcctNo;
		String pswd;
		
		
		System.out.println("Enter your Bank Account Number");
		
		bankAcctNo = scan1.next();
		System.out.println("Enter your Password");
		pswd = scan1.next();
		
		if(custmore1.getBankAccountNo().equals(bankAcctNo) && custmore1.getPassword().equals(pswd))
		{
			System.out.println("Welcome to the HDFC Bank Jaipur");
			int choice;
			do
			{
			System.out.println("--------Main Menu----------");
			System.out.println("1.Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Transfer Fund");
			System.out.println("0. Exit");
			System.out.println("Please Enter your Choice");
			choice =scan1.nextInt();
			
			   switch(choice) 
			   {
			         case 0:
			        {
				     choice = 0;
				     System.out.println("-----Existing Menu------ ");
				     break;
			        }
			   
			         case 1:
			        {
			         banking.deposit();
			         break;
			        }
			         case 2:
			        {
				  banking.withdraw();
			      break;
			        }
			         case 3:
			        {
				  banking.transferfund();
				  break;
			        }
			  
			        default:
			  
			        {
				    System.out.println("Sorry Invalid Choice");
				    break;
			        }
			   }
				  
			  
			
			System.out.println("-------END MAIN MENU------------");
		    }while(choice != 0); 
			System.out.println("Exited Menu Successfully..");
		  
		}
		else;
	    {
			 System.out.println("Sorry Invalid Account details...");
		}
}
		
}		

	
		


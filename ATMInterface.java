package Rahul;
import java.util.Scanner;  
		  public class ATMInterface  
		{  
		       
		    public static void main(String args[] )  
		    {  
		      
		        int balance = 10000, withdraw, deposit;  
		          
		         
		        Scanner sc = new Scanner(System.in);  
		          
		        while(true)  
		        {  
		            System.out.println("Welcome To SBI ATM");  
		            System.out.println("1 Press To Withdraw Cash");  
		            System.out.println("2 Press To Deposit Cash");  
		            System.out.println("3 Press To Check Bank Balance");  
		            System.out.println("4 Press To EXIT");  
		            System.out.print("Press Number the operation you want to perform:");  
		              
		            
		            int choice = sc.nextInt();  
		            switch(choice)  
		            {  
		                case 1:  
		        System.out.print("Enter The Amount");  
		                      
		       
		        withdraw = sc.nextInt();  
		                      
		      
		        if(balance >= withdraw)  
		        {  
		              
		            balance = balance - withdraw;  
		            System.out.println("Please collect your money");  
		        }  
		        else  
		        {  
		              
		            System.out.println("Insufficient Balance");  
		        }  
		        System.out.println("");  
		        break;  
		   
		                case 2:  
		                      
		        System.out.print("Enter the amount in deposit");  
		                      
		         
		        deposit = sc.nextInt();  
		                      
		          
		        balance = balance + deposit;  
		        System.out.println("Your amount has been successfully depsited");  
		        System.out.println("");  
		        break;  
		   
		                case 3:  
		          
		        System.out.println("Balance : "+balance);  
		        System.out.println("");  
		        break;  
		   
		                case 4:  
		         
		        System.exit(0);  
		            }  
		        }  
		    }  
	 
	}


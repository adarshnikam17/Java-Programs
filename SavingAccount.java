import java.util.*;
class BankAccount
{
 int D_amount,W_amount;
Scanner sc=new Scanner(System.in);
  void deposit()
  {

	System.out.println("Enter amount you want to deposit ");
	D_amount=sc.nextInt();
	
	System.out.println("Amount has been deposit");
  }
 void withdraw()
  {
	
	
	
	   System.out.println("your amount is withdraw");

	   D_amount=D_amount-W_amount;
	  
    	   System.out.println("Now your current balance is :"+D_amount);
	    	    	    
	}
 	
  
}
class SavingAccount extends BankAccount
{
Scanner sc=new Scanner(System.in);


void withdraw()
{
		System.out.println("how much amount you want withdraw ");
		W_amount=sc.nextInt();

	if(D_amount<=100)
	{
	    System.out.println("your saving account amount is : "+D_amount+"  So you can't withdraw amount less than 100 ");
	}
	else if(D_amount<W_amount)
	{
  		
	   System.out.println("enter amount greater than "+D_amount);
  	}
	else
	{
	    super.withdraw();
	    	    	    
	}
}
   

 public static void main(String args[])
  {
	SavingAccount s=new SavingAccount();
	s.deposit();
	s.withdraw();
  }
}

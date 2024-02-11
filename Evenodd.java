import java.lang.*;
import java.util.*;

class Evenodd
{ 
  
 public static void main(String args[])
  {
	Scanner sc=new Scanner(System.in);
	int num;
	System.out.print("enter number :");
	num=sc.nextInt();
	
	if(num%2==0)
	  {
		System.out.print(num+" number is even");
	  }
	else
	  {
		System.out.print(num+" number is odd");
	  }

  }
}

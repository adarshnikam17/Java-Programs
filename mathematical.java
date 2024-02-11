package math;
import java.util.*;

public class mathematical
{
  Scanner sc=new Scanner(System.in);
  
 
  int fact=1,i;

  public void cube()
  {
   System.out.print("Enter number as per your choice to find cube :");
  int num=sc.nextInt(); 
  System.out.println("Cube of  "+num+" is  :"+(num*num*num));
  }
  
  public void factorial()
  {
 System.out.print("Enter number as per your choice to find factorial :");
  int num=sc.nextInt();
for( i=1;i<=num;i++)
{
	fact=fact*i;	
     }
     
     System.out.println("factorial of  "+num+" is  :"+fact);
  }
 
 
}

package Factorial;
import java.util.*;

public class Fact
{
Scanner sc=new Scanner(System.in);
	int num,result=1,i=1;
	
   public int fact(int num)
   {
	this.num=num;
   
	if(num>=1)
	{
	return  result=num*fact(num-1);
	
	}
	else
	{ 
 	   return 1;
	}
    }
   
}

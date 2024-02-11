class cmd_prime
{
  public static void main(String args[])
  {
    int num=Integer.parseInt(args[0]);
    int i,count=0;
boolean flag=false;
    for (i = 2; i <= num / 2; ++i) {
      // condition for nonprime number
      if (num % i == 0) {
        flag = true;
        break;
      }
    }

    if (!flag)
      System.out.println(num + " is a prime number.");
    else
      System.out.println(num + " is not a prime number.");
  
/* for(i=1;i<=num/2;i++)
    {
	if(num%i==0)
	 {
	   count=1;
	   break;
  	 }
    }
    if(count==0)
    {
	System.out.print(num+" is prime number");
    }
    else
    {
	System.out.print(num+"is not prime number");
    }*/
  }
}

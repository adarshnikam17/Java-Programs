class cmd_fact
{
  public static void main(String args[])
   {
    int num,i=1,fact=1;
     num=Integer.parseInt(args[0])+Integer.parseInt(args[0]);
    
    while(i<=num)
     {
	fact=fact*i;
	i++;
     }
   System.out.print("factorial of "+num+" is :"+fact);
   }
}


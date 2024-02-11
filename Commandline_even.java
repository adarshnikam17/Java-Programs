class Commandline_even
{
   public static void main(String args[])
    {
	int num;
	num =Integer.parseInt(args[0]);
	
	System.out.println("Display number : "+num);
	
	if(num%2!=0)
	  {
		System.out.print(num+" is odd number");
	  }
	else
	  {
		System.out.print(num+" is even number");
	  }
    }	
}

import java.util.*;
class   merge
{
 public static void main(String args[])
  {
Scanner sc=new Scanner(System.in);
   int a[]=new int[2];
   int b[]=new int[2];
int i,j;
System.out.print("Enter 1st array  elements :\n");
   for(i=0;i<a.length;i++)
   {
	a[i]=sc.nextInt();
     }
   

	System.out.print("Enter 2nd array  elements :\n ");

     for(j=0;j<b.length;j++)
     {
	b[j]=sc.nextInt();
     }
  
 
 	i=0;j=0;
	int k=0;
	int c[]=new int[4];

 	while(i<a.length && j<b.length)
 	{
 	 if(a[i]>b[j])
	  {
   		c[k]=b[j];
   		k++; 
   		j++;
  	}
 	else
 	{
  		c[k]=a[i];
  		k++; 
  		j++;
 	}
     }
	for(k=0;k<4;k++)
	{
	System.out.print(c[k]);
	}
   }
}

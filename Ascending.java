class Ascending
{
 public static void main(String args[])
 {
   int arr[]=new  int[5];
   int i,j;
   int temp;
   
   for(i=0;i<5;i++)
   {
    arr[i]=Integer.parseInt(args[i]);
   }
  
  for(i=0;i<5;i++)
   {
    for(j=i+1;j<5;j++)
    {
       if(arr[i]>arr[j])
       {
	 temp=arr[i];
	 arr[i]=arr[j];
	 arr[j]=temp;
       } 
    }
   }
  for(i=0;i<5;i++)
   {
    System.out.println(arr[i]);
    }
   System.out.println("Min value is = "+arr[0]);
   System.out.println("Max value is = "+arr[4]);

 }
}

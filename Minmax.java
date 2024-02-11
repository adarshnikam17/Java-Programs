class Minmax
{
 public static void main(String args[])
 {
   int arr[]=new  int[5];
   int i,j;
   int temp,min;
  
   for(i=0;i<arr.length;i++)
   {
    arr[i]=Integer.parseInt(args[i]);
   }
 min=arr[0];
  for(i=0;i<arr.length;i++)
   {
  

       if(min>arr[i])
       {
	min=arr[i];
       } 
    
   }

   System.out.println("Min value is = "+min);

 }
}

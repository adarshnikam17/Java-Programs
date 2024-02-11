import java.util.*;
class matrix
{
 public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
    int a[][]=new int[3][3];
   int b[][]=new int[3][3];
 int i,j;
  
System.out.print("Enter 1st array  elements :\n");
   for(i=0;i<a.length;i++)
   {
     for(j=0;j<a.length;j++)
     {
	a[i][j]=sc.nextInt();
     }
   System.out.println();
   }

System.out.print("Enter 2nd array  elements :\n ");
   for(i=0;i<b.length;i++)
   {
     for(j=0;j<b.length;j++)
     {
	b[i][j]=sc.nextInt();
     }
   System.out.println();
   }

int add[][]=new int[3][3];

System.out.print("Matrix addition : \n");
   for(i=0;i<add.length;i++)
   {
     for(j=0;j<add.length;j++)
     {
	add[i][j]=a[i][j]+b[i][j];
   	System.out.print(add[i][j]+"   "); 
    }
   System.out.println();
   }
int sub[][]=new int[3][3];
System.out.print("Matrix Substraction : \n");
   for(i=0;i<sub.length;i++)
   {
     for(j=0;j<sub.length;j++)
     {
	sub[i][j]=a[i][j]-b[i][j];
   	System.out.print(sub[i][j]+"   "); 
    }
   System.out.println();
   }

int mul[][]=new int[3][3];
System.out.print("Matrix Multiplication : \n");
   for(i=0;i<mul.length;i++)
   {
     for(j=0;j<mul.length;j++)
     {
	mul[i][j]=a[i][j]*b[j][i];
   	System.out.print(mul[i][j]+"   "); 
    }
   System.out.println();
   }

int transpose[][]=new int[3][3];
System.out.print(" transpose matrix: \n");
   for(i=0;i<transpose.length;i++)
   {
     for(j=0;j<transpose.length;j++)
     {
 transpose[i][j]=a[j][i];
   	System.out.print(transpose[i][j]+"   "); 
    }
   System.out.println();
   }
  }
}

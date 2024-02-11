import java.util.*;

class stackOpr
{
 int top=-1;
 int mxsize=5;
 int stk[]=new int[mxsize];
 int i,value;
 
 void push()
  {
	Scanner sc=new Scanner(System.in);

    if(top==mxsize)
    {
	System.out.println(" stack is overflow "); 
    }
    else
    {

	System.out.println("enter value :");
    	value=sc.nextInt();
 	
	top+=1;
 	stk[top]=value;

 	System.out.println("value is pushed on to stack");
    }
  }
 
 void pop()
  {
    if(top==-1)
    {
	System.out.println("stack is underflow ");
    }
   else
    {
	top--;
	System.out.println("stack is poped ");
    }
  }
 
 void display()
 {
  if(top==-1)
  {
	System.out.println("stack is empty ");
  }
  else
   {
  System.out.println("display stack :");
   for(i=0;i<=top;i++)
   {
 	System.out.println(stk[i]+"  ");
   }
  }
 }

 public static void main(String args[])
 {
	Scanner sc=new Scanner(System.in);
	int ch; 


	
stackOpr s=new stackOpr();	

 while(true)
  {
	System.out.println("enter your choice :");
	ch=sc.nextInt();

	switch(ch)
	{
	case 1:s.push();
		break;

	case 2:s.pop();
		break;

	case 3:s.display();
		break;

	default :
		System.out.println("Invalid choice ");
	}
   } 
 }
}


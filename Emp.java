package employee;
import java.util.*;
class Emp
{
  Scanner sc=new Scanner(System.in);
  String name,category;
  int empid,bpay,hra,da,npay,pf,grosspay,incometax,allowance;.//da=5 hra=9 pf==11  allow=10

 public void set()
  {
   System.out.println("Enter name :");
   name=sc.next();
  System.out.println("Enter empid :");
   empid=sc.nextInt();
  System.out.println("Enter category :");
   category=sc.next();
   System.out.println("Enter bpay :");
   bpay=sc.nextInt();
   System.out.println("Enter hra :");
   hra=sc.nextInt();
   System.out.println("Enter da :");
   da=sc.nextInt();

   System.out.println("Enter npay :");
   npay=sc.nextInt();
  System.out.println("Enter pf :");
   pf=sc.nextInt();
   System.out.println("Enter bpay :");
   bpay=sc.nextInt();
   System.out.println("Enter hra :");
   hra=sc.nextInt();
   System.out.println("Enter da :");
   da=sc.nextInt();
  }
}

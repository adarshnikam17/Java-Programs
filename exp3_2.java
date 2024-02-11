import java.util.*;

class employee
{
String name;
String address;
String jobTitle;
int salary;
}
class Manager extends employee
{
   Manager(String n,String a,String j,int s)
   {
   name=n;
   address=a;
   jobTitle=j;
   salary=s;
   }
   void calculateBonus()
   { 
      double bonus=(salary*5)/100;
	System.out.println("name : "+name);
	System.out.println("address : "+address);
	System.out.println("jobTitle : "+jobTitle);
	System.out.println("salary : "+salary);
	System.out.println("bonus : "+bonus);
	System.out.println("total salary after adding bonus : "+(bonus+salary));
	System.out.println("yearly salary : "+(bonus+salary)*12);
	
   }
   void remark(String remark,String project)
   {
	System.out.println();
	System.out.println("remark : "+remark);
	System.out.println("current project on :"+project);
   }
}

class Developer extends employee
{
   Developer(String n,String a,String j,int s)
   {
 name=n;
   address=a;
   jobTitle=j;
   salary=s;
   }
   void calculateBonus()
   { 
      double bonus=(salary*5)/100;
	System.out.println("name : "+name);
	System.out.println("address : "+address);
	System.out.println("jobTitle : "+jobTitle);
	System.out.println("salary : "+salary);
	System.out.println("bonus : "+bonus);
	System.out.println("total salary after adding bonus : "+(bonus+salary));
	System.out.println("yearly salary : "+(bonus+salary)*12);
	
   }
   void remark(String remark,String project)
   {
	System.out.println();
	System.out.println("remark : "+remark);
	System.out.println("current project on :"+project);
   }
}

class Programmer extends employee
{
   Programmer(String n,String a,String j,int s)
   {
    name=n;
   address=a;
   jobTitle=j;
   salary=s;
   }
   void calculateBonus()
   { 
      double bonus=(salary*5)/100;
	System.out.println("name : "+name);
	System.out.println("address : "+address);
	System.out.println("jobTitle : "+jobTitle);
	System.out.println("salary : "+salary);
	System.out.println("bonus : "+bonus);
	System.out.println("total salary after adding bonus : "+(bonus+salary));
	System.out.println("yearly salary : "+(bonus+salary)*12);
	
   }
   void remark(String remark,String project)
   {
	System.out.println();
	System.out.println("remark : "+remark);
	System.out.println("current project on :"+project);
   }
}

class exp3_2 
{
public static void main(String args[])
{
Manager m=new   Manager("Elvish","bawda","Manager",10000);
Programmer p=new   Programmer("yash","rajarampuri","Programmer",11000);
Developer d=new   Developer("samii","takala","Developer",12000);
m.calculateBonus();
m.remark("good","hardware");

p.calculateBonus();
p.remark("good","software");

d.calculateBonus();
d.remark("better","hardware");

}
}

import java.util.*;
class employee
{
   
       String f_name,l_name;
      double m_salary;

  employee()
  {
   f_name="";
   l_name="";
   m_salary=0.0;
   }
   
 void get()
   {
      Scanner sc=new Scanner(System.in);
        System.out.println("enter first name of employee : ");
       f_name=sc.next();
 
      System.out.println("enter last name of employee : ");
      l_name=sc.next();

     System.out.println("enter monthly salary  of employee : ");
     m_salary=sc.nextDouble();  
   }
 void set()
   {
     if(m_salary<0)
        {
	    m_salary=0.0;
        }
   System.out.println("first name of employee : "+f_name);
    System.out.println("last name of employee :"+l_name);
    System.out.println("monthly salary of employee :" +m_salary);

   double y_salary=m_salary*12;
    System.out.println("yearly salary of employee :" +y_salary);

    y_salary=y_salary+((y_salary*10)/100); 
    System.out.println("yearly  salary of employee after 10% increment :" +y_salary);
   }
}

class employee_test extends employee
{
   public static void main(String args[])
    {
	employee emp1=new employee(); 
	employee emp2=new employee();

      

   System.out.println("\ndetails of 1st employee :");	
	emp1.get();
   System.out.println("\ndettails of 2nd employee :");
	emp2.get();
   System.out.println("\ndisplay details of 1st employee :");
	emp1.set();
   System.out.println("\ndisplay details of 2nd employee :");
	emp2.set();
    }
}


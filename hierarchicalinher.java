import java.util.*;
class base
{
    public float a;
    public float b;
}
class add extends base
{
  add(float x,float y)
  {
      a=x;
      b=y;
  }
  void display()
  {
      float c= a+b;
      System.out.println("Addition="+c);
  }
}

class substract extends base
{
    substract(float x,float y)
    {
        a=x;
        b=y;
    }
    void display()
    {
        float c= a-b;
        System.out.println("Substraction="+c);
    }
}

class multiply extends base
{
    multiply(float x,float y)
    {
        a=x;
        b=y;
    }
    void display()
    {
        float c= a*b;
        System.out.println("Multiplication="+c);
    }
}

class division extends base
{
    division(float x,float y)
    {
        a=x;
        b=y;
    }
    void display()
    {
        float c= a/b;
        System.out.println("Division="+c);
    }
}
public class hierarchicalinher {
    public static void main(String args[])
    {
        float x,y;
        Scanner om=new Scanner(System.in);
        System.out.println("Enter First number:");
        x= om.nextFloat();
        System.out.println("Enter Second number:");
        y= om.nextFloat();

        add a1=new add(x,y);
        a1.display();
        substract a2=new substract(x,y);
        a2.display();
        multiply a3=new multiply(x,y);
        a3.display();
        division a4=new division(x,y);
        a4.display();
    }
}

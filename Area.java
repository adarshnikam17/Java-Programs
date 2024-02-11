
import java.util.*;
class Area
{
// Area of  reactangle
   int length,breadth;
  
   public void  setDim(int l,int b)
  {
  length=l;
  System.out.println("length of rectangle :"+length);
  breadth=b;
  System.out.println("breadth of rectangle :"+breadth);
  }
 
   public void  getArea()
  {
   System.out.println("area of rectangle :"+(length*breadth));
  }

public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);

Area a=new Area();
  int length,breadth;
  System.out.println("enter length of rectangle :");
  length=sc.nextInt();

  System.out.println("enter breadth of rectangle :");
  breadth=sc.nextInt();

  a.setDim(length,breadth);
  a.getArea();
 }

}

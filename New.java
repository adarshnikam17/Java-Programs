import java.util.*;
abstract class abc
{
 void show()
 {
System.out.print("Hello");
 }
}
class New extends abc
{
public static void main(String args[])
 {
   New obj=new New();
   obj.show();
 }
}

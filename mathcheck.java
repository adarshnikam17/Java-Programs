import math.mathematical;
import math.convert.conversion;

class mathcheck
{
public static void main(String args[])
  {
  mathematical m=new mathematical();
    conversion c=new conversion();
 
   m.cube();
   m.factorial();
   
   System.out.println(c.convertBinary());
   System.out.println(c.convertOctal());
  

  }
}

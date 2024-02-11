package math.convert;
import java.util.*;

public class conversion
{
     Scanner sc=new Scanner (System.in);
  public String convertBinary()
   {

      System.out.println("Enter decimal number :");
      int decimal=sc.nextInt();
     System.out.println("Decimal to binary :");	
      return Integer.toBinaryString(decimal);
	
   }
  
   public String convertOctal()
   {
	
      System.out.println("Enter decimal number :");
      int decimal=sc.nextInt();
	System.out.println("Decimal to octal :");
	return Integer.toOctalString(decimal);
   }

}

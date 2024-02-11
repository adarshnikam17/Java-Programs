import java.util.*;

class student1
{
    public int roll_no;
}
class test extends student1
{
    public float sub1,sub2;
}
class result extends test
{
    public float percentage;
    void setdata(int no,float x,float y)
    {
        roll_no=no;
        sub1 = x;
        sub2 = y;
    }
    void display()
    {
        percentage=(sub1+sub2)/2;
        System.out.println("***********");
        System.out.println("Result of Roll No"+roll_no);
        System.out.print("is = "+percentage+"%");
    }

}
public class multilevelinheri {
    public static void main(String args[])
    {
        int no;
        float x,y;
        Scanner om=new Scanner(System.in);
        System.out.println("Enter Adarsh Roll No:");
        no= om.nextInt();

        System.out.println("Enter Adarsh subject 1 marks:");
        x = om.nextFloat();

        System.out.println("Enter Adarsh subject 2 marks:");
        y = om.nextFloat();

        result op=new result();
        op.setdata(no,x,y);
        op.display();
    }
}

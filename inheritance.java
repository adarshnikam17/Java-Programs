import java.util.*;

class person
{
    public String name;
    public int roll_no;
    public int marks;
}
class student extends person
{
    int id;
    void putdata(String name,int roll_no,int marks,int id)
    {
        this.name=name;
        this.roll_no= roll_no;
        this.marks=marks;
        this.id=id;

    }
    void display()
    {
        System.out.println("Student name:"+name);
        System.out.println("Student roll no:"+roll_no);
        System.out.println("Student marks:"+marks);
        System.out.println("Student id:"+id);
    }
}

public class inheritance {
    public static void main(String args[])
    {
        student s1=new student();
        Scanner om=new Scanner(System.in);
        int rollno;
        int marks;
        int id;

        System.out.println("Enter a name of student:");
        String name = om.next();
        System.out.println("Enter a Roll no:");
        rollno=om.nextInt();
        System.out.println("Enter marks");
        marks=om.nextInt();
        System.out.println("Enter id:");
        id=om.nextInt();

        s1.putdata(name,rollno,marks,id);
        s1.display();
    }
}

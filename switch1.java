import java.util.*;
public class switch1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int op=sc.nextInt();
        switch(op){
            case 1: System.out.println("Hello");
            break;
            case 2: System.out.println("Namaste");
            break;
            case 3: System.out.println("Vk");
            break;
            default: System.out.println("Invalid");
        }
    }
}

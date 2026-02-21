package String;
import java.util.*;
public class sec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName=sc.next();
        System.out.println("Enter your second name: ");
        String secondName=sc.next();
        String fullName=firstName+" "+secondName;
        System.out.println(fullName);
        System.out.println(fullName.charAt(0));
    }
    
}

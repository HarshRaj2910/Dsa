        // 1. Reverse a string 
import java.util.*;
public class rev {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String a ="hello";
        String reverse="";

        for(int i=a.length()-1;i>=0;i--){
                reverse +=a.charAt(i);
        }
        System.out.println(reverse);
    }
    
}

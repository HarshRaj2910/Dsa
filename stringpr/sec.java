package stringpr;
import java.util.*;
public class sec {
    // Question 2: Reverse a String (without using inbuilt reverse function)
    public static String reverseString(String str){
        int n=str.length();  // total string length
        String reversed="";  // initial reversed string is empty
        for(int i=n-1;i>=0;i--){  // start from backward
            reversed += str.charAt(i);
        }
        return reversed;
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a string");
    String str=sc.nextLine();
    System.out.println(reverseString(str));

}
    
}

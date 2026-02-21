package stringpr;
import java.util.*;
public class fir {

    // 1. Check Palindrome Write a method that checks whether a given string is a palindrome
    public static boolean isPalindrome(String str){
        int n=str.length();
        for(int i=0;i<n/2;i++){
            if(str.charAt(i) != str.charAt(n-1-i)){
            return false;  // if mismatch found (not palindrome)
        }
     }
        return true;  // if match found ( palindrome)
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your word want to check if it a palindrome");
        String str=sc.next();
        System.out.println(isPalindrome(str));
    }
}

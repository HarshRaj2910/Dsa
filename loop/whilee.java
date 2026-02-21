package loop;
import java.util.*;
public class whilee {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter the number: ");
        int num=sc.nextInt();
        int rev=0;
        while(num>0){
            int lastdigit=num%10; // check last digit
            rev=(rev*10)+lastdigit;
            num/=10;  // remove last digit
        }
        System.out.print(rev);
    }

    }
    
    
    


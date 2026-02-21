import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number:");
        int num= sc.nextInt();            // user input integer type
        int rev=0;
        for(;num!=0;num/=10){
            int number=num%10;
            rev=rev*10+number;
        }
        System.out.print("The required numberin reverse is:"+rev);
        }
}

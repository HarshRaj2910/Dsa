package loop;
import java.util.*;
public class prime {
    // check if a number is prime or not

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        {
            boolean isPrime=true;
            for(int i=2;i<=(n-1);i++){
                if(n%i == 0 ){

                    isPrime=false;
                }
            }
            if(isPrime == true){
                System.out.print(n+" is Prime");
            } else {
                System.out.print(n+" is not Prime");
            }
        }
    }
    
}

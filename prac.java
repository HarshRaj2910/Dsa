import java.util.*;
public class prac {
    // 1. check prime number or not
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();

        if(num <=1){
            System.out.print("Not Prime");
            return;
        }
        boolean isPrime=true;
        for(int i=2;i<Math.sqrt(num);i++){
            if(num % i==0){
                isPrime=false;
            }
        }
        if(isPrime==true){
            System.out.println(num+": Prime");
        }else {
            System.out.println(num+": Not Prime");
        }

        // 2. sum of the even and odd integer
        int nums;
        int choice;
        int evenSum=0;
        int oddSum=0;
        do{
            System.out.println("enter the number: ");
            nums=sc.nextInt();
            if( nums % 2==0){
                evenSum+=nums;
            }else {
                oddSum+=nums;
            }
            System.out.println("do yuu want to continue? Press 1 for yes or 0 for no");
            choice=sc.nextInt();
        }while(choice==1);
        System.out.println("Sum of even numbers : "+evenSum);
        System.out.println("Sum of odd numbers :  "+oddSum);

        // 3. print multiple table of any number
        System.out.println("Enter number: ");
        int n=sc.nextInt();
        System.out.println("Multiplation table of :"+ n);
        for(int i=1;i<=10;i++){
            System.out.println(n+" * "+i+"="+(n*i));
        }
    }
    
}

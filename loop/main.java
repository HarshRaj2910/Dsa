// check the sum of integers and then prints the sum of the even and odd integers

import java.util.*;
public class main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        int choice;
        int evenSum=0;
        int oddSum=0;
        do{
            System.out.println("enter the number: ");
            num = sc.nextInt();
            if(num % 2 ==0){
                evenSum+=num;
            }else {
                oddSum+=num;
            }
            System.out.println("do you want to continue? Press 1 for yes or 0 for end ");
            choice=sc.nextInt();
        } while(choice ==1);
        System.out.println("Sum of even numbers: "+evenSum);
        System.out.println("Sum of odd numbers: "+oddSum);
    }
}
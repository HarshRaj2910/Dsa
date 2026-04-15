// print number from n to 1 (decreasing order) using recursion
import java.util.*;
class Main{
    public static void printDec(int n){
        if ( n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);
    }

    // print number from 1 to n (increasing order) using recursion
    public static void printInc(int n){
        if ( n==1){
            System.out.println(n);
            return;
        }
        printInc(n-1);
        System.out.println(n+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n= sc.nextInt();
        System.out.println("Decreasing order:");
        printDec(n);
        System.out.println("\nIncreasing order:");
        printInc(n);
    }

}
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

    // print factorial of a number using recursion
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fnm1=fact(n-1);
        int fn=n*fnm1;
        return fn;
    }

        // print Nth fibanacci number using recursion
        public static int Fib(int n){
            if (n ==0 || n==1){
                return n;
            }
            int f3=Fib(n-2);
            int f2=Fib(n-1);
            int f1=f2+f3;
            return f1;
        }

        // check if an array is sorted or not using recursion
        public static boolean isSorted(int arr[],int i){
            if(i==arr.length-1){
                return true;
            }
            if(arr[i]>arr[i+1]){
                return false;
            }
            return isSorted(arr,i+1);
        }

        // first occurence of a number in an array using recursion
        public static int firstOccurence(int arr1[] , int key, int i){
            // base case
            if(i==arr1.length){
                return -1;
            }
            // recursive call
            // current element matches in the array
            if(arr1[i]==key){
                return i;
            }
            // recursive call for the rest of the array
            return firstOccurence(arr1,key,i+1);
        }

        // last occurence of a number in an array using recursion
        public static int lastOccurenece(int arr2[], int key2,int n){
            // base case
            if(n==arr2.length){
                return -1;
            }
            // recursive call
            int isFound=lastOccurenece(arr2,key2,n+1);
            if(isFound == -1 && arr2[n]==key2){
                return n;
            }
            return isFound;
        }


        // print x to the power n using recursion   T.C => O(n) S.C => O(n)
        public static int power(int x, int n){
            // base case
            if(n==0){
                return 1;
            }
            // recursive call
            return x * power(x,n-1);
        }

        // print x to the power n using recursion   T.C => O(log n) S.C => O(log n)
        public static int powerOpt(int x, int n){
            // base case
            if(n==0){
                return 1;
            }
            // recursive call
            int halfPower=powerOpt(x,n/2);
            int halfPowerSq=halfPower*halfPower;
            if(n%2!=0){
                halfPowerSq=x*halfPowerSq;
            }
            return halfPowerSq;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n= sc.nextInt();

        // print number from n to 1 (decreasing order) using recursion 
        System.out.println("Decreasing order:");
        printDec(n);

        // print number from 1 to n (increasing order) using recursion
        System.out.println("\nIncreasing order:");
        printInc(n);
       

        // print factorial of a number using recursion
        System.out.println("\nFactorial of " + n + " is: " + fact(n));

        // print Nth fibanacci number using recursion
        System.out.println("\n" + n + "th Fibonacci number is: " + Fib(n));

        // check if an array is sorted or not using recursion
        int arr[] = {1,2,3,4,5,6,7,9,8,7};
        System.out.println("\nIs the array sorted? " + isSorted(arr,0));

        // first occurence of a number in an array using recursion
        int arr1[]={2,3,5,6,7,8,6,9};
        System.out.println("\nEnter the key to find: ");
        int key = sc.nextInt();
        System.out.println("First occurence of " + key + " is at index: " + firstOccurence(arr,key,0));

        // last occurence of a number in an array using recursion
        int arr2[]={2,3,5,6,7,8,6,9,8,6,15,24,36,6};
        System.out.println("\nEnter the key to find: ");
        int key2 = sc.nextInt();
        System.out.println("Last occurence of " + key2 + " is at index: " + lastOccurenece(arr2,key2,0));

        // print x to the power n using recursion
        System.out.println("\nEnter the base number: ");
        int x = sc.nextInt();
        System.out.println("Enter the exponent: ");
        int exp = sc.nextInt();
        System.out.println(x + " to the power " + exp + " is: " + power(x,exp));

        // print x to the power n using recursion
        System.out.println("\nEnter the base number: ");    
        int x2 = sc.nextInt();
        System.out.println("Enter the exponent: ");
        int exp2 = sc.nextInt();
        System.out.println(x2 + " to the power " + exp2 + " is: " + powerOpt(x2,exp2));


}}
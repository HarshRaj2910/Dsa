        // while loop

package Array;
import java.util.*;
public class hello {

    // 1. print 100 hello

//  public static void main(String[] args) {
//         int counter=0;
//         while(counter<=100){
//             System.out.println(counter+" "+"Hello World!");
//             counter++;
//         }
//         System.out.println("print hello world! upto 100");
//     }
    
// }

        // 2. print number from 1 to n

         public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
    //     System.out.println("print the number upto you want to print: ");
    //     int n=sc.nextInt();
    //     System.out.println("print the starting number: ");
    //     int num=sc.nextInt();
    //     while (num<=n){
    //         System.out.println(num);
    //         num++;
    //     }
    // }

    // 3. print sum of first n natural number
    
 //   Scanner sc= new Scanner(System.in);
//     System.out.println("print last number: ");
//     int n=sc.nextInt();
//     int sum=0; // initial sum is zero
//     int i=1;
//     while(i<=n){
//         System.out.println(sum+=i);
//         i++;
//     }
//     System.out.println("sum is : "+sum);
    

// }

        // 4. print reverse of a number

        // System.out.println("print the number: ");
        // int num=sc.nextInt();
        // while(num > 0){
        //     int lastDigit=num%10;  //  find last digit 
        //     System.out.print(lastDigit+" ");
        //     num/=10; // remove the last digit
        // }

        // 5. print reverse of a given number
//         System.out.println("user give a number: ");
//         int num=sc.nextInt();
//         int rev=0;
//         while(num > 0){
//             int lastDigit=num % 10; // check last digit
//             rev=(rev*10)+lastDigit;
//             num/=10;
//         }
//         System.out.println(rev);


// }

            // 6. enter multiple of 10 using break statement
            do{
                System.out.println("enter your number: ");
                int n=sc.nextInt();
                if(n % 10 == 0){
                    break;  // to exit the loop when condition become true
                }
                System.out.println(n);
            }while(true);

            // 7. enter multiple of 7 using continue statement
            do {
    System.out.println("Enter your number: ");
    int n = sc.nextInt();

    if (n == 0) {
        break;  // stop the loop
    }

    if (n % 7 == 0) {
        continue;   // skip the iteration
    }

    System.out.println("Number was: " + n);

} while (true);

        }

}


        // while loop

package Array;
import java.util.*;
public class hello {

    // print 100 hello

//  public static void main(String[] args) {
//         int counter=0;
//         while(counter<=100){
//             System.out.println(counter+" "+"Hello World!");
//             counter++;
//         }
//         System.out.println("print hello world! upto 100");
//     }
    
// }

        // print number from 1 to n

         public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("print the number upto you want to print: ");
    //     int n=sc.nextInt();
    //     System.out.println("print the starting number: ");
    //     int num=sc.nextInt();
    //     while (num<=n){
    //         System.out.println(num);
    //         num++;
    //     }
    // }

    // print sum of first n natural number
    
    Scanner sc= new Scanner(System.in);
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

        // print reverse of a number
        System.out.println("print the number: ");
        int num=sc.nextInt();
        while(num > 0){
            int lastDigit=num%10;  //  find last digit 
            System.out.print(lastDigit+" ");
            num/=10; // remove the last digit
        }


}
}


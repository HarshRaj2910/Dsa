package Pattern;
import java.util.*;

public class star {
    public static void main(String[] args) {

        // 1. forward star pattern

        // outer loop
        for (int i = 1; i <= 4; i++) {

            // inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // move to next line after each row
            System.out.println();
        }
        System.out.println("---------------------------------------");

        // 2. reversed star pattern
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        // outer loop
        for(int ol=1;ol<=n;ol++){  // ol: outerloop

            // inner loop
            for(int il=1;il<=(n-ol+1);il++){   // il: inner loop, print star=>(n-outerloop+1)
                System.out.print("*");

            }
            System.out.println();
        }

        // 3. print half pyramid pattern 
        int num=4;
        // outer loop
        for(int fl=1;fl<=num;fl++){

            // inner loop 
            for(int sl=1;sl<=fl;sl++){
                System.out.print(sl);  // number => inner loop counter   ,, same as first one
            }
            System.out.println();
        }

        

    }
}

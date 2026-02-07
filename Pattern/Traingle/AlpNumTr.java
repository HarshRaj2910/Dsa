package Pattern.Traingle;
import java.util.*;
public class AlpNumTr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=1;
        char ch='A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i%2 !=0){        // Checks if the row number is odd
                    System.out.print(ch+" ");
                    ch++;
                } else {            // Executes when the row number is even.
                    System.out.print(num+" ");
                    num++;
                }
            }
            System.out.println();
        }
    }
    
}

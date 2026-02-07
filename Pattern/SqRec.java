package Pattern;
import java.util.*;

import java.util.Scanner;

public class SqRec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row, col;
        
        row=col=sc.nextInt();
        // outer loop
        for(int i=1;i<=row;i++){
            // inner loop
            for(int j=1;j<=col;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}

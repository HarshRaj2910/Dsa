package Pattern;
import java.util.*;
public class StarRectangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // print rectangle star
        int row=sc.nextInt();
        int col=sc.nextInt();
        for(int i=1;i<=row;i++){  // outerloop => rows  , kitni lines hogi
            for(int j=1;j<=col;j++){  // inner loop => columns ,, har line me kitna print hoga
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}

package Pattern;
import java.util.*;

public class SqNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){  // lines print
            for(int j=1;j<=(n);j++){  // har line me kitna print hoga
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
}

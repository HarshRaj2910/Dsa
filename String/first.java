package String;
import java.util.*;
public class first {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       char arr[]={'h','a','r','s','h'};
       for(int ele : arr){   // implicit type conversion print ASCII / unicode values
        System.out.print(ele+" ");
       }
       System.out.println();


       
       char arr1[]={'p','r','i','y','a'};
       for(char ele: arr1){   // normal form print actual character
        System.out.print(ele +" ");
        }
        System.out.println("length of aar1 is "+arr1.length);
       System.out.println();


       String s="krishna";
       System.out.println(s.charAt(4));
       
    }
    
}

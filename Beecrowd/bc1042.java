import java.io.IOException;
import java.util.Scanner;
public class bc1042 {
 
    public static void main(String[] args) throws IOException {
 
       Scanner s = new Scanner(System.in);
       
       int A, B, C, min1, min2 = 0, min3 = 0;
       int n1 = s.nextInt();
       int n2 = s.nextInt();
       int n3 = s.nextInt();
       
       min1 = Math.min(n1, Math.min(n2, n3));
       
       if (min1 == n1) {
           min2 = Math.min(n2, n3);
           min3 = Math.max(n2, n3);
       
       } else if (min1 == n2) {
           min2 = Math.min(n1, n3);
           min3 = Math.max(n1, n3);
       
       } else if (min1 == n3) {
           min2 = Math.min(n1, n2);
           min3 = Math.max(n1, n2);
    
       }
       
       System.out.println(min1);
       System.out.println(min2);
       System.out.println(min3);
       System.out.println("");
       System.out.println(n1);
       System.out.println(n2);
       System.out.println(n3);
    }
}
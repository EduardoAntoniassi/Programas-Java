import java.io.IOException;
import java.util.Scanner;
public class bc1014 {
 
    public static void main(String[] args) throws IOException {
 
       Scanner s = new Scanner(System.in);
       
       int km = s.nextInt();
       double l = s.nextDouble();
       
       double consmed = km/l;
       
       System.out.printf("%.3f km/l\n" ,consmed);
    }
 

}
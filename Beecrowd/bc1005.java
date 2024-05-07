import java.io.IOException;
import java.util.Scanner;
public class bc1005 {
 
    public static void main(String[] args) throws IOException {
 
    Scanner s = new Scanner(System.in);
    
    double a = s.nextDouble();
    double b = s.nextDouble();
    double MEDIA = ((a*3.5) + (b*7.5))/(3.5+7.5);
    
    System.out.printf("MEDIA = %.5f\n" ,MEDIA);
 
    }
 
}
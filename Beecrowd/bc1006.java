import java.io.IOException;
import java.util.Scanner;
public class bc1006 {
 
    public static void main(String[] args) throws IOException {
 
    Scanner s = new Scanner(System.in);
    
    double a = s.nextDouble();
    double b = s.nextDouble();
    double c = s.nextDouble();
    
    double MEDIA = ((a*2) + (b*3) + (c*5)) / (2 + 3 + 5);
    
    System.out.printf("MEDIA = %.1f\n" ,MEDIA);
    s.close();
    }
 
}
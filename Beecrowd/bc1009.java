import java.io.IOException;
import java.util.Scanner;
public class bc1009 {
 
    public static void main(String[] args) throws IOException {
 
    Scanner s = new Scanner(System.in);
    
    double a = s.nextDouble();
    double t = s.nextDouble();
    
    double bonus = a + (t * 0.15);
    
    System.out.printf("TOTAL = R$ %.2f\n" ,bonus);
    s.close();
    }
}
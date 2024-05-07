import java.io.IOException;
import java.util.Scanner;
public class bc1010 {
 
    public static void main(String[] args) throws IOException {
 
    Scanner s = new Scanner(System.in);
    
    int cod = s.nextInt();
    int uni = s.nextInt();
    double pri = s.nextDouble();
    
    int cod2 = s.nextInt();
    int uni2 = s.nextInt();
    double pri2 = s.nextDouble();
    
    double val = (uni * pri) + (uni2 * pri2);
    
    System.out.printf("VALOR A PAGAR: R$ %.2f\n" ,val);
    }
 
}
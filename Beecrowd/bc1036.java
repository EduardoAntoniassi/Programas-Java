import java.io.IOException;
import java.util.Scanner;
public class bc1036 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner s = new Scanner(System.in);
        
        double A = s.nextDouble();
        double B = s.nextDouble();
        double C = s.nextDouble();
        
        double del = Math.pow(B ,2) - (4 * A * C);
        double div = 2 * A;
        double bask = (-B + (Math.sqrt(del))) / div;
        double bask2 = (-B - (Math.sqrt(del))) / div;
        
        if (div == 0) {
            System.out.println("Impossivel calcular");
            
        } else if (del < 0) {
            System.out.println("Impossivel calcular");
       
        } else {
            System.out.printf("R1 = %.5f\n" ,bask);
            System.out.printf("R2 = %.5f\n" ,bask2);
        }
        s.close();
    }
 
}
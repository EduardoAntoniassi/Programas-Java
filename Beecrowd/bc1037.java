import java.io.IOException;
import java.util.Scanner;
public class bc1037 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner s = new Scanner(System.in);
        
        double val = s.nextDouble();
        
        if (val <= 25.00 && val >= 0) {
            System.out.println("Intervalo [0,25]");
        
        } else if (val >= 25.00 && val <= 50.00) {
            System.out.println("Intervalo (25,50]");
            
        } else if (val >= 50.00 && val <= 75.00) {
            System.out.println("Intervalo (50,75]");
            
        } else if (val >= 75.00 && val <= 100.00) {
            System.out.println("Intervalo (75,100]");
            
        } else {
            System.out.println("Fora de intervalo");
        }
 
    }
 
}
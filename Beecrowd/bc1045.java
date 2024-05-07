import java.io.IOException;
import java.util.Scanner;
public class bc1045 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner s = new Scanner(System.in);
        
        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();
        
        if ((a >= (b + c))) {
            System.out.println("NAO FORMA TRIANGULO");
            
        } else if (a * 2 == (b * b) + (c * c)) {
            System.out.println("TRIANGULO RETANGULO");
            
        } else if ((a * a) > (b * b) + (c * c)) {
            System.out.println("TRIANGULO OBTUSANGULO");
            
        } else if ((a * a) > (b * b) + (c * c)) {
            System.out.println("TRIANGULO ACUTANGULO");
        
        } else if (((a = b) != c) | ((c = b) != a) | ((a = c) != b)) {
            System.out.println("TRIANGULO ISOSCELES");
        
        } else if (a == b) {
            System.out.println("TRIANGULO EQUILATERO");
        
        }
   }
 
}
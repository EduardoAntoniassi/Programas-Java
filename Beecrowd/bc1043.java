import java.io.IOException;
import java.util.Scanner;
public class bc1043 {
 
    public static void main(String[] args) throws IOException {
 
    Scanner s = new Scanner(System.in);
    
    double A = s.nextDouble();
    double B = s.nextDouble();
    double C = s.nextDouble();
    
    double per = A + B + C;
    double area = ((A + B) * C) / 2;
    
    if ((A < B + C) && (B < A + C) && (C < A + B)) {
        System.out.printf("Perimetro = %.1f\n" ,per);
    
    } else {
        System.out.printf("Area = %.1f\n" ,area);
    }
    s.close();
    }
 
}
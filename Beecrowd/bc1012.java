import java.io.IOException;
import java.util.Scanner;
public class bc1012 {
 
    public static void main(String[] args) throws IOException {
 
    Scanner s = new Scanner(System.in);
    
    double A = s.nextDouble();
    double B = s.nextDouble();
    double C = s.nextDouble();
    
    double triret = (A * C)/2;
    
    double pi = 3.14159;
    double circ = pi * (C * C);
    
    double trap = ((A + B) * C)/2;
    
    double quad = B * B;
    
    double ret = A * B;
    
    System.out.printf("TRIANGULO: %.3f\n" ,triret);
    System.out.printf("CIRCULO: %.3f\n" ,circ);
    System.out.printf("TRAPEZIO: %.3f\n" ,trap);
    System.out.printf("QUADRADO: %.3f\n" ,quad);
    System.out.printf("RETANGULO: %.3f\n" ,ret);
    }
 
}